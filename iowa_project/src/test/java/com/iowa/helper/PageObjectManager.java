package com.iowa.helper;

import org.openqa.selenium.WebDriver;

import com.iowa.pom.LoginModule;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private LoginModule LM;
	
	public PageObjectManager(WebDriver ldriver) {
		this.driver=ldriver;
		
	}
	
	public LoginModule getLM() {
	     LM = new LoginModule(driver);
		return LM;
	}

}
