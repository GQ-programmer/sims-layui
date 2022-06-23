package pub.zgq.pojo;

import lombok.Data;

/**
 * @Author 孑然
 *
 * 维修登记类
 */
@SuppressWarnings("all")
@Data
public class DormRepair {
    private int r_id;//唯一标识
    private String d_dormbuilding;//宿舍楼号
    private String d_dormitoryid;//宿舍号
    private String r_name;//维修人员姓名
    private String r_reason;//报修事由
    private String repair_time;//维修时间

}
