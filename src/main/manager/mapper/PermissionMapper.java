package manager.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import manager.entity.Permission;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: authorization
 * @description
 * @author: linjing
 * @create: 2019-12-19 09:40
 **/
@Mapper
public interface PermissionMapper  extends BaseMapper<Permission> {

}
