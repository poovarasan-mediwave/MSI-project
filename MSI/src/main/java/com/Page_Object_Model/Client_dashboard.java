package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class Client_dashboard extends Base_Class {

	public Client_dashboard() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[normalize-space()='Client Dashboard']")
	private WebElement client_dash;

	@FindBy(xpath = "//label[normalize-space()='Dashboard heading']//*[name()='svg']")
	private WebElement dash_head_edit;

	@FindBy(xpath = "//input[@placeholder='Dashboard']")
	private WebElement dash_head_txtbox;

	@FindBy(xpath = "//button[@id='SAVE']")
	private WebElement dash_head_save;

	@FindBy(xpath = "//label[normalize-space()='Dashboard description']//*[name()='svg']")
	private WebElement dash_descrip_edit;

	@FindBy(xpath = "//input[@placeholder='Please follow the steps given below']")
	private WebElement dash_descrip_txtbox;

	@FindBy(xpath = "//div[@class='db-head']//div[2]//span[1]//button[1]")
	private WebElement dash_descrip_save;

	public WebElement getClient_dash() {
		return client_dash;
	}

	public WebElement getDash_head_edit() {
		return dash_head_edit;
	}

	public WebElement getDash_head_txtbox() {
		return dash_head_txtbox;
	}

	public WebElement getDash_head_save() {
		return dash_head_save;
	}

	public WebElement getDash_descrip_edit() {
		return dash_descrip_edit;
	}

	public WebElement getDash_descrip_txtbox() {
		return dash_descrip_txtbox;
	}

	public WebElement getDash_descrip_save() {
		return dash_descrip_save;
	}
}
