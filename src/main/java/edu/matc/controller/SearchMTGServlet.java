package edu.matc.controller;

import java.io.*;
import java.net.URLEncoder;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
/**
 * Created by netherskub on 12/11/16.
 */
@WebServlet (name = "searchMTG",
        urlPatterns = {"/search-mtg-servlet"})
public class SearchMTGServlet extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String nameVal = String.valueOf(name);

        Client client = ClientBuilder.newClient();
        String url = "http://api.deckbrew.com/mtg/cards";
        url += "?name=" + URLEncoder.encode(nameVal, "UTF-8");
        WebTarget target = client.target(url);
        String serviceResponse = target.request(MediaType.APPLICATION_JSON).get(String.class);
        log.info(serviceResponse);
        request.setAttribute("cardSearched", serviceResponse);


        String urlForward = "/searchMTGCards.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(urlForward);
        dispatcher.forward(request, response);

    }
}