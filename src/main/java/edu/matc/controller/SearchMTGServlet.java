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

import com.deckbrew.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
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
        url += "?name="     + URLEncoder.encode(nameVal, "UTF-8");
        WebTarget target = client.target(url);
        String serviceResponse = target.request(MediaType.APPLICATION_JSON).get(String.class);
        //log.info(serviceResponse);

        ObjectMapper mapper = new ObjectMapper();

        Response results = mapper.readValue(serviceResponse, Response.class);
        log.info(results);
        //List<Results> results = mapper.readValue(serviceResponse, new TypeReference<List<Results>>() {});

        //Results results = mapper.readValue(serviceResponse, Results.class);
        //ResultsItem resultsItem = results.getResults().get(0);
        //log.info(results);


        String urlForward = "/searchMTGCards.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(urlForward);
        dispatcher.forward(request, response);

    }
}
