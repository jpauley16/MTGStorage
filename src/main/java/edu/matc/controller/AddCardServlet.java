package edu.matc.controller;

import edu.matc.entity.Card;
import edu.matc.entity.User;
import edu.matc.persistence.CardDao;
import edu.matc.persistence.UserDao;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 * Created by netherskub on 10/29/16.
 */

@WebServlet (name = "cardAddServlet",
             urlPatterns = {"/card-add-servlet"})
public class AddCardServlet extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        UserDao dao = new UserDao();
        User currentUser = dao.getUser(request.getUserPrincipal().getName());
        String username = currentUser.getUser_name();

        String name = request.getParameter("name");
        String manaCost = request.getParameter("cost");
        String superType = request.getParameter("superType");
        String subType = request.getParameter("subType");
        String cardType = request.getParameter("cardType");
        String rarity = request.getParameter("rarity");
        String power = request.getParameter("power");
        String toughness = request.getParameter("toughness");
        String color = request.getParameter("color");
        int qty = Integer.parseInt(request.getParameter("quantity"));

        CardDao cardDao = new CardDao();
        Set<Card> card = cardDao.getCardByUsernameAndName(username, name);
        log.info(card.toString());
        if (card.size() == 0)
        {
            Card newCard = new Card();

            newCard.setName(name);
            newCard.setManaCost(manaCost);
            newCard.setSuperType(superType);
            newCard.setSubType(subType);
            newCard.setCardType(cardType);
            newCard.setRarity(rarity);
            newCard.setPower(power);
            newCard.setToughness(toughness);
            newCard.setColor(color);
            newCard.setQty(qty);
            newCard.setUsername(username);

            cardDao.addCard(newCard);

            session.setAttribute("cardAddMessage", "Card successfully entered!");

            String url = "/add-to-library-display";

            response.sendRedirect(url);
        }
        else
        {


            String url = "/add-to-library-display";

            response.sendRedirect(url);
        }
    }
}
