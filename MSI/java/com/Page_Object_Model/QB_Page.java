package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class QB_Page extends Base_Class {

	public QB_Page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[normalize-space()='Forms & Questionnaires']")
	private WebElement qb;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[3]/button[1]")
	private WebElement create;

	@FindBy(xpath = "(//input[@name='name'])[1]")
	private WebElement displayname;

	@FindBy(xpath = "(//input[@name='version'])")
	private WebElement internalques;

	@FindBy(xpath = "(//div[@class='react-select__control css-1im77uy-control'])[1]")
	private WebElement select;

	@FindBy(xpath = "//div[@id='react-select-6-option-3']")
	private WebElement consult;

	@FindBy(xpath = "//div[text()='Select a service']")
	private WebElement serviceselect;

	@FindBy(xpath = "//div[@id='react-select-7-option-0']")
	private WebElement selectservice;

	@FindBy(xpath = "//div[@class=' css-19bb58m']")
	private WebElement addtags;

	@FindBy(xpath = "//input[@placeholder='mm:ss']")
	private WebElement ESTtime;

	@FindBy(xpath = "//button[normalize-space()='Next']")
	private WebElement next;

	@FindBy(xpath = "//p[normalize-space()='Multiple choice question']")
	private WebElement multichoice;

	@FindBy(xpath = "//textarea[@name='notes']")
	private WebElement MCque;

	@FindBy(xpath = "//input[@name='role']")
	private WebElement supporttext;

	@FindBy(xpath = "(//input[@name='Dropdown'])[1]")
	private WebElement option1;

	@FindBy(xpath = "(//input[@name='Dropdown'])[2]")
	private WebElement option2;

	@FindBy(xpath = "//label[normalize-space()='Conditional']")
	private WebElement conditional;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Add conditional questions'])[1]")
	private WebElement addconditional1;

	@FindBy(xpath = "//button[normalize-space()='Select question type']")
	private WebElement questype;

	@FindBy(xpath = "(//p[normalize-space()='Free text input question'])[1]")
	private WebElement freetext;

	@FindBy(xpath = "//textarea[@name='Rating']")
	private WebElement MCque1;

	@FindBy(xpath = "//input[@name='role']")
	private WebElement supporttext1;

	@FindBy(xpath = "(//label[normalize-space()='Mark as optional'])[2]")
	private WebElement optional;

	@FindBy(xpath = "//p[normalize-space()='Yes/No question']")
	private WebElement yesorno;

	@FindBy(xpath = "//textarea[@name='YesNo']")
	private WebElement MCque2;

	@FindBy(xpath = "(//p[normalize-space()='Date input question'])")
	private WebElement dateinput;

	@FindBy(xpath = "//textarea[@name='Date input question']")
	private WebElement MCque3;

	@FindBy(xpath = "(//div[@class='react-date-picker__wrapper'])[1]")
	private WebElement beforedate;

	@FindBy(xpath = "(//button[@type='button'])[9]")
	private WebElement Bdate;

	@FindBy(xpath = "(//div[@class='react-date-picker__inputGroup'])[2]")
	private WebElement afterdate;

	@FindBy(xpath = "(//button[@type='button'])[56]")
	private WebElement Adate;

	@FindBy(xpath = "//p[normalize-space()='Number input question']")
	private WebElement numbertype;

	@FindBy(xpath = "//textarea[@name='Number input question']")
	private WebElement MCque4;

	@FindBy(xpath = "(//input[@name='role'])[2]")
	private WebElement greater;

	@FindBy(xpath = "(//input[@name='role'])[3]")
	private WebElement lesser;

	@FindBy(xpath = "//label[normalize-space()='Range (eg:1-100)']/parent::div/parent::div/following-sibling::div/input")
	private WebElement range;

	@FindBy(xpath = "//p[normalize-space()='Likert']")
	private WebElement likert;

	@FindBy(xpath = "//textarea[@name='scale']")
	private WebElement MCque5;

	@FindBy(xpath = "//input[@name='lowerRangeDescription']")
	private WebElement scale1to5;

	@FindBy(xpath = "//p[normalize-space()='Dropdown']")
	private WebElement dropdown;

	@FindBy(xpath = "//textarea[@name='notes']")
	private WebElement MCque6;

	@FindBy(xpath = "(//input[@name='Dropdown'])[1]")
	private WebElement drop1;

	@FindBy(xpath = "(//input[@name='Dropdown'])[2]")
	private WebElement drop2;

	@FindBy(xpath = "//p[normalize-space()='Section']")
	private WebElement section;

	@FindBy(xpath = "//textarea[@name='Rating']")
	private WebElement MCque7;

	@FindBy(xpath = "//p[normalize-space()='Opening statement']")
	private WebElement opening;

	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	private WebElement MCque8;

	@FindBy(xpath = "//p[normalize-space()='Closing statement']")
	private WebElement closing;

	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	private WebElement MCque9;

	@FindBy(xpath = "//p[normalize-space()='Conditional segment']")
	private WebElement segment;

	@FindBy(xpath = "//div[@class='react-select__placeholder css-1jqq78o-placeholder']")
	private WebElement selectfield;

	@FindBy(xpath = "//div[text()='GESTATION']")
	private WebElement gestation;

	@FindBy(xpath = "//div[text()='ABOVE']")
	private WebElement abovegest;

	@FindBy(xpath = "//div[text()='BELOW']")
	private WebElement belowgest;

	@FindBy(xpath = "//input[@value='0']")
	private WebElement weeks;

	@FindBy(xpath = "(//input[@value='0'])[2]")
	private WebElement days;

	@FindBy(xpath = "//div[text()='DOB']")
	private WebElement DOB;

	@FindBy(xpath = "//div[text()='ABOVE']")
	private WebElement abovedob;

	@FindBy(xpath = "//div[text()='BELOW']")
	private WebElement belowdob;

	@FindBy(xpath = "(//input[@value='0'])[1]")
	private WebElement years;

	@FindBy(xpath = "//div[text()='BMI']")
	private WebElement BMI;

	@FindBy(xpath = "(//input[@value='0'])[1]")
	private WebElement abovebmi;

	@FindBy(xpath = "(//input[@class='inputnor select-none !outline-none w-8 h-8'])[2]")
	private WebElement belowbmi;

	@FindBy(xpath = "//button[text()='SAVE DRAFT']")
	private WebElement savedraft;

	@FindBy(xpath = "(//button[normalize-space()='BACK TO DASHBOARD'])[1]")
	private WebElement backtodashboard;

	@FindBy(xpath = "(//button[normalize-space()='Continue Editing'])[1]")
	private WebElement conti;

	@FindBy(xpath = "(//a[contains(text(),'EDIT')])[1]")
	private WebElement edit;

	@FindBy(xpath = "(//span[@aria-label='Delete Button'])[1]")
	private WebElement deletebtn;

	@FindBy(xpath = "(//button[normalize-space()='Delete Questionnaire'])[1]")
	private WebElement deleteque;

	@FindBy(xpath = "(//a[normalize-space()='Staff Login'])[1]")
	private WebElement stafflogin;

	@FindBy(xpath = "//input[@id='i0116']")
	private WebElement externalemail;

	@FindBy(xpath = "//input[@id='idSIButton9']")
	private WebElement externalNext;

	@FindBy(xpath = "//input[@id='i0118']")
	private WebElement externalPassword;

	@FindBy(xpath = "//input[@id='idSIButton9']")
	private WebElement exnext;

	@FindBy(xpath = "(//label[normalize-space()='Conditional'])[3]")
	private WebElement datecondi;

	@FindBy(xpath = "(//label[normalize-space()='Conditional'])[4]")
	private WebElement numcondi;

	@FindBy(xpath = "(//div[@class='question-menu-info focusto'])[4]")
	private WebElement selectques1;

	@FindBy(xpath = "//button[@class='backarrow']")
	private WebElement backbtn;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Add conditional questions'])[2]")
	private WebElement addconditional2;

	@FindBy(xpath = "(//label[normalize-space()='Conditional'])[2]")
	private WebElement yesornocondi;

	@FindBy(xpath = "(//span[text()='PREVIEW'])[1]")
	private WebElement preview;

	@FindBy(xpath = "//div[@id='popup_focus']")
	private WebElement closepreview;

	@FindBy(xpath = "(//div[@class='question-menu-info focusto'])[2]")
	private WebElement selectques2;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Add conditional questions'])[3]")
	private WebElement addconditional3;

	@FindBy(xpath = "(//label[text()='Conditional'])[5]")
	private WebElement dropcondi;

	@FindBy(xpath = "//span[text()='Preview questionnaire']")
	private WebElement previewques;

	@FindBy(xpath = "(//div[@id='popup_focus'])")
	private WebElement closeque;

	@FindBy(xpath = "(//button[normalize-space()='SUBMIT FOR APPROVAL'])[1]")
	private WebElement approval;

	@FindBy(xpath = "(//div[@class='react-select__control css-1im77uy-control'])[2]")
	private WebElement adminapprove;

	@FindBy(xpath = "(//div[@class='input-group'])[3]/div/div[2]/div/div[1]")
	private WebElement adminemail;

	@FindBy(xpath = "(//button[@class='btn primary-btn'])[3]")
	private WebElement confirmbtn;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;

	@FindBy(xpath = "//div[@role='button']")
	private WebElement logout2;

	@FindBy(xpath = "//a[normalize-space()='Form approvals']")
	private WebElement formapprovals;

	@FindBy(xpath = "(//li[@role='tab'])[2]")
	private WebElement received;

	@FindBy(xpath = "(//div[@class='react-select__control css-1im77uy-control'])[1]")
	private WebElement datemodify;

	@FindBy(xpath = "//div[@id='react-select-4-option-3']")
	private WebElement lastdate;

	@FindBy(xpath = "(//button[@class='btn approve-btn'])[1]")
	private WebElement approvebtn;

	@FindBy(xpath = "//button[normalize-space()='CHECK FORM STATUS']")
	private WebElement checkstatus;

	@FindBy(xpath = "//div[@id='otherTile']")
	private WebElement addacc;

	public WebElement getqb() {
		return qb;
	}

	public WebElement getcreate() {
		return create;
	}

	public WebElement getdisplayname() {
		return displayname;
	}

	public WebElement getinternalques() {
		return internalques;
	}

	public WebElement getselect() {
		return select;
	}

	public WebElement getconsult() {
		return consult;
	}

	public WebElement getselectservice() {
		return selectservice;
	}

	public WebElement getaddtags() {
		return addtags;
	}

	public WebElement getESTtime() {
		return ESTtime;
	}

	public WebElement getnext() {
		return next;
	}

	public WebElement getmultichoice() {
		return multichoice;
	}

	public WebElement getMCque() {
		return MCque;
	}

	public WebElement getsupporttext() {
		return supporttext;
	}

	public WebElement getoption1() {
		return option1;
	}

	public WebElement getoption2() {
		return option2;
	}

	public WebElement getconditional() {
		return conditional;
	}

	public WebElement getquestype() {
		return questype;
	}

	public WebElement getfreetext() {
		return freetext;
	}

	public WebElement getMCque1() {
		return MCque1;
	}

	public WebElement getsupporttext1() {
		return supporttext1;
	}

	public WebElement getoptional() {
		return optional;
	}

	public WebElement getyesorno() {
		return yesorno;
	}

	public WebElement getMCque2() {
		return MCque2;
	}

	public WebElement getdateinput() {
		return dateinput;
	}

	public WebElement getMCque3() {
		return MCque3;
	}

	public WebElement getbeforedate() {
		return beforedate;
	}

	public WebElement getBdate() {
		return Bdate;
	}

	public WebElement getafterdate() {
		return afterdate;
	}

	public WebElement getAdate() {
		return Adate;
	}

	public WebElement getnumbertype() {
		return numbertype;
	}

	public WebElement getMCque4() {
		return MCque4;
	}

	public WebElement getgreater() {
		return greater;
	}

	public WebElement getlesser() {
		return lesser;
	}

	public WebElement getrange() {
		return range;
	}

	public WebElement getlikert() {
		return likert;
	}

	public WebElement getMCque5() {
		return MCque5;
	}

	public WebElement getscale1to5() {
		return scale1to5;
	}

	public WebElement getdropdown() {
		return dropdown;
	}

	public WebElement getMCque6() {
		return MCque6;
	}

	public WebElement getdrop1() {
		return drop1;
	}

	public WebElement getsection() {
		return section;
	}

	public WebElement getMCque7() {
		return MCque7;
	}

	public WebElement getopening() {
		return opening;
	}

	public WebElement getMCque8() {
		return MCque8;
	}

	public WebElement getclosing() {
		return closing;
	}

	public WebElement getMCque9() {
		return MCque9;
	}

	public WebElement getsegment() {
		return segment;
	}

	public WebElement getselectfield() {
		return selectfield;
	}

	public WebElement getgestation() {
		return gestation;
	}

	public WebElement getabovegest() {
		return abovegest;
	}

	public WebElement getbelowgest() {
		return belowgest;
	}

	public WebElement getweeks() {
		return weeks;
	}

	public WebElement getdays() {
		return days;
	}

	public WebElement getDOB() {
		return DOB;
	}

	public WebElement getabovedob() {
		return abovedob;
	}

	public WebElement getbelowdob() {
		return belowdob;
	}

	public WebElement getyears() {
		return years;
	}

	public WebElement getBMI() {
		return BMI;
	}

	public WebElement getabovebmi() {
		return abovebmi;
	}

	public WebElement getbelowbmi() {
		return belowbmi;
	}

	public WebElement getsavedraft() {
		return savedraft;
	}

	public WebElement getbacktodashboard() {
		return backtodashboard;
	}

	public WebElement getconti() {
		return conti;
	}

	public WebElement getedit() {
		return edit;
	}

	public WebElement getdeletebtn() {
		return deletebtn;
	}

	public WebElement getdeleteque() {
		return deleteque;
	}

	public WebElement getstafflogin() {
		return stafflogin;
	}

	public WebElement getexternalemail() {
		return externalemail;
	}

	public WebElement getexternalNext() {
		return externalNext;
	}

	public WebElement getexternalPassword() {
		return externalPassword;
	}

	public WebElement getdrop2() {
		return drop2;
	}

	public WebElement getexnext() {
		return exnext;
	}

	public WebElement getdatecondi() {
		return datecondi;
	}

	public WebElement getnumcondi() {
		return numcondi;
	}

	public WebElement getserviceselect() {
		return serviceselect;
	}

	public WebElement getaddconditional1() {
		return addconditional1;
	}

	public WebElement getaddconditional2() {
		return addconditional2;
	}

	public WebElement getselectques1() {
		return selectques1;
	}

	public WebElement getbackbtn() {
		return backbtn;
	}

	public WebElement getyesornocondi() {
		return yesornocondi;
	}

	public WebElement getpreview() {
		return preview;
	}

	public WebElement getclosepreview() {
		return closepreview;
	}

	public WebElement getselectques2() {
		return selectques2;

	}

	public WebElement getaddconditional3() {
		return addconditional3;
	}

	public WebElement getdropcondi() {
		return dropcondi;
	}

	public WebElement getpreviewques() {
		return previewques;
	}

	public WebElement getcloseque() {
		return closeque;
	}

	public WebElement getapproval() {
		return approval;
	}

	public WebElement getadminapprove() {
		return adminapprove;
	}

	public WebElement getadminemail() {
		return adminemail;
	}

	public WebElement getconfirmbtn() {
		return confirmbtn;
	}

	public WebElement getlogout() {
		return logout;
	}

	public WebElement getlogout2() {
		return logout2;
	}

	public WebElement getformapprovals() {
		return formapprovals;
	}

	public WebElement getreceived() {
		return received;
	}

	public WebElement getdatemodify() {
		return datemodify;
	}

	public WebElement getlastdate() {
		return lastdate;
	}

	public WebElement getapprovebtn() {
		return approvebtn;
	}

	public WebElement getcheckstatus() {
		return checkstatus;
	}

	public WebElement getAddacc() {
		return addacc;
	}

}
