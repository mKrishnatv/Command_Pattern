package Electronics;

public class RemoteControl {
    ElectronicsCommand command;

    public void setElectronicCommand(ElectronicsCommand command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }

    public void pressUndo(){
        command.undo();
    }
}
