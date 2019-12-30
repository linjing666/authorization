package manager.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: authorization
 * @description
 * @author: linjing
 * @create: 2019-12-19 09:28
 **/
@Data
public class Permission implements Serializable {
    private Long id;
    private String permission;
//    private Role role;
}
