package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class External_Login extends Base_Class {

	public External_Login() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/external-azure-login']")
	private WebElement stafflogin_Button;

	@FindBy(xpath = "//input[@id='i0116']")
	private WebElement externalemail;

	@FindBy(xpath = "//input[@id='idSIButton9']")
	private WebElement externalNext;

	@FindBy(xpath = "//input[@id='i0118']")
	private WebElement externalPassword;

	public WebElement getStafflogin_Button() {
		return stafflogin_Button;
	}

	public WebElement getExternalemail() {
		return externalemail;
	}

	public WebElement getExternalNext() {
		return externalNext;
	}

	public WebElement getExternalPassword() {
		return externalPassword;
	}

}
