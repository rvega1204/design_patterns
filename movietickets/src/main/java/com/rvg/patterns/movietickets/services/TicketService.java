/**
 * The TicketService interface provides a contract for purchasing movie tickets.
 * Implementations of this interface should define the logic for purchasing a ticket.
 * 
 * <p>
 * Example usage:
 * <pre>
 * {@code
 * TicketService ticketService = new TicketServiceImpl();
 * Ticket ticket = new Ticket();
 * ticketService.purchaseTicket(ticket);
 * }
 * </pre>
 * </p>
 * 
 * @see com.rvg.patterns.movietickets.bo.Ticket
 */
package com.rvg.patterns.movietickets.services;

import com.rvg.patterns.movietickets.bo.Ticket;

public interface TicketService {

    void purchaseTicket(Ticket ticket);
}
