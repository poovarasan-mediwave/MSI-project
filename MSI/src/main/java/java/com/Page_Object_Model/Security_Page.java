package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class Security_Page extends Base_Class {
	public Security_Page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Security']")
	private WebElement security;

	@FindBy(xpath = "(//input[@name='pin'])[1]")
	private WebElement memorablepin;

	@FindBy(xpath = "(//input[@name='password'])[1]")
	private WebElement memorablepass;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='SAVE'])[1]")
	private WebElement savepin;

	@FindBy(xpath = "(//button[@id='reset_password'])[1]")
	private WebElement savepass;

	@FindBy(xpath = "(//input[@name='password'])[1]")
	private WebElement newpass;

	@FindBy(xpath = "(//input[@name='confirmpassword'])[1]")
	private WebElement confipass;

	@FindBy(xpath = "//button[text()='CONFIRM']")
	private WebElement confirm;

	@FindBy(xpath = "(//input[@id='secure PIN'])[1]")
	private WebElement enterpin;

	@FindBy(xpath = "(//input[@id='Confirm PIN'])[1]")
	private WebElement confipin;

	@FindBy(xpath = "//button[text()='confirm']")
	private WebElement confirmbtn;

	@FindBy(xpath = "(//button[normalize-space()='LogIn'])[1]")
	private WebElement login;

	public WebElement getSecurity() {
		return security;
	}

	public WebElement getMemorablepin() {
		return memorablepin;
	}

	public WebElement getMemorablepass() {
		return memorablepass;
	}

	public WebElement getSavepin() {
		return savepin;
	}

	public WebElement getSavepass() {
		return savepass;
	}

	public WebElement getNewpass() {
		return newpass;
	}

	public WebElement getConfipass() {
		return confipass;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getEnterpin() {
		return enterpin;
	}

	public WebElement getConfipin() {
		return confipin;
	}

	public WebElement getConfirmbtn() {
		return confirmbtn;
	}

	public WebElement getLogin() {
		return login;
	}
}
