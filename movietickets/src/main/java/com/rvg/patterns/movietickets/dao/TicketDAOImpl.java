/**
 * Implementation of the TicketDAO interface for managing Ticket entities in the database.
 * This class uses Spring's JdbcTemplate to perform database operations.
 * 
 * <p>
 * The class is annotated with @Repository to indicate that it's a Spring Data Repository.
 * </p>
 * 
 * <p>
 * The SQL query for inserting a ticket is defined as a constant string.
 * </p>
 * 
 * <p>
 * The JdbcTemplate is injected using Spring's @Autowired annotation.
 * </p>
 * 
 * <p>
 * The create method inserts a new ticket into the database using the provided Ticket object.
 * </p>
 * 
 * @see com.rvg.patterns.movietickets.entities.Ticket
 * @see org.springframework.jdbc.core.JdbcTemplate
 * @see org.springframework.beans.factory.annotation.Autowired
 * @see org.springframework.stereotype.Repository
 */
package com.rvg.patterns.movietickets.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rvg.patterns.movietickets.entities.Ticket;

@Repository
public class TicketDAOImpl implements TicketDAO {

    private static final String INSERT_TICKET = "insert into ticket (movie, screen, seat) values (?, ?, ?)";

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void create(Ticket ticket) {
        jdbcTemplate.update(INSERT_TICKET,
                ticket.getMovie(), ticket.getScreen(), ticket.getSeat());
    }

}
