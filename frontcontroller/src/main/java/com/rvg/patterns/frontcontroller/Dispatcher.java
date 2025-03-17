/**
 * The Dispatcher class is responsible for dispatching requests to the appropriate view.
 * It uses the HttpServletRequest and HttpServletResponse objects to forward the request
 * to the specified view.
 */
package com.rvg.patterns.frontcontroller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Dispatcher {

    /**
     * Dispatches the request to the specified view.
     * @param request
     * @param response
     * @param view
     */
    public void dispatch(HttpServletRequest request, HttpServletResponse response, String view) {
        try {
            if (view != null) {
                request.getRequestDispatcher(mapPageToView(view)).forward(request, response);   
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    /**
     * Maps a given view name to its corresponding JSP page.
     *
     * @param view the name of the view to be mapped
     * @return the corresponding JSP page for the given view name, or null if the view name is not recognized
     */
    private String mapPageToView(String view) {
        if (view.equals("showStudentDetails")) {
            return "viewStudentDetails.jsp";
        }

        return null;
    }

}
