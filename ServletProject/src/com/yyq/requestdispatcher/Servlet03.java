package com.yyq.requestdispatcher;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by gao on 16-4-14.
 */
public class Servlet03 extends HttpServlet {
    //处理HTTP GET请求
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    //处理HTTP POST请求
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求分派器
        RequestDispatcher dispatcher = req.getRequestDispatcher("servlet04");
        //将请求转发至指定路径的资源
        dispatcher.forward(req,resp);
    }

    @Override
    public void destroy() {
        //空
    }

    @Override
    public void init() throws ServletException {
        //空
    }
}
