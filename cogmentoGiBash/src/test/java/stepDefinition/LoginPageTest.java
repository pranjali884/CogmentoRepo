package stepDefinition;

import baseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.LoginPage;

public class LoginPageTest extends BaseClass{
	public LoginPage   loginPage;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    BaseClass.initialization();
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
	    loginPage = new LoginPage();
		String uname = prop.getProperty("USERNAME");
		String pass =prop.getProperty("PASSWORD");
		loginPage.loginFunctionality(uname, pass);
	}

	@Then("click on login button")
	public void click_on_login_button() {
	   loginPage.clickOnLogin();
	}


}
