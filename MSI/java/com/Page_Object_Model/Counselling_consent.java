package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class Counselling_consent extends Base_Class {

	public Counselling_consent() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/div[@id='root']/div/div[contains(@class,'react-tabs')]/div[@id='panel:r0:4']/div/div[contains(@class,'counselling-card')]/div[contains(@class,'cd-card')]/div[contains(@class,'Ecard-footer')]/div[contains(@class,'mini-link-set')]/a[1]")
	private WebElement preview_coun;

	@FindBy(xpath = "//div[@id='popup_focus']//*[name()='svg']")
	private WebElement close_form_coun;

	@FindBy(xpath = "//body/div[@id='root']/div/div[@class='react-tabs']/div[@id='panel:r0:4']/div[2]/div[2]/div[2]/label[1]/span[1]//*[name()='svg']")
	private WebElement edit_form_coun;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/input[1]")
	private WebElement txtbox_form_coun;

	@FindBy(xpath = "//div[contains(@class,'counselling-card')]//a[contains(text(),'REPLACE')]")
	private WebElement replace_coun;

	@FindBy(xpath = "//body/div/div/div[contains(@data-rttabs,'true')]/div[contains(@role,'tabpanel')]/div/div/div/div/div/div/div[1]/label[1]/span[1]")
	private WebElement select_consentform;

	@FindBy(xpath = "//button[normalize-space()='CONFIRM']")
	private WebElement confirm_consent;

	@FindBy(xpath = "//div[@class='cd-card']//span[@aria-label='PREVIEW Button']//a[contains(text(),'PREVIEW')]")
	private WebElement preview_consent;

	@FindBy(xpath = "//div[@class='mb-20']//span[@class='cd-edit-head']//*[name()='svg']")
	private WebElement edit_consent;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[5]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/input[1]")
	private WebElement txtbox_consent;

	public WebElement getPreview_coun() {
		return preview_coun;
	}

	public WebElement getClose_form_coun() {
		return close_form_coun;
	}

	public WebElement getEdit_form_coun() {
		return edit_form_coun;
	}

	public WebElement getTxtbox_form_coun() {
		return txtbox_form_coun;
	}

	public WebElement getReplace_coun() {
		return replace_coun;
	}

	public WebElement getSelect_consentform() {
		return select_consentform;
	}

	public WebElement getConfirm_consent() {
		return confirm_consent;
	}

	public WebElement getPreview_consent() {
		return preview_consent;
	}

	public WebElement getEdit_consent() {
		return edit_consent;
	}

	public WebElement getTxtbox_consent() {
		return txtbox_consent;
	}
}
