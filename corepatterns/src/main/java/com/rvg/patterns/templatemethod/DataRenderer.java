package com.rvg.patterns.templatemethod;

/*
 * This is the abstract class that defines the template method
 * The template method is the render() method
 * The render() method calls the readData() and processData() methods
 * The readData() and processData() methods are abstract and must be implemented by the subclasses
 * The subclasses are XMLDataRenderer and CSVDataRenderer
 * The XMLDataRenderer and CSVDataRenderer classes implement the readData() and processData() methods
 */
public abstract class DataRenderer {

    public void render() {
        String data = readData();
        String processedData = processData(data);
        System.out.println(processedData);
    }

    public abstract String readData();

    public abstract String processData(String data);
}
