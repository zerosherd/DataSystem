package zerosherd.project.DataManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @Description: This is a Controller for Log in
 * @ClassName: LoginController
 * @Author: ZeroSherd
 * @Date: 2022/2/25 14:31
 */

@RestController
public class LoginController {

    @RequestMapping(value="/", method = { RequestMethod.POST, RequestMethod.GET })
    public String homePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        session.setAttribute("data", "userInfo");
        String sessionId = session.getId();
        if (session.isNew()) {
            response.getWriter().print("session创建成功，session的id是："+sessionId);
        }else {
            response.getWriter().print("服务器已经存在该session了，session的id是："+sessionId);
        }
        response.sendRedirect("/homePage");
        return null;

    }


}
