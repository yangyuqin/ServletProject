package com.yyq.sendredirect;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by gao on 16-4-14.
 */
public class Servlet01 extends HttpServlet{
    //处理HTTP GET请求
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doPost(req, resp);
    }

    //处理HTTP POST请求
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //重新定向到servlet02
        resp.sendRedirect("s02");
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
