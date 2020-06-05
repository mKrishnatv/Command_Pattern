package Electronics.setTopBox;

import Electronics.ElectronicsCommand;

public class SetTopBoxOnCommand implements ElectronicsCommand {

    SetTopBox setTopBox;

    public SetTopBoxOnCommand(SetTopBox setTopBox){
        this.setTopBox = setTopBox;
    }

    @Override
    public void execute() {
        setTopBox.on();
    }

    @Override
    public void undo() {
        setTopBox.off();
    }
}
