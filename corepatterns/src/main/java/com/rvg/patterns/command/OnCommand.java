package com.rvg.patterns.command;

/**
 * Command to turn on the television.
 */
public class OnCommand implements Command {

    private Television television;

    public OnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.on();
    }

}
