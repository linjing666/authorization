package manager.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import manager.entity.User;
import manager.entity.UserDto;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: authorization
 * @description
 * @author: linjing
 * @create: 2019-12-18 16:04
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {
//    @Select("select * from user where id = #{id}")
    UserDto findUserByName(String name);
}