package edu.matc.controller;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;



@WebServlet (
        name = "loginSignupDisplay",
        urlPatterns = {"/signup-display"}
)
public class SignupDisplay extends HttpServlet {


    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {

        String url = "/signup.jsp";

        RequestDispatcher dispatcher =
                request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}