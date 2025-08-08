package design_patterns.behavioural.command;

public class Main {

    public static void main(String[] args) {

        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);

        Remote remote = new Remote();
        remote.setCommand(lightOnCommand);
        remote.pressButton();

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remote.setCommand(lightOffCommand);
        remote.pressButton();

    }
}
