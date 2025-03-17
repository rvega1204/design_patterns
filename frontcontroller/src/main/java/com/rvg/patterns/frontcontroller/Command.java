/**
 * The Command interface defines a contract for executing a command
 * within the Front Controller design pattern.
 * 
 * <p>Implementations of this interface are responsible for processing
 * HTTP requests and generating appropriate responses.</p>
 * 
 * @author rvega
 */
package com.rvg.patterns.frontcontroller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Command {

    String execute(HttpServletRequest request, HttpServletResponse response);
}
