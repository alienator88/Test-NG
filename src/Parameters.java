import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Parameters {
    WebDriver driver;

    @BeforeClass
    @org.testng.annotations.Parameters({"browser","url"})
    void setup(String browser, String app)
    {
        if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/alin/Dev/chromedriver");
            driver = new ChromeDriver();
            //driver.get("https://opensource-demo.orangehrmlive.com/");
        }
        else if(browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "/Users/alin/Dev/geckodriver");
            driver = new FirefoxDriver();
            //driver.get("https://opensource-demo.orangehrmlive.com/");
        }
        driver.get(app);
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
