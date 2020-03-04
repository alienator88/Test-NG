import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;

public class Assertions {
    WebDriver driver;

    @BeforeClass
    void setup()
    {
        System.setProperty("webdriver.chrome.driver","/Users/alin/Dev/chromedriver");
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @Test(priority = 1)
    void logoTest()
    {
        WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(),"Logo not displayed");
        //Assert.assertFalse(logo.isDisplayed(),"Logo not displayed");
    }

    @Test(priority = 2)
    void homePageTitle()
    {
       String title=driver.getTitle();
       Assert.assertEquals("OrangeHRM", title,"Title does not match");
    }
    @AfterClass
    void tearDown()
    {
        driver.quit();
    }




}
