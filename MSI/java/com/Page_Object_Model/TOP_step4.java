package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class TOP_step4 extends Base_Class {

	@FindBy(xpath = "//div[@class='MuiBox-root jss31 jss5']//div//a[contains(text(),'REPLACE')]")
	private WebElement replace_step4;

	@FindBy(xpath = "//body/div/div/div[contains(@data-rttabs,'true')]/div[contains(@role,'tabpanel')]/div/div/div/div/div/div/div[1]/label[1]/span[1]")
	private WebElement select_form_step4;

	@FindBy(xpath = "//button[normalize-space()='CONFIRM']")
	private WebElement confirm_form_step4;

	@FindBy(xpath = "//div[@id='popup_focus']//*[name()='svg']")
	private WebElement close_step4;

	@FindBy(xpath = "//div[@class='MuiBox-root jss31 jss5']//div//a[contains(text(),'PREVIEW')]")
	private WebElement preview_step4;

	@FindBy(xpath = "//div[@class='MuiBox-root jss31 jss5']//div//label[contains(text(),'Form description')]//span[@class='cd-edit-head cursor-pointer']//*[name()='svg']")
	private WebElement edit_form_step4;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/p[1]/div[2]/div[1]/div[1]/div[2]/input[1]")
	private WebElement txtbox_form_step4;

	@FindBy(xpath = "//button[normalize-space()='SAVE']")
	private WebElement save_step4;

	@FindBy(xpath = "//div[contains(@class,'MuiBox-root jss31 jss5')]//div//div[contains(@class,'input-group')]//span[contains(@class,'cd-edit-head cursor-pointer')]//*[name()='svg']")
	private WebElement time_edit_step4;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/p[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	private WebElement txtbox_time_step4;

	public TOP_step4() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getReplace_step4() {
		return replace_step4;
	}

	public WebElement getSelect_form_step4() {
		return select_form_step4;
	}

	public WebElement getConfirm_form_step4() {
		return confirm_form_step4;
	}

	public WebElement getClose_step4() {
		return close_step4;
	}

	public WebElement getPreview_step4() {
		return preview_step4;
	}

	public WebElement getEdit_form_step4() {
		return edit_form_step4;
	}

	public WebElement getTxtbox_form_step4() {
		return txtbox_form_step4;
	}

	public WebElement getSave_step4() {
		return save_step4;
	}

	public WebElement getTime_edit_step4() {
		return time_edit_step4;
	}

	public WebElement getTxtbox_time_step4() {
		return txtbox_time_step4;
	}
}
