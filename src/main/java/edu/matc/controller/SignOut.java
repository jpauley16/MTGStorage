package edu.matc.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.log4j.Logger;

/**
 * Created by netherskub on 12/09/16.
 */
@WebServlet(name = "SignOut", urlPatterns = { "/signOut" } )
public class SignOut extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            request.logout();
            log.debug("Logging out");

        } catch (ServletException e) {

            log.debug("Failed to logout");
            log.error(e);

        }

        response.sendRedirect("signout.jsp");
    }
}