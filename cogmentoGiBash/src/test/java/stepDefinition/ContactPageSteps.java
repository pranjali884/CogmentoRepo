package stepDefinition;

import baseLayer.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.ContactPage;

public class ContactPageSteps extends BaseClass{
	static ContactPage contact;
	@When("User clicks Contact Link and click new contact")
	public void user_clicks_Contact_Link_and_click_new_contact() {
	  contact= new ContactPage();
	  contact.clickOnContact();
	  contact.clickOncreate();
	}

	@Then("USer enter firstName and LastName")
	public void user_enter_firstName_and_LastName() {
	   contact.validateContactPage("ankit", "suryawanshi");
	}

	@Then("User click on save button")
	public void user_click_on_save_button() {
		
		contact.clickOnSaveButton();
	  
	}
	

}
