package stepDefinition;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import baseLayer.BaseClass;
import pageLayer.HomePage;

public class HomePageSteps extends BaseClass{
	private static HomePage homePage;
	public void validateLogo()
	{
		homePage = new HomePage();
		boolean actualLogo = homePage.checkLogo();
		//return actualLogo;
		Assert.assertEquals(actualLogo, true);
		System.out.println("Logo is verified");
	}
	
	public void validateTitle()
	{
		String actualTitle = homePage.checkTitle();
		Assert.assertEquals(actualTitle, "Cogmento CRM");
		System.out.println("Title is verified");
	}
	
	public void validateUrl()
	{
		String actualUrl = homePage.checkUrl();
		Assert.assertEquals(actualUrl.contains("cogmento"), true);
		System.out.println("Url is veried");
	}

}
