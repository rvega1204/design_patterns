package com.rvg.patterns.singleton;

/**
 * This class demonstrates the use of an enum to implement the Singleton design pattern.
 * The EnumSingletonDemo class is a singleton that provides a single, globally accessible instance.
 * This class is thread-safe and ensures that only one instance of EnumSingletonDemo is created.
 * 
 * <p>Usage example:</p>
 * <pre>
 * {@code
 * EnumSingletonDemo singleton = EnumSingletonDemo.INSTANCE;
 * }
 * </pre>
 * 
 * <p>Features:</p>
 * <ul>
 *   <li>Enum type: The singleton instance is created as an enum constant.</li>
 *   <li>Thread safety: The JVM ensures that only one instance of the enum constant is created.</li>
 * </ul>
 * 
 * <p>Note:</p>
 * <p>The enum type is inherently serializable and thread-safe.</p>
 */
public class TestEnumSingleton {

    public static void main(String[] args) {
        EnumSingletonDemo singleton = EnumSingletonDemo.INSTANCE;
        System.out.println(singleton.getName());
        singleton.setName("Singleton");
        System.out.println(singleton.getName());
    }
}
