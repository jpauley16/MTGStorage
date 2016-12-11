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
        name = "remove",
        urlPatterns = {"/display_remove"}
)
public class Remove extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        int cardKey = Integer.parseInt(request.getParameter("card"));

        CardDao cardDao = new CardDao();
        cardDao.deleteCard(cardKey);

        request.setAttribute("deleteMessage", "Card successfully deleted!");

        String url = "/remove-from-library-display";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);


    }
}