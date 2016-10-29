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

@WebServlet (name = "removeCardServlet",
        urlPatterns = {"/remove-card-servlet"})
public class RemoveCardServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        //Check if card is in the database
        //If card doesn't exist, send error message


        //Else, delete card



        String url = "/removeFromLibrary.jsp";

        response.sendRedirect(url);

    }
}
