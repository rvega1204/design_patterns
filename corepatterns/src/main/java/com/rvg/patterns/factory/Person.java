/**
 * The Person interface represents a contract for a person entity.
 * Any class implementing this interface should provide an implementation
 * for the wish method, which allows the person to send a wish message.
 */
package com.rvg.patterns.factory;

public interface Person {

    void wish(String msg);
}
