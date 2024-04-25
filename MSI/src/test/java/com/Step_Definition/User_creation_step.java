package com.Step_Definition;

import java.io.IOException;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class User_creation_step extends Base_Class {

	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	@Given("Launch the external site URL")
	public void launch_the_external_site_url() throws IOException {
//		browserLaunch(FileReaderManager.getInstanceCR().getBrowser_name());
//		wait(10);
//		getDrive(FileReaderManager.getInstanceCR().getURL());
//		wait(10);
	}

	@When("User click on the Book an Appointment option")
	public void user_click_on_the_book_an_appointment_option() {
		ClickOnElement(si.getuser_creation().getBook_appaintment_button());
		sleep(1500);
	}

	@When("User select on TOP after that user answer the pregnancy test and enter the postcode to check eligibility; otherwise,user can skip those steps and navigate to create an account page")
	public void user_select_on_top_after_that_user_answer_the_pregnancy_test_and_enter_the_postcode_to_check_eligibility_otherwise_user_can_skip_those_steps_and_navigate_to_create_an_account_page()
			throws IOException {

//		Service_selection(FileReaderManager.getInstanceCR().getTOP(), FileReaderManager.getInstanceCR().getYes(),
//				FileReaderManager.getInstanceCR().getPostcode1());
		sleep(1500);

		Service_selection(FileReaderManager.getInstanceCR().getVAS(), null, null);

//		Service_selection(FileReaderManager.getInstanceCR().getLARC(), null, null);
	}

	@When("User click on signUp button")
	public void user_click_on_sign_up_button() {
//		ClickOnElement(si.getuser_creation().getSignUp_button());
//		sleep(2000);
	}

	@When("User enter their Firstname, Lastname and Email into the respective fields")
	public void user_enter_their_firstname_lastname_and_email_into_the_respective_fields() {
		enterText(si.getuser_creation().getFirstname(), generateRandomName());
		sleep(1000);
		enterText(si.getuser_creation().getLastname(), generateRandomLastName());
		sleep(1000);
		jsScrollDownElement(si.getuser_creation().getEmail());
		wait(10);
		enterText(si.getuser_creation().getEmail(), generateRandomEmail());
		sleep(1000);

	}

	@When("User click on recaptcha button")
	public void user_click_on_recaptcha_button() {
		jsScrollDownElement(si.getuser_creation().getCaptcha());
		wait(10);
		ClickOnElement(si.getuser_creation().getCaptcha());
		sleep(1000);
	}

	@When("User click on terms and condition option and click accept button and also click on next button")
	public void user_click_on_terms_and_condition_option_and_click_accept_button_and_also_click_on_next_button() {
		jsScrollDownElement(si.getuser_creation().getTerms());
		wait(10);
		ClickOnElement(si.getuser_creation().getTerms());
		sleep(2000);
		ClickOnElement(si.getuser_creation().getAccept_button());
		sleep(1000);
		jsScrollDownElement(si.getuser_creation().getNext_button());
		wait(10);
		if (enabledMethod(si.getuser_creation().getNext_button())) {
			System.out.println("Next button enabled");
			ClickOnElement(si.getuser_creation().getNext_button());
			sleep(1500);
		} else {
			System.out.println("Next button disabled");
		}
	}

	@When("User enter our UK address in the designated field and click on next button")
	public void user_enter_our_uk_address_in_the_designated_field_and_click_on_next_button() throws IOException {

		if (displayedMethod(si.getuser_creation().getAddress_manual_option())) {
			System.out.println("Manual address entry option displayed");
			ClickOnElement(si.getuser_creation().getAddress_manual_option());
			sleep(1000);
		} else {
			System.out.println("Manual address entry option not displayed");
		}
		enterText(si.getuser_creation().getHouse_field(), FileReaderManager.getInstanceCR().getHopuse_name());
		sleep(1000);
		jsScrollDownElement(si.getuser_creation().getStreet_field());
		wait(10);
		enterText(si.getuser_creation().getStreet_field(), FileReaderManager.getInstanceCR().getStreet_name());
		sleep(1000);
		jsScrollDownElement(si.getuser_creation().getCity_field());
		wait(10);
		enterText(si.getuser_creation().getCity_field(), FileReaderManager.getInstanceCR().getCity_name());
		sleep(1000);
		jsScrollDownElement(si.getuser_creation().getPostcode_field());
		wait(10);
		enterText(si.getuser_creation().getPostcode_field(), FileReaderManager.getInstanceCR().getPost_code());
		sleep(1000);
		if (enabledMethod(si.getuser_creation().getNext_button())) {
			System.out.println("Next button enabled");
			ClickOnElement(si.getuser_creation().getNext_button());
			sleep(2000);
		} else {
			System.out.println("Next button disabled");
		}
	}

	@When("User enter our Mobile number and click on next button")
	public void user_enter_our_mobile_number_and_click_on_next_button() throws Throwable {
		enterText(si.getuser_creation().getMobilenumber_field(), generateRandomMobileNumber());
		sleep(1000);
		if (enabledMethod(si.getuser_creation().getNext_button())) {
			System.out.println("Next button enabled");
			ClickOnElement(si.getuser_creation().getNext_button());
			sleep(2000);
		} else {
			System.out.println("Next button disabled");
		}

		Random_value_storedin_Excel("Random_values", 3);
		sleep(2000);
	}

	@When("User can set their password for both password and confirm password fields and also click on confirm button")
	public void user_can_set_their_password_for_both_password_and_confirm_password_fields_and_also_click_on_confirm_button()
			throws IOException {
		enterText(si.getuser_creation().getPassword_field(), FileReaderManager.getInstanceCR().getPassword1());
		sleep(1000);
		enterText(si.getuser_creation().getConfirmPassword_field(), FileReaderManager.getInstanceCR().getPassword1());
		sleep(1000);
		if (enabledMethod(si.getuser_creation().getConfirm_button())) {
			System.out.println("COnfirm button enabled");
			ClickOnElement(si.getuser_creation().getConfirm_button());
			sleep(2000);
		} else {
			System.out.println("getConfirm_button button disabled");
		}
	}

	@When("User selects the safe option under the security options, they will be navigated to the contact preference page here you select the preference option. If the user selects neither or the safe option, they will be navigated to the set a memorable word page here you can set the PIN.")
	public void user_selects_the_safe_option_under_the_security_options_they_will_be_navigated_to_the_contact_preference_page_here_you_select_the_preference_option_if_the_user_selects_neither_or_the_safe_option_they_will_be_navigated_to_the_set_a_memorable_word_page_here_you_can_set_the_pin()
			throws IOException {
		security_selection(FileReaderManager.getInstanceCR().getSecurity_unsafe(),
				FileReaderManager.getInstanceCR().getPassword1(), FileReaderManager.getInstanceCR().getContact_yes(),
				null);

	}

	@When("User click on verify by email button")
	public void user_click_on_verify_by_email_button() {
//		jsScrollDownElement(si.getuser_creation().getVerifybyEmail_button());
//		wait(10);
//		ClickOnElement(si.getuser_creation().getVerifybyEmail_button());
//		sleep(2000);
	}

	@When("User login to the recently created credentials")
	public void user_login_to_the_recently_created_credentials() {

	}

	@Then("User should be log in to the recently created credentials")
	public void user_should_be_log_in_to_the_recently_created_credentials() {

	}

}
