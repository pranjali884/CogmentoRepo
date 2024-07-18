package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilityLayer.Wait;

public class ContactPage extends BaseClass{

	@FindBy(xpath="//a[@href='/contacts']")
	private WebElement contactLink;
	
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement createBtn;

	@FindBy(name = "first_name")
	private WebElement Fname;

	@FindBy(name = "last_name")
	private WebElement Lname;
   
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveBtn;

	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
public void clickOnContact() {
		Wait.click(contactLink);
	}

	public void clickOncreate() {
		Wait.click(createBtn);
	}
public void validateContactPage(String firstName, String lastName) {
		
		Wait.sendKeys(Fname, firstName);
		Wait.sendKeys(Lname, lastName);}

	public void clickOnSaveButton() {
		Wait.click(saveBtn);
	}
}
