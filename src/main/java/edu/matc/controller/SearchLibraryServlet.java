package edu.matc.controller;

import edu.matc.entity.Card;
import edu.matc.persistence.CardDao;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by netherskub on 12/9/16.
 */

@WebServlet(name = "searchCardServlet",
        urlPatterns = {"/search-card-servlet"})
public class SearchLibraryServlet extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String username = request.getUserPrincipal().getName();
        String name = request.getParameter("name");
        session.setAttribute("user", "signed in as: " + username);

        CardDao cardDao = new CardDao();
        Set<Card> card = cardDao.getCardByUsernameAndName(username, name);

        if (card.size() == 0)
        {
            request.setAttribute("error", "Card not found");
        }
        else
        {
            request.setAttribute("card", card);
        }

        String url = "/searchLibrary.jsp";

        RequestDispatcher dispatcher =
                request.getRequestDispatcher(url);
        dispatcher.forward(request, response);


    }
}
