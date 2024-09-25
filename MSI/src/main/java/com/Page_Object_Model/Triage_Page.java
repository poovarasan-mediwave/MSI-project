package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class Triage_Page extends Base_Class {

	public Triage_Page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[normalize-space()='Triage worklist'])[1]")
	private WebElement triage1;

	@FindBy(xpath = "(//div[@class=' css-13cymwt-control'])[91]")
	private WebElement select;

	@FindBy(xpath = "//label[text()='IR raised SG']")
	private WebElement IRraised;

	@FindBy(xpath = "//label[text()='Mark completed']")
	private WebElement markcompleted;

	@FindBy(xpath = "//label[text()='Refer to manager']")
	private WebElement refer;

	@FindBy(xpath = "//label[text()='Assign to me']")
	private WebElement assign;

	@FindBy(xpath = "//label[text()='Flagged to clinic']")
	private WebElement flagged;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	private WebElement savebtn;

	@FindBy(xpath = "//span[normalize-space()='Audit trail']")
	private WebElement audit;

	@FindBy(xpath = "//button[normalize-space()='Filter by']")
	private WebElement filterby;

	@FindBy(xpath = "//label[text()='TOP']")
	private WebElement TOP;

	@FindBy(xpath = "//label[text()='VAS']")
	private WebElement VAS;

	@FindBy(xpath = "//label[text()='LARC']")
	private WebElement LARC;

	@FindBy(xpath = "(//input[@placeholder='From'])[1]")
	private WebElement fromage;

	@FindBy(xpath = "(//input[@placeholder='From'])[2]")
	private WebElement toage;

	@FindBy(xpath = "//label[normalize-space()='Category 1']")
	private WebElement cat1;

	@FindBy(xpath = "//label[normalize-space()='Category 2']")
	private WebElement cat2;

	@FindBy(xpath = "//label[normalize-space()='Category 3']")
	private WebElement cat3;

	@FindBy(xpath = "//label[normalize-space()='Category 4']")
	private WebElement cat4;

	@FindBy(xpath = "//label[normalize-space()='Red']")
	private WebElement red;

	@FindBy(xpath = "//label[normalize-space()='Amber']")
	private WebElement amber;

	@FindBy(xpath = "//label[normalize-space()='Green']")
	private WebElement green;

	@FindBy(xpath = "//label[normalize-space()='Safe']")
	private WebElement safe;

	@FindBy(xpath = "//label[normalize-space()='Unsafe']")
	private WebElement unsafe;

	@FindBy(xpath = "//label[normalize-space()='IR raised SG']")
	private WebElement SG;

	@FindBy(xpath = "(//li[@role='tab'])[1]")
	private WebElement pending;

	@FindBy(xpath = "//label[normalize-space()='Assign to me']")
	private WebElement assigntome;

	@FindBy(xpath = "//label[normalize-space()='IR raised RC']")
	private WebElement RC;

	@FindBy(xpath = "//label[normalize-space()='Referred to manager']")
	private WebElement reftomanager;

	@FindBy(xpath = "//label[normalize-space()='Flagged to clinic']")
	private WebElement flagged1;

	@FindBy(xpath = "//button[normalize-space()='RESET']")
	private WebElement reset;

	@FindBy(xpath = "//button[normalize-space()='SUBMIT']")
	private WebElement submit;

	@FindBy(xpath = "(//li[@role='tab'])[2]")
	private WebElement completed;

	@FindBy(xpath = "//a[@class='font-proximanovaBold underline cursor-pointer']")
	private WebElement userno;

	@FindBy(xpath = "//input[@name='searchTxt']")
	private WebElement search;

	@FindBy(xpath = "//button[text()='Back']")
	private WebElement backbtn1;

	public WebElement getTriage1() {
		return triage1;
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getIRraised() {
		return IRraised;
	}

	public WebElement getMarkcompleted() {
		return markcompleted;
	}

	public WebElement getRefer() {
		return refer;
	}

	public WebElement getAssign() {
		return assign;
	}

	public WebElement getFlagged() {
		return flagged;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getAudit() {
		return audit;
	}

	public WebElement getFilterby() {
		return filterby;
	}

	public WebElement getTOP() {
		return TOP;
	}

	public WebElement getVAS() {
		return VAS;
	}

	public WebElement getLARC() {
		return LARC;
	}

	public WebElement getFromage() {
		return fromage;
	}

	public WebElement getToage() {
		return toage;
	}

	public WebElement getCat1() {
		return cat1;
	}

	public WebElement getCat2() {
		return cat2;
	}

	public WebElement getCat3() {
		return cat3;
	}

	public WebElement getCat4() {
		return cat4;
	}

	public WebElement getRed() {
		return red;
	}

	public WebElement getAmber() {
		return amber;
	}

	public WebElement getGreen() {
		return green;
	}

	public WebElement getSafe() {
		return safe;
	}

	public WebElement getUnsafe() {
		return unsafe;
	}

	public WebElement getSG() {
		return SG;
	}

	public WebElement getPending() {
		return pending;
	}

	public WebElement getAssigntome() {
		return assigntome;
	}

	public WebElement getRC() {
		return RC;
	}

	public WebElement getReftomanager() {
		return reftomanager;
	}

	public WebElement getFlagged1() {
		return flagged1;
	}

	public WebElement getReset() {
		return reset;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getCompleted() {
		return completed;
	}

	public WebElement getUserno() {
		return userno;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getBackbtn1() {
		return backbtn1;
	}
}
