package pub.zgq.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 管理员类
 */
@Data
public class User {

    private int aid;
    private String username;
    private String password;
    private String sex;
    private String tel;
    private String name;


}
