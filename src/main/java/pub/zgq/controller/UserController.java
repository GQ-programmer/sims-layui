package pub.zgq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pub.zgq.pojo.Log;
import pub.zgq.pojo.ResultInfo;
import pub.zgq.pojo.User;
import pub.zgq.service.LogService;
import pub.zgq.service.UserService;
import pub.zgq.utils.LayuiUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 管理员
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private ResultInfo info;
    @Autowired
    private UserService userService;
    @Autowired
    private LogService logService;

    /**
     * 登录方法
     * @param user
     * @param session
     * @return
     */
    @RequestMapping("/loginUser")
    @ResponseBody
    public ResultInfo loginUser(User user, HttpSession session){
        User u = userService.findUser(user);
        if (u != null){
            //登录成功
            //向日志中添加一条登录日志
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss秒 E");
            String format = dateFormat.format(date);

            Log log = new Log();
            log.setUsername(u.getUsername());
            log.setName(u.getName());
            log.setSex(u.getSex());
            log.setTel(u.getTel());
            log.setLogin_time(format);
            logService.addLog(log);

            //将user存进session中
            info.setFlag(true);
            session.setAttribute("user",u);

        }else if (u == null){
            //登陆失败
            info.setFlag(false);
            info.setMsg("账号或密码错误！");
        }
        return  info;
    }

    /**
     * 查询登陆信息
     */
    @RequestMapping("/isLogin")
    @ResponseBody
    public ResultInfo isLogin(HttpSession session){
        User user = (User) session.getAttribute("user");
        info.setUser(user);
        return info;
    }

    @RequestMapping("/exit")
    @ResponseBody
    public void exit(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //删除登录态
        request.getSession().removeAttribute("user");
        //重定向到登录页面
        response.sendRedirect("/login");
    }

    /**
     * 查询所有管理员
     * @return
     */
    @RequestMapping("/findAll")
    @ResponseBody
    public LayuiUtil findAll(){
        List<User> list = userService.findAll();
        int count = list.size();
        return LayuiUtil.data(count,list);
    }

}
