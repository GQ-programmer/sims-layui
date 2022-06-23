package pub.zgq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pub.zgq.pojo.ClassGrade;
import pub.zgq.pojo.DormGrade;
import pub.zgq.pojo.ResultInfo;
import pub.zgq.service.ClassGradeService;
import pub.zgq.utils.LayuiUtil;

import java.util.List;

/**
 * @Author 孑然
 */
@RequestMapping("/classGrade")
@RestController
public class ClassGradeController {

    @Autowired
    private ClassGradeService classGradeService;
    @Autowired
    private ResultInfo info;

    @RequestMapping("/findAll")
    public LayuiUtil findAll(ClassGrade classGrade){

        List<ClassGrade> list = classGradeService.findAll(classGrade);
        int count = list.size();
        return LayuiUtil.data(count,list);

    }

    @RequestMapping("/addClassGrade")
    public ResultInfo addClassGrade(ClassGrade classGrade){
        boolean flag = classGradeService.addClassGrade(classGrade);
        if (flag == true){
            info.setFlag(true);
            info.setMsg("添加成功");
        }else {
            info.setFlag(false);
            info.setMsg("该班级编号已存在");
        }
        return info;
    }

    @RequestMapping("/updateClassGrade")
    public ResultInfo updateClassGrade(ClassGrade classGrade){
        classGradeService.updateClassGrade(classGrade);
        info.setFlag(true);
        info.setMsg("修改成功");
        return info;
    }

    @RequestMapping("/delClassGrade")
    public ResultInfo delClassGrade(String cg_id){
        classGradeService.delClassGrade(cg_id);
        info.setFlag(true);
        info.setMsg("删除成功");
        return info;
    }
}
