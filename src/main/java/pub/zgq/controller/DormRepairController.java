package pub.zgq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pub.zgq.pojo.DormRepair;
import pub.zgq.pojo.Dormitory;
import pub.zgq.pojo.ResultInfo;
import pub.zgq.service.DormRepairService;
import pub.zgq.utils.LayuiUtil;

import java.util.List;

/**
 * @Author 孑然
 *
 * 维修信息
 */
@RequestMapping("/dormRepair")
@RestController
public class DormRepairController {

    @Autowired
    private DormRepairService dormRepairService;
    @Autowired
    private ResultInfo info;

    /**
     * 查询维修信息
     * @param dormRepair
     * @return
     */
    @RequestMapping("/findAll")
    public LayuiUtil findAll(DormRepair dormRepair){

        List<DormRepair> list = dormRepairService.findAll(dormRepair);
        int count = list.size();
        return LayuiUtil.data(count,list);
    }

    /**
     * 添加维修信息
     * @param dormRepair
     * @return
     */
    @RequestMapping("/addDormRepair")
    public ResultInfo addDorm(DormRepair dormRepair){
        boolean flag = dormRepairService.addDormRepair(dormRepair);
        if (flag == true){
            info.setFlag(true);
            info.setMsg("添加成功");
        }else if (flag == false){
            info.setFlag(false);
            info.setMsg("该宿舍楼与楼号组合已存在");
        }
        return info;
    }

    /**
     * 修改维修信息
     * @param dormRepair
     * @return
     */
    @RequestMapping("/updateDormRepair")
    public ResultInfo updateDorm(DormRepair dormRepair){
        dormRepairService.updateDormRepair(dormRepair);
        info.setFlag(true);
        info.setMsg("修改成功");
        return info;

    }

    /**
     * 根据id删除维修信息
     */
    @RequestMapping("/delDormRepair")
    @ResponseBody
    public ResultInfo delDorm(String r_id){
        dormRepairService.delDormRepair(r_id);
        info.setFlag(true);
        info.setMsg("删除成功");
        return info;
    }
}
