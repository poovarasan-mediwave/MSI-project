package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class TOP_step2 extends Base_Class {

	public TOP_step2() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='MuiBox-root jss21 jss5']//div//a[contains(text(),'REPLACE')]")
	private WebElement replace_step2;

	@FindBy(xpath = "//body/div/div/div[contains(@data-rttabs,'true')]/div[contains(@role,'tabpanel')]/div/div/div/div/div/div/div[1]/label[1]/span[1]")
	private WebElement select_form;

	@FindBy(xpath = "//button[normalize-space()='CONFIRM']")
	private WebElement confirm_form;

	@FindBy(xpath = "//div[@id='popup_focus']//*[name()='svg']")
	private WebElement close_form;

	@FindBy(xpath = "//div[contains(@class,'MuiBox-root jss21 jss5')]//div//a[contains(text(),'PREVIEW')]")
	private WebElement preview_step2;

	@FindBy(xpath = "//div[@id='popup_focus']//*[name()='svg']")
	private WebElement close_preview_step2;

	@FindBy(xpath = "//div[@class='MuiBox-root jss21 jss5']//div//label[contains(text(),'Form description')]//span[@class='cd-edit-head cursor-pointer']//*[name()='svg']")
	private WebElement edit_form_step2;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/p[1]/div[2]/div[1]/div[1]/div[2]/input[1]")
	private WebElement txtbox_form_step2;

	@FindBy(xpath = "//button[contains(text(),'SAVE')]")
	private WebElement save_step2;

	@FindBy(xpath = "//div[@class='MuiBox-root jss21 jss5']//div//div[@class='input-group']//span[@class='cd-edit-head cursor-pointer']//*[name()='svg']")
	private WebElement edit_time_step2;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/p[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	private WebElement txtbox_time_step2;

	public WebElement getReplace_step2() {
		return replace_step2;
	}

	public WebElement getSelect_form() {
		return select_form;
	}

	public WebElement getConfirm_form() {
		return confirm_form;
	}

	public WebElement getClose_form() {
		return close_form;
	}

	public WebElement getPreview_step2() {
		return preview_step2;
	}

	public WebElement getClose_preview_step2() {
		return close_preview_step2;
	}

	public WebElement getEdit_form_step2() {
		return edit_form_step2;
	}

	public WebElement getTxtbox_form_step2() {
		return txtbox_form_step2;
	}

	public WebElement getSave_step2() {
		return save_step2;
	}

	public WebElement getEdit_time_step2() {
		return edit_time_step2;
	}

	public WebElement getTxtbox_time_step2() {
		return txtbox_time_step2;
	}

}
