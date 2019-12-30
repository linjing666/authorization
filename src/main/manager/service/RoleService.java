package manager.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: authorization
 * @description
 * @author: linjing
 * @create: 2019-12-20 09:20
 **/

public interface RoleService {
    void  RoleLinkToUser(List<String> users, String roleName);
}
