package pub.zgq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pub.zgq.pojo.DormGrade;
import pub.zgq.pojo.ResultInfo;
import pub.zgq.pojo.Visitor;
import pub.zgq.service.DormGradeService;
import pub.zgq.service.VisitorService;
import pub.zgq.utils.LayuiUtil;

import java.util.List;

/**
 * @Author 孑然
 */
@RequestMapping("/visitor")
@RestController
public class VisitorController {

    @Autowired
    private VisitorService visitorService;

    @Autowired
    private ResultInfo info;

    @RequestMapping("/findAll")
    public LayuiUtil findAll(Visitor visitor){

        List<Visitor> list = visitorService.findAll(visitor);
        Integer count = list.size();
        return LayuiUtil.data(count,list);
    }



    @RequestMapping("/addVisitor")
    public ResultInfo addVisitor(Visitor visitor){
        boolean flag = visitorService.addVisitor(visitor);
        if (flag == true){
            info.setFlag(true);
            info.setMsg("添加成功");
        }else if (flag == false){
            info.setFlag(false);
            info.setMsg("添加失败!");
        }

        return info;
    }

    @RequestMapping("/delVisitor")
    public ResultInfo delVisitor(String v_id){
        visitorService.delVisitor(v_id);
        info.setFlag(true);
        info.setMsg("删除成功");
        return info;
    }
}
