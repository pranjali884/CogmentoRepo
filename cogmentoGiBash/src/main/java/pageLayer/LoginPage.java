package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilityLayer.Wait;

public class LoginPage extends BaseClass
{
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement login;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginFunctionality(String uname,String pass)
	{
		Wait.sendKeys(username, uname);
		Wait.sendKeys(password, pass);
	}
	
	public void clickOnLogin()
	{
		Wait.click(login);
	}

}
