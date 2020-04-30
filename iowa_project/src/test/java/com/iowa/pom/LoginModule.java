package com.iowa.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class LoginModule {
	
	public static WebDriver driver;
	@FindBy(xpath=("//input[@id='userName']"))
	private WebElement username;
	
	@FindBy(xpath=("//*[@id=\"password\"]"))
	private WebElement password;
	
	@FindBy(xpath=("/html/body/app-root/app-login/div/div/div/div/div/div/div[1]/div/form/div[4]/input"))
	private WebElement captcha;
	
	
	
	@FindBy(xpath=("//button[@class='btn btn-yellow']"))
	private WebElement login;
	
	


	public LoginModule(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
		
	}

	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	public WebElement getCaptcha() {
		return captcha;
	}

	
	public WebElement getLogin() {
		return login;
	}
	

}
