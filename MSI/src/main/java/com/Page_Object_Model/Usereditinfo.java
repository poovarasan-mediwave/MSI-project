package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class Usereditinfo extends Base_Class {

	public Usereditinfo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='pin']")
	private WebElement pin;

	@FindBy(xpath = "//button[contains(text(),'LOG IN')]")
	private WebElement login;

	@FindBy(xpath = "//iframe[@title='reCAPTCHA']")
	private WebElement recaptchaframe;

	@FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
	private WebElement recaptcha;

	@FindBy(xpath = "//div[@class='menuside']")
	private WebElement accountmenuheader;

	public WebElement getAccountmenuheader() {
		return accountmenuheader;
	}

	@FindBy(xpath = "//div[@class='menuside']/div[2]")
	private WebElement accountmenu;

	@FindBy(xpath = "(//span[@class='copytext'])[1]")
	private WebElement profileedit;

	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement lastname;

	@FindBy(xpath = "//input[@type='tel']")
	private WebElement telephone;

	@FindBy(xpath = "//input[@id='flatno']")
	private WebElement flatno;

	@FindBy(xpath = "//input[@id='street']")
	private WebElement street;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement city;

	@FindBy(xpath = "//input[@id='postcode']")
	private WebElement postcode;

	@FindBy(xpath = "//button[@id='client-info-save']")
	private WebElement clienteditsave;

	@FindBy(xpath = "(//span[@class='copytext'])[3]")
	private WebElement clienteditsecurity;

	@FindBy(xpath = "//label[contains(text(),'Just my email account is safe')]")
	private WebElement justemailissafe;

	@FindBy(xpath = "//label[contains(text(),'Just my phone is safe')]")
	private WebElement justphoneissafe;

	@FindBy(xpath = "//button[contains(text(),'SAVE')]")
	private WebElement savesecurity;

	@FindBy(xpath = "(//span[@class='copytext'])[4]")
	private WebElement clienteditcontactpreference;

	@FindBy(xpath = "//label[contains(text(),'Email')]")
	private WebElement clienteditcontactmail;

	@FindBy(xpath = "//label[contains(text(),'Phone call')]")
	private WebElement clienteditcontacttext;

	@FindBy(xpath = "(//div[@class='my-8 btn-center'])[1]/button")
	private WebElement accounthistoryheader;

	@FindBy(xpath = "//button[contains(text(),'ACCOUNT HISTORY')]")
	private WebElement accounthistory;

	@FindBy(xpath = "//button[contains(text(),'Back')]")
	private WebElement backbutton;

	@FindBy(xpath = "(//div[@class='my-8 btn-center'])[2]")
	private WebElement deleteaccountheader;

	public WebElement getAccounthistoryheader() {
		return accounthistoryheader;
	}

	public WebElement getDeleteaccountheader() {
		return deleteaccountheader;
	}

	@FindBy(xpath = "//button[@id='delete']")
	private WebElement deleteaccount;

	@FindBy(xpath = "(//button[@class='btn primary-btn'])[2]")
	private WebElement dete_Account;

	public WebElement getDete_Account() {
		return dete_Account;
	}

	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	private WebElement confirmdeleteaccount;

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

	public WebElement getRecaptchaframe() {
		return recaptchaframe;
	}

	public WebElement getRecaptcha() {
		return recaptcha;
	}

	public WebElement getAccountmenu() {
		return accountmenu;
	}

	public WebElement getProfileedit() {
		return profileedit;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getTelephone() {
		return telephone;
	}

	public WebElement getFlatno() {
		return flatno;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getClienteditsave() {
		return clienteditsave;
	}

	public WebElement getClienteditsecurity() {
		return clienteditsecurity;
	}

	public WebElement getJustemailissafe() {
		return justemailissafe;
	}

	public WebElement getJustphoneissafe() {
		return justphoneissafe;
	}

	public WebElement getSavesecurity() {
		return savesecurity;
	}

	public WebElement getClienteditcontactpreference() {
		return clienteditcontactpreference;
	}

	public WebElement getClienteditcontactmail() {
		return clienteditcontactmail;
	}

	public WebElement getClienteditcontacttext() {
		return clienteditcontacttext;
	}

	public WebElement getAccounthistory() {
		return accounthistory;
	}

	public WebElement getBackbutton() {
		return backbutton;
	}

	public WebElement getDeleteaccount() {
		return deleteaccount;
	}

	public WebElement getConfirmdeleteaccount() {
		return confirmdeleteaccount;
	}
}
