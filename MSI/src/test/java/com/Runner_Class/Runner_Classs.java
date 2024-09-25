package com.Runner_Class;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;

import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature_File", monochrome = true, dryRun = false, glue = "com.Step_Definition", publish = true, plugin = {
		"html:target/Report/cucumber.html", "pretty", "json:target/Report/cucumber.json", })
public class Runner_Classs extends Base_Class {

	@Before
	public static void browsersetup() throws Throwable {
		browserLaunch(FileReaderManager.getInstanceCR().getBrowser_name());
		wait(10);
		getDrive(FileReaderManager.getInstanceCR().getURL());
		wait(10);
	}

}
