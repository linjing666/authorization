package manager.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * @program: authorization
 * @description
 * @author: linjing
 * @create: 2019-12-18 16:01
 **/
@Data
public class User implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private String name;
    private  String password;
    private Integer age;
    private String email;

}
