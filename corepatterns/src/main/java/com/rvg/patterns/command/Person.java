package com.rvg.patterns.command;

/**
 * Person class to test the command pattern.
 * The person will press the button on the remote control.
 * The remote control will execute the command.
 * The command will turn on or off the television.
 * The television will be turned on or off.
 * The television is the receiver.
 * The remote control is the invoker.
 * The command is the command.
 * The person is the client.
 */
public class Person {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Television television = new Television();
        Command onCommand = new OnCommand(television);
        Command offCommand = new OffCommand(television);
        remoteControl.setCommand(onCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(offCommand);
        remoteControl.pressButton();
    }
}
