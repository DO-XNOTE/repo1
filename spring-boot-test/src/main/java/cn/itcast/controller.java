package cn.itcast;

import cn.itcast.domain.Account;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import javax.servlet.annotation.WebServlet;

@RestController
@RequestMapping("/param")
//@WebServlet
public class controller {

    @RequestMapping("/testParam")
    public String testParam(String name, String password){
        System.out.println("执行了....wqwq");
        return "success...";
    }

    /**
     * 把数据封装到javabean的类中
     * @param name
     * @param password
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("执行了....");
        System.out.println(account);
        return "success...account";
    }
    /**
     * 把数据封装到javabean的类中
     * @param name
     * @param password
     * @return
     */
    @RequestMapping("/testServletApi")
    public String testServletApi(HttpServletRequest request, HttpServletResponse response){
        System.out.println("执行了....");
        HttpSession session = request.getSession();
        System.out.println(session);
        ServletContext context = session.getServletContext();
        System.out.println(context);
        System.out.println(response);
        System.out.println("测试git");

        return "success...servlet";
    }

}
