package pub.zgq.pojo;

import lombok.Data;

/**
 * @Author 孑然
 *
 * 宿舍类
 */
@SuppressWarnings("all")
@Data
public class Dormitory {
    private int d_id;//唯一标识
    private String d_dormbuilding;//宿舍楼号
    private String d_dormitoryid;//宿舍号
    private Integer d_bedtotal;//床位总数
    private Integer d_bed;//已用床位
    private String d_dormitoryhead;//宿舍长姓名
    private String d_phone;//宿舍长电话
    private String d_dormitorycategory;//宿舍类别
}
