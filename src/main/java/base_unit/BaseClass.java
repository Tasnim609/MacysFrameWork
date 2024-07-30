package base_unit;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.HomePage;

public class BaseClass {
public WebDriver driver;
public HomePage homePage;
@BeforeMethod
public void setUp() {
	//WebDriverManager.chromedriver().setup();
	WebDriverManager.safaridriver().setup();
	//System.setProperty("webdriver.chrome.driver", "/Users/muhammadquarashy/eclipse-workspace/com.costco/driver/chromedriver");
	//driver=new ChromeDriver();
	driver = new SafariDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.macys.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(2000));
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	homePage=new HomePage(driver);
}
@AfterMethod
public void tearUp() {
	driver.quit();
}
}
