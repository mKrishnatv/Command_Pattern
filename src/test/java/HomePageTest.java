import AutomationExample.ElementValidator;
import AutomationExample.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    private HomePage homePage;

    @BeforeTest
    public void setHomePage(){
        this.homePage = new HomePage(driver);
    }

    @Test
    public void homePageTest(){
        homePage.goTo();

        for(ElementValidator ev: homePage.getElementValidators()){
            boolean result = ev.validate();
            Assert.assertTrue(result);
        }

//        this.homePage.getElementValidators()
//                .stream()
//                //.parallel()
//                .map(ev -> ev.validate())
//                .forEach(b -> Assert.assertTrue(b));
    }
}
