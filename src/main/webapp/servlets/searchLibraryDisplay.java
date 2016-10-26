/**package edu.matc;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import edu.matc.entity.Card;


@WebServlet (
        name = "searchLibraryDisplay",
        urlPatterns = {"/search-library-display"}
)
public class SearchLibraryDisplay extends HttpServlet {


    public void doGet(HttpServletRequest request,
                      Http ServletResponse respone)
            throws ServletException, IOException
    {
        HttpSession session = request.getSession();

        String url = "/searchLibrary.jsp";

        RequestDispatcher dispatcher =
                getServeltContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
 */