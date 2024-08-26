package pages;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base_unit.BaseClass;

public class HomePageTest extends BaseClass{

	@Test
	public void logoTest() {
		homePage.validateLogo();
	}
	@Test
	public void menTest() {
		homePage.validateMen();
	}
	
	@Test
	public void demo() {
		
	}
}
