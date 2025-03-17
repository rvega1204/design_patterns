package com.rvg.patterns.templatemethod;

/*
 * This is the concrete class that extends the abstract class DataRenderer
 * This class implements the readData() and processData() methods
 * These methods are called by the template method render()
 */
public class Test {

    public static void main(String[] args) {
        DataRenderer renderer = new XMLDataRenderer();
        renderer.render();

        renderer = new CSVDataRenderer();
        renderer.render();
    }
}
