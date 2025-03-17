/**
 * FrontController is a servlet that acts as the central point for handling all incoming requests
 * with the ".do" extension. It uses the Front Controller design pattern to delegate the request
 * processing to appropriate commands and dispatches the response to the corresponding view.
 * 
 * <p>This servlet overrides the doGet method to handle GET requests. It extracts the request URI,
 * determines the appropriate command to execute based on the URI, and then dispatches the request
 * to the appropriate view.
 * 
 * <p>Example usage:
 * <pre>
 * {@code
 * http://localhost:8080/app/someAction.do
 * }
 * </pre>
 * 
 * @see jakarta.servlet.http.HttpServlet
 * @see jakarta.servlet.http.HttpServletRequest
 * @see jakarta.servlet.http.HttpServletResponse
 * @see jakarta.servlet.ServletException
 * @see java.io.IOException
 */
package com.rvg.patterns.frontcontroller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// The FrontController servlet is responsible for handling all incoming requests with the ".do" extension.
// It uses the CommandHelper class to determine the appropriate command to execute based on the request URI.
// The CommandHelper class returns an instance of the Command interface, which is then executed to process the request.
// The FrontController servlet also uses the Dispatcher class to dispatch the response to the appropriate view.
// The Dispatcher class forwards the request to the specified JSP page based on the view name returned by the command.
@WebServlet("*.do")
public class FrontController extends HttpServlet{

    
    /**
     * Handles the HTTP GET request.
     *
     * @param request  the HttpServletRequest object that contains the request the client has made of the servlet
     * @param response the HttpServletResponse object that contains the response the servlet sends to the client
     * @throws ServletException if the request could not be handled
     * @throws IOException      if an input or output error is detected when the servlet handles the GET request
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        System.out.println("Request URI: " + requestURI);
        CommandHelper commandHelper = new CommandHelper();
        Command command = commandHelper.getCommand(requestURI);
        String view = command.execute(request, response);
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.dispatch(request, response, view);
    }
}
