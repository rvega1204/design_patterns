package com.rvg.patterns.interceptingfilter;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * This is the HomeServlet class that extends HttpServlet and overrides the doGet method.
 * The doGet method sets the userName attribute to "Bob" and forwards the request to the home.jsp page.
 * The home.jsp page will display the userName attribute value.
 */
@WebServlet("/homeServlet")
public class HomeServlet extends HttpServlet{


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("userName", "Bob");
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }
}
