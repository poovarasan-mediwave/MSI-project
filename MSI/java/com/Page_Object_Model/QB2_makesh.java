package com.Page_Object_Model;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class QB2_makesh extends Base_Class {

	public QB2_makesh() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/external-azure-login']")
	private WebElement stafflogin_Button;

	@FindBy(xpath = "//input[@id='i0116']")
	private WebElement externalemail;

	@FindBy(xpath = "//input[@id='idSIButton9']")
	private WebElement externalNext;

	@FindBy(xpath = "//input[@id='i0118']")
	private WebElement externalPassword;

	@FindBy(xpath = "//a[@href='/questionnaires/form']")
	private WebElement formsquestionnaire;

	@FindBy(xpath = "//button[@class='btn primary-btn']")
	private WebElement createNew_button;

	@FindBy(xpath = "//input[@name='name']")
	private WebElement questionnaire_Name;

	@FindBy(xpath = "//input[@name='version']")
	private WebElement internalQuestionnaire_name;

	@FindBy(xpath = "//div[@id='react-select-6-placeholder']")
	private WebElement questionnaire_Type;

	@FindBy(xpath = "//div[@id='react-select-6-option-0']")
	private WebElement demographic_Type;

	@FindBy(xpath = "//div[@id='react-select-6-option-1']")
	private WebElement medical_history_Type;

	@FindBy(xpath = "//div[@id='react-select-6-option-2']")
	private WebElement eligibility_Type;

	@FindBy(xpath = "//div[@id='react-select-6-option-3']")
	private WebElement consultation_Type;

	@FindBy(xpath = "//div[@id='react-select-6-option-4']")
	private WebElement counselling_Type;

	@FindBy(xpath = "//div[@id='react-select-7-placeholder']")
	private WebElement services;

	@FindBy(xpath = "//div[@id='react-select-7-option-0']")
	private WebElement tOP_services;

	@FindBy(xpath = "//div[@id='react-select-7-option-1']")
	private WebElement vAS_services;

	@FindBy(xpath = "//div[@id='react-select-7-option-2']")
	private WebElement lARC_services;

	@FindBy(xpath = "//div[@class=' css-19bb58m']")
	private WebElement add_Tags;

//	@FindBy(xpath = "//input[@class='text-field w-100']")
//	private WebElement estimatedcompletion_Time;

	@FindBy(xpath = "(//button[@class='btn primary-btn'])[2]")
	private WebElement next_Button;

	@FindBy(xpath = "//p[normalize-space()='Multiple choice question']/parent::span[@class='onkeyup']")
	private WebElement multiplechoice_Question;

	@FindBy(xpath = "//p[normalize-space()='Free text input question']/parent::span[@class='onkeyup']")
	private WebElement freetext_Question;

	@FindBy(xpath = "//p[normalize-space()='Yes/No question']/parent::span[@class='onkeyup']")
	private WebElement yesorNo_Question;

	@FindBy(xpath = "//p[normalize-space()='Date input question']/parent::span[@class='onkeyup']")
	private WebElement dateinput_Question;

	@FindBy(xpath = "//p[normalize-space()='Number input question']/parent::span[@class='onkeyup']")
	private WebElement numberinput_Question;

	@FindBy(xpath = "//p[normalize-space()='Dropdown']/parent::span[@class='onkeyup']")
	private WebElement dropDown_Question;

	@FindBy(xpath = "//p[normalize-space()='Section']/parent::span[@class='onkeyup']")
	private WebElement section_Question;

	@FindBy(xpath = "//p[normalize-space()='Opening statement']/parent::span[@class='onkeyup']")
	private WebElement openstatement_Question;

	@FindBy(xpath = "//p[normalize-space()='Closing statement']/parent::span[@class='onkeyup']")
	private WebElement closestatement_Question;

	@FindBy(xpath = "//p[normalize-space()='Conditional segment']/parent::span[@class='onkeyup']")
	private WebElement conditionalsegment_Question;

	@FindBy(xpath = "//div[@class='qb-menu-active false']")
	private WebElement multiplechoice_MarkasOptional;

	@FindBy(xpath = "(//div[@class='question-menu-block qb-menu-active false']//div[@class='align'])[1]")
	private WebElement conditional;

	@FindBy(xpath = "(//div[@class='question-menu-block qb-menu-active false']//div[@class='align'])[2]")
	private WebElement triggers;

	@FindBy(xpath = "//textarea[@name='notes']")
	private WebElement multiplequestion_textarea;

	@FindBy(xpath = "//input[@name='role']")
	private WebElement supporting_Text;

//	@FindBy(xpath = "(//input[@name='Dropdown'])[1]")
//	private WebElement multiplequestion_Options1;
//	
//	@FindBy(xpath = "(//input[@name='Dropdown'])[2]")
//	private WebElement multiplequestion_Options2;
//	
//	@FindBy(xpath = "(//input[@name='Dropdown'])[3]")
//	private WebElement multiplequestion_Options3;
//	
//	@FindBy(xpath = "(//input[@name='Dropdown'])[4]")
//	private WebElement multiplequestion_Options4;
//	
//	@FindBy(xpath = "(//input[@name='Dropdown'])[5]")
//	private WebElement multiplequestion_Options5;
//	
//	@FindBy(xpath = "(//input[@name='Dropdown'])[6]")
//	private WebElement multiplequestion_Options6;
//	
//	@FindBy(xpath = "(//input[@name='Dropdown'])[7]")
//	private WebElement multiplequestion_Options7;
//	
//	@FindBy(xpath = "(//input[@name='Dropdown'])[8]")
//	private WebElement multiplequestion_Options8;
//	
//	@FindBy(xpath = "(//input[@name='Dropdown'])[9]")
//	private WebElement multiplequestion_Options9;
//	
//	@FindBy(xpath = "(//input[@name='Dropdown'])[10]")
//	private List<WebElement> multiplequestion_Options10;

	@FindBy(xpath = "//button[@class='btn option-link']")
	private WebElement addOptions;

	@FindBy(xpath = "//div[@class='add-question-block']//div[@class='qbcol']")
	private List<WebElement> multiplechoice_Options;

	@FindBy(xpath = "//button[normalize-space()='Add conditional questions']")
	private List<WebElement> multiplechoice_addConditional;

	@FindBy(xpath = "//button[@class='btn primary-btn']")
	private WebElement savedraft;

	@FindBy(xpath = "//span[@id='clinician_preview']")
	private WebElement previewQuestionnaire;

	@FindBy(xpath = "//button[@id='clinician_submit_for_approval']")
	private WebElement submitforApproval;

	@FindBy(xpath = "//button[@class='backarrow']")
	private WebElement backoption;

	@FindBy(xpath = "//button[@class='btn primary-btn'][normalize-space()='Continue Editing']")
	private WebElement continue_Editing;

	@FindBy(xpath = "//button[@class='btn primary-btn'][normalize-space()='BACK TO DASHBOARD']")
	private WebElement backtoDashboard;

	@FindBy(xpath = "//textarea[@name='Rating']")
	private WebElement freetext_Textarea;

	@FindBy(xpath = "//textarea[@name='YesNo']")
	private WebElement yesorNoquestion_Textarea;

	public WebElement getStafflogin_Button() {
		return stafflogin_Button;
	}

	public WebElement getExternalemail() {
		return externalemail;
	}

	public WebElement getExternalNext() {
		return externalNext;
	}

	public WebElement getExternalPassword() {
		return externalPassword;
	}

	public WebElement getFormsquestionnaire() {
		return formsquestionnaire;
	}

	public WebElement getCreateNew_button() {
		return createNew_button;
	}

	public WebElement getQuestionnaire_Name() {
		return questionnaire_Name;
	}

	public WebElement getInternalQuestionnaire_name() {
		return internalQuestionnaire_name;
	}

	public WebElement getQuestionnaire_Type() {
		return questionnaire_Type;
	}

	public WebElement getDemographic_Type() {
		return demographic_Type;
	}

	public WebElement getMedical_history_Type() {
		return medical_history_Type;
	}

	public WebElement getEligibility_Type() {
		return eligibility_Type;
	}

	public WebElement getConsultation_Type() {
		return consultation_Type;
	}

	public WebElement getCounselling_Type() {
		return counselling_Type;
	}

	public WebElement getServices() {
		return services;
	}

	public WebElement gettOP_services() {
		return tOP_services;
	}

	public WebElement getvAS_services() {
		return vAS_services;
	}

	public WebElement getlARC_services() {
		return lARC_services;
	}

	public WebElement getAdd_Tags() {
		return add_Tags;
	}

//	public WebElement getEstimatedcompletion_Time() {
//		return estimatedcompletion_Time;
//	}

	public WebElement getNext_Button() {
		return next_Button;
	}

	public WebElement getMultiplechoice_Question() {
		return multiplechoice_Question;
	}

	public WebElement getFreetext_Question() {
		return freetext_Question;
	}

	public WebElement getYesorNo_Question() {
		return yesorNo_Question;
	}

	public WebElement getDateinput_Question() {
		return dateinput_Question;
	}

	public WebElement getNumberinput_Question() {
		return numberinput_Question;
	}

	public WebElement getDropDown_Question() {
		return dropDown_Question;
	}

	public WebElement getSection_Question() {
		return section_Question;
	}

	public WebElement getOpenstatement_Question() {
		return openstatement_Question;
	}

	public WebElement getClosestatement_Question() {
		return closestatement_Question;
	}

	public WebElement getConditionalsegment_Question() {
		return conditionalsegment_Question;
	}

	public WebElement getMultiplechoice_MarkasOptional() {
		return multiplechoice_MarkasOptional;
	}

	public WebElement getConditional() {
		return conditional;
	}

	public WebElement getTriggers() {
		return triggers;
	}

	public WebElement getMultiplequestion_textarea() {
		return multiplequestion_textarea;
	}

	public WebElement getSupporting_Text() {
		return supporting_Text;
	}

	public WebElement getAddOptions() {
		return addOptions;
	}

	public List<WebElement> getMultiplechoice_Options() {
		return multiplechoice_Options;
	}

	public List<WebElement> getMultiplechoice_addConditional() {
		return multiplechoice_addConditional;
	}

	public WebElement getSavedraft() {
		return savedraft;
	}

	public WebElement getPreviewQuestionnaire() {
		return previewQuestionnaire;
	}

	public WebElement getSubmitforApproval() {
		return submitforApproval;
	}

	public WebElement getBackoption() {
		return backoption;
	}

	public WebElement getContinue_Editing() {
		return continue_Editing;
	}

	public WebElement getBacktoDashboard() {
		return backtoDashboard;
	}

	public WebElement getFreetext_Textarea() {
		return freetext_Textarea;
	}

	public WebElement getYesorNoquestion_Textarea() {
		return yesorNoquestion_Textarea;
	}
}
