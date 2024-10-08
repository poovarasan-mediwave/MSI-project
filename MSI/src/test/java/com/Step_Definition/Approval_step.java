package com.Step_Definition;

import java.io.IOException;
import java.util.ResourceBundle;
import java.util.Set;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Approval_step extends Base_Class {

	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	
	
	@Given("Launch the external site {string} for approval flow")
	public void launch_the_external_site_for_approval_flow(String string) throws Throwable {
		
		browserLaunch("chrome");
		wait(20);
		getDrive(FileReaderManager.getInstanceCR().geturl());
		sleep(1500);
		GP_registration
		Eligibility_flow(FileReaderManager.getInstanceCR().Dropdown_Question3(), string, string, string, string, string, string, string, string, string, string, string, string, string, string);
	}

	@When("User click the Staff login button for approval flow")
	public void user_click_the_staff_login_button_for_approval_flow() throws Throwable {
		ClickOnElement(si.getQuesPage().getstafflogin());
		sleep(1500);
	
	}

	@When("User can enter the superadmin email {string} and click the next button")
	public void user_can_enter_the_superadmin_email_and_click_the_next_button(String string) throws Throwable {
		enterText(si.getExternal_Login().getExternalemail(),
				FileReaderManager.getInstanceCR().getemail());
		sleep(2000);
		ClickOnElement(si.getExternal_Login().getExternalNext());
		sleep(2000);

	}

	@When("User can enter the superadmin password {string} and click the signup button")
	public void user_can_enter_the_superadmin_password_and_click_the_signup_button(String string) throws Throwable {
		enterText(si.getQuesPage().getexternalPassword(),
				FileReaderManager.getInstanceCR().getpassword());
		ClickOnElement(si.getQuesPage().getexnext());
		sleep(2000);
		ClickOnElement(si.getQuesPage().getexternalNext());
		sleep(8000);
	}

	@When("User can click the forms and questionnaire option  and also click the create a new form button")
	public void user_can_click_the_forms_and_questionnaire_option_and_also_click_the_create_a_new_form_button()
			throws Throwable {
		ClickOnElement(si.getQuesPage().getqb());
		sleep(23000);
		ClickOnElement(si.getQuesPage().getcreate());
		sleep(10000);
	}

	@When("USer can enter Questionnaire display name and internal questionnaire name field")
	public void u_ser_can_enter_questionnaire_display_name_and_internal_questionnaire_name_field() throws Throwable {
		String displayname = FileReaderManager.getInstanceCR().getdisplayname();
		enterText(si.getQuesPage().getdisplayname(), displayname);

		wait(10);
		String internalques = FileReaderManager.getInstanceCR().getinternalques();
		enterText(si.getQuesPage().getinternalques(), internalques);
		sleep(9000);
	}

	@When("User can select the questionnaire type and services for approval flow")
	public void user_can_select_the_questionnaire_type_and_services_for_approval_flow() throws Throwable {
		ClickOnElement(si.getQb().getQuestionnaire_Type());
		sleep(2000);
		clickon_ListElement_indexbased(si.getQb().getSelect_QuestionnaireType(), 3);
//		0 - Demographic
//		1 - Medical history
//		2 - Eligibility
//		3 - Consultation
//		4 - Counselling 
		wait(20);

		ClickOnElement(si.getQb().getServices());
		sleep(1500);
		clickon_ListElement_indexbased(si.getQb().getSelect_Service(), 0);
//		0 - TOP
//		1 - VAS
//		2 - LARC
		sleep(1500);
	}

	@When("User enter the estimated completion time field and click the next button")
	public void user_enter_the_estimated_completion_time_field_and_click_the_next_button() throws Throwable {
		enterText(si.getQuesPage().getESTtime(), FileReaderManager.getInstanceCR().getESTtime());
		wait(10);
		ClickOnElement(si.getQuesPage().getnext());
		sleep(5000);
	}

	@When("User can add the freetext question and enter the question name and click the mark as optional")
	public void user_can_add_the_freetext_question_and_enter_the_question_name_and_click_the_mark_as_optional()
			throws Throwable {
		ClickOnElement(si.getQuesPage().getquestype());
		wait(10);
		ClickOnElement(si.getQuesPage().getfreetext());
		ClickOnElement(si.getQuesPage().getoptional());
		wait(10);
		enterText(si.getQuesPage().getMCque1(), FileReaderManager.getInstanceCR().getfreetext());
		wait(10);
	}

	@When("User can add the multiple choice question and enter the question name and options and add conditional question")
	public void user_can_add_the_multiple_choice_question_and_enter_the_question_name_and_options_and_add_conditional_question()
			throws Throwable {
		sleep(8000);
		ClickOnElement(si.getQuesPage().getmultichoice());
		wait(10);
		ClickOnElement(si.getQuesPage().getconditional());

		String multichoice = FileReaderManager.getInstanceCR().getmultichoice();
		enterText(si.getQuesPage().getMCque(), multichoice);
		wait(10);
		String supporttext = FileReaderManager.getInstanceCR().getsupporttext();
		enterText(si.getQuesPage().getsupporttext(), supporttext);
		wait(10);
		String option1 = FileReaderManager.getInstanceCR().getoption1();
		enterText(si.getQuesPage().getoption1(), option1);
		wait(10);
		String option2 = FileReaderManager.getInstanceCR().getoption2();
		enterText(si.getQuesPage().getoption2(), option2);
		sleep(2000);

		ClickOnElement(si.getQuesPage().getaddconditional1());
		sleep(2000);
		ClickOnElement(si.getQuesPage().getquestype());
		ClickOnElement(si.getQuesPage().getfreetext());
		sleep(2000);
		String freetext = FileReaderManager.getInstanceCR().getfreetext();
		enterText(si.getQuesPage().getMCque1(), freetext);
		sleep(2000);
		ClickOnElement(si.getQuesPage().getbackbtn());

		ClickOnElement(si.getQuesPage().getaddconditional2());
		ClickOnElement(si.getQuesPage().getquestype());
		wait(10);
		ClickOnElement(si.getQuesPage().getnumbertype());
		String numberinput = FileReaderManager.getInstanceCR().getnumberinput();
		enterText(si.getQuesPage().getMCque4(), numberinput);

		ClickOnElement(si.getQuesPage().getbackbtn());
		sleep(2000);

	}

	@When("User can add the Yes\\/No question and enter the question name and click conditional and add conditional question")
	public void user_can_add_the_yes_no_question_and_enter_the_question_name_and_click_conditional_and_add_conditional_question()
			throws Throwable {

		sleep(2000);

		ClickOnElement(si.getQuesPage().getquestype());
		ClickOnElement(si.getQuesPage().getyesorno());
		sleep(2000);
		ClickOnElement(si.getQuesPage().getyesornocondi());
		String yesorno = FileReaderManager.getInstanceCR().getyesorno();
		enterText(si.getQuesPage().getMCque2(), yesorno);

		ClickOnElement(si.getQuesPage().getaddconditional1());
		ClickOnElement(si.getQuesPage().getquestype());
		ClickOnElement(si.getQuesPage().getsection());
		String section = FileReaderManager.getInstanceCR().getsection();
		enterText(si.getQuesPage().getMCque7(), section);
		ClickOnElement(si.getQuesPage().getbackbtn());
		sleep(2000);
		ClickOnElement(si.getQuesPage().getaddconditional2());
		ClickOnElement(si.getQuesPage().getquestype());
		ClickOnElement(si.getQuesPage().getdateinput());
		String dateinput = FileReaderManager.getInstanceCR().getdateinput();
		enterText(si.getQuesPage().getMCque3(), dateinput);
		ClickOnElement(si.getQuesPage().getbackbtn());
		sleep(2000);

	}

	@When("User can add the date input question and enter the question name and click conditional and add conditional question")
	public void user_can_add_the_date_input_question_and_enter_the_question_name_and_click_conditional_and_add_conditional_question()
			throws Throwable {
		ClickOnElement(si.getQuesPage().getquestype());
		ClickOnElement(si.getQuesPage().getdateinput());
		ClickOnElement(si.getQuesPage().getdatecondi());
		sleep(2000);
		String dateinput = FileReaderManager.getInstanceCR().getdateinput();
		enterText(si.getQuesPage().getMCque3(), dateinput);
		ClickOnElement(si.getQuesPage().getbeforedate());
		sleep(2000);
		ClickOnElement(si.getQuesPage().getBdate());
		ClickOnElement(si.getQuesPage().getafterdate());
		ClickOnElement(si.getQuesPage().getAdate());
		sleep(2000);
		ClickOnElement(si.getQuesPage().getaddconditional1());
		ClickOnElement(si.getQuesPage().getquestype());
		ClickOnElement(si.getQuesPage().getdropdown());
		String dropdown = FileReaderManager.getInstanceCR().getdropdown();
		enterText(si.getQuesPage().getMCque6(), dropdown);
		sleep(2000);
		String drop1 = FileReaderManager.getInstanceCR().getdrop1();
		enterText(si.getQuesPage().getdrop1(), drop1);
		String drop2 = FileReaderManager.getInstanceCR().getdrop2();
		enterText(si.getQuesPage().getdrop2(), drop2);
		ClickOnElement(si.getQuesPage().getbackbtn());
		sleep(2000);
		ClickOnElement(si.getQuesPage().getaddconditional2());
		ClickOnElement(si.getQuesPage().getquestype());
		ClickOnElement(si.getQuesPage().getfreetext());
		String freetext = FileReaderManager.getInstanceCR().getfreetext();
		enterText(si.getQuesPage().getMCque1(), freetext);
		ClickOnElement(si.getQuesPage().getbackbtn());
		sleep(2000);

	}

	@When("User add the Number input question and enter the question name and click conditional and add conditional question")
	public void user_add_the_number_input_question_and_enter_the_question_name_and_click_conditional_and_add_conditional_question()
			throws Throwable {
		ClickOnElement(si.getQuesPage().getquestype());
		ClickOnElement(si.getQuesPage().getnumbertype());
		ClickOnElement(si.getQuesPage().getnumcondi());
		String numberinput = FileReaderManager.getInstanceCR().getnumberinput();
		enterText(si.getQuesPage().getMCque4(), numberinput);
		String greater = FileReaderManager.getInstanceCR().getgreater();
		enterText(si.getQuesPage().getgreater(), greater);
		String lesser = FileReaderManager.getInstanceCR().getlesser();
		enterText(si.getQuesPage().getlesser(), lesser);
		sleep(2000);
		String range = FileReaderManager.getInstanceCR().getrange();
		enterText(si.getQuesPage().getrange(), range);

		ClickOnElement(si.getQuesPage().getaddconditional1());
		ClickOnElement(si.getQuesPage().getquestype());
		sleep(2000);
		ClickOnElement(si.getQuesPage().getyesorno());
		String yesorno = FileReaderManager.getInstanceCR().getyesorno();
		enterText(si.getQuesPage().getMCque2(), yesorno);
		ClickOnElement(si.getQuesPage().getbackbtn());

		ClickOnElement(si.getQuesPage().getaddconditional2());
		ClickOnElement(si.getQuesPage().getquestype());
		sleep(2000);
		ClickOnElement(si.getQuesPage().getsection());
		String section = FileReaderManager.getInstanceCR().getsection();
		enterText(si.getQuesPage().getMCque7(), section);
		ClickOnElement(si.getQuesPage().getbackbtn());

		ClickOnElement(si.getQuesPage().getaddconditional3());
		ClickOnElement(si.getQuesPage().getquestype());
		sleep(2000);
		ClickOnElement(si.getQuesPage().getdropdown());
		String dropdown = FileReaderManager.getInstanceCR().getdropdown();
		enterText(si.getQuesPage().getMCque6(), dropdown);
		String drop1 = FileReaderManager.getInstanceCR().getdrop1();
		enterText(si.getQuesPage().getdrop1(), drop1);
		String drop2 = FileReaderManager.getInstanceCR().getdrop2();
		enterText(si.getQuesPage().getdrop2(), drop2);
		ClickOnElement(si.getQuesPage().getbackbtn());
		sleep(3000);

	}

	@When("User add the dropdown question and enter the question name and click conditional and add conditional question")
	public void user_add_the_dropdown_question_and_enter_the_question_name_and_click_conditional_and_add_conditional_question()
			throws Throwable {

		ClickOnElement(si.getQuesPage().getquestype());
		ClickOnElement(si.getQuesPage().getdropdown());
		ClickOnElement(si.getQuesPage().getdropcondi());
		sleep(2000);
		String dropdown = FileReaderManager.getInstanceCR().getdropdown();
		enterText(si.getQuesPage().getMCque6(), dropdown);
		sleep(2000);
		String drop1 = FileReaderManager.getInstanceCR().getdrop1();
		enterText(si.getQuesPage().getdrop1(), drop1);
		String drop2 = FileReaderManager.getInstanceCR().getdrop2();
		enterText(si.getQuesPage().getdrop2(), drop2);

		ClickOnElement(si.getQuesPage().getaddconditional1());
		ClickOnElement(si.getQuesPage().getquestype());
		ClickOnElement(si.getQuesPage().getfreetext());
		sleep(2000);
		String freetext = FileReaderManager.getInstanceCR().getfreetext();
		enterText(si.getQuesPage().getMCque1(), freetext);
		ClickOnElement(si.getQuesPage().getbackbtn());
		sleep(2000);

		ClickOnElement(si.getQuesPage().getaddconditional2());
		ClickOnElement(si.getQuesPage().getquestype());
		sleep(2000);
		ClickOnElement(si.getQuesPage().getsection());
		String section = FileReaderManager.getInstanceCR().getsection();
		enterText(si.getQuesPage().getMCque7(), section);
		ClickOnElement(si.getQuesPage().getbackbtn());
		sleep(2000);

	}

	@When("User can add the section question and enter the question name")
	public void user_can_add_the_section_question_and_enter_the_question_name() throws Throwable {
		ClickOnElement(si.getQuesPage().getquestype());
		wait(10);
		ClickOnElement(si.getQuesPage().getsection());
		enterText(si.getQuesPage().getMCque7(), FileReaderManager.getInstanceCR().getsection());
		wait(10);
	}

	@When("User add the Opening statement question")
	public void user_add_the_opening_statement_question() throws Throwable {
		ClickOnElement(si.getQuesPage().getquestype());
		wait(10);
		ClickOnElement(si.getQuesPage().getopening());
		enterText(si.getQuesPage().getMCque8(), FileReaderManager.getInstanceCR().getopening());
		wait(10);
	}

	@When("User add the Closing statement question")
	public void user_add_the_closing_statement_question() throws Throwable {
		ClickOnElement(si.getQuesPage().getquestype());
		wait(10);
		ClickOnElement(si.getQuesPage().getclosing());
		enterText(si.getQuesPage().getMCque9(), FileReaderManager.getInstanceCR().getclosing());

	}

	@When("User add the section question and enter the question name and click conditional and add conditional question")
	public void user_add_the_section_question_and_enter_the_question_name_and_click_conditional_and_add_conditional_question()
			throws Throwable {

//		ClickOnElement(si.getQuesPage().getquestype());
//		ClickOnElement(si.getQuesPage().getsection());
//		String section = FileReaderManager.getInstanceFRM().getInstanceCR().getsection();
//		enterText(si.getQuesPage().getMCque7(), section);
		sleep(2000);

	}

	@When("User add the Conditional segment question and enter the question name and click conditional and add conditional question")
	public void user_add_the_conditional_segment_question_and_enter_the_question_name_and_click_conditional_and_add_conditional_question()
			throws Throwable {

		ClickOnElement(si.getQuesPage().getquestype());
		wait(10);
		ClickOnElement(si.getQuesPage().getsegment());
		ClickOnElement(si.getQuesPage().getselectfield());
		ClickOnElement(si.getQuesPage().getgestation());
		sleep(2000);
		ClickOnElement(si.getQuesPage().getselectfield());
		ClickOnElement(si.getQuesPage().getabovegest());
		sleep(1000);
		String weeks = FileReaderManager.getInstanceCR().getweeks();
		enterText(si.getQuesPage().getweeks(), weeks);
		sleep(1000);
		ClickOnElement(si.getQuesPage().getaddconditional1());
		ClickOnElement(si.getQuesPage().getquestype());
		ClickOnElement(si.getQuesPage().getfreetext());
		sleep(2000);
		String freetext = FileReaderManager.getInstanceCR().getfreetext();
		enterText(si.getQuesPage().getMCque1(), freetext);
		ClickOnElement(si.getQuesPage().getbackbtn());
		sleep(4000);

		ClickOnElement(si.getQuesPage().getquestype());
		ClickOnElement(si.getQuesPage().getsegment());
		ClickOnElement(si.getQuesPage().getselectfield());
		sleep(5000);
		ClickOnElement(si.getQuesPage().getDOB());
		ClickOnElement(si.getQuesPage().getselectfield());
		ClickOnElement(si.getQuesPage().getbelowdob());
		String years = FileReaderManager.getInstanceCR().getyears();
		enterText(si.getQuesPage().getyears(), years);
		sleep(2000);
		ClickOnElement(si.getQuesPage().getaddconditional1());
		sleep(2000);
		ClickOnElement(si.getQuesPage().getquestype());
		ClickOnElement(si.getQuesPage().getmultichoice());
		String multichoice = FileReaderManager.getInstanceCR().getmultichoice();
		enterText(si.getQuesPage().getMCque(), multichoice);
		String option1 = FileReaderManager.getInstanceCR().getoption1();
		enterText(si.getQuesPage().getoption1(), option1);
		wait(10);
		String option2 = FileReaderManager.getInstanceCR().getoption2();
		enterText(si.getQuesPage().getoption2(), option2);
		ClickOnElement(si.getQuesPage().getbackbtn());
		sleep(4000);

		ClickOnElement(si.getQuesPage().getquestype());
		ClickOnElement(si.getQuesPage().getsegment());
		ClickOnElement(si.getQuesPage().getselectfield());
		sleep(4000);
		ClickOnElement(si.getQuesPage().getBMI());
		String aboveemi = FileReaderManager.getInstanceCR().getabovebmi();
		enterText(si.getQuesPage().getabovebmi(), aboveemi);
		sleep(3000);
		String belowbmi = FileReaderManager.getInstanceCR().getbelowbmi();
		enterText(si.getQuesPage().getbelowbmi(), belowbmi);
		ClickOnElement(si.getQuesPage().getaddconditional1());
		ClickOnElement(si.getQuesPage().getquestype());
		ClickOnElement(si.getQuesPage().getyesorno());
		String yesorno = FileReaderManager.getInstanceCR().getyesorno();
		enterText(si.getQuesPage().getMCque2(), yesorno);
		sleep(3000);

	}

	@When("User click preview button and select submit for approval")
	public void user_click_preview_button_and_select_submit_for_approval() throws Throwable {
		// ClickOnElement(si.getQuesPage().getpreviewques());
		sleep(7000);
		// ClickOnElement(si.getQuesPage().getcloseque());
		ClickOnElement(si.getQuesPage().getapproval());
		sleep(10000);
		ClickOnElement(si.getQuesPage().getadminapprove());
		sleep(9000);
		// Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		ClickOnElement(si.getQuesPage().getadminemail());
		sleep(3000);
		ClickOnElement(si.getQuesPage().getconfirmbtn());

		ClickOnElement(si.getQuesPage().getcheckstatus());
		sleep(14000);

	}

	@When("User click logout button and login as admin")
	public void user_click_logout_button_and_login_as_admin() throws Throwable {

		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(si.getQuesPage().getlogout());
		sleep(6000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
				ClickOnElement(si.getQuesPage().getlogout2());
			}
			driver.switchTo().window(Parenthandle);
		}

		sleep(3000);
	}

	@When("Launch the admin external {string}")
	public void launch_the_admin_external(String string) throws Throwable {
		String url = FileReaderManager.getInstanceCR().geturl();
		getDrive(url);

		sleep(3000);
	}

	@When("User click the Staff login button for admin approval purpose")
	public void user_click_the_staff_login_button_for_admin_approval_purpose() throws Throwable {
		ClickOnElement(si.getQuesPage().getstafflogin());
		sleep(1500);
	}

	@When("User enter the admin email {string} and click the next button")
	public void user_enter_the_admin_email_and_click_the_next_button(String string) throws Throwable {
		ClickOnElement(si.getQuesPage().getAddacc());
		sleep(2000);

		String Email = FileReaderManager.getInstanceCR().getEmailad();
		enterText(si.getQuesPage().getexternalemail(), Email);
		ClickOnElement(si.getQuesPage().getexternalNext());
	}

	@When("User enter the admin Password {string} and click the signup button")
	public void user_enter_the_admin_password_and_click_the_signup_button(String string) throws Throwable {
		String Password = FileReaderManager.getInstanceCR().getPasswordad();
		enterText(si.getQuesPage().getexternalPassword(), Password);
		sleep(5000);
		ClickOnElement(si.getQuesPage().getexnext());
		// sleep(8000);
		// ClickOnElement(si.getQuesPage().getexternalNext());
		sleep(14000);

	}

	@When("User click the forms&questionnaire and form approvals and approve the form")
	public void user_click_the_forms_questionnaire_and_form_approvals_and_approve_the_form() throws Throwable {
		sleep(10000);
		ClickOnElement(si.getQuesPage().getqb());
		sleep(16000);
		ClickOnElement(si.getQuesPage().getformapprovals());
		sleep(7000);
		ClickOnElement(si.getQuesPage().getreceived());
		sleep(2000);
		ClickOnElement(si.getQuesPage().getdatemodify());
		sleep(5000);
		ClickOnElement(si.getQuesPage().getlastdate());
		sleep(6000);
		ClickOnElement(si.getQuesPage().getapprovebtn());
		sleep(4000);

	}

}
