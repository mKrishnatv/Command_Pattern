package electronics.Television;

import electronics.ElectronicsCommand;

public class TvOnCommand implements ElectronicsCommand {

    TV tv;

    public TvOnCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
