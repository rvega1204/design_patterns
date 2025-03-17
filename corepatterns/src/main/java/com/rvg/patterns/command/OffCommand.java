package com.rvg.patterns.command;

/**
 * Command to turn off the television.
 */
public class OffCommand implements Command{

    private Television television;

    public OffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.off();
    }
}
