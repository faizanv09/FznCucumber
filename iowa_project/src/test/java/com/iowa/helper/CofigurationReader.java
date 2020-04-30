package com.iowa.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class CofigurationReader {
	public static Properties ps;

	public CofigurationReader() throws IOException {
		File f = new File(
				"E:\\Inhabitr\\iowa_project\\src\\test\\java\\com\\iowa\\properties\\Configuration.Properties");
		FileInputStream fis = new FileInputStream(f);
		ps = new Properties();
		ps.load(fis);

	}

	public static String BrowserName() {
		String browser = ps.getProperty("BrowserName");
		return browser;

	}

	public static String getUrl() {
		String url = ps.getProperty("Url");
		return url;
	}
}