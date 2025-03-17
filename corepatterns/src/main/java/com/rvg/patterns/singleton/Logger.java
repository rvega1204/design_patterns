package com.rvg.patterns.singleton;

/**
 * The Logger class implements the Singleton design pattern to provide a single, globally accessible instance.
 * This class is thread-safe and ensures that only one instance of Logger is created.
 * 
 * <p>Usage example:</p>
 * <pre>
 * {@code
 * Logger logger = Logger.getInstance();
 * logger.log("Hello, world!");
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
public class Logger {

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }

        return logger;
    }

    public void log(String message) {
        System.out.println(message);
    }

    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
