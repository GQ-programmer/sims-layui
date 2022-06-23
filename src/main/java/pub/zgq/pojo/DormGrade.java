package pub.zgq.pojo;

import lombok.Data;

/**
 * @Author 孑然
 *
 * 维修登记类
 */
@SuppressWarnings("all")
@Data
public class DormGrade {
    private int dg_id;//唯一标识
    private String d_dormbuilding;//宿舍楼号
    private String d_dormitoryid;//宿舍号
    private int dorm_grade;//宿舍卫生分数
    private String update_time;//更新时间

}
