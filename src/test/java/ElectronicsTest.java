import Electronics.RemoteControl;
import Electronics.setTopBox.SetTopBox;
import Electronics.setTopBox.SetTopBoxOffCommand;
import Electronics.setTopBox.SetTopBoxOnCommand;
import Electronics.Television.TV;
import Electronics.Television.TvOffCommand;
import Electronics.Television.TvOnCommand;
import org.junit.Test;

public class ElectronicsTest {

    @Test
    public void setTopBoxTest(){
        RemoteControl remoteControl = new RemoteControl();
        SetTopBox setTopBox = new SetTopBox();
        TV tv = new TV();

        remoteControl.setElectronicCommand(new SetTopBoxOnCommand(setTopBox));
        remoteControl.pressButton();

        remoteControl.setElectronicCommand(new TvOnCommand(tv));
        remoteControl.pressButton();

        remoteControl.setElectronicCommand(new SetTopBoxOffCommand(setTopBox));
        remoteControl.pressButton();
        remoteControl.setElectronicCommand(new TvOffCommand(tv));
        remoteControl.pressButton();
    }

}
