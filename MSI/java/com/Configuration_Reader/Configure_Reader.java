package com.Configuration_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configure_Reader {
	public static Properties proper;

	public Configure_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\Mediwave Digital\\git\\FE-MSI\\Automation\\MSI_Project\\src\\main\\java\\com\\Configuration_Properties\\Configuration.properties");
		FileInputStream fi = new FileInputStream(f);

		proper = new Properties();
		proper.load(fi);

	}

	public String getBrowser_name() {

		String property = proper.getProperty("browser_name");
		return property;

	}
	public String getURL() {

		String property = proper.getProperty("url");
		return property;

	}

	public String getTOP() {

		String property = proper.getProperty("TOP");
		return property;
	}

	public String getVAS() {

		String property = proper.getProperty("VAS");
		return property;
	}

	public String getLARC() {

		String property = proper.getProperty("LARC");
		return property;
	}

	public String getYes() {

		String property = proper.getProperty("value_yes");
		return property;
	}

	public String getNo() {

		String property = proper.getProperty("value_no");
		return property;
	}

	public String getPostcode1() {

		String property = proper.getProperty("Postcode");
		return property;
	}

	public String getHopuse_name() {

		String property = proper.getProperty("House_name");
		return property;
	}

	public String getStreet_name() {

		String property = proper.getProperty("Street_name");
		return property;
	}

	public String getCity_name() {

		String property = proper.getProperty("City_name");
		return property;
	}

	public String getPost_code() {

		String property = proper.getProperty("Post_code");
		return property;
	}

	public String getPassword1() {

		String property = proper.getProperty("Password");
		return property;
	}

	public String getSecurity_safe1() {

		String property = proper.getProperty("security_safe1");
		return property;
	}

	public String getSecurity_safe2() {

		String property = proper.getProperty("security_safe2");
		return property;
	}

	public String getSecurity_safe3() {

		String property = proper.getProperty("security_safe3");
		return property;
	}

	public String getContact_yes() {

		String property = proper.getProperty("Contact_yes");
		return property;
	}

	public String getCOntact_no() {

		String property = proper.getProperty("Contact_no");
		return property;
	}

	public String getSecurity_unsafe() {

		String property = proper.getProperty("security_unsafe");
		return property;
	}
//	
//	public String getSecurity_unsafe() {
//
//		String property = proper.getProperty("security_unsafe");
//		return property;
//	}public String getSecurity_unsafe() {
//
//		String property = proper.getProperty("security_unsafe");
//		return property;
//	}
//	public String getSecurity_unsafe() {
//
//		String property = proper.getProperty("security_unsafe");
//		return property;
//	}
//	public String getSecurity_unsafe() {
//
//		String property = proper.getProperty("security_unsafe");
//		return property;
//	}
//	public String getSecurity_unsafe() {
//
//		String property = proper.getProperty("security_unsafe");
//		return property;
//	}
//	public String getSecurity_unsafe() {
//
//		String property = proper.getProperty("security_unsafe");
//		return property;
//	}public String getSecurity_unsafe() {
//
//		String property = proper.getProperty("security_unsafe");
//		return property;
//	}
//	
//	public String getSecurity_unsafe() {
//
//		String property = proper.getProperty("security_unsafe");
//		return property;
//	}
//	public String getSecurity_unsafe() {
//
//		String property = proper.getProperty("security_unsafe");
//		return property;
//	}

	public String getEmail() {

		String property = proper.getProperty("email");
		return property;
	}

	public String getPostcod() {

		String property = proper.getProperty("postcode");
		return property;
	}

	public String getPassword() {

		String property = proper.getProperty("password");
		return property;
	}

	public String getQuestionnaireName() {

		String property = proper.getProperty("QuestionnaireName");
		return property;
	}

	public String getInternalquestionnairename() {

		String property = proper.getProperty("Internalquestionnairename");
		return property;

	}

	public String getOpening_Statement() {

		String property = proper.getProperty("Opening_Statement");
		return property;

	}

	public String getSection_Question1() {

		String property = proper.getProperty("Section_question1");
		return property;

	}

	public String getYesorNoQuestion1() {

		String property = proper.getProperty("YesorNoQuestion1");
		return property;

	}

	public String getYesorNoQuestion1_supportingtext1() {

		String property = proper.getProperty("YesorNoQuestion1_supportingtext");
		return property;

	}

	public String getYesorNoQuestion2() {

		String property = proper.getProperty("YesorNoQuestion2");
		return property;

	}

	public String getSection_Question2() {

		String property = proper.getProperty("Section_question2");
		return property;

	}

	public String getYesorNoQuestion3() {

		String property = proper.getProperty("YesorNoQuestion3");
		return property;

	}

	public String getYesorNoQuestion3_supportingtext() {

		String property = proper.getProperty("YesorNoQuestion3_supportingtext");
		return property;

	}

	public String getSection_Question3() {

		String property = proper.getProperty("Section_question3");
		return property;

	}

	public String getYesorNoQuestion4() {

		String property = proper.getProperty("YesorNoQuestion4");
		return property;

	}

	public String getYesorNoQuestion4_supportingtext() {

		String property = proper.getProperty("YesorNoQuestion4_supportingtext");
		return property;

	}

	public String getMCQ_YesorNoQuestion4() {

		String property = proper.getProperty("MCQ_YesorNoQuestion4");
		return property;

	}

	public String getMCQ_YesorNoQuestion4_Options() {

		String property = proper.getProperty("MCQ_YesorNoQuestion4_Options");
		return property;

	}

	public String getFreetext_MCQ_YesorNoQuestion4_Option7() {

		String property = proper.getProperty("Freetext_MCQ_YesorNoQuestion4_Option7");
		return property;

	}

	public String getDropdownQuestion1() {

		String property = proper.getProperty("DropdownQuestion1");
		return property;

	}

	public String getDropdownQuestion1_supportingtext() {

		String property = proper.getProperty("DropdownQuestion1_supportingtext");
		return property;

	}

	public String getDropdownQuestion1_Options() {

		String property = proper.getProperty("DropdownQuestion1_Options");
		return property;

	}

	public String getDropdown_DropdownQuestion1_Option1() {

		String property = proper.getProperty("Dropdown_DropdownQuestion1_Option1");
		return property;

	}

	public String getDropdown_DropdownQuestion1_Option1_supportingtext() {

		String property = proper.getProperty("Dropdown_DropdownQuestion1_Option1_supportingtext");
		return property;

	}

	public String getDropdown_DropdownQuestion1_Option1_Options() {

		String property = proper.getProperty("Dropdown_DropdownQuestion1_Option1_Options");
		return property;

	}

	public String getYesorNoQuestion5() {

		String property = proper.getProperty("YesorNoQuestion5");
		return property;

	}

	public String getYesorNoQuestion6() {

		String property = proper.getProperty("YesorNoQuestion6");
		return property;

	}

	public String getSection_question4() {

		String property = proper.getProperty("Section_question4");
		return property;

	}

	public String getYesorNoQuestion7() {

		String property = proper.getProperty("YesorNoQuestion7");
		return property;

	}

	public String getYesorNo1_YesorNoQuestion7() {

		String property = proper.getProperty("YesorNo1_YesorNoQuestion7");
		return property;

	}

	public String getYesorNo2_YesorNoQuestion7() {

		String property = proper.getProperty("YesorNo2_YesorNoQuestion7");
		return property;

	}

	public String getDropdownQuestion2() {

		String property = proper.getProperty("DropdownQuestion2");
		return property;

	}

	public String getDropdownQuestion2_Options() {

		String property = proper.getProperty("DropdownQuestion2_Options");
		return property;

	}

	public String getYesorNoQuestion8() {

		String property = proper.getProperty("YesorNoQuestion8");
		return property;

	}

	public String getYesorNoQuestion9() {

		String property = proper.getProperty("YesorNoQuestion9");
		return property;

	}

	public String getYesorNoQuestion9_supportingtext() {

		String property = proper.getProperty("YesorNoQuestion9_supportingtext");
		return property;

	}

	public String getYesorNoQuestion10() {

		String property = proper.getProperty("YesorNoQuestion10");
		return property;

	}

	public String getYesorNoQuestion10_supportingtext() {

		String property = proper.getProperty("YesorNoQuestion10_supportingtext");
		return property;

	}

	public String getYesorNoQuestion11() {

		String property = proper.getProperty("YesorNoQuestion11");
		return property;

	}

	public String getYesorNoQuestion12() {

		String property = proper.getProperty("YesorNoQuestion12");
		return property;

	}

	public String getYesorNoQuestion13() {

		String property = proper.getProperty("YesorNoQuestion13");
		return property;

	}

	public String getYesorNo_YesorNoQuestion13() {

		String property = proper.getProperty("YesorNo_YesorNoQuestion13");
		return property;

	}

	public String getYesorNoQuestion14() {

		String property = proper.getProperty("YesorNoQuestion14");
		return property;

	}

	public String getMCQ_YesorNoQuestion14() {

		String property = proper.getProperty("MCQ_YesorNoQuestion14");
		return property;

	}

	public String getMCQ_YesorNoQuestion14_Options() {

		String property = proper.getProperty("MCQ_YesorNoQuestion14_Options");
		return property;

	}

	public String getFreetext_MCQ_YesorNoQuestion14() {

		String property = proper.getProperty("Freetext_MCQ_YesorNoQuestion14");
		return property;

	}

	public String getMCQ1() {

		String property = proper.getProperty("MCQ1");
		return property;

	}

	public String getMCQ1_Options() {

		String property = proper.getProperty("MCQ1_Options");
		return property;

	}

	public String getSection_question5() {

		String property = proper.getProperty("Section_question5");
		return property;

	}

	public String getYesorNoQuestion15() {

		String property = proper.getProperty("YesorNoQuestion15");
		return property;

	}

	public String getNumberinput1_YesorNoQuestion15() {

		String property = proper.getProperty("Numberinput1_YesorNoQuestion15");
		return property;

	}

	public String getYesorNo1_YesorNoQuestion15() {

		String property = proper.getProperty("YesorNo1_YesorNoQuestion15");
		return property;

	}

	public String getNumberinput2_YesorNoQuestion15() {

		String property = proper.getProperty("Numberinput2_YesorNoQuestion15");
		return property;

	}

	public String getNumberinput2_YesorNoQuestion15_supportingtext() {

		String property = proper.getProperty("Numberinput2_YesorNoQuestion15_supportingtext");
		return property;

	}

	public String getNumberinput3_YesorNoQuestion15() {

		String property = proper.getProperty("Numberinput3_YesorNoQuestion15");
		return property;

	}

	public String getDateinput1_YesorNoQuestion15() {

		String property = proper.getProperty("Dateinput1_YesorNoQuestion15");
		return property;

	}

	public String getNumberinput4_YesorNoQuestion15() {

		String property = proper.getProperty("Numberinput4_YesorNoQuestion15");
		return property;

	}

	public String getDateinput2_YesorNoQuestion15() {

		String property = proper.getProperty("Dateinput2_YesorNoQuestion15");
		return property;

	}

	public String getDropdown_YesorNoQuestion15() {

		String property = proper.getProperty("Dropdown_YesorNoQuestion15");
		return property;

	}

	public String getDropdown_YesorNoQuestion15_Options() {

		String property = proper.getProperty("Dropdown_YesorNoQuestion15_Options");
		return property;

	}

	public String getYesorNo2_YesorNoQuestion15() {

		String property = proper.getProperty("YesorNo2_YesorNoQuestion15");
		return property;

	}

	public String getYesorNo2_YesorNoQuestion15_supportingtext() {

		String property = proper.getProperty("YesorNo2_YesorNoQuestion15_supportingtext");
		return property;

	}

	public String getFreetext_YesorNo2_YesorNoQuestion15() {

		String property = proper.getProperty("Freetext_YesorNo2_YesorNoQuestion15");
		return property;

	}

	public String getNumberinput5_YesorNoQuestion15() {

		String property = proper.getProperty("Numberinput5_YesorNoQuestion15");
		return property;

	}

	public String getNumberinput5_YesorNoQuestion15_supportingtext() {

		String property = proper.getProperty("Numberinput5_YesorNoQuestion15_supportingtext");
		return property;

	}

	public String getNumberinput6_YesorNoQuestion15() {

		String property = proper.getProperty("Numberinput6_YesorNoQuestion15");
		return property;

	}

	public String getNumberinput6_YesorNoQuestion15_supportingtext() {

		String property = proper.getProperty("Numberinput6_YesorNoQuestion15_supportingtext");
		return property;

	}

	public String getYesorNo3_YesorNoQuestion15() {

		String property = proper.getProperty("YesorNo3_YesorNoQuestion15");
		return property;

	}

	public String getNumberinput1_YesorNo3_YesorNoQuestion15() {

		String property = proper.getProperty("Numberinput1_YesorNo3_YesorNoQuestion15");
		return property;

	}

	public String getNumberinput2_YesorNo3_YesorNoQuestion15() {

		String property = proper.getProperty("Numberinput2_YesorNo3_YesorNoQuestion15");
		return property;

	}

	public String getYesorNo_YesorNo3_YesorNoQuestion15() {

		String property = proper.getProperty("YesorNo_YesorNo3_YesorNoQuestion15");
		return property;

	}

	public String getFreetext_YesorNo_YesorNo3_YesorNoQuestion15() {

		String property = proper.getProperty("Freetext_YesorNo_YesorNo3_YesorNoQuestion15");
		return property;

	}

	public String getYesorNoQuestion16() {

		String property = proper.getProperty("YesorNoQuestion16");
		return property;

	}

	public String getYesorNo_YesorNoQuestion16() {

		String property = proper.getProperty("YesorNo_YesorNoQuestion16");
		return property;

	}

	public String getFreetext_YesorNoQuestion16() {

		String property = proper.getProperty("Freetext_YesorNoQuestion16");
		return property;

	}

	public String getYesorNoQuestion17() {

		String property = proper.getProperty("YesorNoQuestion17");
		return property;

	}

	public String getMCQ_YesorNoQuestion17() {

		String property = proper.getProperty("MCQ_YesorNoQuestion17");
		return property;

	}

	public String getMCQ_YesorNoQuestion17_Options() {

		String property = proper.getProperty("MCQ_YesorNoQuestion17_Options");
		return property;

	}

	public String getFreetext_MCQ_YesorNoQuestion17_Options() {

		String property = proper.getProperty("Freetext_MCQ_YesorNoQuestion17_Options");
		return property;

	}

	public String getYesorNoQuestion18() {

		String property = proper.getProperty("YesorNoQuestion18");
		return property;

	}

	public String getDropdown_YesorNoQuestion18() {

		String property = proper.getProperty("Dropdown_YesorNoQuestion18");
		return property;

	}

	public String getDropdown_YesorNoQuestion18_Options() {

		String property = proper.getProperty("Dropdown_YesorNoQuestion18_Options");
		return property;

	}

	public String getYesorNoQuestion19() {

		String property = proper.getProperty("YesorNoQuestion19");
		return property;

	}

	public String getYesorNoQuestion19_supportingtext() {

		String property = proper.getProperty("YesorNoQuestion19_supportingtext");
		return property;

	}

	public String getMCQ_YesorNoQuestion19() {

		String property = proper.getProperty("MCQ_YesorNoQuestion19");
		return property;

	}

	public String getMCQ_YesorNoQuestion19_Options() {

		String property = proper.getProperty("MCQ_YesorNoQuestion19_Options");
		return property;

	}

	public String getFreetext_MCQ_YesorNoQuestion19_Options() {

		String property = proper.getProperty("Freetext_MCQ_YesorNoQuestion19_Options");
		return property;

	}

	public String getYesorNoQuestion20() {

		String property = proper.getProperty("YesorNoQuestion20");
		return property;

	}

	public String getYesorNo_YesorNoQuestion20() {

		String property = proper.getProperty("YesorNo_YesorNoQuestion20");
		return property;

	}

	public String getFreeText_YesorNo_YesorNoQuestion20() {

		String property = proper.getProperty("FreeText_YesorNo_YesorNoQuestion20");
		return property;

	}

	public String getDateinput_YesorNoQuestion20() {

		String property = proper.getProperty("Dateinput_YesorNoQuestion20");
		return property;

	}

	public String getNumberinput_YesorNoQuestion20() {

		String property = proper.getProperty("Numberinput_YesorNoQuestion20");
		return property;

	}

	public String getFreeText_YesorNoQuestion20() {

		String property = proper.getProperty("FreeText_YesorNoQuestion20");
		return property;

	}

	public String getYesorNoQuestion21() {

		String property = proper.getProperty("YesorNoQuestion21");
		return property;

	}

	public String getYesorNo_YesorNoQuestion21() {

		String property = proper.getProperty("YesorNo_YesorNoQuestion21");
		return property;

	}

	public String getFreetext1_YesorNoQuestion21() {

		String property = proper.getProperty("Freetext1_YesorNoQuestion21");
		return property;

	}

	public String getFreetext2_YesorNoQuestion21() {

		String property = proper.getProperty("Freetext2_YesorNoQuestion21");
		return property;

	}

	public String getYesorNoQuestion22() {

		String property = proper.getProperty("YesorNoQuestion22");
		return property;

	}

	public String getMCQ_YesorNoQuestion22() {

		String property = proper.getProperty("MCQ_YesorNoQuestion22");
		return property;

	}

	public String getMCQ_YesorNoQuestion22_Options() {

		String property = proper.getProperty("MCQ_YesorNoQuestion22_Options");
		return property;

	}

	public String getFreetext_YesorNoQuestion22() {

		String property = proper.getProperty("Freetext_YesorNoQuestion22");
		return property;

	}

	public String getYesorNoQuestion23() {

		String property = proper.getProperty("YesorNoQuestion23");
		return property;

	}

	public String getMCQ_YesorNoQuestion23() {

		String property = proper.getProperty("MCQ_YesorNoQuestion23");
		return property;

	}

	public String getMCQ_YesorNoQuestion23_Options() {

		String property = proper.getProperty("MCQ_YesorNoQuestion23_Options");
		return property;

	}

	public String getFreetext_MCQ_YesorNoQuestion23_Options() {

		String property = proper.getProperty("Freetext_MCQ_YesorNoQuestion23_Options");
		return property;

	}

	public String getFreetext_YesorNoQuestion23() {

		String property = proper.getProperty("Freetext_YesorNoQuestion23");
		return property;

	}

	public String getYesorNoQuestion24() {

		String property = proper.getProperty("YesorNoQuestion24");
		return property;

	}

	public String getYesorNo1_YesorNoQuestion24() {

		String property = proper.getProperty("YesorNo1_YesorNoQuestion24");
		return property;

	}

	public String getFreetext_YesorNo_YesorNoQuestion24() {

		String property = proper.getProperty("Freetext_YesorNo_YesorNoQuestion24");
		return property;

	}

	public String getYesorNo2_YesorNoQuestion24() {

		String property = proper.getProperty("YesorNo2_YesorNoQuestion24");
		return property;

	}

	public String getFreetext_YesorNo2_YesorNoQuestion24() {

		String property = proper.getProperty("Freetext_YesorNo2_YesorNoQuestion24");
		return property;

	}

	public String getYesorNo_YesorNo2_YesorNoQuestion24() {

		String property = proper.getProperty("YesorNo_YesorNo2_YesorNoQuestion24");
		return property;

	}

	public String getYesorNo3_YesorNoQuestion24() {

		String property = proper.getProperty("YesorNo3_YesorNoQuestion24");
		return property;

	}

	public String getMCQ_YesorNo3_YesorNoQuestion24() {

		String property = proper.getProperty("MCQ_YesorNo3_YesorNoQuestion24");
		return property;

	}

	public String getMCQ_YesorNo3_YesorNoQuestion24_Options() {

		String property = proper.getProperty("MCQ_YesorNo3_YesorNoQuestion24_Options");
		return property;

	}

	public String getDateinput_YesorNoQuestion24() {

		String property = proper.getProperty("Dateinput_YesorNoQuestion24");
		return property;

	}

	public String getYesorNo4_YesorNoQuestion24() {

		String property = proper.getProperty("YesorNo4_YesorNoQuestion24");
		return property;

	}

	public String getYesorNo5_YesorNoQuestion24() {

		String property = proper.getProperty("YesorNo5_YesorNoQuestion24");
		return property;

	}

	public String getYesorNo6_YesorNoQuestion24() {

		String property = proper.getProperty("YesorNo6_YesorNoQuestion24");
		return property;

	}

	public String getFreetext_YesorNo6_YesorNoQuestion24() {

		String property = proper.getProperty("Freetext_YesorNo6_YesorNoQuestion24");
		return property;

	}

	public String getYesorNoQuestion25() {

		String property = proper.getProperty("YesorNoQuestion25");
		return property;

	}

	public String getMCQ_YesorNoQuestion25() {

		String property = proper.getProperty("MCQ_YesorNoQuestion25");
		return property;

	}

	public String getMCQ_YesorNoQuestion25_Options() {

		String property = proper.getProperty("MCQ_YesorNoQuestion25_Options");
		return property;

	}

	public String getFreetext_YesorNoQuestion25() {

		String property = proper.getProperty("Freetext_YesorNoQuestion25");
		return property;

	}

	public String getYesorNoQuestion26() {

		String property = proper.getProperty("YesorNoQuestion26");
		return property;

	}

	public String getMCQ_YesorNoQuestion26() {

		String property = proper.getProperty("MCQ_YesorNoQuestion26");
		return property;

	}

	public String getMCQ_YesorNoQuestion26_Options() {

		String property = proper.getProperty("MCQ_YesorNoQuestion26_Options");
		return property;

	}

	public String getYesorNo1_YesorNoQuestion26() {

		String property = proper.getProperty("YesorNo1_YesorNoQuestion26");
		return property;

	}

	public String getMCQ_YesorNo1_YesorNoQuestion26() {

		String property = proper.getProperty("MCQ_YesorNo1_YesorNoQuestion26");
		return property;

	}

	public String getMCQ_YesorNo1_YesorNoQuestion26_supportingtext() {

		String property = proper.getProperty("MCQ_YesorNo1_YesorNoQuestion26_supportingtext");
		return property;

	}

	public String getMCQ_YesorNo1_YesorNoQuestion26_Options() {

		String property = proper.getProperty("MCQ_YesorNo1_YesorNoQuestion26_Options");
		return property;

	}

	public String getFreetext_MCQ_YesorNo1_YesorNoQuestion26_Options() {

		String property = proper.getProperty("Freetext_MCQ_YesorNo1_YesorNoQuestion26_Options");
		return property;

	}

	public String getNumberinput1_YesorNo1_YesorNoQuestion26() {

		String property = proper.getProperty("Numberinput1_YesorNo1_YesorNoQuestion26");
		return property;

	}

	public String getNumberinput2_YesorNo1_YesorNoQuestion26() {

		String property = proper.getProperty("Numberinput2_YesorNo1_YesorNoQuestion26");
		return property;

	}

	public String getYesorNo2_YesorNoQuestion26() {

		String property = proper.getProperty("YesorNo2_YesorNoQuestion26");
		return property;

	}

	public String getFreetext1_YesorNo2_YesorNoQuestion26() {

		String property = proper.getProperty("Freetext1_YesorNo2_YesorNoQuestion26");
		return property;

	}

	public String getFreetext2_YesorNo2_YesorNoQuestion26() {

		String property = proper.getProperty("Freetext2_YesorNo2_YesorNoQuestion26");
		return property;

	}

	public String getFreetext3_YesorNo2_YesorNoQuestion26() {

		String property = proper.getProperty("Freetext3_YesorNo2_YesorNoQuestion26");
		return property;

	}

	public String getYesorNoQuestion27() {

		String property = proper.getProperty("YesorNoQuestion27");
		return property;

	}

	public String getMCQ_YesorNoQuestion27() {

		String property = proper.getProperty("MCQ_YesorNoQuestion27");
		return property;

	}

	public String getMCQ_YesorNoQuestion27_Options() {

		String property = proper.getProperty("MCQ_YesorNoQuestion27_Options");
		return property;

	}

	public String getYesorNo1_MCQ_YesorNoQuestion27_Option1() {

		String property = proper.getProperty("YesorNo1_MCQ_YesorNoQuestion27_Option1");
		return property;

	}

	public String getYesorNo2_MCQ_YesorNoQuestion27_Option3() {

		String property = proper.getProperty("YesorNo2_MCQ_YesorNoQuestion27_Option3");
		return property;

	}

	public String getFreetext1_YesorNo2_MCQ_YesorNoQuestion27_Option3() {

		String property = proper.getProperty("Freetext1_YesorNo2_MCQ_YesorNoQuestion27_Option3");
		return property;

	}

	public String getFreetext_MCQ_YesorNoQuestion27_Option7() {

		String property = proper.getProperty("Freetext_MCQ_YesorNoQuestion27_Option7");
		return property;

	}

	public String getYesorNo_YesorNoQuestion27() {

		String property = proper.getProperty("YesorNo_YesorNoQuestion27");
		return property;

	}

	public String Freetext_YesorNo_YesorNoQuestion27() {

		String property = proper.getProperty("Freetext_YesorNo_YesorNoQuestion27");
		return property;

	}

	public String Freetext_YesorNoQuestion27() {

		String property = proper.getProperty("Freetext_YesorNoQuestion27");
		return property;

	}

	public String YesorNoQuestion28() {

		String property = proper.getProperty("YesorNoQuestion28");
		return property;

	}

	public String YesorNo_YesorNoQuestion28() {

		String property = proper.getProperty("YesorNo_YesorNoQuestion28");
		return property;

	}

	public String Freetext_YesorNo_YesorNoQuestion28() {

		String property = proper.getProperty("Freetext_YesorNo_YesorNoQuestion28");
		return property;

	}

	public String Freetext_YesorNoQuestion28() {

		String property = proper.getProperty("Freetext_YesorNoQuestion28");
		return property;

	}

	public String YesorNoQuestion29() {

		String property = proper.getProperty("YesorNoQuestion29");
		return property;

	}

	public String MCQ_YesorNoQuestion29() {

		String property = proper.getProperty("MCQ_YesorNoQuestion29");
		return property;

	}

	public String MCQ_YesorNoQuestion29_Options() {

		String property = proper.getProperty("MCQ_YesorNoQuestion29_Options");
		return property;

	}

	public String FreeText_MCQ_YesorNoQuestion29_Options() {

		String property = proper.getProperty("FreeText_MCQ_YesorNoQuestion29_Options");
		return property;

	}

	public String Freetext1_YesorNoQuestion29() {

		String property = proper.getProperty("Freetext1_YesorNoQuestion29");
		return property;

	}

	public String Freetext2_YesorNoQuestion29() {

		String property = proper.getProperty("Freetext2_YesorNoQuestion29");
		return property;

	}

	public String YesorNoQuestion30() {

		String property = proper.getProperty("YesorNoQuestion30");
		return property;

	}

	public String MCQ_YesorNoQuestion30() {

		String property = proper.getProperty("MCQ_YesorNoQuestion30");
		return property;

	}

	public String MCQ_YesorNoQuestion30_Options() {

		String property = proper.getProperty("MCQ_YesorNoQuestion30_Options");
		return property;

	}

	public String Freetext_MCQ_YesorNoQuestion30_Options() {

		String property = proper.getProperty("Freetext_MCQ_YesorNoQuestion30_Options");
		return property;

	}

	public String Freetext1_YesorNoQuestion30() {

		String property = proper.getProperty("Freetext1_YesorNoQuestion30");
		return property;

	}

	public String Freetext2_YesorNoQuestion30() {

		String property = proper.getProperty("Freetext2_YesorNoQuestion30");
		return property;

	}

	public String YesorNoQuestion31() {

		String property = proper.getProperty("YesorNoQuestion31");
		return property;

	}

	public String YesorNo1_YesorNoQuestion31() {

		String property = proper.getProperty("YesorNo1_YesorNoQuestion31");
		return property;

	}

	public String Freetext_YesorNo1_YesorNoQuestion31() {

		String property = proper.getProperty("Freetext_YesorNo1_YesorNoQuestion31");
		return property;

	}

	public String YesorNo2_YesorNoQuestion31() {

		String property = proper.getProperty("YesorNo2_YesorNoQuestion31");
		return property;

	}

	public String Freetext1_YesorNoQuestion31() {

		String property = proper.getProperty("Freetext1_YesorNoQuestion31");
		return property;

	}

	public String Freetext2_YesorNoQuestion31() {

		String property = proper.getProperty("Freetext2_YesorNoQuestion31");
		return property;

	}

	public String YesorNoQuestion32() {

		String property = proper.getProperty("YesorNoQuestion32");
		return property;

	}

	public String YesorNoQuestion32_supportingtext() {

		String property = proper.getProperty("YesorNoQuestion32_supportingtext");
		return property;

	}

	public String MCQ_YesorNoQuestion32() {

		String property = proper.getProperty("MCQ_YesorNoQuestion32");
		return property;

	}

	public String MCQ_YesorNoQuestion32_Options() {

		String property = proper.getProperty("MCQ_YesorNoQuestion32_Options");
		return property;

	}

	public String Freetext_MCQ_YesorNoQuestion32_Options() {

		String property = proper.getProperty("Freetext_MCQ_YesorNoQuestion32_Options");
		return property;

	}

	public String YesorNo_YesorNoQuestion32() {

		String property = proper.getProperty("YesorNo_YesorNoQuestion32");
		return property;

	}

	public String Freetext_YesorNo_YesorNoQuestion32() {

		String property = proper.getProperty("Freetext_YesorNo_YesorNoQuestion32");
		return property;

	}

	public String Freetext1_YesorNoQuestion32() {

		String property = proper.getProperty("Freetext1_YesorNoQuestion32");
		return property;

	}

	public String Freetext2_YesorNoQuestion32() {

		String property = proper.getProperty("Freetext2_YesorNoQuestion32");
		return property;

	}

	public String YesorNoQuestion33() {

		String property = proper.getProperty("YesorNoQuestion33");
		return property;

	}

	public String Freetext1_YesorNoQuestion33() {

		String property = proper.getProperty("Freetext1_YesorNoQuestion33");
		return property;

	}

	public String Freetext2_YesorNoQuestion33() {

		String property = proper.getProperty("Freetext2_YesorNoQuestion33");
		return property;

	}

	public String Freetext3_YesorNoQuestion33() {

		String property = proper.getProperty("Freetext3_YesorNoQuestion33");
		return property;

	}

	public String YesorNo_YesorNoQuestion33() {

		String property = proper.getProperty("YesorNo_YesorNoQuestion33");
		return property;

	}

	public String Freetext_YesorNo_YesorNoQuestion33() {

		String property = proper.getProperty("Freetext_YesorNo_YesorNoQuestion33");
		return property;

	}

	public String YesorNoQuestion34() {

		String property = proper.getProperty("YesorNoQuestion34");
		return property;

	}

	public String YesorNo1_YesorNoQuestion34() {

		String property = proper.getProperty("YesorNo1_YesorNoQuestion34");
		return property;

	}

	public String Freetext_YesorNo_YesorNoQuestion34() {

		String property = proper.getProperty("Freetext_YesorNo_YesorNoQuestion34");
		return property;

	}

	public String YesorNo2_YesorNoQuestion34() {

		String property = proper.getProperty("YesorNo2_YesorNoQuestion34");
		return property;

	}

	public String Freetext1_YesorNoQuestion34() {

		String property = proper.getProperty("Freetext1_YesorNoQuestion34");
		return property;

	}

	public String Freetext2_YesorNoQuestion34() {

		String property = proper.getProperty("Freetext2_YesorNoQuestion34");
		return property;

	}

	public String Freetext2_YesorNoQuestion34_supportingtext() {

		String property = proper.getProperty("Freetext2_YesorNoQuestion34_supportingtext");
		return property;

	}

	public String Freetext3_YesorNoQuestion34() {

		String property = proper.getProperty("Freetext3_YesorNoQuestion34");
		return property;

	}

	public String YesorNo3_YesorNoQuestion34() {

		String property = proper.getProperty("YesorNo3_YesorNoQuestion34");
		return property;

	}

	public String YesorNo3_YesorNoQuestion34_supportingtext() {

		String property = proper.getProperty("YesorNo3_YesorNoQuestion34_supportingtext");
		return property;

	}

	public String Freetext_YesorNo3_YesorNoQuestion34() {

		String property = proper.getProperty("Freetext_YesorNo3_YesorNoQuestion34");
		return property;

	}

	public String YesorNo4_YesorNoQuestion34() {

		String property = proper.getProperty("YesorNo4_YesorNoQuestion34");
		return property;

	}

	public String Freetext_YesorNo4_YesorNoQuestion34() {

		String property = proper.getProperty("Freetext_YesorNo4_YesorNoQuestion34");
		return property;

	}

	public String YesorNo5_YesorNoQuestion34() {

		String property = proper.getProperty("YesorNo5_YesorNoQuestion34");
		return property;

	}

	public String Freetext_YesorNo5_YesorNoQuestion34() {

		String property = proper.getProperty("Freetext_YesorNo5_YesorNoQuestion34");
		return property;

	}

	public String Freetext_YesorNoQuestion34() {

		String property = proper.getProperty("Freetext_YesorNoQuestion34");
		return property;

	}

	public String YesorNoQuestion35() {

		String property = proper.getProperty("YesorNoQuestion35");
		return property;

	}

	public String MCQ_YesorNoQuestion35() {

		String property = proper.getProperty("MCQ_YesorNoQuestion35");
		return property;

	}

	public String MCQ_YesorNoQuestion35_Options() {

		String property = proper.getProperty("MCQ_YesorNoQuestion35_Options");
		return property;

	}

	public String YesorNo_MCQ_YesorNoQuestion35_Options() {

		String property = proper.getProperty("YesorNo_MCQ_YesorNoQuestion35_Options");
		return property;

	}

	public String Freetext_YesorNo_MCQ_YesorNoQuestion35_Options() {

		String property = proper.getProperty("Freetext_YesorNo_MCQ_YesorNoQuestion35_Options");
		return property;

	}

	public String Freetext_MCQ_YesorNoQuestion35_Options() {

		String property = proper.getProperty("Freetext_MCQ_YesorNoQuestion35_Options");
		return property;

	}

	public String YesorNo_YesorNoQuestion35() {

		String property = proper.getProperty("YesorNo_YesorNoQuestion35");
		return property;

	}

	public String Freetext_YesorNo_YesorNoQuestion35() {

		String property = proper.getProperty("Freetext_YesorNo_YesorNoQuestion35");
		return property;

	}

	public String Freetext_YesorNoQuestion35() {

		String property = proper.getProperty("Freetext_YesorNoQuestion35");
		return property;

	}

	public String YesorNoQuestion36() {

		String property = proper.getProperty("YesorNoQuestion36");
		return property;

	}

	public String YesorNo_YesorNoQuestion36() {

		String property = proper.getProperty("YesorNo_YesorNoQuestion36");
		return property;

	}

	public String Freetext_YesorNo_YesorNoQuestion36() {

		String property = proper.getProperty("Freetext_YesorNo_YesorNoQuestion36");
		return property;

	}

	public String Freetext1_YesorNoQuestion36() {

		String property = proper.getProperty("Freetext1_YesorNoQuestion36");
		return property;

	}

	public String Freetext2_YesorNoQuestion36() {

		String property = proper.getProperty("Freetext2_YesorNoQuestion36");
		return property;

	}

	public String YesorNoQuestion37() {

		String property = proper.getProperty("YesorNoQuestion37");
		return property;

	}

	public String MCQ_YesorNoQuestion37() {

		String property = proper.getProperty("MCQ_YesorNoQuestion37");
		return property;

	}

	public String MCQ_YesorNoQuestion37_Options() {

		String property = proper.getProperty("MCQ_YesorNoQuestion37_Options");
		return property;

	}

	public String Freetext_MCQ_YesorNoQuestion37_Options() {

		String property = proper.getProperty("Freetext_MCQ_YesorNoQuestion37_Options");
		return property;

	}

	public String YesorNo_YesorNoQuestion37() {

		String property = proper.getProperty("YesorNo_YesorNoQuestion37");
		return property;

	}

	public String Freetext_YesorNo_YesorNoQuestion37() {

		String property = proper.getProperty("Freetext_YesorNo_YesorNoQuestion37");
		return property;

	}

	public String Freetext1_YesorNoQuestion37() {

		String property = proper.getProperty("Freetext1_YesorNoQuestion37");
		return property;

	}

	public String Freetext2_YesorNoQuestion37() {

		String property = proper.getProperty("Freetext2_YesorNoQuestion37");
		return property;

	}

	public String Freetext3_YesorNoQuestion37() {

		String property = proper.getProperty("Freetext3_YesorNoQuestion37");
		return property;

	}

	public String YesorNoQuestion38() {

		String property = proper.getProperty("YesorNoQuestion38");
		return property;

	}

	public String YesorNo_YesorNoQuestion38() {

		String property = proper.getProperty("YesorNo_YesorNoQuestion38");
		return property;

	}

	public String Freetext_YesorNo_YesorNoQuestion38() {

		String property = proper.getProperty("Freetext_YesorNo_YesorNoQuestion38");
		return property;

	}

	public String Freetext1_YesorNoQuestion38() {

		String property = proper.getProperty("Freetext1_YesorNoQuestion38");
		return property;

	}

	public String Freetext2_YesorNoQuestion38() {

		String property = proper.getProperty("Freetext2_YesorNoQuestion38");
		return property;

	}

	public String YesorNoQuestion39() {

		String property = proper.getProperty("YesorNoQuestion39");
		return property;

	}

	public String YesorNo1_YesorNoQuestion39() {

		String property = proper.getProperty("YesorNo1_YesorNoQuestion39");
		return property;

	}

	public String Freetext_YesorNo1_YesorNoQuestion39() {

		String property = proper.getProperty("Freetext_YesorNo1_YesorNoQuestion39");
		return property;

	}

	public String YesorNo2_YesorNoQuestion39() {

		String property = proper.getProperty("YesorNo2_YesorNoQuestion39");
		return property;

	}

	public String Freetext_YesorNoQuestion39() {

		String property = proper.getProperty("Freetext_YesorNoQuestion39");
		return property;

	}

	public String YesorNoQuestion40() {

		String property = proper.getProperty("YesorNoQuestion40");
		return property;

	}

	public String MCQ_YesorNoQuestion40() {

		String property = proper.getProperty("MCQ_YesorNoQuestion40");
		return property;

	}

	public String MCQ_YesorNoQuestion40_Options() {

		String property = proper.getProperty("MCQ_YesorNoQuestion40_Options");
		return property;

	}

	public String Dropdown_YesorNoQuestion40() {

		String property = proper.getProperty("Dropdown_YesorNoQuestion40");
		return property;

	}

	public String Dropdown_YesorNoQuestion40_Options() {

		String property = proper.getProperty("Dropdown_YesorNoQuestion40_Options");
		return property;

	}

	public String Freetext_YesorNoQuestion40() {

		String property = proper.getProperty("Freetext_YesorNoQuestion40");
		return property;

	}

	public String YesorNoQuestion41() {

		String property = proper.getProperty("YesorNoQuestion41");
		return property;

	}

	public String YesorNoQuestion41_supportingtext() {

		String property = proper.getProperty("YesorNoQuestion41_supportingtext");
		return property;

	}

	public String Freetext1_YesorNoQuestion41() {

		String property = proper.getProperty("Freetext1_YesorNoQuestion41");
		return property;

	}

	public String YesorNo1_YesorNoQuestion41() {

		String property = proper.getProperty("YesorNo1_YesorNoQuestion41");
		return property;

	}

	public String YesorNo2_YesorNoQuestion41() {

		String property = proper.getProperty("YesorNo2_YesorNoQuestion41");
		return property;

	}

	public String YesorNo3_YesorNoQuestion41() {

		String property = proper.getProperty("YesorNo3_YesorNoQuestion41");
		return property;

	}

	public String Freetext_YesorNo3_YesorNoQuestion41() {

		String property = proper.getProperty("Freetext_YesorNo3_YesorNoQuestion41");
		return property;

	}

	public String Freetext2_YesorNoQuestion41() {

		String property = proper.getProperty("Freetext2_YesorNoQuestion41");
		return property;

	}

	public String Freetext3_YesorNoQuestion41() {

		String property = proper.getProperty("Freetext3_YesorNoQuestion41");
		return property;

	}

	public String YesorNoQuestion42() {

		String property = proper.getProperty("YesorNoQuestion42");
		return property;

	}

	public String Freetext1_YesorNoQuestion42() {

		String property = proper.getProperty("Freetext1_YesorNoQuestion42");
		return property;

	}

	public String YesorNo1_YesorNoQuestion42() {

		String property = proper.getProperty("YesorNo1_YesorNoQuestion42");
		return property;

	}

	public String YesorNo2_YesorNoQuestion42() {

		String property = proper.getProperty("YesorNo2_YesorNoQuestion42");
		return property;

	}

	public String Freetext_YesorNo2_YesorNoQuestion42() {

		String property = proper.getProperty("Freetext_YesorNo2_YesorNoQuestion42");
		return property;

	}

	public String Freetext2_YesorNoQuestion42() {

		String property = proper.getProperty("Freetext2_YesorNoQuestion42");
		return property;

	}

	public String Freetext3_YesorNoQuestion42() {

		String property = proper.getProperty("Freetext3_YesorNoQuestion42");
		return property;

	}

	public String YesorNoQuestion43() {

		String property = proper.getProperty("YesorNoQuestion43");
		return property;

	}

	public String Numberinput_YesorNoQuestion43() {

		String property = proper.getProperty("Numberinput_YesorNoQuestion43");
		return property;

	}

	public String YesorNoQuestion44() {

		String property = proper.getProperty("YesorNoQuestion44");
		return property;

	}

	public String YesorNoQuestion44_supportingtext() {

		String property = proper.getProperty("YesorNoQuestion44_supportingtext");
		return property;

	}

	public String Freetext_YesorNoQuestion44() {

		String property = proper.getProperty("Freetext_YesorNoQuestion44");
		return property;

	}

	public String YesorNo_YesorNoQuestion44() {

		String property = proper.getProperty("YesorNo_YesorNoQuestion44");
		return property;

	}

	public String YesorNo_YesorNoQuestion44_supportingtext() {

		String property = proper.getProperty("YesorNo_YesorNoQuestion44_supportingtext");
		return property;

	}

	public String Dropdown_Question3() {

		String property = proper.getProperty("Dropdown_Question3");
		return property;

	}

	public String Dropdown_options() {

		String property = proper.getProperty("Dropdown_options");
		return property;

	}

	public String YesorNo1_Dropdown_option1() {

		String property = proper.getProperty("YesorNo1_Dropdown_option1");
		return property;

	}

	public String Freetext_YesorNo_Dropdown_option1() {

		String property = proper.getProperty("Freetext_YesorNo_Dropdown_option1");
		return property;

	}

	public String YesorNo2_Dropdown_option1() {

		String property = proper.getProperty("YesorNo2_Dropdown_option1");
		return property;

	}

	public String Freetext_YesorNo2_Dropdown_option1() {

		String property = proper.getProperty("Freetext_YesorNo2_Dropdown_option1");
		return property;

	}

	public String Freetext_Dropdown_option2() {

		String property = proper.getProperty("Freetext_Dropdown_option2");
		return property;

	}

	public String YesorNoQuestion45() {

		String property = proper.getProperty("YesorNoQuestion45");
		return property;

	}

	public String Freetext_YesorNoQuestion45() {

		String property = proper.getProperty("Freetext_YesorNoQuestion45");
		return property;

	}

	public String Freetextquestion() {

		String property = proper.getProperty("Freetextquestion");
		return property;

	}

	public String YesorNoQuestion46() {

		String property = proper.getProperty("YesorNoQuestion46");
		return property;

	}

	public String Freetext_YesorNoQuestion46() {

		String property = proper.getProperty("Freetext_YesorNoQuestion46");
		return property;

	}

	public String Freetextquestion1() {

		String property = proper.getProperty("Freetextquestion1");
		return property;

	}

	public String Closing_Statement() {

		String property = proper.getProperty("Closing_Statement");
		return property;

	}

	public String getQuestionnaireName1() {

		String property = proper.getProperty("QuestionnaireName1");
		return property;
	}

	public String getInternalquestionnairename1() {

		String property = proper.getProperty("Internalquestionnairename1");
		return property;
	}

	public String getQuestionnaireName2() {

		String property = proper.getProperty("QuestionnaireName2");
		return property;
	}

	public String getInternalquestionnairename2() {

		String property = proper.getProperty("Internalquestionnairename2");
		return property;
	}

	public String getMultiplechoicequestion() {

		String property = proper.getProperty("Multiplechoicequestion");
		return property;
	}

	public String getMultiplechoicequestion_Options() {

		String property = proper.getProperty("Multiplechoicequestion_Options");
		return property;
	}

	public String getYesnotypequestion() {

		String property = proper.getProperty("Yes/notypequestion");
		return property;
	}

	public String getfreetext_Yesnotypequestion() {

		String property = proper.getProperty("freetext_Yes/notypequestion");
		return property;
	}

	public String getfreetexttypequestion() {

		String property = proper.getProperty("freetexttypequestion");
		return property;
	}

	public String getDateinputtypequestion() {

		String property = proper.getProperty("Dateinputtypequestion");
		return property;
	}

	public String getNumberinputtypequestion() {

		String property = proper.getProperty("Numberinputtypequestion");
		return property;
	}

	public String getDropdowntypequestion() {

		String property = proper.getProperty("Dropdowntypequestion");
		return property;
	}

	public String getDropdowntypequestion_Options() {

		String property = proper.getProperty("Dropdowntypequestion_Options");
		return property;
	}

	public String getSectiontypequestion() {

		String property = proper.getProperty("Sectiontypequestion");
		return property;
	}

	public String getfreetext_Lengthycontent() {

		String property = proper.getProperty("freetext_Lengthycontent");
		return property;
	}

	public String getMultiplechoicequestion1() {

		String property = proper.getProperty("Multiplechoicequestion1");
		return property;
	}

	public String getMultiplechoicequestion_Options1() {

		String property = proper.getProperty("Multiplechoicequestion_Options1");
		return property;
	}

	public String getYesnotypequestion1() {

		String property = proper.getProperty("Yes/notypequestion1");
		return property;

	}

	public String getfreetext_Yesnotypequestion1() {

		String property = proper.getProperty("freetext_Yes/notypequestion1");
		return property;
	}

	public String getYesnotypequestion2() {

		String property = proper.getProperty("Yes/notypequestion2");
		return property;
	}

	public String getDropdowntypequestion1() {

		String property = proper.getProperty("Dropdowntypequestion1");
		return property;
	}

	public String getDropdowntypequestion1_Options() {

		String property = proper.getProperty("Dropdowntypequestion1_Options");
		return property;
	}

	public String getfreetext_Dropdowntypequestion1_Options() {

		String property = proper.getProperty("freetext_Dropdowntypequestion1_Options");
		return property;
	}

	public String getDateinputtypequestion1() {

		String property = proper.getProperty("Dateinputtypequestion1");
		return property;
	}

	public String getMultiplechoicequestion2() {

		String property = proper.getProperty("Multiplechoicequestion2");
		return property;
	}

	public String getMultiplechoicequestion2_Options() {

		String property = proper.getProperty("Multiplechoicequestion2_Options");
		return property;
	}

	public String getYesNo1_Yesnotypequestion() {

		String property = proper.getProperty("Yes/No1_Yes/notypequestion");
		return property;
	}

	public String getDropdown_Yesnotypequestion() {

		String property = proper.getProperty("Dropdown_Yes/notypequestion");
		return property;
	}

	public String getDropdown_Yesnotypequestion_Options() {

		String property = proper.getProperty("Dropdown_Yes/notypequestion_Options");
		return property;
	}

	public String getYesNo2_Yesnotypequestion() {

		String property = proper.getProperty("Yes/No2_Yes/notypequestion");
		return property;
	}

	public String getDropdown1_Yesnotypequestion() {

		String property = proper.getProperty("Dropdown1_Yes/notypequestion");
		return property;
	}

	public String getDropdown1_Yesnotypequestion_Options() {

		String property = proper.getProperty("Dropdown1_Yes/notypequestion_Options");
		return property;
	}

	public String getFreetext_Yesnotypequestion() {

		String property = proper.getProperty("Freetext_Yes/notypequestion");
		return property;
	}

	public String geturl() {

		String property = proper.getProperty("url");
		return property;

	}

	public String getemail() {

		String property = proper.getProperty("email");
		return property;

	}

	public String getpassword() {

		String property = proper.getProperty("password");
		return property;

	}

	public String getdisplayname() {

		String property = proper.getProperty("displayname");
		return property;

	}

	public String getinternalques() {

		String property = proper.getProperty("internalques");
		return property;

	}

	public String getESTtime() {

		String property = proper.getProperty("ESTtime");
		return property;

	}

	public String getmultichoice() {

		String property = proper.getProperty("multichoice");
		return property;

	}

	public String getsupporttext() {

		String property = proper.getProperty("supporttext");
		return property;

	}

	public String getoption1() {

		String property = proper.getProperty("option1");
		return property;

	}

	public String getoption2() {

		String property = proper.getProperty("option2");
		return property;

	}

	public String getfreetext() {

		String property = proper.getProperty("freetext");
		return property;

	}

	public String getyesorno() {

		String property = proper.getProperty("yesorno");
		return property;

	}

	public String getdateinput() {

		String property = proper.getProperty("dateinput");
		return property;

	}

	public String getnumberinput() {

		String property = proper.getProperty("numberinput");
		return property;

	}

	public String getgreater() {

		String property = proper.getProperty("greater");
		return property;

	}

	public String getlesser() {

		String property = proper.getProperty("lesser");
		return property;

	}

	public String getrange() {

		String property = proper.getProperty("range");
		return property;

	}

	public String getdropdown() {

		String property = proper.getProperty("dropdown");
		return property;

	}

	public String getdrop1() {

		String property = proper.getProperty("drop1");
		return property;

	}

	public String getdrop2() {

		String property = proper.getProperty("drop2");
		return property;

	}

	public String getsection() {

		String property = proper.getProperty("section");
		return property;

	}

	public String getopening() {

		String property = proper.getProperty("opening");
		return property;

	}

	public String getclosing() {

		String property = proper.getProperty("closing");
		return property;

	}

	public String getweeks() {

		String property = proper.getProperty("weeks");
		return property;

	}

	public String getdays() {

		String property = proper.getProperty("days");
		return property;

	}

	public String getyears() {

		String property = proper.getProperty("years");
		return property;

	}

	public String getabovebmi() {

		String property = proper.getProperty("abovebmi");
		return property;

	}

	public String getbelowbmi() {

		String property = proper.getProperty("belowbmi");
		return property;

	}

	public String getURL1() {

		String property = proper.getProperty("URL");
		return property;

	}

	public String getEmailad() {

		String property = proper.getProperty("Emailad");
		return property;

	}

	public String getPasswordad() {

		String property = proper.getProperty("Passwordad");
		return property;

	}

	public String getPostcode() {

		String property = proper.getProperty("Postcode");
		return property;

	}

	public String getFirstname() {

		String property = proper.getProperty("Firstname");
		return property;

	}

	public String getLastname() {

		String property = proper.getProperty("Lastname");
		return property;

	}

	public String getemail1() {

		String property = proper.getProperty("email1");
		return property;

	}

	public String getHouseno() {

		String property = proper.getProperty("Houseno");
		return property;

	}

	public String getStreet() {

		String property = proper.getProperty("Street");
		return property;

	}

	public String getCity() {

		String property = proper.getProperty("City");
		return property;

	}

	public String getPincode() {

		String property = proper.getProperty("Pincode");
		return property;

	}

	public String getMobileno() {

		String property = proper.getProperty("Mobileno");
		return property;

	}

	public String getPwd() {

		String property = proper.getProperty("Pwd");
		return property;

	}

	public String getConfirmpwd() {

		String property = proper.getProperty("Confirmpwd");
		return property;

	}

	public String getEnterpin() {

		String property = proper.getProperty("Enterpin");
		return property;

	}

	public String getConfirmpin() {

		String property = proper.getProperty("Confirmpin");
		return property;

	}

	public String getEmail2() {

		String property = proper.getProperty("Email2");
		return property;

	}

	public String getPassword2() {

		String property = proper.getProperty("Password2");
		return property;

	}

	public String getMemorable() {

		String property = proper.getProperty("Memorable");
		return property;

	}

	public String getDay() {

		String property = proper.getProperty("Day");
		return property;

	}

	public String getMonth() {

		String property = proper.getProperty("Month");
		return property;

	}

	public String getYear() {

		String property = proper.getProperty("Year");
		return property;

	}

	public String getEntertext() {

		String property = proper.getProperty("Entertext");
		return property;

	}

	public String getLocalenter() {

		String property = proper.getProperty("Localenter");
		return property;

	}

	public String getFlatno() {

		String property = proper.getProperty("Flatno");
		return property;

	}

	public String getStreets() {

		String property = proper.getProperty("Streets");
		return property;

	}

	public String getCities() {

		String property = proper.getProperty("Cities");
		return property;

	}

	public String getPostcodes() {

		String property = proper.getProperty("Postcodes");
		return property;

	}

	public String geturl1() {

		String property = proper.getProperty("url1");
		return property;

	}

	public String getedit() {

		String property = proper.getProperty("edit");
		return property;

	}

	public String getedit1() {

		String property = proper.getProperty("edit1");
		return property;

	}

	public String getVasemail() {

		String property = proper.getProperty("Vasemail");
		return property;

	}

	public String getVaspass() {

		String property = proper.getProperty("Vaspass");
		return property;

	}

	public String getVasword() {

		String property = proper.getProperty("Vasword");
		return property;

	}

	public String getNHSno() {

		String property = proper.getProperty("NHSno");
		return property;

	}

	public String getVasubrn() {

		String property = proper.getProperty("Vasubrn");
		return property;

	}

	public String getVascode() {

		String property = proper.getProperty("Vascode");
		return property;

	}

	public String getLarcemail() {

		String property = proper.getProperty("Larcemail");
		return property;

	}

	public String getLarcpass() {

		String property = proper.getProperty("Larcpass");
		return property;

	}

	public String getLarccode() {

		String property = proper.getProperty("Larccode");
		return property;

	}

	public String getadurl() {

		String property = proper.getProperty("adurl");
		return property;

	}

	public String getFindubrn() {

		String property = proper.getProperty("Findubrn");
		return property;

	}

	public String getLarcphone() {

		String property = proper.getProperty("Larcphone");
		return property;

	}

	public String getinfoname() {

		String property = proper.getProperty("infoname");
		return property;

	}

	public String getinfocode() {

		String property = proper.getProperty("infocode");
		return property;

	}

	public String getEntermemo() {

		String property = proper.getProperty("Entermemo");
		return property;

	}

	public String getConfimemo() {

		String property = proper.getProperty("Confimemo");
		return property;

	}

	public String getEnterpass() {

		String property = proper.getProperty("Enterpass");
		return property;

	}

	public String getConfipass() {

		String property = proper.getProperty("Confipass");
		return property;

	}

	public String getuserpass() {

		String property = proper.getProperty("userpass");
		return property;

	}

	public String getusermemo() {

		String property = proper.getProperty("usermemo");
		return property;

	}

	public String getpass() {

		String property = proper.getProperty("pass");
		return property;

	}

	public String getconpass() {

		String property = proper.getProperty("conpass");
		return property;

	}

	public String getmemo() {

		String property = proper.getProperty("memo");
		return property;

	}

	public String getconmemo() {

		String property = proper.getProperty("conmemo");
		return property;

	}

	public String getuserurl() {

		String property = proper.getProperty("userurl");
		return property;

	}

	public String getuseremail() {

		String property = proper.getProperty("useremail");
		return property;

	}

	// ramcode need to analyse

	public String getuserno() {

		String property = proper.getProperty("userno");
		return property;

	}

	public String getserviceuserurl() {

		String property = proper.getProperty("serviceuserurl");
		return property;

	}

	public String getserviceuseremail() {

		String property = proper.getProperty("serviceuseremail");
		return property;

	}

	public String getserviceuserpassword() {

		String property = proper.getProperty("serviceuserpassword");
		return property;

	}

	public String getserviceuserpin() {

		String property = proper.getProperty("serviceuserpin");
		return property;

	}

	public String getserviceuserDOB() {

		String property = proper.getProperty("serviceuserDOB");
		return property;

	}

	public String getallclientsearch() {

		String property = proper.getProperty("Allclientsearch");
		return property;

	}

	public String getEditname() {

		String property = proper.getProperty("Editname");
		return property;

	}

	public String getEdittext() {

		String property = proper.getProperty("Edittext");
		return property;

	}

	// makeshcodeneed to verify

	public String getestimatedcompletionTime() {

		String property = proper.getProperty("EstimatedCompletionTime");
		return property;

	}

	public String getMultiplechoiceQuestion() {

		String property = proper.getProperty("Multiplechoicequestion");
		return property;
	}

	public String getFreetextquestion() {

		String property = proper.getProperty("Freetextquestion");
		return property;
	}

	public String getReset_Questionnaire_Name() {

		String property = proper.getProperty("Reset_Questionnaire_Name");
		return property;
	}

	public String getReset_Internalquestionnaire_Name() {

		String property = proper.getProperty("Reset_Internalquestionnaire_Name");
		return property;
	}
}
