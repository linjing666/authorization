package manager.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @program: authorization
 * @description
 * @author: linjing
 * @create: 2019-12-19 09:28
 **/
@Data
public class Role implements Serializable {
    private Long id;
    private String roleName;
//    private List<User> users;
    private List<Permission> permissions;
}
