package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class TOP_Page extends Base_Class {

	public TOP_Page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[normalize-space()='Start now']")
	private WebElement start;

	@FindBy(xpath = "(//span[@class='radio'])[1]")
	private WebElement yes;

	@FindBy(xpath = "(//span[@class='radio'])[2]")
	private WebElement no;

	@FindBy(xpath = "(//span[@class='radio'])[3]")
	private WebElement periodyes;

	@FindBy(xpath = "(//span[@class='radio'])[4]")
	private WebElement periodno;

	@FindBy(xpath = "(//button[@type='button'])[8]")
	private WebElement lastperiod;

	@FindBy(xpath = "//button[normalize-space()='NEXT']")
	private WebElement yesornoperiodnext;

	@FindBy(xpath = "//input[@name='day']")
	private WebElement day;

	@FindBy(xpath = "//input[@name='month']")
	private WebElement month;

	@FindBy(xpath = "//input[@name='year']")
	private WebElement year;

	@FindBy(xpath = "//div[@class='react-date-picker__wrapper']")
	private WebElement DOB;

	@FindBy(xpath = "(//span[@class='radio'])[1]")
	private WebElement yessafe;

	@FindBy(xpath = "(//span[@class='radio'])[2]")
	private WebElement nosafe;

	@FindBy(xpath = "//textarea[@placeholder='Start typing here']")
	private WebElement unsafetext;

	@FindBy(xpath = "(//span[@class='radio'])[1]")
	private WebElement yesgp;

	@FindBy(xpath = "(//span[@class='radio'])[2]")
	private WebElement nogp;

	@FindBy(xpath = "//div[@class='react-select__control css-1im77uy-control']")
	private WebElement entergp;

	@FindBy(xpath = "react-select-3-option-0")
	private WebElement selectgp;

	@FindBy(xpath = "(//span[@class='radio'])[1]")
	private WebElement ukyes;

	@FindBy(xpath = "(//span[@class='radio'])[2]")
	private WebElement ukno;

	@FindBy(xpath = "//button[normalize-space()='CHOOSE A CALL BACK SLOT']")
	private WebElement arrangecall;

	@FindBy(xpath = "(//input[@placeholder='House/Flat no.'])[1]")
	private WebElement flatno;

	@FindBy(xpath = "//input[@placeholder='Street name']")
	private WebElement street;

	@FindBy(xpath = "//input[@placeholder='Town/City']")
	private WebElement town;

	@FindBy(xpath = "//input[@placeholder='Postcode']")
	private WebElement postcode;

	@FindBy(xpath = "(//span[@class='radio'])[1]")
	private WebElement flow1yes;

	@FindBy(xpath = "//textarea[@placeholder='Start typing here']")
	private WebElement flow1text;

	@FindBy(xpath = "(//span[@class='radio'])[2]")
	private WebElement flow1no;

	@FindBy(xpath = "//button[normalize-space()='Submit']")
	private WebElement submit;

	@FindBy(xpath = "//div[@id='react-select-12-option-0']")
	private WebElement ubrnaddress;

	@FindBy(xpath = "//input[@placeholder='Enter UBRN number']")
	private WebElement enterubrn;

	@FindBy(xpath = "//input[@placeholder='Start typing']")
	private WebElement enterpasscode;

	@FindBy(xpath = "//div[@id='react-select-28-option-0']")
	private WebElement localaddress;

	@FindBy(xpath = "(//span[@class='radio'])[1]")
	private WebElement localyes;

	@FindBy(xpath = "//textarea[@placeholder='Start typing here']")
	private WebElement localtext;

	@FindBy(xpath = "(//span[@class='radio'])[2]")
	private WebElement localno;

	@FindBy(xpath = "(//span[@class='radio'])[1]")
	private WebElement anytime;

	@FindBy(xpath = "(//span[@class='radio'])[2]")
	private WebElement morning;

	@FindBy(xpath = "(//span[@class='radio'])[3]")
	private WebElement afternoon;

	@FindBy(xpath = "(//span[@class='radio'])[4]")
	private WebElement evening;

	@FindBy(xpath = "//button[normalize-space()='BOOK CALL BACK']")
	private WebElement callback;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement logemail;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement logpass;

	@FindBy(xpath = "//input[@id='pin']")
	private WebElement pin;

	@FindBy(xpath = "//button[@type='submit'][normalize-space()='LOGIN']")
	private WebElement login;

	@FindBy(xpath = "//a[text()='All Clients']")
	private WebElement allclients;

	@FindBy(xpath = "//iframe[@title='reCAPTCHA']")
	private WebElement recaptchaframe;

	@FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
	private WebElement recaptcha;

	@FindBy(xpath = "(//span[@aria-label='PREVIEW Button'])[1]")
	private WebElement completenow;

	@FindBy(xpath = "//div[@id='react-select-2-placeholder']")
	private WebElement entertext;

	@FindBy(xpath = "(//span[@class='radio'])[5]")
	private WebElement yesukadd;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement userlogout;

	@FindBy(xpath = "(//div[contains(text(),'Account settings')])[1]")
	private WebElement account;

	@FindBy(xpath = "//span[normalize-space()='Completed forms']")
	private WebElement completedforms;

	@FindBy(xpath = "//span[@aria-label='EDIT Button']")
	private WebElement edit;

	@FindBy(xpath = "(//textarea[@class='answer-textarea'])[5]")
	private WebElement edityes;

	@FindBy(xpath = "(//textarea[@class='answer-textarea'])[16]")
	private WebElement edituk;

	@FindBy(xpath = "//button[normalize-space()='SUBMIT']")
	private WebElement editsubmit;

	@FindBy(xpath = "//span[@aria-label='PREVIEW Button']")
	private WebElement editpreview;

	@FindBy(xpath = "//div[@id='popup_focus']")
	private WebElement closepreview;

	@FindBy(xpath = "(//button[@type='button'])[9]")
	private WebElement goback;

	@FindBy(xpath = "(//span[@class='copytext'])[1]")
	private WebElement infoedit1;

	@FindBy(xpath = "(//input[@id='lastname'])[1]")
	private WebElement editname;

	@FindBy(xpath = "(//input[@id='postcode'])[1]")
	private WebElement editpostcode;

	@FindBy(xpath = "(//button[normalize-space()='SAVE'])[1]")
	private WebElement editsave;

	@FindBy(xpath = "(//button[@type='button'])[5]")
	private WebElement audit;

	@FindBy(xpath = "(//button[@type='button'])[6]")
	private WebElement safe;

	@FindBy(xpath = "(//button[@type='button'])[7]")
	private WebElement rightcare;

	@FindBy(xpath = "//div[text()='CHANCERY LANE SURGERY ,  CHANCERY LANE SURGERY ,  CHAPEL END , NUNEATON ,  WARWICKSHIRE ,  CV10 0PB']")
	private WebElement gpdetails1;

	public WebElement getStart() {
		return start;
	}

	public WebElement getYes() {
		return yes;
	}

	public WebElement getNo() {
		return no;
	}

	public WebElement getPeriodyes() {
		return periodyes;
	}

	public WebElement getPeriodno() {
		return periodno;
	}

	public WebElement getLastperiod() {
		return lastperiod;
	}

	public WebElement getYesornoperiodnext() {
		return yesornoperiodnext;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getDOB() {
		return DOB;
	}

	public WebElement getYessafe() {
		return yessafe;
	}

	public WebElement getNosafe() {
		return nosafe;
	}

	public WebElement getUnsafetext() {
		return unsafetext;
	}

	public WebElement getYesgp() {
		return yesgp;
	}

	public WebElement getNogp() {
		return nogp;
	}

	public WebElement getEntergp() {
		return entergp;
	}

	public WebElement getSelectgp() {
		return selectgp;
	}

	public WebElement getUkyes() {
		return ukyes;
	}

	public WebElement getUkno() {
		return ukno;
	}

	public WebElement getArrangecall() {
		return arrangecall;
	}

	public WebElement getFlatno() {
		return flatno;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getTown() {
		return town;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getFlow1yes() {
		return flow1yes;
	}

	public WebElement getFlow1text() {
		return flow1text;
	}

	public WebElement getFlow1no() {
		return flow1no;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getUbrnaddress() {
		return ubrnaddress;
	}

	public WebElement getEnterubrn() {
		return enterubrn;
	}

	public WebElement getEnterpasscode() {
		return enterpasscode;
	}

	public WebElement getLocaladdress() {
		return localaddress;
	}

	public WebElement getLocalyes() {
		return localyes;
	}

	public WebElement getLocaltext() {
		return localtext;
	}

	public WebElement getLocalno() {
		return localno;
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

	public WebElement getCallback() {
		return callback;
	}

	public WebElement getLogemail() {
		return logemail;
	}

	public WebElement getLogpass() {
		return logpass;
	}

	public WebElement getPin() {
		return pin;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getRecaptchaframe() {
		return recaptchaframe;
	}

	public WebElement getRecaptcha() {
		return recaptcha;
	}

	public WebElement getCompletenow() {
		return completenow;
	}

	public WebElement getEntertext() {
		return entertext;
	}

	public WebElement getYesukadd() {
		return yesukadd;
	}

	public WebElement getAllclients() {
		return allclients;
	}

	public WebElement getUserlogout() {
		return userlogout;
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getCompletedforms() {
		return completedforms;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getEdityes() {
		return edityes;
	}

	public WebElement getEdituk() {
		return edituk;
	}

	public WebElement getEditsubmit() {
		return editsubmit;
	}

	public WebElement getEditpreview() {
		return editpreview;
	}

	public WebElement getClosepreview() {
		return closepreview;
	}

	public WebElement getGoback() {
		return goback;
	}

	public WebElement getEditname() {
		return editname;
	}

	public WebElement getEditpostcode() {
		return editpostcode;
	}

	public WebElement getEditsave() {
		return editsave;
	}

	public WebElement getAudit() {
		return audit;
	}

	public WebElement getSafe() {
		return safe;
	}

	public WebElement getRightcare() {
		return rightcare;
	}

	public WebElement getInfoedit1() {
		return infoedit1;
	}

	public WebElement getGpdetails1() {
		return gpdetails1;
	}
}
