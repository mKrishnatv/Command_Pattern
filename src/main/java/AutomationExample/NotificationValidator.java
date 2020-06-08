package AutomationExample;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class NotificationValidator implements ElementValidator {

    private final WebElement button;
    private final WebElement notification;

    public NotificationValidator(final WebElement button, final WebElement notification)
    {
        this.button = button;
        this.notification = notification;
    }

    @Override
    public boolean validate() {
        this.button.click();
        boolean appearState = this.notification.isDisplayed(); //true
        //System.out.println(appearState);
        Uninterruptibles.sleepUninterruptibly(4, TimeUnit.SECONDS);
        boolean disappearState = this.notification.isDisplayed(); //false
        //System.out.println(disappearState);
        return appearState && (!disappearState);
    }
}
