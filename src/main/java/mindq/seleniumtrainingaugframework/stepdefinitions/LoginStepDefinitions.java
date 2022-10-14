package mindq.seleniumtrainingaugframework.stepdefinitions;

import java.io.IOException;

import org.testng.asserts.SoftAssert;

import com.cucumber.listener.Reporter;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mindq.seleniumtrainingaugframework.base.Base;
import mindq.seleniumtrainingaugframework.pageobjects.LoginPageObjects;
import mindq.seleniumtrainingaugframework.utils.ReportingManager;

public class LoginStepDefinitions extends LoginPageObjects{

	
	SoftAssert sa = new SoftAssert();
	
	@Before
	public void launchApp() {
		launchBrowser("Chrome");
	}
	@After
	public void closeApplication() {
		closeBrowser();
	}
	
	  @Given("^User is in login page$")
	    public void user_is_in_login_page()  {
		  launchBrowser("Chrome");
	    }

	  @When("^User enters email address \"([^\"]*)\"$")
	    public void user_enters_email_address(String strArg1) {
		  enterEmailId(strArg1);
		  Reporter.addStepLog("entered email id");
	    }

	    @When("^User clicks sign in button$")
	    public void user_clicks_sign_in_button() {
	       clickSignin();
	    }

	    @Then("^User should see error message on the screen$")
	    public void user_should_see_error_message_on_the_screen() throws IOException  {
	    	boolean actualResult = errorMessagePresence();
			
			boolean expectedResult = false;
			
			sa.assertEquals(actualResult, expectedResult,"Values are not matching");
			
			if(!(actualResult == expectedResult)) {
				Reporter.addScreenCaptureFromPath(ReportingManager.captureScreenshot());
			}
			
			System.out.println("Test case is completed");
			
			sa.assertAll();
	    }

	    @Then("^User should be successfully login$")
	    public void user_should_be_successfully_login()  {
	       
	    }

	    @And("^User enters password \"([^\"]*)\"$")
	    public void user_enters_password(String strArg1) {
	    	enterPassword(strArg1);
	    }
}
