package manager.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import manager.entity.Role;
import manager.entity.RoleDto;
import manager.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @program: authorization
 * @description
 * @author: linjing
 * @create: 2019-12-19 09:38
 **/
@Mapper
public interface RoleMapper extends BaseMapper<Role> {
    Role findRoleByName(String name);
    RoleDto findRoleUser(String name);
    void RoleLinkToUser(@Param("users") List<String> list,String roleName);
    List<String> findUserExit(@Param("users") List<String> list,String roleName);
}
