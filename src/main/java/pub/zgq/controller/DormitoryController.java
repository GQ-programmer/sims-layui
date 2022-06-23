package pub.zgq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pub.zgq.pojo.Dormitory;
import pub.zgq.pojo.ResultInfo;
import pub.zgq.service.DormitoryService;
import pub.zgq.utils.LayuiUtil;

import java.util.List;

/**
 * @Author 孑然
 */
@RequestMapping("/dorm")
@RestController
public class DormitoryController {

    @Autowired
    private DormitoryService dormitoryService;
    @Autowired
    private ResultInfo info;

    /**
     * 查询宿舍列表
     * @param dormitory
     * @return
     */
    @RequestMapping("/findAll")
    public LayuiUtil findAll(Dormitory dormitory){

        List<Dormitory> list = dormitoryService.findAll(dormitory);
        int count = list.size();
        return LayuiUtil.data(count,list);
    }

    /**
     * 添加宿舍
     * @param dormitory
     * @return
     */
    @RequestMapping("/addDorm")
    public ResultInfo addDorm(Dormitory dormitory){
        boolean flag = dormitoryService.addDorm(dormitory);
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
     * 修改宿舍信息
     * @param dormitory
     * @return
     */
    @RequestMapping("/updateDorm")
    public ResultInfo updateDorm(Dormitory dormitory){
        dormitoryService.updateDorm(dormitory);
        info.setFlag(true);
        info.setMsg("修改成功");
        return info;

    }

    /**
     * 根据id删除宿舍信息
     */
    @RequestMapping("/delDorm")
    @ResponseBody
    public ResultInfo delDorm(String sid){
        dormitoryService.delDorm(sid);
        info.setFlag(true);
        info.setMsg("删除成功");
        return info;
    }
}
