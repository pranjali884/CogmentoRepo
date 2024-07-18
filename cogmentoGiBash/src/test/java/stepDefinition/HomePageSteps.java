package stepDefinition;

import org.junit.Assert;

import baseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageLayer.HomePage;

public class HomePageSteps extends BaseClass {
	private static HomePage homePage;

	@Given("user is on Homepage and validate logo")
	public void user_is_on_Homepage_and_validate_logo() {
		homePage = new HomePage();
		boolean actualLogo = homePage.checkLogo();
		// return actualLogo;
		Assert.assertEquals(actualLogo, true);
		System.out.println("Logo is verified");
	}

	@Then("User validtae hompage title and url")
	public void user_validtae_hompage_title_and_url() {
		String actualTitle = homePage.checkTitle();
		Assert.assertEquals(actualTitle, "Cogmento CRM");
		System.out.println("Title is verified");

		String actualUrl = homePage.checkUrl();
		Assert.assertEquals(actualUrl.contains("cogmento"), true);
		System.out.println("Url is veried");

	}

}
