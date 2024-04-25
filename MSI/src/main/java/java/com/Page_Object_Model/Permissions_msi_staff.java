package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class Permissions_msi_staff extends Base_Class {

	public Permissions_msi_staff() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Staff Login')]")
	private WebElement stafflogin;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement staffemail;

	@FindBy(xpath = "//input[@name='passwd']")
	private WebElement staffpassword;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement staffsubmit;

	@FindBy(xpath = "(//a[@href='/admin/dashboard/msistaff'])[1]")
	private WebElement msistaff;

	@FindBy(xpath = "//a[@href='/admin/upload-csv']")
	private WebElement adminfunctions;

	@FindBy(xpath = "//a[@href='/admin/dashboard']")
	private WebElement dashboard;

	public WebElement getDashboard() {
		return dashboard;
	}

	@FindBy(xpath = "//li[contains(text(),' Permissions')]")
	private WebElement permissions;

	@FindBy(xpath = "//button[contains(text(),'ADD SUPER ADMIN')]")
	private WebElement addsuperadmin;

	@FindBy(xpath = "//p[contains(text(),'msi-oliver@mindwaveventures.com')]")
	private WebElement selectsuperadmin;

	@FindBy(xpath = "//button[contains(text(),'CONFIRM')]")
	private WebElement addsuperadminconfirm;

	@FindBy(xpath = "(//span[contains(text(),'SWITCH TO ADMIN')])[1]")
	private WebElement switchtoadmin;

	@FindBy(xpath = "(//div[contains(text(),'DISABLE')])[1]")
	private WebElement disableadmin;

	@FindBy(xpath = "(//span[@class='slider round'])[5]")
	private WebElement enableadmin;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;

	@FindBy(xpath = "//div[contains(text(),'Use another account')]")
	private WebElement useanotheraccount;

	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	private WebElement confirm;

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getUseanotheraccount() {
		return useanotheraccount;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getLogout2() {
		return logout2;
	}

	@FindBy(xpath = "//div[@role='button']")
	private WebElement logout2;

	public WebElement getStafflogin() {
		return stafflogin;
	}

	public WebElement getStaffemail() {
		return staffemail;
	}

	public WebElement getStaffpassword() {
		return staffpassword;
	}

	public WebElement getStaffsubmit() {
		return staffsubmit;
	}

	public WebElement getMsistaff() {
		return msistaff;
	}

	public WebElement getAdminfunctions() {
		return adminfunctions;
	}

	public WebElement getPermissions() {
		return permissions;
	}

	public WebElement getAddsuperadmin() {
		return addsuperadmin;
	}

	public WebElement getSelectsuperadmin() {
		return selectsuperadmin;
	}

	public WebElement getAddsuperadminconfirm() {
		return addsuperadminconfirm;
	}

	public WebElement getSwitchtoadmin() {
		return switchtoadmin;
	}

	public WebElement getDisableadmin() {
		return disableadmin;
	}

	public WebElement getEnableadmin() {
		return enableadmin;
	}
}
