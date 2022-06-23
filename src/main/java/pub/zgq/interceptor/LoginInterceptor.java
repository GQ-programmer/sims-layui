package pub.zgq.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import pub.zgq.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author 孑然
 */

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //判断是否登陆
        User user = (User)request.getSession().getAttribute("user");
        if (user == null){
            //跳转到login页面
            response.sendRedirect("/login");
            return false;
        }
        return true;
    }
}
