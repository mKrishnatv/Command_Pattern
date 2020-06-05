package electronics.setTopBox;

public class SetTopBox {
    private int volume = 0;

    public void on(){
        System.out.println("SetTopBox is On");
    }

    public void off(){
        System.out.println("SetTopBox is Off");
    }

    public void setVolumeUp(){
        volume ++;
        System.out.println("SetTopBox volume is set to "+volume);
    }

    public void setVolumeDown(){
        volume--;
        System.out.println("SetTopBox volume is set to "+volume);
    }
}
