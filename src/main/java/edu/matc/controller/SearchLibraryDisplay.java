package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.persistence.UserDao;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;



@WebServlet (
        name = "searchLibraryDisplay",
        urlPatterns = {"/search-library-display"}
)
public class SearchLibraryDisplay extends HttpServlet {


    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {

        UserDao dao = new UserDao();

        User currentUser = dao.getUser(request.getUserPrincipal().getName());
        String username = currentUser.getUser_name();
        request.setAttribute("user", "signed in as: " + username);

        String url = "/searchLibrary.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
 