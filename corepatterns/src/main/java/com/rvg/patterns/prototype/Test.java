/**
 * This is a test class to demonstrate the Prototype design pattern.
 * It creates instances of the Game class and performs cloning operations.
 * 
 * The main method performs the following actions:
 * 1. Creates an instance of Game (game1) and sets its properties.
 * 2. Clones game1 to create a new instance (game2).
 * 3. Verifies that game1 and game2 are not the same instance.
 * 4. Verifies that game1 and game2 have the same properties.
 * 5. Prints the details of both game1 and game2.
 * 6. Creates a deep copy of game1 (game3) using a copy constructor.
 * 7. Prints the details of game3.
 * 
 * Note: The equals method should be overridden in the Game class to ensure
 * that the properties of game1 and game2 are compared correctly.
 * 
 * @throws CloneNotSupportedException if the Game class does not support cloning.
 */
package com.rvg.patterns.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Game game1 = new Game();
        game1.setId(1);
        game1.setName("Game 1");
        game1.setMembership(new Membership());

        Game game2 = game1.clone();

        // Verify that the cloned object is not the same instance
        System.out.println("Are game1 and game2 the same instance? " + (game1 == game2)); // false

        // Verify that the cloned object has the same properties
        System.out.println("Do game1 and game2 have the same properties? " + game1.equals(game2)); // true if equals is overridden

        // Print the details of both objects
        System.out.println("game1: " + game1);
        System.out.println("game2: " + game2);

        // Deep copy
        Game game3 = new Game(game1);
        System.out.println("game3: " + game3);
    }
}
