import electronics.RemoteControl;
import electronics.setTopBox.SetTopBox;
import electronics.setTopBox.SetTopBoxOffCommand;
import electronics.setTopBox.SetTopBoxOnCommand;
import electronics.Television.TV;
import electronics.Television.TvOffCommand;
import electronics.Television.TvOnCommand;
import electronics.setTopBox.SetTopBoxVolumeCommand;
import org.junit.Test;

public class ElectronicsTest {

    @Test
    public void scenarioOne(){
        RemoteControl remoteControl = new RemoteControl();
        SetTopBox setTopBox = new SetTopBox();
        TV tv = new TV();

        //SetTopBox On
        remoteControl.setElectronicCommand(new SetTopBoxOnCommand(setTopBox));
        remoteControl.pressButton();

        //Tv On
        remoteControl.setElectronicCommand(new TvOnCommand(tv));
        remoteControl.pressButton();

        //SetTopBox Off
        remoteControl.setElectronicCommand(new SetTopBoxOffCommand(setTopBox));
        remoteControl.pressButton();

        //Tv Off
        remoteControl.setElectronicCommand(new TvOffCommand(tv));
        remoteControl.pressButton();
    }

    @Test
    public void scenarioTwo(){
        RemoteControl remoteControl = new RemoteControl();
        SetTopBox setTopBox = new SetTopBox();
        TV tv = new TV();

        remoteControl.setElectronicCommand(new SetTopBoxOnCommand(setTopBox));
        remoteControl.pressButton();
        //remoteControl.pressUndo();

        remoteControl.setElectronicCommand(new SetTopBoxVolumeCommand(setTopBox));
        remoteControl.pressButton();
        remoteControl.pressButton();
        remoteControl.pressUndo();

        remoteControl.setElectronicCommand(new TvOnCommand(tv));
        remoteControl.pressButton();
        //remoteControl.pressUndo();

    }

}
