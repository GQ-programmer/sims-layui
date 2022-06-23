package pub.zgq.pojo;

import lombok.Data;

/**
 * @Author 孑然
 *
 * 维修登记类
 */
@SuppressWarnings("all")
@Data
public class ClassGrade {
    private int cg_id;//唯一标识
    private String c_classId;//班级编号
    private String c_className;//班级名称
    private int class_grade;//宿舍卫生分数
    private String update_time;//更新日期

}
