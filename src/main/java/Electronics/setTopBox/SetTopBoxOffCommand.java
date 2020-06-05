package Electronics.setTopBox;

import Electronics.ElectronicsCommand;

public class SetTopBoxOffCommand implements ElectronicsCommand {

    SetTopBox setTopBox;

    public SetTopBoxOffCommand(SetTopBox setTopBox){
        this.setTopBox = setTopBox;
    }

    @Override
    public void execute() {
        setTopBox.off();
    }
}
