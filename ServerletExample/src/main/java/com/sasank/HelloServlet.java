package com.sasank;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In service method");
        res.setContentType("text/html");
        PrintWriter out= res.getWriter();

        out.println("<h1 style=\"color: red;\">Hello world</h1>");

    }

}
