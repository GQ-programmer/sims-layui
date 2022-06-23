package pub.zgq.pojo;

import lombok.Data;

/**
 * @Author 孑然
 *
 * 维修登记类
 */
@SuppressWarnings("all")
@Data
public class Visitor {
    private int v_id;//唯一标识
    private String v_name;//班级编号
    private String v_phone;//班级名称
    private String v_dormbuilding;//宿舍卫生分数
    private String v_dormitoryid;//更新日期
    private String create_time;//创建日期

}
