package com.iowa.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.iowa.baseclass.BaseClassIowa;
import com.iowa.helper.FileReaderManager;
import com.iowa.helper.PageObjectManager;
import com.iowa.runner.RunnerIowa;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class A_LoginModule extends BaseClassIowa {
	public static WebDriver driver = RunnerIowa.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	private static Logger log = LogManager.getLogger(A_LoginModule.class.getName());

	@Given("^Enter the Url to navigate webpage$")
	public void enter_the_Url_to_navigate_webpage() throws Throwable {
		log.debug("navigate to the url page");
		String url = FileReaderManager.getInstance().getcrInstance().getUrl();
		getUrl(url);
		log.info("successfuly entered into login page");

	}

	@When("^User enter the valid Email$")
	public void user_enter_the_valid_Email() throws Throwable {
		log.debug("entering email in text field");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		inputOnElement(pom.getLM().getUsername(), "Ide@mobiusservices.com");
		log.info("Email entered successfully");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("^User enter the valid password$")
	public void user_enter_the_valid_password() throws Throwable {
		log.debug("entering password in text field");
		inputOnElement(pom.getLM().getPassword(), "Angular@123");
		log.info("password entered successfully");
		log.debug("waiting for entering captcha which is displayed in text box");
	}

	@When("^user enter the valid captcha$")
	public void user_enter_the_valid_captcha() throws Throwable {
		clickOnElement(pom.getLM().getCaptcha());
		Thread.sleep(9000);

	}

	@And("^User click the Login button$")
	public void user_click_the_Login_button() throws Throwable {
		log.info("captcha textfield entered successfully");

		clickOnElement(pom.getLM().getLogin());
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		log.info("login button clicked successfully");
	}

	@Then("^validate user enter into the Home page of Iowa$")
	public void validate_user_enter_into_the_Home_page_of_Iowa() throws Throwable {
		log.info("success login into the home page");

	}

}
