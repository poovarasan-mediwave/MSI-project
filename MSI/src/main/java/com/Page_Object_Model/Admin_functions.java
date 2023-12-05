package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class Admin_functions extends Base_Class {


	
	
	@FindBy(xpath = "//a[@href='/admin/upload-csv'][normalize-space()='Admin functions']")
	private WebElement admin_Fun;
	
	@FindBy(xpath = "//a[@class='\"+exDay+\"']")
	private WebElement sdefewfe;
	

	public Admin_functions() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdmin_Fun() {
		return admin_Fun;
	}

}
