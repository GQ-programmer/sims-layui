package pub.zgq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pub.zgq.pojo.DormGrade;
import pub.zgq.pojo.ResultInfo;
import pub.zgq.pojo.Student;
import pub.zgq.service.DormGradeService;
import pub.zgq.utils.LayuiUtil;

import java.util.List;

/**
 * @Author 孑然
 */
@RequestMapping("/dormGrade")
@RestController
public class DormGradeController {

    @Autowired
    private DormGradeService dormGradeService;
    @Autowired
    private ResultInfo info;

    @RequestMapping("/findAll")
    public LayuiUtil findAll(DormGrade dormGrade){

        List<DormGrade> list = dormGradeService.findAll(dormGrade);
        int count = list.size();
        return LayuiUtil.data(count,list);
    }

    @RequestMapping("/updateDormGrade")
    public ResultInfo updateDormGrade(DormGrade dormGrade){
        dormGradeService.updateDormGrade(dormGrade);
        info.setFlag(true);
        info.setMsg("修改成功");
        return info;
    }

    @RequestMapping("/addDormGrade")
    public ResultInfo addDormGrade(DormGrade dormGrade){
        boolean flag = dormGradeService.addDormGrade(dormGrade);
        if (flag == true){
            info.setFlag(true);
            info.setMsg("添加成功");
        }else if (flag == false){
            info.setFlag(false);
            info.setMsg("该宿舍楼与楼号组合已存在");
        }

        return info;
    }

    @RequestMapping("/delDormGrade")
    public ResultInfo delDormGrade(String dg_id){
        dormGradeService.delDormGrade(dg_id);
        info.setFlag(true);
        info.setMsg("删除成功");
        return info;
    }
}
