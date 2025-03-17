/**
 * The ViewStudentCommand class implements the Command interface and is responsible
 * for handling the request to view student details.
 * 
 * <p>This class creates a StudentVO object with hardcoded values and sets it as an
 * attribute in the HttpServletRequest object. It then returns the name of the view
 * to be rendered.
 * 
 * <p>Usage:
 * <pre>
 * {@code
 * Command command = new ViewStudentCommand();
 * String view = command.execute(request, response);
 * }
 * </pre>
 * 
 * @see Command
 * @see StudentVO
 */
package com.rvg.patterns.frontcontroller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ViewStudentCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        StudentVO vo = new StudentVO(1, "Bob");
        request.setAttribute("studentDetails", vo);
        return "viewStudentDetails";
    }

}
