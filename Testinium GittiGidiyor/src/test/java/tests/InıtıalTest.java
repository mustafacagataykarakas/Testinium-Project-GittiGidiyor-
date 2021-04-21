package tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
/**
 * @mustafacagataykarakas @testinium
 */
public class InıtıalTest {
    private static WebDriver driver;
    protected static HomePage homePage;

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.chrome.driver", "./src/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi";
        Assert.assertEquals(expectedTitle, actualTitle);
        homePage = new HomePage(driver);


    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }


}
