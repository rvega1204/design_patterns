package com.rvg.patterns.singleton;

import java.lang.reflect.Constructor;

/**
 * The ReflectionProblem class demonstrates the problem with the Singleton design pattern when using reflection.
 * 
 * <p>Reflection allows us to access private constructors and create new instances of a class, even if the constructor is private.
 * This can be a problem for the Singleton pattern, as it allows multiple instances to be created.</p>
 */
public class ReflectionProblem {

    public static void main(String[] args) {
        DateUtil instance1 = DateUtil.getInstance();
        DateUtil instance2 = null;

        Constructor[] constructors = DateUtil.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            try {
                instance2 = (DateUtil) constructor.newInstance();
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
