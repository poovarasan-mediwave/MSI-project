package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class VAS_reference_code extends Base_Class {

	public VAS_reference_code() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[contains(text(),'ELIGIBLITY')]/ancestor::div[@class='Ecard-info']/following-sibling::div/div[@class='mini-link-set']/span/button/a")
	private WebElement vas_eligibility_starting;

	@FindBy(xpath = "//input[@id='nhsnumber']")
	private WebElement nHS_number_field;

	@FindBy(xpath = "//div[@class='radiolink']/button/a")
	private WebElement dont_have_nhs_number;

	@FindBy(xpath = "//button[normalize-space()='CHOOSE A CALL BACK SLOT']")
	private WebElement choose_call_back_button;

	@FindBy(xpath = "//button[normalize-space()='NEXT']")
	private WebElement next_button;

	@FindBy(xpath = "//h6[normalize-space()='Please enter your GP details']/parent::div/div/div/div/div")
	private WebElement search_field;

	@FindBy(xpath = "//h6[normalize-space()='Please enter your GP details']/parent::div/div/div/div/div/following-sibling::div/div/div[1]")
	private WebElement unique_gp_postcode;

	public WebElement getVas_eligibility_starting() {
		return vas_eligibility_starting;
	}

	public WebElement getnHS_number_field() {
		return nHS_number_field;
	}

	public WebElement getDont_have_nhs_number() {
		return dont_have_nhs_number;
	}

	public WebElement getChoose_call_back_button() {
		return choose_call_back_button;
	}

	public WebElement getNext_button() {
		return next_button;
	}

	public WebElement getSearch_field() {
		return search_field;
	}

	public WebElement getUnique_gp_postcode() {
		return unique_gp_postcode;
	}

	public void vas_NHS_page(String NHS_number, String dont_have_nhs, String unique_call_back,
			String unique_call_back_time) {

		ClickOnElement(getVas_eligibility_starting());
		// need to update the date field

//		enterText(getnHS_number_field(), NHS_number);
		if (dont_have_nhs == "I don't have an NHS number") {
			ClickOnElement(getDont_have_nhs_number());
			ClickOnElement(getChoose_call_back_button());
			call_back_default(unique_call_back, unique_call_back_time);

		} else {
			enterText(getnHS_number_field(), NHS_number);
			next_button(getNext_button());

		}
	}

	public void GP_details_page(String gp_postcode) {
		if (URL_lastsegment() == "PregnancyCounselling") {
			next_button(getNext_button());
		}
		if (gp_postcode == "asnmas") {
			ClickOnElement(getSearch_field());
			enterText(getSearch_field(), gp_postcode);
			ClickOnElement(getUnique_gp_postcode());
		} else {

		}

	}
}
