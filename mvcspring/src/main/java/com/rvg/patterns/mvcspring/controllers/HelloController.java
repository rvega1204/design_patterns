/**
 * HelloController is a Spring MVC controller that handles HTTP requests
 * for the "/hello" URL.
 * 
 * This controller adds a message to the model and returns the view name
 * "helloMvc" to be rendered.
 * 
 * Annotations:
 * @Controller - Indicates that this class serves the role of a controller in Spring MVC.
 * @RequestMapping("/hello") - Maps HTTP requests to the /hello URL to the hello() method.
 * 
 * Methods:
 * hello(ModelMap model) - Adds a "msg" attribute with the value "Hello Spring MVC" to the model
 *                         and returns the view name "helloMvc".
 * 
 * @param model - The ModelMap object used to pass attributes to the view.
 * @return The name of the view to be rendered, "helloMvc".
 */
package com.rvg.patterns.mvcspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(ModelMap model) {
        model.addAttribute("msg", "Hello Spring MVC");
        return "helloMvc";
    }
}
