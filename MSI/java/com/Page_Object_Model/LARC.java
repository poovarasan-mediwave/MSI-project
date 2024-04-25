package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class LARC extends Base_Class {
	public LARC() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[normalize-space()='Start now'])[1]")
	private WebElement start;

	@FindBy(xpath = "(//span[@class='radio'])[1]")
	private WebElement yesbtn;

	@FindBy(xpath = "(//span[@class='radio'])[2]")
	private WebElement nobtn;

	@FindBy(xpath = "(//span[@class='radio'])[3]")
	private WebElement insertion;

	@FindBy(xpath = "(//span[@class='radio'])[4]")
	private WebElement removal;

	@FindBy(xpath = "(//span[@class='radio'])[5]")
	private WebElement change;

	@FindBy(xpath = "//input[@name='day']")
	private WebElement day;

	@FindBy(xpath = "//input[@name='month']")
	private WebElement month;

	@FindBy(xpath = "(//span[@class='radio'])[2]")
	private WebElement no2;

	@FindBy(xpath = "(//span[@class='radio'])[4]")
	private WebElement no4;

	@FindBy(xpath = "(//span[@class='radio'])[6]")
	private WebElement no6;

	@FindBy(xpath = "(//span[@class='radio'])[7]")
	private WebElement yes7;

	@FindBy(xpath = "(//button[normalize-space()='Submit'])[1]")
	private WebElement submit;

	@FindBy(xpath = "//input[@placeholder='House/Flat no']")
	private WebElement houseno;

	@FindBy(xpath = "(//span[@class='radio'])[8]")
	private WebElement no8;

	@FindBy(xpath = "//div[text()='CHANCERY LANE SURGERY ,  CHANCERY LANE SURGERY ,  CHAPEL END , NUNEATON ,  WARWICKSHIRE ,  CV10 0PB']")
	private WebElement address1;

	public WebElement getNo2() {
		return no2;
	}

	public WebElement getNo4() {
		return no4;
	}

	public WebElement getNo6() {
		return no6;
	}

	public WebElement getStart() {
		return start;
	}

	public WebElement getYesbtn() {
		return yesbtn;
	}

	public WebElement getNobtn() {
		return nobtn;
	}

	public WebElement getInsertion() {
		return insertion;
	}

	public WebElement getRemoval() {
		return removal;
	}

	public WebElement getChange() {
		return change;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYes7() {
		return yes7;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getHouseno() {
		return houseno;
	}

	public WebElement getNo8() {
		return no8;
	}

	public WebElement getAddress1() {
		return address1;
	}

}
