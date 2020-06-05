package Electronics.Television;

import Electronics.ElectronicsCommand;

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
