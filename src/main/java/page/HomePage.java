package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
public WebDriver driver;
//I use this line (public WebDriver driver;) for Parameterize Constructor,
public HomePage(WebDriver driver) {//Parameterize Constructor,
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}  
@FindBy(xpath = "//a[@class='logo']")
WebElement logo;

@FindBy(id = "fob-Men")
WebElement men;

public void validateLogo() {
	logo.click();
}

public void validateMen() {
	men.click();
}
}
