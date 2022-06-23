package pub.zgq.pojo;

import lombok.Data;

/**
 * @Author 孑然
 *
 * 维修登记类
 */
@SuppressWarnings("all")
@Data
public class Log {
    private int l_id;//唯一标识
    private String username;//用户名
    private String name;//姓名
    private String sex;//性别
    private String tel;//电话
    private String login_time;//更新日期

}
