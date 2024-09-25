package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class Top_user_edithistory extends Base_Class {

	public Top_user_edithistory() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='pin']")
	private WebElement pin;

	@FindBy(xpath = "//button[@class='btn primary-btn']")
	private WebElement login;

	@FindBy(xpath = "//iframe[@title='reCAPTCHA']")
	private WebElement recaptchaframe;

	public WebElement getRecaptchaframe() {
		return recaptchaframe;
	}

	@FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
	private WebElement recaptcha;

	@FindBy(xpath = "//a[normalize-space()='Start now']")
	private WebElement start;

	@FindBy(xpath = "//a[contains(text(),'Complete now')]")
	private WebElement complete;

	@FindBy(xpath = "//a[contains(text(),'Preview')]")
	private WebElement preview;

	@FindBy(xpath = "//button[@class='react-calendar__navigation__arrow react-calendar__navigation__prev-button']")
	private WebElement calendarback;

	@FindBy(xpath = "//button[@class='react-calendar__navigation__arrow react-calendar__navigation__prev2-button']")
	private WebElement calendaryearback;

	public WebElement getCalendaryearback() {
		return calendaryearback;
	}

	public WebElement getCalendarback() {
		return calendarback;
	}

	public WebElement getPreview() {
		return preview;
	}

	public WebElement getComplete() {
		return complete;
	}

	@FindBy(xpath = "(//span[@class='radio'])[1]")
	private WebElement yes;

	@FindBy(xpath = "(//span[@class='radio'])[2]")
	private WebElement no;

	@FindBy(xpath = "(//span[@class='radio'])[3]")
	private WebElement periodyes;

	@FindBy(xpath = "(//span[@class='radio'])[4]")
	private WebElement periodno;

	@FindBy(xpath = "//div[@class='react-date-picker__wrapper']")
	private WebElement perioddatepicker;

	@FindBy(xpath = "//abbr[@aria-label='May 7, 2023']")
	private WebElement perioddate;

	@FindBy(xpath = "//button[normalize-space()='NEXT']")
	private WebElement yesornoperiodnext;

	@FindBy(xpath = "//abbr[@aria-label='May 10, 2001']")
	private WebElement dateofbirth;

	@FindBy(xpath = "(//span[@class='radio'])[1]")
	private WebElement feelsafeyes;

	@FindBy(xpath = "(//span[@class='radio'])[2]")
	private WebElement feelsafeno;

	@FindBy(xpath = "(//span[@class='radio'])[1]")
	private WebElement registeredUKGPyes;

	@FindBy(xpath = "(//span[@class='radio'])[2]")
	private WebElement registeredUKGPno;

	@FindBy(xpath = "(//span[@class='radio'])[3]")
	private WebElement registeredUKaddressyes;

	@FindBy(xpath = "(//span[@class='radio'])[4]")
	private WebElement registeredUKaddressno;

	@FindBy(xpath = "(//span[@class='radio'])[5]")
	private WebElement enterregisteredUKGPyes;

	@FindBy(xpath = "(//span[@class='radio'])[6]")
	private WebElement enterregisteredUKGPno;

	@FindBy(xpath = "//button[contains(text(),'Arrange a call BACK')]")
	private WebElement choosecallbackslot;

	@FindBy(xpath = "(//span[@class='radio'])[1]")
	private WebElement Anytimecallback;

	@FindBy(xpath = "//button[contains(text(),'BOOK CALL BACK')]")
	private WebElement bookcallback;

	@FindBy(xpath = "//a[contains(text(),'Staff Login')]")
	private WebElement stafflogin;

	@FindBy(xpath = "(//a[@href='/admin/dashboard/all-clients'])[1]")
	private WebElement Allclients;

	@FindBy(xpath = "//input[@name='searchTxt']")
	private WebElement Allclientsearch;

	@FindBy(xpath = "//div[contains(text(),'Account settings')][1]")
	private WebElement Accountsettings;

	@FindBy(xpath = "//span[contains(text(),'Completed forms')]")
	private WebElement completedforms;

	@FindBy(xpath = "//span[contains(text(),'EDIT')]")
	private WebElement completedformsEDIT;

	@FindBy(xpath = "//span[contains(text(),'View edit history')][1]")
	private WebElement viewedithistory;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getPin() {
		return pin;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getRecaptcha() {
		return recaptcha;
	}

	public WebElement getStart() {
		return start;
	}

	public WebElement getYes() {
		return yes;
	}

	public WebElement getNo() {
		return no;
	}

	public WebElement getPeriodyes() {
		return periodyes;
	}

	public WebElement getPeriodno() {
		return periodno;
	}

	public WebElement getPerioddatepicker() {
		return perioddatepicker;
	}

	public WebElement getPerioddate() {
		return perioddate;
	}

	public WebElement getYesornoperiodnext() {
		return yesornoperiodnext;
	}

	public WebElement getDateofbirth() {
		return dateofbirth;
	}

	public WebElement getFeelsafeyes() {
		return feelsafeyes;
	}

	public WebElement getFeelsafeno() {
		return feelsafeno;
	}

	public WebElement getRegisteredUKGPyes() {
		return registeredUKGPyes;
	}

	public WebElement getRegisteredUKGPno() {
		return registeredUKGPno;
	}

	public WebElement getRegisteredUKaddressyes() {
		return registeredUKaddressyes;
	}

	public WebElement getRegisteredUKaddressno() {
		return registeredUKaddressno;
	}

	public WebElement getEnterregisteredUKGPyes() {
		return enterregisteredUKGPyes;
	}

	public WebElement getEnterregisteredUKGPno() {
		return enterregisteredUKGPno;
	}

	public WebElement getChoosecallbackslot() {
		return choosecallbackslot;
	}

	public WebElement getAnytimecallback() {
		return Anytimecallback;
	}

	public WebElement getBookcallback() {
		return bookcallback;
	}

	public WebElement getStafflogin() {
		return stafflogin;
	}

	public WebElement getAllclients() {
		return Allclients;
	}

	public WebElement getAllclientsearch() {
		return Allclientsearch;
	}

	public WebElement getAccountsettings() {
		return Accountsettings;
	}

	public WebElement getCompletedforms() {
		return completedforms;
	}

	public WebElement getCompletedformsEDIT() {
		return completedformsEDIT;
	}

	public WebElement getViewedithistory() {
		return viewedithistory;
	}

}
