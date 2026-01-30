package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void testValidLogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername("laura.taylor1234@example.com");
		loginPage.enterPassword("test123");
		System.out.println("Title of the page is: " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login");

	}

}
