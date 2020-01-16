package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")

public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        //TODO: making sure raw empty data cannot be inputted
        boolean inputIsEmpty = (username.isEmpty() || password.isEmpty() || email.isEmpty());
        if(inputIsEmpty)
        {
            response.sendRedirect("/register?null");
        } else
            {
            // TODO: create a new user based off of the submitted information
            User user = new User(username, password, email);
            DaoFactory.getUsersDao().insert(user);
            // TODO: if a user was successfully created, send them to their profile
            response.sendRedirect("/profile");
            }


    }
}
