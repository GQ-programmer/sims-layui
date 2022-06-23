package pub.zgq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pub.zgq.dao.ClassDao;
import pub.zgq.pojo.Class;
import pub.zgq.pojo.ResultInfo;
import pub.zgq.service.ClassService;
import pub.zgq.utils.LayuiUtil;

import java.util.List;

/**
 * @Author 孑然
 *
 * 班级信息
 */
@RestController
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private ResultInfo info;
    @Autowired
    private ClassService classService;


    /**
     * 查询所有班级
     * @param class_
     * @return
     */
    @RequestMapping("/findAll")
    public LayuiUtil findAll(Class class_){
        List<Class> list = classService.findAll(class_);
        int count = list.size();
        return LayuiUtil.data(count,list);
    }

    /**
     * 根据班级ID更新
     * @param class_
     * @return
     */
    @RequestMapping("updateClass")
    public ResultInfo updateClass(Class class_){
        classService.updateClass(class_);
        info.setFlag(true);
        info.setMsg("修改成功");
        return info;
    }

    /**
     * 添加班级
     *
     */
    @RequestMapping("/addClass")
    public ResultInfo addClass(Class class_){
        boolean flag = classService.addClass(class_);
        if (flag == true){
            info.setFlag(true);
            info.setMsg("添加成功");
        }else if (flag == false){
            info.setFlag(false);
            info.setMsg("该学号已存在");
        }
        return info;

    }

    /**
     * 根据班级ID删除学生
     */
    @RequestMapping("/delClass")
    public ResultInfo delStu(String c_id){
        classService.delStu(c_id);
        info.setFlag(true);
        info.setMsg("删除成功");
        return info;
    }
}
