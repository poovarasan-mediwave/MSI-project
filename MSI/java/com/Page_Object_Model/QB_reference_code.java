package com.Page_Object_Model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class QB_reference_code extends Base_Class {

	public QB_reference_code() {

		PageFactory.initElements(driver, this);
	}

	public void triggers(WebElement singleQuestion, String exValue, String exValue1, int num, int num1)
			throws Throwable {
		System.out.println("Successfully enter the trigger setting option");

		if (singleQuestion.getText().equals("Yes / No question")
				|| singleQuestion.getText().equals("Multiple choice question")
				|| singleQuestion.getText().equals("Dropdown question")) {
			driver.findElement(By.xpath("//label[contains(text(),'" + exValue
					+ "')]/ancestor::div[@class='score-section']/following-sibling::div/descendant::input")).click();
			List<WebElement> optionsList = driver.findElements(By.xpath("//label[contains(text(),'" + exValue
					+ "')]/ancestor::div[@class='score-section']/following-sibling::div/descendant::div[@class='input-group undefined']/following-sibling::ul/li"));
			sleep(3000);
			Actions actions = new Actions(driver);
			for (WebElement singleelment : optionsList) {
				if (singleelment.getText().equals(exValue1)) {
					System.out.println("Inside for loop");
					actions.moveToElement(singleelment).build().perform();
					sleep(2000);
					if (exValue1.equalsIgnoreCase("Safeguarding")) {
						ClickOnElement(singleelment);
						sleep(1000);
						break;
					} else {
						List<WebElement> findElements = driver.findElements(By.xpath("//label[contains(text(),'"
								+ exValue
								+ "')]/ancestor::div[@class='score-section']/following-sibling::div/descendant::div[@class='input-group undefined']/following-sibling::ul/li["
								+ num + "]/ul/li"));
						if (num1 >= 0 && num1 < findElements.size()) {
							WebElement desiredElement = findElements.get(num1);
							desiredElement.click();

							System.out.println("Performed action after clicking element at index: " + num1);
						} else {
							System.out.println("Invalid index: " + num1);
						}
					}
				}
			}
		}
		if (singleQuestion.getText().equals("Date input question")) {
			driver.findElement(By.xpath(
					"//label[contains(text(),'" + exValue + "')]/parent::div/descendant::div[@class='relative']/input"))
					.click();
			List<WebElement> optionsList = driver.findElements(By.xpath("//label[contains(text(),'" + exValue
					+ "')]/parent::div/descendant::div[@class='input-group undefined']/following-sibling::ul/li"));
			sleep(3000);
			Actions actions = new Actions(driver);
			for (WebElement singleelment : optionsList) {
				if (singleelment.getText().equals(exValue1)) {
					actions.moveToElement(singleelment).build().perform();
					sleep(2000);
					if (exValue1.equalsIgnoreCase("Safeguarding")) {
						ClickOnElement(singleelment);
						sleep(1000);
						break;

					} else {
						List<WebElement> findElements = driver.findElements(By.xpath("//label[contains(text(),'"
								+ exValue
								+ "')]/parent::div/descendant::div[@class='input-group undefined']/following-sibling::ul/li["
								+ num + "]/ul/li"));
						if (num1 >= 0 && num1 < findElements.size()) {
							WebElement desiredElement = findElements.get(num1);
							desiredElement.click();

							System.out.println("Performed action after clicking element at index: " + num1);
						} else {
							System.out.println("Invalid index: " + num1);
						}
					}
				}
			}
		}
		if (singleQuestion.getText().equals("Number input question")) {
			driver.findElement(By.xpath("//label[contains(text(),'" + exValue
					+ " ')]/ancestor::div[@class='score-section']/following-sibling::div/descendant::input")).click();
			List<WebElement> optionsList = driver.findElements(By.xpath("//label[contains(text(),'" + exValue
					+ "')]/ancestor::div[@class='score-section']/following-sibling::div/div/div/ul/li"));
			sleep(3000);
			Actions actions = new Actions(driver);
			for (WebElement singleelment : optionsList) {
				if (singleelment.getText().equals(exValue1)) {
					actions.moveToElement(singleelment).build().perform();
					sleep(2000);
					if (exValue1.equalsIgnoreCase("Safeguarding")) {
						ClickOnElement(singleelment);
						sleep(1000);
						break;

					} else {
						List<WebElement> findElements = driver.findElements(By.xpath("//label[contains(text(),'"
								+ exValue
								+ "')]/ancestor::div[@class='score-section']/following-sibling::div/div/div/ul/li["
								+ num + "]/ul/li"));
						if (num1 >= 0 && num1 < findElements.size()) {
							WebElement desiredElement = findElements.get(num1);
							desiredElement.click();

							System.out.println("Performed action after clicking element at index: " + num1);
						} else {
							System.out.println("Invalid index: " + num1);
						}
					}
				}
			}
		}
	}

//	Only for MSI project usage
	public void Clickon_AddconditionalQuestion(WebElement singleQuestion, String exValue) {

		if (singleQuestion.getText().equalsIgnoreCase("Multiple choice question")
				|| singleQuestion.getText().equals("Yes / No question")
				|| singleQuestion.getText().equals("Dropdown question")) {
			driver.findElement(By.xpath("//label[contains(text(),'" + exValue
					+ "')]/ancestor::div[@class='qbcol']/following-sibling::div/button")).click();

		}
		if (singleQuestion.getText().equalsIgnoreCase("Date input question")) {
			driver.findElement(By
					.xpath("//label[contains(text(),'" + exValue + "')]/parent::div/div/following-sibling::div/button"))
					.click();
		}
		if (singleQuestion.getText().equalsIgnoreCase("Number input question")) {
			driver.findElement(By.xpath("//label[contains(text(),'" + exValue
					+ "')]/ancestor::div[@class='qbcol']/following-sibling::div/descendant::button"));

		}

	}

}
