package com.rvg.patterns.prototype;

/**
 * The {@code Game} class represents a game with an id, name, and membership.
 * It implements the {@code Cloneable} interface to allow for cloning of game objects.
 * This class provides both shallow and deep copy mechanisms.
 * 
 * <p>Usage example:
 * <pre>
 *     Game originalGame = new Game();
 *     originalGame.setId(1);
 *     originalGame.setName("Chess");
 *     originalGame.setMembership(new Membership());
 *     
 *     // Shallow copy
 *     Game shallowCopy = originalGame.clone();
 *     
 *     // Deep copy
 *     Game deepCopy = new Game(originalGame);
 * </pre>
 * </p>
 * 
 * @see Cloneable
 */
public class Game implements Cloneable {

    /**
     * The unique identifier for the game.
     */
    private int id;

    /**
     * The name of the game.
     */
    private String name;

    /**
     * The membership associated with the game.
     */
    private Membership membership;

    /**
     * Gets the membership associated with the game.
     * 
     * @return the membership of the game
     */
    public Membership getMembership() {
        return membership;
    }

    /**
     * Sets the membership for the game.
     * 
     * @param membership the membership to set
     */
    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    /**
     * Gets the unique identifier for the game.
     * 
     * @return the id of the game
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the game.
     * 
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the name of the game.
     * 
     * @return the name of the game
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the game.
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Creates a shallow copy of the game object.
     * 
     * @return a shallow copy of the game
     * @throws CloneNotSupportedException if the object's class does not support the {@code Cloneable} interface
     */
    @Override
    protected Game clone() throws CloneNotSupportedException {
        Game game = (Game) super.clone();
        game.setMembership(new Membership());
        return game;
    }

    /**
     * Default constructor for the {@code Game} class.
     */
    Game() {
    }

    /**
     * Deep copy constructor for the {@code Game} class.
     * This constructor creates a new {@code Game} object with the same properties as the given game.
     * 
     * @param game the game to copy
     */
    Game(Game game) {
        this.id = game.id;
        this.name = game.name;
        this.membership = new Membership();
    }

    /**
     * Returns a string representation of the game object.
     * 
     * @return a string representation of the game
     */
    @Override
    public String toString() {
        return "Game{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", membership = " + membership +
                '}';
    }
}
