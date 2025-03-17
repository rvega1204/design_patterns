/**
 * AverageController is a servlet that handles HTTP POST requests to calculate the average of two numbers.
 * It retrieves the numbers from the request parameters, uses the AverageModel to calculate the average,
 * and forwards the result to a JSP page for display.
 * 
 * <p>URL pattern: /averageController</p>
 * 
 * @see HttpServlet
 * @see HttpServletRequest
 * @see HttpServletResponse
 * @see ServletException
 * @see IOException
 */
package com.rvg.patterns.mvc.controller;

import java.io.IOException;

import com.rvg.patterns.mvc.model.AverageModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/averageController")
public class AverageController extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    // The doPost method is called when a POST request is sent to the servlet.
    // It retrieves the numbers from the request parameters, calculates the average using the AverageModel,
    // and forwards the result to a JSP page for display.
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("number1"));
        int num2 = Integer.parseInt(request.getParameter("number2"));
        
        AverageModel model = new AverageModel();
        int result = model.calculateAverage(num1, num2);
        request.setAttribute("result", result);

        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
