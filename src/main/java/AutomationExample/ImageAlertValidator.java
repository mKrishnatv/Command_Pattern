package AutomationExample;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class ImageAlertValidator implements ElementValidator {

    private final WebElement dismissalAlert;

    public ImageAlertValidator(final WebElement element)
    {
        this.dismissalAlert = element;
    }

    @Override
    public boolean validate() {
        this.dismissalAlert.isDisplayed(); //true
        //Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
        this.dismissalAlert.findElement(By.cssSelector("button.close")).click();

        try {
            this.dismissalAlert.isDisplayed(); //false
            return false;
        } catch (Exception e){
            return true;
        }
    }

}
