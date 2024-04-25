package com.Page_Object_Model;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class QB extends Base_Class {

	public QB() {

		PageFactory.initElements(driver, this);
	}

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

	@FindBy(xpath = "//div[@id='react-select-7-placeholder']")
	private WebElement services;

	@FindBy(xpath = "(//button[@class='btn primary-btn'])[2]")
	private WebElement next_Button;

	@FindBy(xpath = "//div[@class='custom-btn']")
	private WebElement selectquestion_Type;

	@FindBy(xpath = "//div[@class='qb-type-section']/descendant::div[@class='input-group']/label")
	private WebElement questionHeading;

	public WebElement getQuestionHeading() {
		return questionHeading;
	}

	@FindBy(xpath = "//div[@class='react-select__menu-list css-qr46ko']/div")
	private List<WebElement> select_QuestionnaireType;

	@FindBy(xpath = "//div[@class='react-select__menu-list css-qr46ko']/div")
	private List<WebElement> select_Service;

	@FindBy(xpath = "//div[@class='custom-dropdown-list active']/span")
	private List<WebElement> select_DifferentTypesofQuestion;

	@FindBy(xpath = "//div[@class='qb-menu-active false']")
	private WebElement multiplechoice_MarkasOptional;

	@FindBy(xpath = "(//div[@class='question-menu-block qb-menu-active false']//div[@class='align'])[1]")
	private WebElement conditional;

	@FindBy(xpath = "(//div[@class='question-menu-block qb-menu-active false']//div[@class='align'])[2]")
	private WebElement triggers;

	@FindBy(xpath = "//input[@placeholder='Triggers']")
	private List<WebElement> trigger_Selection;

	@FindBy(xpath = "//div[@class='qb-type-section']/div/div/div[2]/div[2]/input")
	private WebElement supporting_Textarea;

	@FindBy(xpath = "//button[@class='btn option-link'][normalize-space()='+ Add option']")
	private WebElement addOptions;

	@FindBy(xpath = "//div[@class='add-question-block']//div[@class='qbcol']//div[@class='relative']/input")
	private List<WebElement> options_Textarea;

	@FindBy(xpath = "//button[normalize-space()='Add conditional questions']")
	private List<WebElement> addConditional_Questions;

	@FindBy(xpath = "//div[@contenteditable='true'][@data-placeholder='Statement here']")
	private WebElement openingstatementquestion_textarea;

	@FindBy(xpath = "//div[@contenteditable='true'][@data-placeholder='Statement here']")
	private WebElement closestatementquestion_textarea;

	@FindBy(xpath = "//button[@class='btn primary-btn']")
	private WebElement savedraft;

	@FindBy(xpath = "//span[@id='clinician_preview']")
	private WebElement previewQuestionnaire;

	@FindBy(xpath = "//div[@id='popup_focus']")
	private WebElement previewQuestionnaire_close;

	@FindBy(xpath = "//button[@id='clinician_submit_for_approval']")
	private WebElement submitforApproval;

	@FindBy(xpath = "//button[@class='backarrow']")
	private WebElement backoption;

	@FindBy(xpath = "//button[@class='btn primary-btn'][normalize-space()='Continue Editing']")
	private WebElement continue_Editing;

	@FindBy(xpath = "//button[@class='btn primary-btn'][normalize-space()='Back To Questionnaires']")
	private WebElement backtoQuestionnaires;

	@FindBy(xpath = "//div[@class='qb-type-section']/div/div/div/div/textarea")
	private WebElement question_Textarea;

	@FindBy(xpath = "//div[@class='popup-body']/section/div/form/div/div/label/span")
	private List<WebElement> preview_firstoption;

	@FindBy(xpath = "//p[normalize-space()='Conditional segment']/parent::span[@class='onkeyup']")
	private WebElement cnditionalSegementQuestion;

	@FindBy(xpath = "//div[@id='react-select-8-placeholder']")
	private WebElement cnditionalSegementQuestion_selectfield;

	@FindBy(xpath = "//div[@id='react-select-8-option-0']")
	private WebElement gestationfield;

	@FindBy(xpath = "//div[@id='react-select-8-option-1']")
	private WebElement dobfield;

	@FindBy(xpath = "//div[@id='react-select-8-option-2']")
	private WebElement bMIfield;

	@FindBy(xpath = "//div[@id='react-select-9-placeholder']")
	private WebElement cnditionalSegementQuestion_selectcondition;

	@FindBy(xpath = "//div[@id='react-select-9-option-0']")
	private WebElement above_condition;

	@FindBy(xpath = "//div[@id='react-select-9-option-1']")
	private WebElement below_condition;

	@FindBy(xpath = "//input[@class='inputnor select-none !outline-none w-8 h-8']")
	private WebElement dob_inputfield;

	@FindBy(xpath = "(//input[@class='inputnor select-none !outline-none w-8 h-8'])[1]")
	private WebElement gestationinputfield_weeks;

	@FindBy(xpath = "(//input[@class='inputnor select-none !outline-none w-8 h-8'])[2]")
	private WebElement gestationinputfield_days;

	@FindBy(xpath = "//button[normalize-space()='Add conditional questions']")
	private WebElement conditionalsegment_addconditional;

	@FindBy(xpath = "(//button[normalize-space()='Add conditional questions'])[1]")
	private WebElement bMI_addconditionaloptionAbove;

	@FindBy(xpath = "(//button[normalize-space()='Add conditional questions'])[2]")
	private WebElement bMI_addconditionaloptionBelow;

	@FindBy(xpath = "//div[@class='question-menu-block false false']/div[@class='w-full']/div[@class='question-menu-info focusto']")
	private List<WebElement> randomlyclickthequestions;

	@FindBy(xpath = "//div[@class='trigger-section']//div[@class='input-group undefined']/following-sibling::ul/li/ul/li[@aria-hidden='true']")
	private List<WebElement> rightcaretelemedicine_options;

	@FindBy(xpath = "//div[@class='trigger-section']//div[@class='input-group undefined']/following-sibling::ul/li")
	private List<WebElement> trigger_Options;

	@FindBy(xpath = "(//div[@class='qb-add-section']/section/div/div/div[@class='drag-block']/div/span)[1]")
	private WebElement drag_Options;

	@FindBy(xpath = "(//div[@class='qb-add-section']/section/div/div/div[@class='drag-block']/div/span)[5]")
	private WebElement drop_Options;

	@FindBy(xpath = "//div[@class='question-menu-block false false'][1]/div/following-sibling::div/div")
	private WebElement uniqueclick;

	@FindBy(xpath = "//p[normalize-space()='Update the missing fields']")
	private WebElement savedraft_errormessage;

	@FindBy(xpath = "//div[@class='qb-card-group']/div/div[@class='card-footer']/div[@class='mini-link-set']/a")
	private List<WebElement> edit_Options;

	public List<WebElement> getEdit_Options() {
		return edit_Options;
	}

	@FindBy(xpath = "//h1[normalize-space()='Forms & Questionnaires']")
	private WebElement formsquestionnairepage;

	public WebElement getFormsquestionnairepage() {
		return formsquestionnairepage;
	}

	public WebElement getSavedraft_errormessage() {
		return savedraft_errormessage;
	}

	public WebElement getUniqueclick() {
		return uniqueclick;
	}

	public WebElement getDrag_Options() {
		return drag_Options;
	}

	public WebElement getDrop_Options() {
		return drop_Options;
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

	public WebElement getServices() {
		return services;
	}

	public WebElement getNext_Button() {
		return next_Button;
	}

	public WebElement getSelectquestion_Type() {
		return selectquestion_Type;
	}

	public List<WebElement> getSelect_QuestionnaireType() {
		return select_QuestionnaireType;
	}

	public List<WebElement> getSelect_Service() {
		return select_Service;
	}

	public List<WebElement> getSelect_DifferentTypesofQuestion() {
		return select_DifferentTypesofQuestion;
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

	public List<WebElement> getTrigger_Selection() {
		return trigger_Selection;
	}

	public WebElement getSupporting_Textarea() {
		return supporting_Textarea;
	}

	public WebElement getAddOptions() {
		return addOptions;
	}

	public List<WebElement> getOptions_Textarea() {
		return options_Textarea;
	}

	public List<WebElement> getAddConditional_Questions() {
		return addConditional_Questions;
	}

	public WebElement getOpeningstatementquestion_textarea() {
		return openingstatementquestion_textarea;
	}

	public WebElement getClosestatementquestion_textarea() {
		return closestatementquestion_textarea;
	}

	public WebElement getSavedraft() {
		return savedraft;
	}

	public WebElement getPreviewQuestionnaire() {
		return previewQuestionnaire;
	}

	public WebElement getPreviewQuestionnaire_close() {
		return previewQuestionnaire_close;
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

	public WebElement getBacktoQuestionnaires() {
		return backtoQuestionnaires;
	}

	public WebElement getQuestion_Textarea() {
		return question_Textarea;
	}

	public List<WebElement> getPreview_firstoption() {
		return preview_firstoption;
	}

	public WebElement getCnditionalSegementQuestion() {
		return cnditionalSegementQuestion;
	}

	public WebElement getCnditionalSegementQuestion_selectfield() {
		return cnditionalSegementQuestion_selectfield;
	}

	public WebElement getGestationfield() {
		return gestationfield;
	}

	public WebElement getDobfield() {
		return dobfield;
	}

	public WebElement getbMIfield() {
		return bMIfield;
	}

	public WebElement getCnditionalSegementQuestion_selectcondition() {
		return cnditionalSegementQuestion_selectcondition;
	}

	public WebElement getAbove_condition() {
		return above_condition;
	}

	public WebElement getBelow_condition() {
		return below_condition;
	}

	public WebElement getDob_inputfield() {
		return dob_inputfield;
	}

	public WebElement getGestationinputfield_weeks() {
		return gestationinputfield_weeks;
	}

	public WebElement getGestationinputfield_days() {
		return gestationinputfield_days;
	}

	public WebElement getConditionalsegment_addconditional() {
		return conditionalsegment_addconditional;
	}

	public WebElement getbMI_addconditionaloptionAbove() {
		return bMI_addconditionaloptionAbove;
	}

	public WebElement getbMI_addconditionaloptionBelow() {
		return bMI_addconditionaloptionBelow;
	}

	public List<WebElement> getRandomlyclickthequestions() {
		return randomlyclickthequestions;
	}

	public List<WebElement> getRightcaretelemedicine_options() {
		return rightcaretelemedicine_options;
	}

	public List<WebElement> getTrigger_Options() {
		return trigger_Options;
	}

}
