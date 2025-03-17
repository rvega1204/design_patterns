/**
 * The Ticket class represents a movie ticket with details such as 
 * the ticket ID, movie name, screen number, and seat number.
 * Using Business Object pattern, this class is a simple POJO with
 * getter and setter methods for the ticket details.
 * 
 * <p>Example usage:</p>
 * <pre>
 *     Ticket ticket = new Ticket();
 *     ticket.setId(1);
 *     ticket.setMovieName("Inception");
 *     ticket.setScreenNo("Screen 5");
 *     ticket.setSeatNo("A10");
 * </pre>
 * 
 * @author rvega
 */

package com.rvg.patterns.movietickets.bo;


public class Ticket {

    private int id;
    private String movieName;
    private String screenNo;
    private String seatNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getScreenNo() {
        return screenNo;
    }

    public void setScreenNo(String screenNo) {
        this.screenNo = screenNo;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }
}
