/**
 * The CommandHelper class is responsible for determining the appropriate command
 * to execute based on the provided request URI.
 */
package com.rvg.patterns.frontcontroller;


public class CommandHelper {

    public Command getCommand(String requestURI) {
        if (requestURI.contains("viewStudentDetails")) {
            return new ViewStudentCommand();
        }

        return null;
    }

}
