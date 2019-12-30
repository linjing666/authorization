package manager.entity;

import lombok.Data;

import java.util.List;

/**
 * @program: authorization
 * @description
 * @author: linjing
 * @create: 2019-12-20 12:15
 **/
@Data
public class UserDto extends User {
    private List<Role> roles;
}
