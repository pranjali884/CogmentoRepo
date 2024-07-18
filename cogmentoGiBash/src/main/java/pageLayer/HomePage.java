package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;

public class HomePage extends BaseClass{

	@FindBy(xpath="//div[@class='header item']")
	private WebElement logo;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean checkLogo()
	{
		boolean actualLogo = logo.isDisplayed();
		return actualLogo;
	}
	
	public String checkTitle()
	{
		return driver.getTitle();
	}
	public String checkUrl()
	{
		return driver.getCurrentUrl();
	}
}
