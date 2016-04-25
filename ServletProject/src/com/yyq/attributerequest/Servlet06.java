package com.yyq.attributerequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by gao on 16-4-14.
 */
public class Servlet06 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><title>Servlet06</head></title>");
        out.println("<body>");
        String str = (String) req.getAttribute("content");
        out.print("从Servlet05中获取请求域属性content的值为：" + str);
        out.println("</body>");
        out.println("</html>");
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
