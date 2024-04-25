package com.Page_Object_Model;

import java.util.List;

import org.openqa.selenium.By;
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
	
	public static void Eligibility_flow(String service, String question_name, String button_name,
			String scanquestion_name, String scanbutton_name, String LMPquestion_name, String LMPbutton_name,
			String AppLMPquestion_name, String AppLMPbutton_name, String conceivequestion_name,
			String conceivebutton_name, String riskquestion_name, String riskbutton_name,
			String immediateriskquestion_name, String immediateriskbutton_name) {

		driver.findElement(By.xpath("//h5[contains(text(),'" + service
				+ "')]/ancestor::div[@class='Ecard-info']/following-sibling::div/div[@class='mini-link-set']/span/button/a[normalize-space()='Start now']"))
				.click();
		if (service.equalsIgnoreCase("TOP")) {
			WebElement positive_pregnancy_radio = driver.findElement(By.xpath("//h6[contains(text(),'" + question_name
					+ "')]/parent::div/following-sibling::div/div/label[contains(text(),'" + button_name + "')]/span"));
			if (question_name == "positive" && button_name == "Yes") {
				positive_pregnancy_radio.click();
				WebElement scan_radio = driver.findElement(By.xpath("//h6[contains(text(),'" + scanquestion_name
						+ "')]/parent::div/following-sibling::div/div/label[contains(text(),'" + scanbutton_name
						+ "')]/span"));
				if (scanquestion_name == "scan" && scanbutton_name == "Yes") {
					scan_radio.click();
					// need to update the date fields
					driver.findElement(By.xpath("//button[normalize-space()='NEXT']")).click();
					// need to update the upcoming flows
				} else {
					scan_radio.click();
					WebElement LMP_radio = driver.findElement(By.xpath("//h6[contains(text(),'" + LMPquestion_name
							+ "')]/parent::div/following-sibling::div/div/label[contains(text(),'" + LMPbutton_name
							+ "')]/span"));
					if (LMPquestion_name == "date of the first day" && LMPbutton_name == "Yes") {
						LMP_radio.click();
						// need to update the date fields
						driver.findElement(By.xpath("//button[normalize-space()='NEXT']")).click();

					} else {
						LMP_radio.click();
						WebElement AppLMP_radio = driver
								.findElement(By.xpath("//h6[contains(text(),'" + AppLMPquestion_name
										+ "')]/parent::div/following-sibling::div/div/label[contains(text(),'"
										+ AppLMPbutton_name + "')]/span"));
						if (AppLMPquestion_name == "approximately" && AppLMPbutton_name == "Yes") {
							AppLMP_radio.click();
							// need to update the date fields
							driver.findElement(By.xpath("//button[normalize-space()='NEXT']")).click();

						} else {
							AppLMP_radio.click();
							WebElement conceive_radio = driver
									.findElement(By.xpath("//h6[contains(text(),'" + conceivequestion_name
											+ "')]/parent::div/following-sibling::div/div/label[contains(text(),'"
											+ conceivebutton_name + "')]/span"));
							if (conceivequestion_name == "conceived" && conceivebutton_name == "Yes") {
								conceive_radio.click();
								// need to update the date field
								driver.findElement(By.xpath("//button[normalize-space()='NEXT']")).click();

							} else {
								conceive_radio.click();
								System.out.println("TOP user enter into Unsure gestation flow");
								driver.findElement(By.xpath("//button[normalize-space()='NEXT']")).click();
							}
						}
					}
				}
			} else {
				positive_pregnancy_radio.click();
				System.out.println(driver
						.findElement(By.xpath("//div[@class='top-error'][contains(text(),'positive')]")).getText());

			}
			// need to update the DOB field
			WebElement risk_radio = driver.findElement(By.xpath("//h6[contains(text(),'" + riskquestion_name
					+ "')]/parent::div/following-sibling::div/div/label[contains(text(),'" + riskbutton_name
					+ "')]/span"));

			if (riskquestion_name == "risk" && riskbutton_name == "Yes") {
				risk_radio.click();
				List<WebElement> risk_options = driver.findElements(By.xpath(
						"//h6[contains(text(),'What harm are you at risk of')]/parent::div/following-sibling::div/div/label"));
				for (WebElement single_risk : risk_options) {
					single_risk.click();
					if (single_risk.getText() == "Other") {
						driver.findElement(By.xpath(
								"//h6[contains(text(),'What harm are you at risk of')]/parent::div/following-sibling::div/div[@class='pt-4']/div/div/input"))
								.sendKeys(null);
					}
				}
				driver.findElement(By.xpath(
						"//h6[normalize-space()='Please explain more about who/what is putting you at risk']/parent::div/following-sibling::div/label/div/div/textarea"))
						.sendKeys(null);
				WebElement immediaterisk_radio = driver
						.findElement(By.xpath("//h6[contains(text(),'" + immediateriskquestion_name
								+ "')]/parent::div/following-sibling::div/div/label[contains(text(),'"
								+ immediateriskbutton_name + "')]/span"));
				if (immediateriskquestion_name == "immediate risk" && immediateriskbutton_name == "Yes") {
					immediaterisk_radio.click();
					List<WebElement> immediaterisk_options = driver.findElements(By.xpath(
							"//h6[contains(text(),'What harm are you at immediate risk of')]/parent::div/following-sibling::div/div/label"));
//					for (int i = 0; i < immediaterisk_options.size(); i++) {
//						if (i == num || i == num1) {
//							WebElement single_risk = immediaterisk_options.get(i);
//							single_risk.click();
//							if (i==9) {
//								driver.findElement(By.xpath(
//										"//h6[contains(text(),'What harm are you at risk of')]/parent::div/following-sibling::div/div[@class='pt-4']/div/div/input"))
//										.sendKeys(null);
//							}
//						}
//					}
					for (WebElement single_immediaterisk : immediaterisk_options) {
						single_immediaterisk.click();
						if (single_immediaterisk.getText() == "Other") {
							driver.findElement(By.xpath(
									"//h6[contains(text(),'What harm are you at immediate risk of')]/parent::div/following-sibling::div/div[@class='pt-4']/div/div/input"))
									.sendKeys(null);
						}
					}
					driver.findElement(By.xpath(
							"//h6[normalize-space()='Please explain more about who/what is putting you at immediate risk']/parent::div/following-sibling::div/label/div/div/textarea"))
							.sendKeys(null);
				} else {
					risk_radio.click();
					driver.findElement(By.xpath("//button[normalize-space()='NEXT']")).click();
				}

			} else if (service.equalsIgnoreCase("VAS")) {

			} else {

			}
		}
	}
}
