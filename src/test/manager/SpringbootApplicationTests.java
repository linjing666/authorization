package manager;

import manager.entity.User;
import manager.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @program: authorization
 * @description
 * @author: linjing
 * @create: 2019-12-18 17:17
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public  void  contextLoads(){
        List<User> userList = userMapper.selectList(null);
        System.out.println(userList);
    }
}
