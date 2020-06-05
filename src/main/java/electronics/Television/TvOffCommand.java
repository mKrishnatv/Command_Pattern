package electronics.Television;

import electronics.ElectronicsCommand;

public class TvOffCommand implements ElectronicsCommand {

    TV tv;

    public TvOffCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
