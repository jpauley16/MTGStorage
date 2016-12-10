package edu.matc.controller;

import edu.matc.entity.Card;
import edu.matc.entity.User;
import edu.matc.persistence.CardDao;
import edu.matc.persistence.UserDao;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 * Created by netherskub on 10/29/16.
 */

@WebServlet (name = "cardAddServlet",
             urlPatterns = {"/card-add-servlet"})
public class AddCardServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UserDao dao = new UserDao();
        User currentUser = dao.getUser(request.getUserPrincipal().getName());
        String username = currentUser.getUser_name();
        request.setAttribute("user", currentUser);

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



        //Check if card is in the database
        //If card doesn't exist, add card to database
        CardDao cardDao = new CardDao();
        Card card = new Card();

        card.setName(name);
        card.setManaCost(manaCost);
        card.setSuperType(superType);
        card.setSubtype(subType);
        card.setCardType(cardType);
        card.setRarity(rarity);
        card.setPower(power);
        card.setToughness(toughness);
        card.setColor(color);
        card.setQty(qty);
        card.setUsername(username);

        cardDao.addCard(card);

        //Else, update card



        String url = "/addToLibrary.jsp";

        response.sendRedirect(url);

    }
}
