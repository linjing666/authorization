package manager.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import manager.entity.RoleDto;
import manager.mapper.RoleMapper;
import manager.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @program: authorization
 * @description
 * @author: linjing
 * @create: 2019-12-19 16:47
 **/
@RestController
@Api(tags = "角色管理相关接口")
public class RoleController {
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RoleService roleService;
    @GetMapping("/getRole")
    @ApiOperation("获取角色信息")
    public RoleDto getRole(String roleName){
        RoleDto roleUser = roleMapper.findRoleUser(roleName);
        return roleUser;
    }

    @GetMapping("/RoleLinkToUser")
    @ApiOperation("角色添加用户")
    public Boolean RoleLinkToUser(@RequestParam(value = "users",required = true) List<String> users, String roleName){
        roleService.RoleLinkToUser(users,roleName);
        return  true;
    }
}
