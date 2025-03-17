package com.rvg.patterns.movietickets.entities;

/**
 * The {@code Ticket} class represents a movie ticket with details such as
 * the ticket ID, movie name, screen number, and seat number.
 * <p>
 * This class provides getter and setter methods to access and modify the
 * ticket details.
 * </p>
 */
public class Ticket {

    /**
     * The unique identifier for the ticket.
     */
    private int id;

    /**
     * The name of the movie for which the ticket is issued.
     */
    private String movie;

    /**
     * The screen number where the movie will be shown.
     */
    private String screen;

    /**
     * The seat number assigned to the ticket.
     */
    private String seat;

    /**
     * Gets the unique identifier for the ticket.
     *
     * @return the ticket ID
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the ticket.
     *
     * @param id the ticket ID to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the name of the movie for which the ticket is issued.
     *
     * @return the movie name
     */
    public String getMovie() {
        return movie;
    }

    /**
     * Sets the name of the movie for which the ticket is issued.
     *
     * @param movie the movie name to set
     */
    public void setMovie(String movie) {
        this.movie = movie;
    }

    /**
     * Gets the screen number where the movie will be shown.
     *
     * @return the screen number
     */
    public String getScreen() {
        return screen;
    }

    /**
     * Sets the screen number where the movie will be shown.
     *
     * @param screen the screen number to set
     */
    public void setScreen(String screen) {
        this.screen = screen;
    }

    /**
     * Gets the seat number assigned to the ticket.
     *
     * @return the seat number
     */
    public String getSeat() {
        return seat;
    }

    /**
     * Sets the seat number assigned to the ticket.
     *
     * @param seat the seat number to set
     */
    public void setSeat(String seat) {
        this.seat = seat;
    }
}
