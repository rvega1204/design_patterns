/**
 * GreatestController is a servlet that handles HTTP POST requests to determine 
 * the greatest of two numbers. It retrieves the numbers from the request, 
 * uses the GreatestModel to calculate the greatest number, and forwards the 
 * result to a JSP page for display.
 * 
 * @extends HttpServlet
 * @version 1.0
 * @since 2023-10-01
 */
package com.rvg.patterns.mvc.controller;

import java.io.IOException;

import com.rvg.patterns.mvc.model.GreatestModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GreatestController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("number1"));
        int num2 = Integer.parseInt(request.getParameter("number2"));
        
        GreatestModel model = new GreatestModel();
        int result = model.calculateGreatest(num1, num2);
        request.setAttribute("result", result);

        request.getRequestDispatcher("greatest.jsp").forward(request, response);
    }

}
