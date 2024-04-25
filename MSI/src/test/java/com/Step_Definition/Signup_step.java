package com.Step_Definition;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Signup_step extends Base_Class {

	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	@Given("Launch the external site {string} for the signup purpose")
	public void launch_the_external_site_for_the_signup_purpose(String string) throws Throwable {

		browserLaunch("chrome");
		getDrive(FileReaderManager.getInstanceCR().getURL());
		sleep(1500);
	}

	@When("User click the Book an appointment")
	public void user_click_the_book_an_appointment() throws Throwable {
		ClickOnElement(si.getsignPage().getBook());
		sleep(2000);
	}

	@When("User click the Termination of pregnancy")
	public void user_click_the_termination_of_pregnancy() throws Throwable {
		Service_selection(si.getsignPage().getServic(), "TERMINATION OF PREGNANCY", "no",
				si.getsignPage().getPostcode(), FileReaderManager.getInstanceCR().getPostcod(),
				si.getsignPage().getEligibility_button());

//		ClickOnElement(si.getsignPage().getTOP());
//		sleep(2000);

	}

	@When("User click the yes or no for postive pregenancy test and enter the postcode and select check eligibility")
	public void user_click_the_yes_or_no_for_postive_pregenancy_test_and_enter_the_postcode_and_select_check_eligibility()
			throws Throwable {
		sleep(3000);
		ClickOnElement(si.getsignPage().getYesbtn());
		enterText(si.getsignPage().getPostcode(), FileReaderManager.getInstanceCR().getPostcode());
		sleep(2000);
		ClickOnElement(si.getsignPage().getCheckeligibile());

	}

	@When("User click signup button")
	public void user_click_signup_button() throws Throwable {
		ClickOnElement(si.getsignPage().getSignup());
		sleep(2000);

	}

	@When("User Enter first and last name and email address")
	public void user_enter_first_and_last_name_and_email_address() throws Throwable {
		enterText(si.getsignPage().getFirstname(), FileReaderManager.getInstanceCR().getFirstname());
		sleep(1000);
		enterText(si.getsignPage().getLastname(), FileReaderManager.getInstanceCR().getLastname());
		sleep(1000);
		enterText(si.getsignPage().getEmail(), FileReaderManager.getInstanceCR().getemail1());
		sleep(10000);
	}

	@When("User click the captcha and term and condition and click next")
	public void user_click_the_captcha_and_term_and_condition_and_click_next() throws Throwable {
		ClickOnElement(si.getsignPage().getCaptcha());
		sleep(2500);
		ClickOnElement(si.getsignPage().getTerms());
		sleep(1000);
		ClickOnElement(si.getsignPage().getAccept());

		sleep(2000);
		ClickOnElement(si.getsignPage().getNext());
	}

	@When("User enter the address details manually and click next")
	public void user_enter_the_address_details_manually_and_click_next() throws Throwable {
		ClickOnElement(si.getsignPage().getAddmanually());

		enterText(si.getsignPage().getHouseno(), FileReaderManager.getInstanceCR().getHouseno());
		enterText(si.getsignPage().getStreet(), FileReaderManager.getInstanceCR().getStreet());
		enterText(si.getsignPage().getCity(), FileReaderManager.getInstanceCR().getCity());
		enterText(si.getsignPage().getPincode(), FileReaderManager.getInstanceCR().getPincode());
		ClickOnElement(si.getsignPage().getNext());
		sleep(1000);
	}

	@When("User enter mobile number and click next")
	public void user_enter_mobile_number_and_click_next() throws Throwable {

		enterText(si.getsignPage().getMobileno(), FileReaderManager.getInstanceCR().getMobileno());
		ClickOnElement(si.getsignPage().getNext());
		sleep(2000);

	}

	@When("User enter password and confirm password and click confirm button")
	public void user_enter_password_and_confirm_password_and_click_confirm_button() throws Throwable {

		enterText(si.getsignPage().getPassword(), FileReaderManager.getInstanceCR().getPwd());
		sleep(1000);

		enterText(si.getsignPage().getConfirmpassword(), FileReaderManager.getInstanceCR().getConfirmpwd());

		ClickOnElement(si.getsignPage().getConfirmbtn());
		sleep(2000);

	}

	@When("User click the security preference as yes they are safe radio button and click next")
	public void user_click_the_security_preference_as_yes_they_are_safe_radio_button_and_click_next() throws Throwable {
		// ClickOnElement(si.getsignPage().getSafe());
		ClickOnElement(si.getsignPage().getNeithersafe());
		sleep(2000);
		ClickOnElement(si.getsignPage().getNext1());
		sleep(2000);
	}

	@When("User click the contact preference as do not contact me radio button and click next")
	public void user_click_the_contact_preference_as_do_not_contact_me_radio_button_and_click_next() throws Throwable {

		// ClickOnElement(si.getsignPage().getPreferences());
		// ClickOnElement(si.getsignPage().getNext());
		String enterpin = FileReaderManager.getInstanceCR().getEnterpin();
		enterText(si.getsignPage().getEnterpin(), enterpin);
		sleep(2000);

		String confirmpin = FileReaderManager.getInstanceCR().getConfirmpin();
		enterText(si.getsignPage().getConfirmpin(), confirmpin);
		sleep(2000);

		ClickOnElement(si.getsignPage().getNext1());
		sleep(2000);

	}

	@When("User click the verified email or text message button")
	public void user_click_the_verified_email_or_text_message_button() throws Throwable {

		ClickOnElement(si.gettop_page().getYes());
		sleep(3000);

		ClickOnElement(si.getsignPage().getVerifyemail());
		sleep(2000);

	}

}
