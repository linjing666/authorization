package manager.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import manager.entity.User;
import manager.mapper.UserMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@Api(tags = "用户管理相关接口")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequiresRoles("admin")
    @RequiresPermissions("add")
    @GetMapping("/getUser")
    @ApiOperation("获取用户信息")
    public User getUser(String Name) {
        User user=userMapper.findUserByName(Name);
        return  user;
    }

    @RequiresPermissions("Inquire")
    @GetMapping("/getAllUser")
    @ApiOperation("获取所有用户信息")
    public IPage<User> getAllUser(Integer page,Integer size){
        IPage<User> userPage = new Page<>(page, size);//参数一是当前页，参数二是每页个数
        userPage = userMapper.selectPage(userPage, null);
        List<User> list = userPage.getRecords();
        return userPage;
    }


    @GetMapping("saveUser")
    @ApiOperation("添加用户信息")
    public  Boolean saveUser(String name,Integer age,String email,String password){
        User user=new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);
        user.setPassword(password);
        userMapper.insert(user);
        return true;
    }

    @PostMapping("/login")
    @ApiOperation("用户登录")
    public String login(String name,String password){
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(name,password);
        // 进行验证，这里可以捕获异常，然后返回对应信息
        SecurityUtils.getSubject().login(usernamePasswordToken);
        return "login ok!";
    }
}
