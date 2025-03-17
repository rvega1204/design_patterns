package com.rvg.patterns.templatemethod;

/*
 * This is the concrete class that extends the abstract class DataRenderer
 * This class implements the readData() and processData() methods
 * These methods are called by the template method render()
 */
public class CSVDataRenderer extends DataRenderer {

    @Override
    public String readData() {
        return "CSV Data";
    }

    @Override
    public String processData(String data) {
        return "Processed " + data;
    }

}
