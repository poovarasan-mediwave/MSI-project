package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class User_creation extends Base_Class {

	public User_creation() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[normalize-space()='BOOK AN APPOINTMENT']")
	private WebElement book_appaintment_button;

	@FindBy(xpath = "//button[normalize-space()='SIGN UP']")
	private WebElement signUp_button;

	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement lastname;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//div/iframe[@role='presentation']")
	private WebElement captcha;

	@FindBy(xpath = "//a[text()='Please read the Terms & Conditions to continue']")
	private WebElement terms;

	@FindBy(xpath = "//button[normalize-space()='accept']")
	private WebElement accept_button;

	@FindBy(xpath = "//button[normalize-space()='Next']")
	private WebElement next_button;

	@FindBy(xpath = "//a[normalize-space()='Enter your address manually']")
	private WebElement address_manual_option;

	@FindBy(xpath = "//input[@name='flatno']")
	private WebElement house_field;

	@FindBy(xpath = "//input[@id='street']")
	private WebElement street_field;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement city_field;

	@FindBy(xpath = "//input[@id='postcode']")
	private WebElement postcode_field;

	@FindBy(xpath = "//input[@class='form-control ']")
	private WebElement mobilenumber_field;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password_field;

	@FindBy(xpath = "//input[@id='confirmpassword']")
	private WebElement confirmPassword_field;

	@FindBy(xpath = "//button[normalize-space()='CONFIRM']")
	private WebElement confirm_button;

	@FindBy(xpath = "//button[normalize-space()='Verify by email']")
	private WebElement verifybyEmail_button;

	public WebElement getBook_appaintment_button() {
		return book_appaintment_button;
	}

	public WebElement getSignUp_button() {
		return signUp_button;
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

	public WebElement getAccept_button() {
		return accept_button;
	}

	public WebElement getNext_button() {
		return next_button;
	}

	public WebElement getAddress_manual_option() {
		return address_manual_option;
	}

	public WebElement getHouse_field() {
		return house_field;
	}

	public WebElement getStreet_field() {
		return street_field;
	}

	public WebElement getCity_field() {
		return city_field;
	}

	public WebElement getPostcode_field() {
		return postcode_field;
	}

	public WebElement getMobilenumber_field() {
		return mobilenumber_field;
	}

	public WebElement getPassword_field() {
		return password_field;
	}

	public WebElement getConfirmPassword_field() {
		return confirmPassword_field;
	}

	public WebElement getConfirm_button() {
		return confirm_button;
	}

	public WebElement getVerifybyEmail_button() {
		return verifybyEmail_button;
	}

}