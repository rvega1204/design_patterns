package com.rvg.patterns.command;

/*
 * Remote control to press a button.
 * The button press will execute the command.
 * The command is set by the client.
 * The command is executed when the button is pressed.a
 */
public class RemoteControl {

    private Command command;

    public void pressButton() {
        command.execute();
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
