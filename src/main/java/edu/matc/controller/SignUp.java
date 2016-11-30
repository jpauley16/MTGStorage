package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.entity.Role;

import edu.matc.persistence.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.log4j.Logger;

/**
 * Created by netherskub on 11/29/16.
 */

@WebServlet(name = "SignUp", urlPatterns = { "/sign-up" } )
public class SignUp extends HttpServlet{

    private final Logger log = Logger.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user_name = request.getParameter("user_name");
        String user_pass = request.getParameter("user_pass");
        UserDao dao = new UserDao();

        User existingUser = dao.getUser(user_name);

        if (existingUser == null) {
            User user = new User();
            user.setUser_name(user_name);
            user.setUser_pass(user_pass);
            log.info("Adding User: " + user_name);
            dao.addUser(user);

            Role role = new Role();
            role.setUser_name(user_name);
            role.setRole_name("registered-user");
            dao.createUserRole(role);

            String url = "/index.jsp";
            response.sendRedirect(url);
        } else {
            response.sendError(400, "Username taken");
        }

    }
}
