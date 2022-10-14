package mindq.seleniumtrainingaugframework.runners;

import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterTest;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import mindq.seleniumtrainingaugframework.base.Base;

@CucumberOptions(features = {"Features" },
                 glue =     {"mindq.seleniumtrainingaugframework.stepdefinitions"},
                 plugin = { "pretty","html:target/cucumber-reports",
                		 "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extentreport.html"},
                 tags =     "@invalidlogin",
                 monochrome = true)
public class Runner extends AbstractTestNGCucumberTests{


	
	@AfterClass
	  public static void setup() {
	  
	  
	  
		  Reporter.loadXMLConfig("src/test/resources1/extent-config.xml");
	  //Reporter.loadXMLConfig(new File("src/test/resources1/extent-config.xml"));
	  //Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	  Reporter.setSystemInfo("User Name", "Prashanthi");
	  Reporter.setSystemInfo("Application Name", "Test App");
	  Reporter.setSystemInfo("Operating System Type", "Windows 10");
	  Reporter.setSystemInfo("Environment", "QA");
	  Reporter.setTestRunnerOutput("Test Execution Cucumber Report"); }
	 
}

