package manager.entity;

import lombok.Data;

import java.util.List;

/**
 * @program: authorization
 * @description
 * @author: linjing
 * @create: 2019-12-19 16:40
 **/
@Data
public class RoleDto extends Role {
    private List<User> users;
}
