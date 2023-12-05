package com.Lib_Globals;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Base_Class {

	public static WebDriver driver;
	public static String Email = "";
	public static String FirstName = "";
	public static String LastName = "";
	public static String Mobile_number = "";
	public static Actions actions;

	public static WebDriver browserLaunch(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (type.equalsIgnoreCase("incognito")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(capabilities);
			driver = new ChromeDriver(options);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;

	}

	public static String getDrive(String n) {
		driver.get(n);
		return n;

	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void wait(int num) {

		driver.manage().timeouts().implicitlyWait(num, TimeUnit.SECONDS);

	}

	public static String enterText(WebElement element, String name) {
		element.sendKeys(name);
		return name;

	}

	public static void ClickOnElement(WebElement element) {
		element.click();

	}

	public static String getText(WebElement b) {
		String text = b.getText();
		return text;
	}

	public void screenShot(String path) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),
					new File(System.getProperty("user.dir") + "\\screenshot\\" + path + ".png"));
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static boolean displayedMethod(WebElement element) {

		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public static boolean enabledMethod(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;

	}

	public static void calendaryearback() {
		for (int i = 0; i <= 21; i++) {
			driver.findElement(By.xpath(
					"//button[@class='react-calendar__navigation__arrow react-calendar__navigation__prev2-button']"))
					.click();
		}

	}

	public static boolean selectedMethod(WebElement element) {

		boolean selected = element.isSelected();
		return selected;
	}

	public static void sleep(int num) {
		try {
			Thread.sleep(num);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void screenshotPage(String screenshot) {
		try {
			Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
					.takeScreenshot(driver);
			ImageIO.write(s.getImage(), "PNG",
					new File(System.getProperty("user.dir") + "\\screenshot\\" + screenshot + ".png"));

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void selectbyIndox(WebElement element, int num) {

		Select se = new Select(element);
		se.selectByIndex(num);

	}

	public static void selectbyValue(WebElement element, String num) {

		Select se = new Select(element);
		se.selectByValue(num);

	}

	public static void selectbyVissibleText(WebElement element, String num) {

		Select se = new Select(element);
		se.selectByVisibleText(num);

	}

	public static void Action_Click(WebElement element) {

		actions = new Actions(driver);
		actions.click(element).build().perform();
	}

	public static void Doubleclick(WebElement element) {

		actions = new Actions(driver);
		actions.doubleClick(element).build().perform();
	}

	public static void Rightclick(WebElement element) {

		actions = new Actions(driver);
		actions.contextClick(element).build().perform();
	}

	public static void Mousehoveraction(WebElement element) {

		actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

	public static void DragandDrop(WebElement element, WebElement element1) {

		actions = new Actions(driver);
		actions.dragAndDrop(element, element1).build().perform();
	}

	public static void ClickandHold(WebElement element) {

		actions = new Actions(driver);
		actions.clickAndHold(element).build().perform();
	}

	public static void Copy_Paste_Text(WebElement element, WebElement element1) {

		element.sendKeys(Keys.CONTROL, "a");
		element.sendKeys(Keys.CONTROL, "c");
		element1.sendKeys(Keys.CONTROL, "v");
	}

	public static void javascript_Click(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void Alert_Accept() {

		driver.switchTo().alert().accept();
	}

	public static void Alert_Dismiss() {

		driver.switchTo().alert().dismiss();
	}

	public static void Alert_getText() {

		driver.switchTo().alert().getText();
	}

	public static void Alert_Sendkeys(String name) {
		driver.switchTo().alert().sendKeys(name);
	}

	public static void Explicity_Wait(int num, WebElement element) {
		new WebDriverWait(driver, num).until(ExpectedConditions.visibilityOf(element));
	}

	public static void Browserquit() {

		driver.quit();
	}

	public static void Browserclose() {
		driver.close();
	}

	public static void jsScrollDownElement_index() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}

	public static void jsScrollUpElement_index() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
	}

	public static void jsScrollDownElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void jsScrollUpElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

//	Values insert from configuration properties
	public static void Inputvalueof_ListOptions(List<WebElement> element, String getOptions) {
		try {
			String[] options_Array = getOptions.split(",");
			for (int j = 0; j < options_Array.length; j++) {
				options_Array[j] = options_Array[j].replaceAll("\"", "");
			}
			System.out.println(options_Array.length);
			for (int i = 0; i < element.size(); i++) {
				WebElement singleelement = element.get(i);
				jsScrollDownElement(singleelement);
				ClickOnElement(singleelement);
				if (options_Array.length - 1 >= i) {
					System.out.println(options_Array[i]);
					enterText(singleelement, options_Array[i]);
				} else {
					enterText(singleelement, "Options" + i);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void clickonAddoptions(WebElement element, int num) {
		try {
			for (int i = 0; i < num; i++) {
				jsScrollDownElement(element);
				element.click();
				wait(20);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void clickon_ListElement_indexbased(List<WebElement> element, int num) {
		try {

			// declare the variable
			int desiredElementIndex = num;
			if (desiredElementIndex >= 0 && desiredElementIndex < element.size()) {
				WebElement desiredElement = element.get(desiredElementIndex);
				desiredElement.click();

				System.out.println("Performed action after clicking element at index: " + desiredElementIndex);
			} else {
				System.out.println("Invalid index: " + desiredElementIndex);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//	Only for MSI project usage
	public static void Clickon_AddconditionalQuestion(WebElement singleQuestion, String exValue) {
		try {
			if (singleQuestion.getText().equalsIgnoreCase("Multiple choice question")
					|| singleQuestion.getText().equals("Yes / No question")
					|| singleQuestion.getText().equals("Dropdown question")) {
				driver.findElement(By.xpath("//label[contains(text(),'" + exValue
						+ "')]/ancestor::div[@class='qbcol']/following-sibling::div/button")).click();

			}
			if (singleQuestion.getText().equalsIgnoreCase("Date input question")) {
				driver.findElement(By.xpath(
						"//label[contains(text(),'" + exValue + "')]/parent::div/div/following-sibling::div/button"))
						.click();
			}
			if (singleQuestion.getText().equalsIgnoreCase("Number input question")) {
				driver.findElement(By.xpath("//label[contains(text(),'" + exValue
						+ "')]/ancestor::div[@class='qbcol']/following-sibling::div/descendant::button"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void dynamic_TextSelection(List<WebElement> textList, String dynamicText) {
//  Using Alderhay, Oxcare, MAIA, etc
		try {
			for (WebElement singleText : textList) {
				if (singleText.getText().equals(dynamicText)) {
					singleText.click();
//					System.out.println("Performed action after clicking the element with text: " + dynamicText);
					break;
				} else {
					System.out.println("Desired element with text " + dynamicText + " not found.");
				}

			}

//			WebElement desiredElement = null;
//
//			for (WebElement element : findelements) {
//				if (element.getText().equals(dynamicText)) {
//					desiredElement = element;
//					break;
//				}
//			}
//			if (desiredElement != null) {
//				desiredElement.click();
//
//				System.out.println("Performed action after clicking the element with text: " + dynamicText);
//			} else {
//				System.out.println("Desired element with text " + dynamicText + " not found.");
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void Service_selection(List<WebElement> elements, String dynamicText, WebElement pregnancy,
			WebElement postcode, String postcodes, WebElement eleigibility, String value) {
		for (WebElement singleText : elements) {
			if (singleText.getText().equals(dynamicText)) {
				if (dynamicText == "TERMINATION OF PREGNANCY") {
					singleText.click();
					pregnancy.click();
					if (driver.findElement(By.xpath("//label[normalize-space()='" + value + "']")).getText()
							.equalsIgnoreCase("Yes")) {
						enterText(postcode, postcodes);
						sleep(2000);
						eleigibility.click();
						sleep(2000);
						break;
					} else {
						System.out.println(driver.findElement(By.xpath("//div[@class='top-error']/label")).getText());
						break;
					}

				} else {
					singleText.click();
					break;
				}
			} else {
				System.out.println("Element not identified");
			}

		}
	}

//	Only for MSI project usage
	public static void triggers(WebElement singleQuestion, String exValue, String exValue1, int num, int num1)
			throws Throwable {
		System.out.println("Successfully enter the trigger setting option");
		try {
			if (singleQuestion.getText().equals("Yes / No question")
					|| singleQuestion.getText().equals("Multiple choice question")
					|| singleQuestion.getText().equals("Dropdown question")) {
				driver.findElement(By.xpath("//label[contains(text(),'" + exValue
						+ "')]/ancestor::div[@class='score-section']/following-sibling::div/descendant::input"))
						.click();
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
				driver.findElement(By.xpath("//label[contains(text(),'" + exValue
						+ "')]/parent::div/descendant::div[@class='relative']/input")).click();
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
						+ " ')]/ancestor::div[@class='score-section']/following-sibling::div/descendant::input"))
						.click();
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
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void verificationprocess(WebElement element, String actualValue) {
		try {
			if (getText(element) == actualValue) {
				System.out.println("Verification successfully");

			} else {
				System.out.println("Verification unsuccessfully");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String generateRandomMobileNumber() {
		Random random = new Random();
		String mobileNumber = "91";
		for (int i = 0; i < 10; i++) {
			int digit = random.nextInt(10);
			mobileNumber += digit; // Append each random digit to the mobile number
		}
		Mobile_number = mobileNumber;
		return mobileNumber;
	}

	public static String generateRandomName() {
		String[] names = { "John", "Jane", "Michael", "Emma", "David", "Olivia", "William", "Sophia", "Smith",
				"Johnson", "Brown", "Davis", "Miller", "Wilson", "Anderson", "Thomas", "Oliver", "George", "Noah",
				"Arthur", "Harry", "Leo", "Muhammad", "Jack", "Charlie Oscar", "Jacob", "Henry", "Thomas", "Freddie",
				"Alfie", "William", "Theodore", "Archie", "Alexander", "Isaac", "Edward", "Lucas", "Finley", "Logan",
				"Ethan", "Mohammed", "Benjamin", "Joseph", "Sebastian", "Harrison", "Adam", "Samuel", "Mason", "Albie",
				"Jaxon", "Luca", "Reggie", "Louis", "Albert", "Jude", "Roman", "Toby", "Carter", "Frederick", "Gabriel",
				"Bobby", "Michael", "Grayson", "Liam", "Ellis", "Harvey", "Jake", "Rowan", "Jasper", "Stanley", "Jesse",
				"Elliot", "Mohammad", "Jenson", "Harley", "Charles", "Felix", "Chester", "Hudson", "Ibrahim", "Blake",
				"Jayden", "Ralph", "Elliott", "Ollie", "Finn", "Caleb", "Jackson", "Leon", "Ryan", "Alfred", "Oakley",
				"Matthew", "Luke" };
		Random random = new Random();
		int randomIndex = random.nextInt(names.length);

		String randomName = names[randomIndex];

		FirstName = randomName;
		return randomName;
	}

	public static String generateRandomEmail() {
		Random random = new Random();
		String middleNumber = "000";
		for (int i = 0; i < 1; i++) {
			int digit = random.nextInt(999);
			middleNumber += digit;
			String email = "manoj+" + middleNumber + "@mindwaveventures.com";
			Email = email;
		}
		return middleNumber;
	}

	public static void Random_value_storedin_Excel(String path, String sheetTitle, int Rownum, int Cellnum1,
			int Cellnum2, int Cellnum3) {
		try {
			File f = new File(path);
			FileOutputStream fileOutput = new FileOutputStream(f);
			Workbook workbook = new XSSFWorkbook();
			Sheet createSheet = workbook.createSheet(sheetTitle);
			Row createRow = createSheet.createRow(0);

			createRow.createCell(0).setCellValue("FirstName");
			createRow.createCell(2).setCellValue("Email");
			createRow.createCell(1).setCellValue("Mobile number");

			Row createRow2 = createSheet.createRow(Rownum);
			createRow2.createCell(Cellnum1).setCellValue(FirstName);
			createRow2.createCell(Cellnum3).setCellValue(Email);
			createRow2.createCell(Cellnum2).setCellValue(Mobile_number);
			workbook.write(fileOutput);
			sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//	Only for MSI project usage
	public static void windowsHandling(WebElement currentPage, WebElement signoutMailpage) {
		try {
			String ParentWindow = driver.getWindowHandle();
			ClickOnElement(currentPage);
			sleep(5000);
			Set<String> ListWindow = driver.getWindowHandles();
			for (String SingleWindow : ListWindow) {
				if (!SingleWindow.equals(ParentWindow)) {
					driver.switchTo().window(SingleWindow);
					ClickOnElement(signoutMailpage);
				}
				driver.switchTo().window(ParentWindow);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void frameswitch(WebElement frame) {

		driver.switchTo().frame(frame);

	}

	public void cleartxt(WebElement element) {
		element.clear();

	}

	public static void frame_Into(WebElement frame) {
		driver.switchTo().frame(frame);
	}

	public static void frame_out() {
		driver.switchTo().defaultContent();
	}

}