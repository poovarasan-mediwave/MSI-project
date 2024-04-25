package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class TOP_step3 extends Base_Class {

	public TOP_step3() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@class,'MuiBox-root jss27 jss5')]//div//a[contains(text(),'REPLACE')]")
	private WebElement replace_step3;

	@FindBy(xpath = "//h5[normalize-space()='Testing Uniques']/ancestor::div[@class='grid gap-5 grid-cols-[repeat(auto-fit,minmax(50px,max-content))] justify-center my-4']/label/span")
	private WebElement select_form_step3;

	@FindBy(xpath = "//button[normalize-space()='CONFIRM']")
	private WebElement confirm_form_step3;

	@FindBy(xpath = "//div[@id='popup_focus']//*[name()='svg']")
	private WebElement close_icon_step3;

	@FindBy(xpath = "//div[contains(@class,'MuiBox-root jss27 jss5')]//div//a[contains(text(),'PREVIEW')]")
	private WebElement preview_form_step3;

	@FindBy(xpath = "//div[@class='MuiBox-root jss27 jss5']//div//label[contains(text(),'Form description')]//span[@class='cd-edit-head cursor-pointer']//*[name()='svg']")
	private WebElement edit_form_step3;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/p[1]/div[2]/div[1]/div[1]/div[2]/input[1]")
	private WebElement txtbox_form_step3;

	@FindBy(xpath = "//button[contains(text(),'SAVE')]")
	private WebElement save_step3;

	@FindBy(xpath = "//div[@class='MuiBox-root jss27 jss5']//div//div[@class='input-group']//span[@class='cd-edit-head cursor-pointer']//*[name()='svg']")
	private WebElement edit_time_step3;

	@FindBy(xpath = "//div[@class='MuiBox-root jss27 jss5']//div//p[@class='MuiTypography-root jss15 MuiTypography-body2']//div[@class='cd-head']//div[@class='input-group']//div[@class='textbtngrid']//div//input[@placeholder='mm:ss']")
	private WebElement txtbox_time_step3;

	public WebElement getReplace_step3() {
		return replace_step3;
	}

	public WebElement getSelect_form_step3() {
		return select_form_step3;
	}

	public WebElement getConfirm_form_step3() {
		return confirm_form_step3;
	}

	public WebElement getClose_icon_step3() {
		return close_icon_step3;
	}

	public WebElement getPreview_form_step3() {
		return preview_form_step3;
	}

	public WebElement getEdit_form_step3() {
		return edit_form_step3;
	}

	public WebElement getTxtbox_form_step3() {
		return txtbox_form_step3;
	}

	public WebElement getSave_step3() {
		return save_step3;
	}

	public WebElement getEdit_time_step3() {
		return edit_time_step3;
	}

	public WebElement getTxtbox_time_step3() {
		return txtbox_time_step3;
	}

}
