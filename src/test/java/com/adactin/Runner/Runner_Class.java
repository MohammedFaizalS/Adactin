package com.adactin.Runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Adactin.Baseclass.BaseClass;
import com.properties.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature",
glue = "com.Adaction.Stepdefinition",
monochrome = true,
dryRun = false,
strict = true,
tags = ("@smoketest,@sanitytest"),
plugin = {"html:Reports/HtmlReport",
		"pretty",
		"json:Reports/JsonReport.json",
        "com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html" 
}
)

public class Runner_Class {

	public static WebDriver driver;

	@BeforeClass
	public static void Setup() throws IOException {
		String browser=FileReaderManager.getinstance().getinstanceCR().getBrowser();
		driver=BaseClass.Browser_Launch(browser);
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}

}
