package edu.matc.controller;

import edu.matc.entity.Card;
import edu.matc.entity.User;
import edu.matc.persistence.CardDao;
import edu.matc.persistence.UserDao;
import org.apache.log4j.Logger;

import java.io.*;
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
        log.info(card);

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

            request.setAttribute("cardAddMessage", "Card successfully entered!");
        }
        else
        {
            int cardKey;
            for(Card cardClass : card) {
                cardKey = cardClass.getCardKey();

                Card updateCard = new Card();

                updateCard.setCardKey(cardKey);
                updateCard.setName(name);
                updateCard.setManaCost(manaCost);
                updateCard.setSuperType(superType);
                updateCard.setSubType(subType);
                updateCard.setCardType(cardType);
                updateCard.setRarity(rarity);
                updateCard.setPower(power);
                updateCard.setToughness(toughness);
                updateCard.setColor(color);
                updateCard.setQty(qty);
                updateCard.setUsername(username);

                cardDao.updateCard(updateCard);
            }

            request.setAttribute("cardUpdateMessage", "Card successfully updated!");
        }

        String url = "/addToLibrary.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }
}