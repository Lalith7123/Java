package design_patterns.behavioural.command;

public class LightOffCommand implements Command{

    private final Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute(){
        this.light.off();
    }
}
