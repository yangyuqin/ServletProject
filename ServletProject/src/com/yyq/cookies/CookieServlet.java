package com.yyq.cookies;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by gao on 16-4-14.
 */
public class CookieServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建一个Cookie实例
        Cookie cookie = new Cookie("username", "yuqin");
        //设置有效时间为1天
        cookie.setMaxAge(24 * 3600);
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        //往响应中写入Cookie
        resp.addCookie(cookie);
        //获取Cookie数组
        Cookie[] cookies = req.getCookies();
        if (null == cookies) {
            out.println("<h3>还没有Cookie</h3>");
        } else {
            out.println("<h3>Cookie列表</h3>");
            //遍历Cookie信息
            for (int i = 0; i < cookies.length; i++) {
                out.print("Cookie名称：" + cookies[i].getName());
                out.println("，对应的值为：" + cookies[i].getValue());
                out.println("<br />");
            }

        }
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
