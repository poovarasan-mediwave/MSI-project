package com.Page_Object_Model;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class Signup_Page extends Base_Class {

	public Signup_Page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[normalize-space()='BOOK AN APPOINTMENT']")
	private WebElement book;

	@FindBy(xpath = "//button[normalize-space()='SIGN UP']")
	private WebElement signUp_button;
	
	@FindBy(xpath = "(//span[@class='radio'])[1]")
	private WebElement yesbtn;

	@FindBy(xpath = "//input[@name='postcode']")
	private WebElement postcode;

	@FindBy(xpath = "//button[normalize-space()='CHECK ELIGIBILITY']")
	private WebElement checkeligibile;

	@FindBy(xpath = "//button[normalize-space()='SIGN UP']")
	private WebElement signup;

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastname;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;

	@FindBy(xpath = "//div/iframe[@role='presentation']")
	private WebElement captcha;

	@FindBy(xpath = "//a[text()='Please read the Terms & Conditions to continue']")
	private WebElement terms;

	@FindBy(xpath = "//button[normalize-space()='accept']")
	private WebElement accept;

	@FindBy(xpath = "//button[normalize-space()='Next']")
	private WebElement next;

	@FindBy(xpath = "//a[normalize-space()='Enter your address manually']")
	private WebElement addmanually;

	@FindBy(xpath = "//input[@name='flatno']")
	private WebElement houseno;

	@FindBy(xpath = "//input[@name='street']")
	private WebElement street;

	@FindBy(xpath = "//input[@name='city']")
	private WebElement city;

	@FindBy(xpath = "//input[@name='postcode']")
	private WebElement pincode;

	@FindBy(xpath = "//input[@placeholder='1 (702) 123-4567']")
	private WebElement mobileno;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@name='confirmpassword']")
	private WebElement confirmpassword;

	@FindBy(xpath = "//button[normalize-space()='CONFIRM']")
	private WebElement confirmbtn;

	@FindBy(xpath = "//label[text()='Yes, they are safe']")
	private WebElement safe;

	@FindBy(xpath = "//label[text()='Just my phone is safe']")
	private WebElement phonesafe;

	@FindBy(xpath = "//label[normalize-space()='Just my email account is safe']")
	private WebElement emailsafe;

	@FindBy(xpath = "//label[normalize-space()='Neither are safe']")
	private WebElement neithersafe;

	@FindBy(xpath = "//label[normalize-space()='Do not contact me outside of this portal']")
	private WebElement preferences;

	@FindBy(xpath = "//button[normalize-space()='Verify by text message']")
	private WebElement verifyemail;

	@FindBy(xpath = "//button[normalize-space()='Verify by text message']")
	private WebElement verifytext;

	@FindBy(xpath = "//button[normalize-space()='Next']")
	private WebElement verifycomplete;

	@FindBy(xpath = "//input[@id='secure PIN']")
	private WebElement enterpin;

	@FindBy(xpath = "//input[@id='Confirm PIN']")
	private WebElement confirmpin;

	@FindBy(xpath = "//button[text()='Next']")
	private WebElement next1;

	@FindBy(xpath = "(//span[@class='radio'])[4]")
	private WebElement noukadd;

	@FindBy(xpath = "//a[normalize-space()='Reset password']")
	private WebElement resetpass;

	@FindBy(xpath = "(//span[@class='radio'])[1]")
	private WebElement yessafe;

	@FindBy(xpath = "(//span[@class='radio'])[2]")
	private WebElement nosafe;

	@FindBy(xpath = "//h1[normalize-space()='Select a service']/parent::div/following-sibling::div/a/button")
	private List<WebElement> servic;

	@FindBy(xpath = "//input[@name='yes']/following-sibling::span")
	private WebElement pregnancy;

	@FindBy(id = "postcode")
	private WebElement postcode_field;

	@FindBy(xpath = "//button[@type='submit'][normalize-space()='CHECK ELIGIBILITY']")
	private WebElement eligibility_button;

	public WebElement getResetpass() {
		return resetpass;
	}

	public WebElement getPregnancy() {
		return pregnancy;
	}

	public WebElement getPostcode_field() {
		return postcode_field;
	}

	public WebElement getEligibility_button() {
		return eligibility_button;
	}

	public WebElement getBook() {
		return book;
	}

	public List<WebElement> getServic() {
		return servic;
	}

//	public WebElement getTOP() {
//		return TOP;
//	}

	public WebElement getYesbtn() {
		return yesbtn;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getCheckeligibile() {
		return checkeligibile;
	}

	public WebElement getSignup() {
		return signup;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCaptcha() {
		return captcha;
	}

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getAccept() {
		return accept;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getAddmanually() {
		return addmanually;
	}

	public WebElement getHouseno() {
		return houseno;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public WebElement getConfirmbtn() {
		return confirmbtn;
	}

	public WebElement getSafe() {
		return safe;
	}

	public WebElement getPhonesafe() {
		return phonesafe;
	}

	public WebElement getEmailsafe() {
		return emailsafe;
	}

	public WebElement getNeithersafe() {
		return neithersafe;
	}

	public WebElement getPreferences() {
		return preferences;
	}

	public WebElement getVerifyemail() {
		return verifyemail;
	}

	public WebElement getVerifytext() {
		return verifytext;
	}

	public WebElement getVerifycomplete() {
		return verifycomplete;
	}

	public WebElement getEnterpin() {
		return enterpin;
	}

	public WebElement getConfirmpin() {
		return confirmpin;
	}

	public WebElement getNext1() {
		return next1;
	}

	public WebElement getNoukadd() {
		return noukadd;
	}

	public WebElement getYessafe() {
		return yessafe;
	}

	public WebElement getNosafe() {
		return nosafe;
	}
}
