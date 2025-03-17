package com.rvg.patterns.singleton;

import java.io.Serializable;

/**
 * The DateUtil class implements the Singleton design pattern to provide a single, globally accessible instance.
 * This class is thread-safe and ensures that only one instance of DateUtil is created.
 * 
 * <p>Usage example:</p>
 * <pre>
 * {@code
 * DateUtil dateUtil = DateUtil.getInstance();
 * }
 * </pre>
 * 
 * <p>Features:</p>
 * <ul>
 *   <li>Lazy initialization: The instance is created only when it is first requested.</li>
 *   <li>Thread safety: The synchronized block ensures that only one thread can create the instance at a time.</li>
 * </ul>
 * 
 * <p>Note:</p>
 * <p>The constructor is private to prevent instantiation from outside the class.</p>
 */
public class DateUtil implements Serializable {

    // The singleton instance of DateUtil
    private static volatile DateUtil instance;

    // Private constructor to prevent instantiation
    private DateUtil() {
    }

    /**
     * Provides the global point of access to the DateUtil instance.
     * Uses synchronized block to ensure thread safety during instance creation.
     *
     * @return the singleton instance of DateUtil
     */
    public static DateUtil getInstance() {
        if (instance == null) {
            synchronized (DateUtil.class) {
                if (instance == null) {
                    instance = new DateUtil();
                }
            }
        }

        return instance;
    }

    /**
     * Ensures that only one instance of DateUtil is created during deserialization.
     *
     * @return the singleton instance of DateUtil
     */
    public Object readResolve() {
        return instance;
    }

    // Prevents cloning of the DateUtil instance
    @Override
    protected Object clone() throws CloneNotSupportedException {
       throw new CloneNotSupportedException();
    }
}
