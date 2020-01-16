package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import com.mysql.cj.xdevapi.Session;

import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        boolean validAttempt = false;
        User user = DaoFactory.getUsersDao().findByUsername(username);
        // TODO: make sure we find a user with that username
        if (DaoFactory.getUsersDao().findByUsername(username) != null) {
            // TODO: find a record in your database that matches the submitted password
            // TODO: check the submitted password against what you have in your database
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                session.setAttribute("username", username);
                session.setAttribute("password", password);
                validAttempt = true;
                if (validAttempt) {
                    // TODO: store the logged in user object in the session, instead of just the username
                    request.getSession().setAttribute("user", username);
                    response.sendRedirect("/profile");
                    return;
                } else {
                    response.sendRedirect("/login?error");
                }
            } else {
                response.sendRedirect("/login?error");
            }
        } else {
            response.sendRedirect("/login?error");
        }
    }
}


