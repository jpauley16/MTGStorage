package edu.matc.controller;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;



@WebServlet (
        name = "loginDisplay",
        urlPatterns = {"/login-display"}
)
public class LoginDisplay extends HttpServlet {


    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        HttpSession session = request.getSession();

        String url = "/login.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}