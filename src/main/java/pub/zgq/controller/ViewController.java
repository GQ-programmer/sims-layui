package pub.zgq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pub.zgq.dao.ClassDao;
import pub.zgq.pojo.Class;
import pub.zgq.utils.LayuiUtil;

import java.util.List;

@Controller
public class ViewController {
    //@Autowired
    //private ClassDao classDao;

    @RequestMapping("/")
    public String  loginList(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }

    @RequestMapping("/massage")
    public String massage(){
        return "massage";
    }

    @RequestMapping("/stuList")
    public String stuList(){
        return "stuList";
    }

    @RequestMapping("/classList")
    public String classList(){
        return "classList";
    }

    @RequestMapping("/dorm_list")
    public String dormList(){
        return "dorm_list";
    }

    @RequestMapping("/dorm_repair")
    public String dormrepair(){
        return "dorm_repair";
    }

    @RequestMapping("/dorm_grade")
    public String dormgrade(){
        return "dorm_grade";
    }

    @RequestMapping("/class_grade")
    public String classgrade(){
        return "class_grade";
    }

    @RequestMapping("/visitor_list")
    public String visitorlist(){
        return "visitor_list";
    }

    @RequestMapping("/admin_list")
    public String adminlist(){
        return "admin_list";
    }

    @RequestMapping("/log_list")
    public String loglist(){
        return "log_list";
    }
}
