package com.Page_Object_Model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class TOP_Reference_code extends Base_Class {

	public TOP_Reference_code() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='top-error'][contains(text(),'positive')]")
	private WebElement positive_pregnancy_error;

	@FindBy(xpath = "//h5[contains(text(),'TOP ELIGIBLITY')]/ancestor::div[@class='Ecard-info']/following-sibling::div/div[@class='mini-link-set']/span/button/a")
	private WebElement eligibility_starting;

	@FindBy(xpath = "//div[@class='group-input ']/div/input")
	private List<WebElement> scan_gestation_days_field;

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
	private WebElement next_button;

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

	public WebElement getPositive_pregnancy_error() {
		return positive_pregnancy_error;
	}

	public WebElement getEligibility_starting() {
		return eligibility_starting;
	}

	public List<WebElement> getScan_gestation_days_field() {
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

	public WebElement getNext_button() {
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

	public void TOP_gestation_page(String question_name, String button_name, String scanquestion_name,
			String scanbutton_name, String LMPquestion_name, String LMPbutton_name, String AppLMPquestion_name,
			String AppLMPbutton_name, String conceivequestion_name, String conceivebutton_name, String month,
			String year, String date, String scan_gestation_week_days) {
		ClickOnElement(getEligibility_starting());
		WebElement positive_pregnancy_radio = driver.findElement(By.xpath(
				"//h6[contains(text(),'positive')]/parent::div/following-sibling::div/div/label[contains(text(),'"
						+ button_name + "')]/span"));
		if (button_name == "Yes") {
			positive_pregnancy_radio.click();
			WebElement scan_radio = driver.findElement(By.xpath("//h6[contains(text(),'" + scanquestion_name
					+ "')]/parent::div/following-sibling::div/div/label[contains(text(),'" + scanbutton_name
					+ "')]/span"));
			if (scanquestion_name == "scan" && scanbutton_name == "Yes") {
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
					ClickOnElement(LMP_radio);
					// need to update the date fields
					datepicker(month, year, date);
					next_button(getNext_button());

				} else {
					ClickOnElement(LMP_radio);
					WebElement AppLMP_radio = driver.findElement(By.xpath("//h6[contains(text(),'" + AppLMPquestion_name
							+ "')]/parent::div/following-sibling::div/div/label[contains(text(),'" + AppLMPbutton_name
							+ "')]/span"));
					if (AppLMPquestion_name == "approximately" && AppLMPbutton_name == "Yes") {
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

	public void Risk_question(String riskbutton_name, String immediateriskquestion_name,
			String immediateriskbutton_name, String risk_other, String explain_risk, String immediaterisk_other,
			String explain_immediaterisk, String wellbeing_question, String adult_buttonName, String support_buttonName,
			String date, String month, String year) {
		datepicker(month, year, date);

		WebElement risk_radio = driver.findElement(
				By.xpath("//h6[contains(text(),'risk')]/parent::div/following-sibling::div/div/label[contains(text(),'"
						+ riskbutton_name + "')]/span"));

		if (riskbutton_name == "Yes") {
			ClickOnElement(risk_radio);
			for (WebElement single_risk : getRisk_options()) {
				ClickOnElement(single_risk);
				if (single_risk.getText() == "Other") {
					enterText(getRisk_other_field(), risk_other);
				}
			}
			enterText(getExplain_risk_field(), explain_risk);
			WebElement immediaterisk_radio = driver.findElement(By.xpath("//h6[contains(text(),'"
					+ immediateriskquestion_name + "')]/parent::div/following-sibling::div/div/label[contains(text(),'"
					+ immediateriskbutton_name + "')]/span"));
			if (immediateriskquestion_name == "immediate risk" && immediateriskbutton_name == "Yes") {
				ClickOnElement(immediaterisk_radio);
//				for (int i = 0; i < immediaterisk_options.size(); i++) {
//					if (i == num || i == num1) {
//						WebElement single_risk = immediaterisk_options.get(i);
//						single_risk.click();
//						if (i==9) {
//							driver.findElement(By.xpath(
//									"//h6[contains(text(),'What harm are you at risk of')]/parent::div/following-sibling::div/div[@class='pt-4']/div/div/input"))
//									.sendKeys(null);
//						}
//					}
//				}
				for (WebElement single_immediaterisk : getImmediate_risk_field()) {
					ClickOnElement(single_immediaterisk);
					if (single_immediaterisk.getText() == "Other") {
						enterText(getImmediate_risk_other_field(), immediaterisk_other);
					}
				}

				enterText(getExplain_immediaterisk_field(), explain_immediaterisk);
				if (wellbeing_question == "wellbeing") {
					for (WebElement option : getWellbeing_options()) {
						boolean selectedMethod = selectedMethod(option);
						if (selectedMethod == true) {
							ClickOnElement(getNext_button());
						} else {
							System.out.println(option.getText() + "option is not selected as default");
							ClickOnElement(option);
							break;
						}
					}
				}

				next_button(getNext_button());
			}
		} else {
			risk_radio.click();
			next_button(getNext_button());
		}
		if (URL_lastsegment() == "pregnancy-support") {
			WebElement adult_question = driver.findElement(By.xpath(
					"//h6[contains(text(),'adult')]/parent::div/following-sibling::div/div/label[contains(text(),'"
							+ adult_buttonName + "')]/span"));
			if (adult_buttonName == "Yes") {
				ClickOnElement(adult_question);
				System.out.println("Yes button clicked successfully");

			} else {
				ClickOnElement(adult_question);
				System.out.println("No button clicked successfully");
			}
			WebElement support_question = driver.findElement(By.xpath(
					"//h6[contains(text(),'support')]/parent::div/following-sibling::div/div/label[contains(text(),'"
							+ support_buttonName + "')]/span"));
			if (support_buttonName == "Yes") {
				ClickOnElement(support_question);
				System.out.println("Yes button clicked successfully");

			} else {
				ClickOnElement(support_question);
				System.out.println("No button clicked successfully");
			}
			next_button(getNext_button());
		}
	}

	// Function definition for myFunction with return value and explanation
	/**
	 * This method performs some operation using obj1 and obj2.
	 *
	 * @param uk_gp_button The first parameter of type only access Yes/No.
	 * @param GP_postcode  The second parameter of type Object.
	 * @return The result of the operation, a String value.
	 */
	public void GP_registration(String uk_gp_button, String GP_postcode, String signup_address_question,
			String signup_address_button, String registered_UK_address_question, String registered_UK_address_button,
			String addressSearch_method, String postcode_address, String address_manual) {

		WebElement UK_GP_question = driver.findElement(
				By.xpath("//h6[contains(text(),'UK GP')]/parent::div/following-sibling::div/div/label[contains(text(),'"
						+ uk_gp_button + "')]/span"));
		if (uk_gp_button == "Yes") {
			ClickOnElement(UK_GP_question);
			enterText(getgP_search(), GP_postcode);
			ClickOnElement(getgP_address_selection());
			next_button(getNext_button());

		} else {
			ClickOnElement(UK_GP_question);
			WebElement signup_address = driver.findElement(By.xpath("//h6[contains(text(),'" + signup_address_question
					+ "')]/parent::div/following-sibling::div/div/label[contains(text(),'" + signup_address_button
					+ "')]/span"));
			if (signup_address_question == "UK address" && signup_address_button == "Yes") {
				ClickOnElement(signup_address);
				next_button(getNext_button());
			} else {
				ClickOnElement(signup_address);
				WebElement registered_UK_address = driver
						.findElement(By.xpath("//h6[contains(text(),'" + registered_UK_address_question
								+ "')]/parent::div/following-sibling::div/div/label[contains(text(),'"
								+ registered_UK_address_button + "')]/span"));

				if (registered_UK_address_question == "Do you have a registered UK address?"
						&& registered_UK_address_button == "Yes") {
					ClickOnElement(registered_UK_address);
					if (addressSearch_method == "Enter your UK address") {
						ClickOnElement(getSearch_field());
						enterText(getSearch_field(), postcode_address);
						ClickOnElement(getPostcode_address_selection());
						next_button(getNext_button());
					} else {

						ClickOnElement(getManual_address_field());
						Inputvalueof_ListOptions(getAddress_fields(), address_manual);
						next_button(getNext_button());
					}

				} else {
					next_button(getNext_button());
				}
			}

		}

	}

	public void GP_checking_page(String uk_gp_button, String GP_permission_button, String ubrnNumber_passcode,
			String button_name, String Suite_FPC_buttonname, String bluebell_code, String bluebell_suuite_FPC_button,
			String hopehouse_field, String local_provider_radio, String local_provider_value, String unique_call_back,
			String unique_call_back_time) {
		GP_registration(uk_gp_button, null, null, null, null, null, null, null, null);
		if (uk_gp_button == "Yes") {
			if (URL_lastsegment() == "gp-contact") {
				System.out.println("User enter contract available flow");
				WebElement instances_GP_question = driver.findElement(By.xpath(
						"//h6[contains(text(),'Would you be happy for us to do this?')]/parent::div/following-sibling::div/div/label[contains(text(),'"
								+ GP_permission_button + "')]/span"));
				if (GP_permission_button == "Yes") {
					ClickOnElement(instances_GP_question);
					next_button(getNext_button());

				} else {
					ClickOnElement(instances_GP_question);
					next_button(getNext_button());
				}

			} else if (URL_lastsegment() == "ubrn-passcode") {
				System.out.println("User enter UBRN flow");
				Inputvalueof_ListOptions(getUbrnNumber_passcode_fields(), ubrnNumber_passcode);
				next_button(getNext_button());
				WebElement instances_GP_question = driver.findElement(By.xpath(
						"//h6[contains(text(),'Would you be happy for us to do this?')]/parent::div/following-sibling::div/div/label[contains(text(),'"
								+ GP_permission_button + "')]/span"));
				if (GP_permission_button == "Yes") {
					ClickOnElement(instances_GP_question);
					next_button(getNext_button());

				} else {
					ClickOnElement(instances_GP_question);
					next_button(getNext_button());
				}

			} else if (URL_lastsegment() == "bluebell-suite-fpc-code") {
				System.out.println("User enter Bluebell below 9weeks gestation flow");
				WebElement bluebell_main_radio = driver.findElement(By.xpath(
						"//h6[contains(text(),'Can you confirm that your GP has told you to contact MSI UK?')]/parent::div/following-sibling::div/div/label[contains(text(),'"
								+ button_name + "')]/span"));
				if (button_name == "Yes") {
					ClickOnElement(bluebell_main_radio);
					next_button(getNext_button());

				} else {
					ClickOnElement(bluebell_main_radio);
					WebElement bluebell_FPCquestion_radio = driver.findElement(By.xpath(
							"//h6[contains(text(),'Bluebell Suite FPC')]/parent::div/following-sibling::div/div/label[contains(text(),'"
									+ Suite_FPC_buttonname + "')]/span"));
					if (Suite_FPC_buttonname == "Yes") {
						ClickOnElement(bluebell_FPCquestion_radio);
						ClickOnElement(getBluebell_code_field());
						enterText(getBluebell_code_field(), bluebell_code);
						next_button(getNext_button());
					} else {
						ClickOnElement(bluebell_FPCquestion_radio);
						System.out.println("Flow end " + getText(getBluebell_error_message()));
					}
					WebElement instances_GP_question = driver.findElement(By.xpath(
							"//h6[contains(text(),'Would you be happy for us to do this?')]/parent::div/following-sibling::div/div/label[contains(text(),'"
									+ GP_permission_button + "')]/span"));
					if (GP_permission_button == "Yes") {
						ClickOnElement(instances_GP_question);
						next_button(getNext_button());

					} else {
						ClickOnElement(instances_GP_question);
						next_button(getNext_button());
					}
				}

			} else if (URL_lastsegment() == "bluebell-suite-fpc-direct-services") {
				System.out.println("User enter Bluebell above 9weeks gestation flow");
				WebElement bluebell_suite_radio = driver.findElement(By.xpath(
						"//h6[contains(text(),'Bluebell Suite')]/parent::div/following-sibling::div/div/label[contains(text(),'"
								+ bluebell_suuite_FPC_button + "')]/span"));
				if (bluebell_suuite_FPC_button == "Yes") {
					ClickOnElement(bluebell_suite_radio);
					next_button(getNext_button());

				} else {
					ClickOnElement(bluebell_suite_radio);
					System.out.println("FLow end " + getText(getBluebell_9above_errormessage()));
					next_button(getNext_button());
				}
				WebElement instances_GP_question = driver.findElement(By.xpath(
						"//h6[contains(text(),'Would you be happy for us to do this?')]/parent::div/following-sibling::div/div/label[contains(text(),'"
								+ GP_permission_button + "')]/span"));
				if (GP_permission_button == "Yes") {
					ClickOnElement(instances_GP_question);
					next_button(getNext_button());

				} else {
					ClickOnElement(instances_GP_question);
					next_button(getNext_button());
				}

			} else if (URL_lastsegment() == "hope-house-clinic") {
				ClickOnElement(getHopehouse_code_field());
				enterText(getHopehouse_code_field(), hopehouse_field);
				next_button(getNext_button());
				WebElement instances_GP_question = driver.findElement(By.xpath(
						"//h6[contains(text(),'Would you be happy for us to do this?')]/parent::div/following-sibling::div/div/label[contains(text(),'"
								+ GP_permission_button + "')]/span"));
				if (GP_permission_button == "Yes") {
					ClickOnElement(instances_GP_question);
					next_button(getNext_button());

				} else {
					ClickOnElement(instances_GP_question);
					next_button(getNext_button());
				}
			} else if (URL_lastsegment() == "gp-contact-cbs") {
				WebElement instances_GP_question = driver.findElement(By.xpath(
						"//h6[contains(text(),'Would you be happy for us to do this?')]/parent::div/following-sibling::div/div/label[contains(text(),'"
								+ GP_permission_button + "')]/span"));
				if (GP_permission_button == "Yes") {
					ClickOnElement(instances_GP_question);
					next_button(getNext_button());

				} else {
					ClickOnElement(instances_GP_question);
					next_button(getNext_button());
				}

			} else if (URL_lastsegment() == "cbs-msi-contract-mandatory") {
				ClickOnElement(getBacktodashboard_button());
			} else if (URL_lastsegment() == "cbs-non-msi-contract-mandatory") {
				ClickOnElement(getBacktodashboard_button());

			} else if (URL_lastsegment() == "try-our-services") {
				WebElement local_provider_question = driver.findElement(By.xpath(
						"//h6[contains(text(),'local provider')]/parent::div/following-sibling::div/div/label[contains(text(),'"
								+ local_provider_radio + "')]/span"));
				ClickOnElement(local_provider_question);
				ClickOnElement(getLocal_provider_text_field());
				enterText(getLocal_provider_text_field(), local_provider_value);
				next_button(getSubmit_button());
				ClickOnElement(getChoose_call_back_button());

				call_back_default(unique_call_back, unique_call_back_time);

			} else if (URL_lastsegment() == "msi-uk-private-treatment") {
				ClickOnElement(getChoose_call_back_button());
				call_back_default(unique_call_back, unique_call_back_time);

			}
		} else {
			if (URL_lastsegment() == "gp-contact") {
				System.out.println("User enter contract available flow");
				next_button(getNext_button());
			} else if (URL_lastsegment() == "ubrn-passcode") {
				System.out.println("User enter UBRN flow");
				Inputvalueof_ListOptions(getUbrnNumber_passcode_fields(), ubrnNumber_passcode);
				next_button(getNext_button());
				next_button(getNext_button());
			} else if (URL_lastsegment() == "bluebell-suite-fpc-code") {
				System.out.println("User enter Bluebell below 9weeks gestation flow");
				WebElement bluebell_main_radio = driver.findElement(By.xpath(
						"//h6[contains(text(),'Can you confirm that your GP has told you to contact MSI UK?')]/parent::div/following-sibling::div/div/label[contains(text(),'"
								+ button_name + "')]/span"));
				if (button_name == "Yes") {
					ClickOnElement(bluebell_main_radio);
					next_button(getNext_button());
				} else {
					ClickOnElement(bluebell_main_radio);
					WebElement bluebell_FPCquestion_radio = driver.findElement(By.xpath(
							"//h6[contains(text(),'Bluebell Suite FPC')]/parent::div/following-sibling::div/div/label[contains(text(),'"
									+ Suite_FPC_buttonname + "')]/span"));
					if (Suite_FPC_buttonname == "Yes") {
						ClickOnElement(bluebell_FPCquestion_radio);
						ClickOnElement(getBluebell_code_field());
						enterText(getBluebell_code_field(), bluebell_code);
						next_button(getNext_button());
					} else {
						ClickOnElement(bluebell_FPCquestion_radio);
						System.out.println("Flow end " + getText(getBluebell_error_message()));
					}
				}
				next_button(getNext_button());
			} else if (URL_lastsegment() == "bluebell-suite-fpc-direct-services") {
				System.out.println("User enter Bluebell above 9weeks gestation flow");
				WebElement bluebell_suite_radio = driver.findElement(By.xpath(
						"//h6[contains(text(),'Bluebell Suite')]/parent::div/following-sibling::div/div/label[contains(text(),'"
								+ bluebell_suuite_FPC_button + "')]/span"));
				if (bluebell_suuite_FPC_button == "Yes") {
					ClickOnElement(bluebell_suite_radio);
					next_button(getNext_button());

				} else {
					ClickOnElement(bluebell_suite_radio);
					System.out.println("FLow end " + getText(getBluebell_9above_errormessage()));
					next_button(getNext_button());
				}
				next_button(getNext_button());
			} else if (URL_lastsegment() == "hope-house-clinic") {
				ClickOnElement(getHopehouse_code_field());
				enterText(getHopehouse_code_field(), hopehouse_field);
				next_button(getNext_button());
				next_button(getNext_button());
			} else if (URL_lastsegment() == "gp-contact-cbs") {
				next_button(getNext_button());
			} else if (URL_lastsegment() == "cbs-msi-contract-mandatory") {
				ClickOnElement(getBacktodashboard_button());
			} else if (URL_lastsegment() == "cbs-non-msi-contract-mandatory") {
				ClickOnElement(getBacktodashboard_button());
			} else if (URL_lastsegment() == "try-our-services") {
				WebElement local_provider_question = driver.findElement(By.xpath(
						"//h6[contains(text(),'local provider')]/parent::div/following-sibling::div/div/label[contains(text(),'"
								+ local_provider_radio + "')]/span"));
				ClickOnElement(local_provider_question);
				ClickOnElement(getLocal_provider_text_field());
				enterText(getLocal_provider_text_field(), local_provider_value);
				next_button(getSubmit_button());
				ClickOnElement(getChoose_call_back_button());

				call_back_default(unique_call_back, unique_call_back_time);

			} else if (URL_lastsegment() == "msi-uk-private-treatment") {
				ClickOnElement(getChoose_call_back_button());
				call_back_default(unique_call_back, unique_call_back_time);

			}

		}
	}

}
