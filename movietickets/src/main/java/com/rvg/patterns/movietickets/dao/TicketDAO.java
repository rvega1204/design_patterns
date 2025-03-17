/**
 * The TicketDAO interface provides the methods for creating and managing
 * Ticket entities in the data source.
 * 
 * <p>This interface defines the contract for the Data Access Object (DAO)
 * pattern, which abstracts the underlying data access implementation
 * and provides a consistent API for interacting with Ticket entities.</p>
 * 
 * <p>Implementations of this interface should provide the necessary logic
 * to persist Ticket entities to the data source, such as a database or
 * an in-memory data store.</p>
 * 
 * @see com.rvg.patterns.movietickets.entities.Ticket
 */
package com.rvg.patterns.movietickets.dao;

import com.rvg.patterns.movietickets.entities.Ticket;


public interface TicketDAO {

    void create(Ticket ticket);
}
