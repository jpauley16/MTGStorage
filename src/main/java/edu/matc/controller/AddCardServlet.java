package edu.matc.controller;

import edu.matc.entity.Card;
import edu.matc.persistence.CardDao;

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
        CardDao dao = new CardDao();
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

        dao.addCard(card);

        //Else, update card



        String url = "/addToLibrary.jsp";

        response.sendRedirect(url);

    }
}
