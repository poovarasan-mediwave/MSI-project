package com.Page_Object_Model;

import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

import io.github.bonigarcia.wdm.WebDriverManager;

public class date extends Base_Class {
	public date() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='top-error'][contains(text(),'positive')]")
	private static WebElement positive_pregnancy_error;

	@FindBy(xpath = "//h5[contains(text(),'TOP ELIGIBLITY')]/ancestor::div[@class='Ecard-info']/following-sibling::div/div[@class='mini-link-set']/span/button/a")
	private static WebElement eligibility_starting;

	@FindBy(xpath = "//div[@class='group-input ']/div/input")
	private static List<WebElement> scan_gestation_days_field;

	@FindBy(xpath = "//h6[contains(text(),'What harm are you at risk of')]/parent::div/following-sibling::div/div/label")
	private List<WebElement> risk_options;

	@FindBy(xpath = "//h6[contains(text(),'What harm are you at risk of')]/parent::div/following-sibling::div/div[@class='pt-4']/div/div/input")
	private WebElement risk_other_field;

	@FindBy(xpath = "//h6[normalize-space()='Please explain more about who/what is putting you at risk']/parent::div/following-sibling::div/label/div/div/textarea")
	private WebElement explain_risk_field;

	@FindBy(xpath = "//h6[contains(text(),'What harm are you at immediate risk of')]/parent::div/following-sibling::div/div/label")
	private List<WebElement> immediate_risk_field;

	@FindBy(xpath = "//h6[contains(text(),'What harm are you at immediate risk of')]/parent::div/following-sibling::div/div[@class='pt-4']/div/div/input")
	private WebElement immediate_risk_other_field;

	@FindBy(xpath = "//h6[normalize-space()='Please explain more about who/what is putting you at immediate risk']/parent::div/following-sibling::div/label/div/div/textarea")
	private WebElement explain_immediaterisk_field;

	@FindBy(xpath = "//h6[contains(text(),'safest')]/parent::div/following-sibling::div/div/label")
	private List<WebElement> wellbeing_options;

	@FindBy(xpath = "//button[normalize-space()='NEXT']")
	private static WebElement next_button;

	@FindBy(xpath = "//h6[contains(text(),'Enter your GP’s details')]/parent::div/div/div/div/div")
	private WebElement gP_search;

	@FindBy(xpath = "//h6[contains(text(),'Enter your GP’s details')]/parent::div/div/div/div/div/following-sibling::div/div/div[1]")
	private WebElement gP_address_selection;

	@FindBy(xpath = "//h6[contains(text(),'Enter your UK address')]/parent::div/div/div/div/div")
	private WebElement search_field;

	@FindBy(xpath = "//h6[contains(text(),'Enter your UK address')]/parent::div/div/div/div/div/following-sibling::div/div/div[1]")
	private WebElement postcode_address_selection;

	@FindBy(xpath = "//a[contains(text(),'Enter your address manually')]/parent::div/following-sibling::div/div/div/input")
	private List<WebElement> address_fields;

	@FindBy(xpath = "//a[contains(text(),'Enter your address manually')]")
	private WebElement manual_address_field;

	@FindBy(xpath = "//div[@class='overall-radio']/div/div/div/input")
	private List<WebElement> ubrnNumber_passcode_fields;

	@FindBy(xpath = "//input[@placeholder='Enter your code']")
	private WebElement bluebell_code_field;

	@FindBy(xpath = "//div[@class='bold-text']")
	private WebElement bluebell_error_message;

	@FindBy(xpath = "//div[@class='bold-text break-all']")
	private WebElement bluebell_9above_errormessage;

	@FindBy(xpath = "//input[@placeholder='Enter code']")
	private WebElement hopehouse_code_field;

	@FindBy(xpath = "//button[normalize-space()='BACK TO DASHBOARD']")
	private WebElement backtodashboard_button;

	@FindBy(xpath = "//textarea[@placeholder='Start typing here']")
	private WebElement local_provider_text_field;

	@FindBy(xpath = "//button[normalize-space()='Submit']")
	private WebElement submit_button;

	@FindBy(xpath = "//button[normalize-space()='CHOOSE A CALL BACK SLOT']")
	private WebElement choose_call_back_button;

	public static WebElement getPositive_pregnancy_error() {
		return positive_pregnancy_error;
	}

	public static WebElement getEligibility_starting() {
		return eligibility_starting;
	}

	public static List<WebElement> getScan_gestation_days_field() {
		return scan_gestation_days_field;
	}

	public List<WebElement> getRisk_options() {
		return risk_options;
	}

	public WebElement getRisk_other_field() {
		return risk_other_field;
	}

	public WebElement getExplain_risk_field() {
		return explain_risk_field;
	}

	public List<WebElement> getImmediate_risk_field() {
		return immediate_risk_field;
	}

	public WebElement getImmediate_risk_other_field() {
		return immediate_risk_other_field;
	}

	public WebElement getExplain_immediaterisk_field() {
		return explain_immediaterisk_field;
	}

	public List<WebElement> getWellbeing_options() {
		return wellbeing_options;
	}

	public static WebElement getNext_button() {
		return next_button;
	}

	public WebElement getgP_search() {
		return gP_search;
	}

	public WebElement getgP_address_selection() {
		return gP_address_selection;
	}

	public WebElement getSearch_field() {
		return search_field;
	}

	public WebElement getPostcode_address_selection() {
		return postcode_address_selection;
	}

	public List<WebElement> getAddress_fields() {
		return address_fields;
	}

	public WebElement getManual_address_field() {
		return manual_address_field;
	}

	public List<WebElement> getUbrnNumber_passcode_fields() {
		return ubrnNumber_passcode_fields;
	}

	public WebElement getBluebell_code_field() {
		return bluebell_code_field;
	}

	public WebElement getBluebell_error_message() {
		return bluebell_error_message;
	}

	public WebElement getBluebell_9above_errormessage() {
		return bluebell_9above_errormessage;
	}

	public WebElement getHopehouse_code_field() {
		return hopehouse_code_field;
	}

	public WebElement getBacktodashboard_button() {
		return backtodashboard_button;
	}

	public WebElement getLocal_provider_text_field() {
		return local_provider_text_field;
	}

	public WebElement getSubmit_button() {
		return submit_button;
	}

	public WebElement getChoose_call_back_button() {
		return choose_call_back_button;
	}

//	public List<WebElement> getAllcall_back_content() {
//		return allcall_back_content;
//	}
//
//	public WebElement getRequest_call_back_button() {
//		return request_call_back_button;
//	}

	public static void TOP_gestation_page(String button_name, String scanquestion_name, String scanbutton_name,
			String LMPquestion_name, String LMPbutton_name, String AppLMPquestion_name, String AppLMPbutton_name,
			String conceivequestion_name, String conceivebutton_name, String month, String year, String date,
			String scan_gestation_week_days) {
//		sleep(5000);
//		ClickOnElement(getEligibility_starting());
//		sleep(10000);
		WebElement positive_pregnancy_radio = driver.findElement(By.xpath(
				"//h6[contains(text(),'positive')]/parent::div/following-sibling::div/div/label[contains(text(),'"
						+ button_name + "')]/span"));
		if (button_name == "Yes") {
			positive_pregnancy_radio.click();
			WebElement scan_radio = driver.findElement(By.xpath("//h6[contains(text(),'" + scanquestion_name
					+ "')]/parent::div/following-sibling::div/div/label[contains(text(),'" + scanbutton_name
					+ "')]/span"));
			if (scanquestion_name == "scan" && scanbutton_name == "Yes") {
				jsScrollDownElement(scan_radio);
				ClickOnElement(scan_radio);
				// need to update the date fields
				datepicker(month, year, date);
				Inputvalueof_ListOptions(getScan_gestation_days_field(), scan_gestation_week_days);
//				need to update the gestation
				next_button(getNext_button());
				// need to update the upcoming flows
			} else {
				ClickOnElement(scan_radio);
				WebElement LMP_radio = driver.findElement(By.xpath("//h6[contains(text(),'" + LMPquestion_name
						+ "')]/parent::div/following-sibling::div/div/label[contains(text(),'" + LMPbutton_name
						+ "')]/span"));
				if (LMPquestion_name == "date of the first day" && LMPbutton_name == "Yes") {
					jsScrollDownElement(LMP_radio);
					ClickOnElement(LMP_radio);
					sleep(5000);
					// need to update the date fields
					datepicker(month, year, date);
					next_button(getNext_button());

				} else {
					ClickOnElement(LMP_radio);
					WebElement AppLMP_radio = driver.findElement(By.xpath("//h6[contains(text(),'" + AppLMPquestion_name
							+ "')]/parent::div/following-sibling::div/div/label[contains(text(),'" + AppLMPbutton_name
							+ "')]/span"));
					if (AppLMPquestion_name == "approximately" && AppLMPbutton_name == "Yes") {
						jsScrollDownElement(AppLMP_radio);
						ClickOnElement(AppLMP_radio);
						// need to update the date fields
						datepicker(month, year, date);
						next_button(getNext_button());

					} else {
						ClickOnElement(AppLMP_radio);
						WebElement conceive_radio = driver
								.findElement(By.xpath("//h6[contains(text(),'" + conceivequestion_name
										+ "')]/parent::div/following-sibling::div/div/label[contains(text(),'"
										+ conceivebutton_name + "')]/span"));
						if (conceivequestion_name == "conceived" && conceivebutton_name == "Yes") {
							jsScrollDownElement(conceive_radio);
							ClickOnElement(conceive_radio);
							// need to update the date field
							datepicker(month, year, date);
							next_button(getNext_button());

						} else {
							ClickOnElement(conceive_radio);
							System.out.println("TOP user enter into Unsure gestation flow");
							next_button(getNext_button());
						}
					}
				}
			}
		} else {
			positive_pregnancy_radio.click();
			System.out.println(getText(getPositive_pregnancy_error()));
		}
	}

	public static void datepicker(String month, String year, String date) {
		int dayOfMonth = LocalDate.now().getDayOfMonth();
		int year2 = LocalDate.now().getYear();
		
		WebElement findElement = driver.findElement(By.xpath("//input[@placeholder='DD-MM-YYYY']"));
		jsScrollDownElement(findElement);
		findElement.click();
		String text = driver.findElement(By.xpath("(//div[@class='calendar-dropdown-container']/button/span)[1]"))
				.getText();
		String text1 = driver.findElement(By.xpath("(//div[@class='calendar-dropdown-container']/button/span)[2]"))
				.getText();
		if (Integer.parseInt(date) < dayOfMonth || Integer.parseInt(year) < year2) {
			while (!(text.equals(month) && text1.equals(year))) {

				driver.findElement(By.xpath("(//div[@class='calendar-dropdown-container']/button/span)[1]")).click();
				driver.findElement(By.xpath(
						"//ul[@class='calendar-month-list monthDropdown-open']/li[contains(text(),'" + month + "')]"))
						.click();
				driver.findElement(By.xpath("(//div[@class='calendar-dropdown-container']/button/span)[2]")).click();
				driver.findElement(By.xpath(
						"//ul[@class='calendar-year-list yearDropdown-open']/li[contains(text(),'" + year + "')]"))
						.click();
				break;
//				driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
//				text = driver.findElement(By.xpath("(//div[@class='calendar-dropdown-container']/button/span)[1]"))
//						.getText();
//				text1 = driver.findElement(By.xpath("(//div[@class='calendar-dropdown-container']/button/span)[2]"))
//						.getText();
//			}
			}
		} else {
			while (!(text.equals(month) && text1.equals(year))) {
				driver.findElement(By.xpath("//button[@aria-label='Next month']")).click();

				text = driver.findElement(By.xpath("(//div[@class='calendar-dropdown-container']/button/span)[1]"))
						.getText();
				text1 = driver.findElement(By.xpath("(//div[@class='calendar-dropdown-container']/button/span)[2]"))
						.getText();

			}
		}
		try {
			driver.findElement(By.xpath("//button[@aria-disabled='false'][normalize-space()='" + date + "']")).click();

		} catch (Exception e) {
			System.out.println("wrong date : " + date + ":" + month + ":" + year);
		}

	}

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://devmsi.mindwave.site/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("poovarasan+devvas12@mindwaveventures.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@123");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//input[@id='pin']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("Test@123");
		Thread.sleep(2500);
//		driver.switchTo().frame("//iframe[@title='reCAPTCHA']");
//		sleep(2000);
//		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
//		sleep(2000);
//		driver.switchTo().defaultContent();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView(true)",
				driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();
		Thread.sleep(25000);

		driver.findElement(By.xpath(
				"//h5[contains(text(),'ELIGIBLITY')]/ancestor::div[@class='Ecard-info']/following-sibling::div/div[@class='mini-link-set']/span/button/a"))
				.click();
		Thread.sleep(10000);
		TOP_gestation_page("Yes", "scan", "No", "date of the first day", "No", "approximately", "N", "conceived", "Yes", "May", "1990",
				"21", null);
//		
//		driver.findElement(By.xpath("//input[@placeholder='DD-MM-YYYY']")).click();
//		Thread.sleep(5000);
//		datepicker("February", "1970", "28");
//		Thread.sleep(2000);
	}

}
