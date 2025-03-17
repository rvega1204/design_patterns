package com.rvg.patterns.movietickets.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rvg.patterns.movietickets.dao.TicketDAO;
import com.rvg.patterns.movietickets.bo.Ticket;

/**
 * Service implementation for managing ticket purchases.
 * This class implements the TicketService interface and provides
 * the functionality to purchase tickets.
 * 
 * @Service annotation indicates that this class is a Spring service.
 */
@Service
public class TicketServiceImpl implements TicketService {

    /**
     * The TicketDAO instance used to interact with the data source.
     * It is autowired by Spring to inject the dependency.
     */
    @Autowired
    private TicketDAO ticketDAO;

    /**
     * Purchases a ticket by converting the business object (BO) Ticket
     * to an entity object and then saving it using the TicketDAO.
     * 
     * @param ticket the Ticket business object containing the details of the ticket to be purchased.
     */
    @Override
    public void purchaseTicket(Ticket ticket) {
        // Create a new entity object for the ticket
        com.rvg.patterns.movietickets.entities.Ticket ticketEntity = new com.rvg.patterns.movietickets.entities.Ticket();
        
        // Set the movie name from the business object to the entity object
        ticketEntity.setMovie(ticket.getMovieName());
        
        // Set the screen number from the business object to the entity object
        ticketEntity.setScreen(ticket.getScreenNo());
        
        // Set the seat number from the business object to the entity object
        ticketEntity.setSeat(ticket.getSeatNo());
        
        // Save the ticket entity using the TicketDAO
        ticketDAO.create(ticketEntity);
    }

}
