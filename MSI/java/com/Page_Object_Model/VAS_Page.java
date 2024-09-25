package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class VAS_Page extends Base_Class {

	public VAS_Page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[normalize-space()='Start now']")
	private WebElement startnow;

	@FindBy(xpath = "//input[@placeholder='Enter NHS number']")
	private WebElement NHSno;

	@FindBy(xpath = "//a[normalize-space()='Find my NHS number']")
	private WebElement findNHS;

	@FindBy(xpath = "//button[normalize-space()='NEXT']")
	private WebElement next;

	@FindBy(xpath = "//a[normalize-space()=\"I don't have an NHS number\"]")
	private WebElement noNHS;

	@FindBy(xpath = "//button[normalize-space()='Arrange a call BACK']")
	private WebElement callback;

	@FindBy(xpath = "(//span[@class='radio'])[1]")
	private WebElement anytime;

	@FindBy(xpath = "(//span[@class='radio'])[2]")
	private WebElement morning;

	@FindBy(xpath = "(//span[@class='radio'])[3]")
	private WebElement afternoon;

	@FindBy(xpath = "(//span[@class='radio'])[4]")
	private WebElement evening;

	@FindBy(xpath = "//a[normalize-space()='I am not registered with a UK GP']")
	private WebElement notregistered;

	@FindBy(xpath = "//div[@id='react-select-4-option-0']")
	private WebElement localGP;

	@FindBy(xpath = "//div[@Id='react-select-7-option-0']")
	private WebElement UBRNgp;

	@FindBy(xpath = "//input[@placeholder='Enter your UBRN number']")
	private WebElement enterUBRN;

	@FindBy(xpath = "//input[@placeholder='Start typing']")
	private WebElement enterpasscode;

	@FindBy(xpath = "//button[normalize-space()='CONTINUE BOOKING']")
	private WebElement contibooking;

	@FindBy(xpath = "//div[@id='react-select-11-option-0']")
	private WebElement eligiflow;

	@FindBy(xpath = "//div[@class='react-select-container css-b62m3t-container']/div")
	private WebElement entergp;

	@FindBy(xpath = "//input[@class='react-select__input']")
	private WebElement findubrn;

	@FindBy(xpath = "//div[@class='react-select__value-container css-hlgwow']/div[2]")
	private WebElement passadd;

	@FindBy(xpath = "//div[text()='TESSA JOWELL GP SURGERY ,  TESSA JOWELL HEALTH CTR ,  72H EAST DULWICH GROVE , LONDON ,    SE22 8EY']")
	private WebElement gpdetails;

	public WebElement getFindubrn() {
		return findubrn;
	}

	public WebElement getEntergp() {
		return entergp;
	}

	public WebElement getStartnow() {
		return startnow;
	}

	public WebElement getNHSno() {
		return NHSno;
	}

	public WebElement getFindNHS() {
		return findNHS;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getNoNHS() {
		return noNHS;
	}

	public WebElement getCallback() {
		return callback;
	}

	public WebElement getAnytime() {
		return anytime;
	}

	public WebElement getMorning() {
		return morning;
	}

	public WebElement getAfternoon() {
		return afternoon;
	}

	public WebElement getEvening() {
		return evening;
	}

	public WebElement getNotregistered() {
		return notregistered;
	}

	public WebElement getLocalGP() {
		return localGP;
	}

	public WebElement getUBRNgp() {
		return UBRNgp;
	}

	public WebElement getEnterUBRN() {
		return enterUBRN;
	}

	public WebElement getEnterpasscode() {
		return enterpasscode;
	}

	public WebElement getContibooking() {
		return contibooking;
	}

	public WebElement getEligiflow() {
		return eligiflow;
	}

	public WebElement getPassadd() {
		return passadd;
	}

	public WebElement getGpdetails() {
		return gpdetails;
	}

}
