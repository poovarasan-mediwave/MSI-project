package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class Setting_Update extends Base_Class {

	public Setting_Update() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='qb-card-group']/div/div[@class='card-footer']/div/span[@aria-label='Settings Button'])[1]")
	private WebElement setting_icon;

	@FindBy(xpath = "//label[normalize-space()='Questionnaire Category']/parent::div/div/div")
	private WebElement catagory;

	@FindBy(xpath = "//label[normalize-space()='Service']/parent::div/div/div")
	private WebElement service;

	@FindBy(xpath = "//span[normalize-space()='More options']")
	private WebElement more_Options;

	@FindBy(xpath = "//button[@class='btn primary-btn'][normalize-space()='UPDATE']")
	private WebElement update_Option;

	public WebElement getSetting_icon() {
		return setting_icon;
	}

	public WebElement getCatagory() {
		return catagory;
	}

	public WebElement getService() {
		return service;
	}

	public WebElement getMore_Options() {
		return more_Options;
	}

	public WebElement getUpdate_Option() {
		return update_Option;
	}

}
