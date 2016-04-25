package com.yyq.firstdemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by gao on 16-4-13.
 */
public class FirstServletDemo extends HttpServlet {
    private String message;

    //处理HTTP GET请求
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h3>" + message + "</h3>");
    }

    //处理HTTP POST请求
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        //设置响应内容类型
//        resp.setContentType("text/html;charset=utf-8");
//        //从响应对象中获取打印流
//        PrintWriter out = resp.getWriter();
//        //写字符串
//        out.println("这是我的第一个Servelt应用示例");
    }

    //销毁Servlet实例对象时的回调方法
    @Override
    public void destroy() {
        super.destroy();
    }

    //初始化Servelt时的回调方法
    @Override
    public void init() throws ServletException {
        message = "Hello World. This is my first servlet project.";
    }
}
