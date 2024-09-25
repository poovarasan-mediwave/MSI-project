package com.uhyy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hjytg7y {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rapido.bike/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		if (currentUrl == "https://rapido.bike/") {
			System.out.println("uyhgyh");

		} else {
			System.out.println("neeeeee");
		}

	}
}
