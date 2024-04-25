package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class TOP_step1 extends Base_Class {
	
	public TOP_step1() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='MuiBox-root jss14 jss5']//div//a[contains(text(),'PREVIEW')]")
	private WebElement Preview_step1;

	@FindBy(xpath = "//button[normalize-space()='NEXT']")
	private WebElement next_preview;

	@FindBy(xpath = "//div[@id='popup_focus']//*[name()='svg']")
	private WebElement close_preview;

	@FindBy(xpath = "//div[@class='MuiBox-root jss14 jss5']//div//label[contains(text(),'Form description')]//span[@class='cd-edit-head cursor-pointer']//*[name()='svg']")
	private WebElement edit_form_step1;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]/div[2]/div[1]/div[1]/div[2]/input[1]")
	private WebElement txtbox_form;

	@FindBy(xpath = "//button[normalize-space()='SAVE']")
	private WebElement save_form;

	@FindBy(xpath = "//div[@class='MuiBox-root jss14 jss5']//div//div[@class='input-group']//span[@class='cd-edit-head cursor-pointer']//*[name()='svg']")
	private WebElement edit_time;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	private WebElement txtbox_time;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]/div[2]/div[2]/div[1]/button[1]")
	private WebElement save_time;

	

	public WebElement getPreview_step1() {
		return Preview_step1;
	}

	public WebElement getNext_preview() {
		return next_preview;
	}

	public WebElement getClose_preview() {
		return close_preview;
	}

	public WebElement getEdit_form_step1() {
		return edit_form_step1;
	}

	public WebElement getTxtbox_form() {
		return txtbox_form;
	}

	public WebElement getSave_form() {
		return save_form;
	}

	public WebElement getEdit_time() {
		return edit_time;
	}

	public WebElement getTxtbox_time() {
		return txtbox_time;
	}

	public WebElement getSave_time() {
		return save_time;
	}

}
