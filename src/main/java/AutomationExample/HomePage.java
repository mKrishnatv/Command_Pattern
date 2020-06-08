package AutomationExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class HomePage {

    private final WebDriver driver;

    //buttons
    @FindBy(css="div.button-box button.btn-info")
    private WebElement infoBtn;

    @FindBy(css="div.button-box button.btn-warning")
    private WebElement warnBtn;

    @FindBy(css="div.button-box button.btn-success")
    private WebElement successBtn;

    @FindBy(css="div.button-box button.btn-danger")
    private WebElement dangerBtn;

    //notifications
    @FindBy(css="div.jq-icon-info")
    private WebElement infoNotification;

    @FindBy(css="div.jq-icon-warning")
    private WebElement warnNotification;

    @FindBy(css="div.jq-icon-success")
    private WebElement succesNotification;

    @FindBy(css="div.jq-icon-error")
    private WebElement dangerNotification;

    //image alerts
    @FindBy(css=":nth-child(3) > .alert-info")
    private WebElement imageInfoAlert;

    @FindBy(css=":nth-child(3) > .alert-success")
    private WebElement imageSuccessAlert;

    @FindBy(css=":nth-child(3) > .alert-danger")
    private WebElement infoDangerAlert;

    @FindBy(css=":nth-child(3) > .alert-warning")
    private WebElement imageWarnAlert;

    public HomePage(final WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        this.driver.get("https://www.wrappixel.com/demos/admin-templates/admin-pro/main/ui-notification.html");
        this.driver.manage().window().maximize();
    }

    public List<ElementValidator> getElementValidators(){
        return Arrays.asList(
            //notification validation
            new NotificationValidator(infoBtn, infoNotification),
            new NotificationValidator(successBtn, succesNotification),
            new NotificationValidator(warnBtn, warnNotification),
            new NotificationValidator(dangerBtn, dangerNotification),

            //image alert validation
            new ImageAlertValidator(imageInfoAlert),
            new ImageAlertValidator(imageWarnAlert),
            new ImageAlertValidator(infoDangerAlert),
            new ImageAlertValidator(imageSuccessAlert)
        );
    }
}
