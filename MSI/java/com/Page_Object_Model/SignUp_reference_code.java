package com.Page_Object_Model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class SignUp_reference_code extends Base_Class {

	public SignUp_reference_code() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='postcode']")
	private WebElement postcode_text_field;

	@FindBy(xpath = "//button[@type='submit'][normalize-space()='CHECK ELIGIBILITY']")
	private WebElement check_eligibility_button;

	@FindBy(xpath = "//div[@class='top-error']/label")
	private WebElement signup_eligibility_error;

	@FindBy(xpath = "//h6[normalize-space()='Set a memorable word']/parent::div/div/div/input")
	private List<WebElement> memorable_word_fields;

	@FindBy(xpath = "//button[normalize-space()='NEXT']")
	private WebElement next_button;

	public WebElement getNext_button() {
		return next_button;
	}

	public WebElement getPostcode_text_field() {
		return postcode_text_field;
	}

	public WebElement getCheck_eligibility_button() {
		return check_eligibility_button;
	}

	public WebElement getSignup_eligibility_error() {
		return signup_eligibility_error;
	}

	public List<WebElement> getMemorable_word_fields() {
		return memorable_word_fields;
	}

	public WebElement getNeither_or_safe_error() {
		return neither_or_safe_error;
	}

	@FindBy(xpath = "//p[contains(text(),'If you are unable to safely receive a verification email or text message now, try later when it is safe to do so, or contact us on +44 345 300 8090')]")
	private WebElement neither_or_safe_error;

	public void Service_selection(String service_name, String positive_button_name, String postcodes) {
		WebElement unique_service_name = driver.findElement(By.xpath(
				"//h1[normalize-space()='Select a service']/parent::div/following-sibling::div/a/button[contains(text(),'"
						+ service_name + "')]"));

		if (service_name == "TERMINATION OF PREGNANCY") {
			System.out.println("TOP signup flow executed");
			ClickOnElement(unique_service_name);
			sleep(2000);
			WebElement positive_pregnancy_option = driver.findElement(By.xpath(
					"//div[@class='grid-blk']/div/label[normalize-space()='" + positive_button_name + "']/span"));
			if (positive_button_name == "Yes") {
				ClickOnElement(positive_pregnancy_option);
				sleep(1000);
				enterText(getPostcode_text_field(), postcodes);
				System.out.println("Successfully enter the Postcode");
				sleep(1500);
				next_button(getNext_button());
				sleep(2000);
			} else {
				ClickOnElement(positive_pregnancy_option);
				sleep(2000);
				System.out.println(getText(getSignup_eligibility_error()));
			}

		} else {
			System.out.println("VAS or LARC flow executed");
			ClickOnElement(unique_service_name);
			sleep(1500);
		}
	}

	public void security_selection(String security_option, String memorable_word, String contact_preference_button,
			String consent_option) {
		try {
			WebElement single_security_option = driver.findElement(By.xpath(
					"//div[@class='pin-secure']/div/div/label[normalize-space()='" + security_option + "']/span"));
			if (security_option == "Neither are safe") {
				System.out.println("User inside the Neither are safe flow");
				ClickOnElement(single_security_option);
				wait(10);
				next_button(getNext_button());
				sleep(1500);
				Inputvalueof_ListOptions(getMemorable_word_fields(), memorable_word);
				next_button(getNext_button());
				jsScrollDownElement(getNext_button());
				ClickOnElement(getNext_button());
				sleep(1500);
				WebElement yesno_option = driver
						.findElement(By.xpath("//div[@class='grid-blk']//div/label[contains(text(),'"
								+ contact_preference_button + "')]/span"));
				if (contact_preference_button == "Yes") {
					jsScrollDownElement(yesno_option);
					wait(10);
					ClickOnElement(yesno_option);
					System.out.println("User successfully click on Yes option");
				} else {
					jsScrollDownElement(yesno_option);
					ClickOnElement(yesno_option);
					System.out.println(getText(getNeither_or_safe_error()));
					System.out.println("Flow end");
				}
			} else {
				System.out.println("User inside the safe flow");
				ClickOnElement(single_security_option);
				wait(10);
				ClickOnElement(getNext_button());
				sleep(1500);
				WebElement unique_consent = driver
						.findElement(By.xpath("//div[@class='seperate-blk']/div/label[contains(text(),'"
								+ consent_option + "')]/span[@class='checkmark']"));
				jsScrollDownElement(unique_consent);
				ClickOnElement(unique_consent);
				jsScrollDownElement(getNext_button());
				next_button(getNext_button());
				sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
