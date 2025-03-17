package com.rvg.patterns.movietickets.controllers;

import com.rvg.patterns.movietickets.bo.Ticket;
import com.rvg.patterns.movietickets.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Controller class for handling ticket-related requests.
 * This class is annotated with @Controller to indicate that it is a Spring MVC controller.
 */
@Controller
public class TicketController {

    /**
     * Service for handling ticket operations.
     * This field is autowired by Spring to inject the TicketService bean.
     */
    @Autowired
    private TicketService service;

    /**
     * Handles the request to show the create ticket page.
     * 
     * @return the name of the view to be rendered, which is "createTicket".
     */
    @RequestMapping("/showCreateTicket")
    public String showCreateTicket() {
        return "createTicket";
    }

    /**
     * Handles the request to create a new ticket.
     * 
     * @param ticket the Ticket object containing the ticket details.
     * @param redirectAttributes used to pass flash attributes (temporary attributes stored in the session) to the redirected request.
     * @return a redirect URL to the showCreateTicket endpoint.
     */
    @RequestMapping("/createTicket")
    public String createTicket(Ticket ticket, RedirectAttributes redirectAttributes) {
        service.purchaseTicket(ticket);
        redirectAttributes.addFlashAttribute("msg", "Ticket created!");
        return "redirect:/showCreateTicket";
    }
}
