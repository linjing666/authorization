package manager.service.impl;

import manager.mapper.RoleMapper;
import manager.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: authorization
 * @description
 * @author: linjing
 * @create: 2019-12-20 09:21
 **/
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Transactional
    public void  RoleLinkToUser(List<String> users,String roleName){
        List<String> userExit = roleMapper.findUserExit(users, roleName);
        users.removeAll(userExit);
        if (!users.isEmpty()) {
            roleMapper.RoleLinkToUser(users, roleName);
        }
    }
}
