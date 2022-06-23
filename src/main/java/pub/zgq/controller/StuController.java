package pub.zgq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pub.zgq.dao.StudentDao;
import pub.zgq.pojo.Class;
import pub.zgq.pojo.ResultInfo;
import pub.zgq.pojo.Student;
import pub.zgq.service.StudentService;
import pub.zgq.utils.LayuiUtil;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StuController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private ResultInfo info;

    /**
     * 查询学生列表
     * @param student
     * @return
     */
    @RequestMapping("/findAll")
    @ResponseBody
    public LayuiUtil findAll(Student student){
        List<Student> list = studentService.findAll(student);
        int count = list.size();
        return LayuiUtil.data(count,list);
    }

    /**
     * 根据学号更新学生信息
     */
    @RequestMapping("/updateStu")
    @ResponseBody
    public ResultInfo updateStu(Student student){
        studentService.updateStu(student);
        info.setFlag(true);
        info.setMsg("修改成功");
        return info;
    }
    /**
     * 添加学生信息
     */
    @RequestMapping("/addStu")
    @ResponseBody
    public ResultInfo addStu(Student student){
        boolean flag = studentService.addStu(student);
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
     * 根据学号删除学生
     */
    @RequestMapping("/delStu")
    @ResponseBody
    public ResultInfo delStu(String sid){
        studentService.delStu(sid);
        info.setFlag(true);
        info.setMsg("删除成功");
        return info;
    }
}
