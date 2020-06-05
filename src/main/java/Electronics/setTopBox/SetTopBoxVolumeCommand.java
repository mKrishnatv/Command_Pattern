package Electronics.setTopBox;

import Electronics.ElectronicsCommand;

public class SetTopBoxVolumeCommand implements ElectronicsCommand {

    SetTopBox setTopBox;

    public SetTopBoxVolumeCommand(SetTopBox setTopBox){
        this.setTopBox = setTopBox;
    }

    @Override
    public void execute() {
        setTopBox.setVolumeUp();
    }

    @Override
    public void undo() {
        setTopBox.setVolumeDown();
    }
}
