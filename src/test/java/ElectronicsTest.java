import Electronics.RemoteControl;
import Electronics.setTopBox.SetTopBox;
import Electronics.setTopBox.SetTopBoxOffCommand;
import Electronics.setTopBox.SetTopBoxOnCommand;
import Electronics.Television.TV;
import Electronics.Television.TvOffCommand;
import Electronics.Television.TvOnCommand;
import Electronics.setTopBox.SetTopBoxVolumeCommand;
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
