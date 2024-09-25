package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class  BaseTest {
    public WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void initialiseChrome(){
        driver = new ChromeDriver();
    }
    @AfterClass(alwaysRun = true)
    public void closeChrome(){
        driver.quit();
    }
}
