package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class Upload_Page extends Base_Class {

	public Upload_Page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[normalize-space()='Admin functions'])[1]")
	private WebElement admin;

	@FindBy(xpath = "(//div[@class='cursor-pointer'])[1]")
	private WebElement gpdownload;

	@FindBy(xpath = "(//div[@class='cursor-pointer'])[2]")
	private WebElement contractdownload;

	@FindBy(xpath = "(//span[@class='updateicon'])[1]")
	private WebElement gpupload;

	@FindBy(xpath = "(//span[@class='updateicon'])[2]")
	private WebElement contractupload;

	@FindBy(xpath = "(//button[@id='upload-GP-practices-btn'])[1]")
	private WebElement uploadbtn;

	@FindBy(xpath = "(//span[normalize-space()='IMPORT EXISTING FORM'])[1]")
	private WebElement importfile;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement editname;

	@FindBy(xpath = "//span[text()='More options']")
	private WebElement moreopt;

	@FindBy(xpath = "//div[text()='Vas']")
	private WebElement vas;

	@FindBy(xpath = "(//button[normalize-space()='CREATE'])[1]")
	private WebElement createnew;

	@FindBy(xpath = "(//div[@class='react-select__control css-1im77uy-control'])[4]")
	private WebElement clickservices;

	@FindBy(xpath = "(//div[@class='qb-menu-info'])[2]")
	private WebElement editmulti1;

	@FindBy(xpath = "//textarea[text()='Add a new multi choice question']")
	private WebElement edittext;

	public WebElement getAdmin() {
		return admin;
	}

	public WebElement getGpdownload() {
		return gpdownload;
	}

	public WebElement getContractdownload() {
		return contractdownload;
	}

	public WebElement getGpupload() {
		return gpupload;
	}

	public WebElement getContractupload() {
		return contractupload;
	}

	public WebElement getUploadbtn() {
		return uploadbtn;
	}

	public WebElement getImportfile() {
		return importfile;
	}

	public WebElement getEditname() {
		return editname;
	}

	public WebElement getMoreopt() {
		return moreopt;
	}

	public WebElement getVas() {
		return vas;
	}

	public WebElement getCreatenew() {
		return createnew;
	}

	public WebElement getClickservices() {
		return clickservices;
	}

	public WebElement getEditmulti1() {
		return editmulti1;
	}

	public WebElement getEdittext() {
		return edittext;
	}
}
