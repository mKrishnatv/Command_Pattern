package electronics.setTopBox;

import electronics.ElectronicsCommand;

public class SetTopBoxOffCommand implements ElectronicsCommand {

    SetTopBox setTopBox;

    public SetTopBoxOffCommand(SetTopBox setTopBox){
        this.setTopBox = setTopBox;
    }

    @Override
    public void execute() {
        setTopBox.off();
    }

    @Override
    public void undo() {
        setTopBox.on();
    }
}
