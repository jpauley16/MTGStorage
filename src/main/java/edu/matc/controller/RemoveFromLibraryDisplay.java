package edu.matc.controller;

import edu.matc.entity.Card;
import edu.matc.entity.User;
import edu.matc.persistence.CardDao;
import edu.matc.persistence.UserDao;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;



@WebServlet (
        name = "removeFromLibraryDisplay",
        urlPatterns = {"/remove-from-library-display"}
)
public class RemoveFromLibraryDisplay extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {

        UserDao dao = new UserDao();
        User currentUser = dao.getUser(request.getUserPrincipal().getName());
        String username = currentUser.getUser_name();
        request.setAttribute("user", "signed in as: " + username);

        CardDao cardDao = new CardDao();
        Set<Card> cards = cardDao.getAllCardsByUsername(username);

        request.setAttribute("cards", cards);

        log.info(cards);


        String url = "/removeFromLibrary.jsp";

        RequestDispatcher dispatcher =
                request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
