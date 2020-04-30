package com.iowa.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClassIowa {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browsername) {

		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","E:\\Iowa_Workspace\\iowa_project\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty(("user.dir") + "\\driver\\IEDriverServer.exe"));
				driver = new InternetExplorerDriver();
			} else if (browsername.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty(("user.dir") + "\\driver\\geckoDriver.exe"));
				driver = new FirefoxDriver();
			} else {
				System.out.println("Invalid browsername");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String Url) {
		driver.get(Url);
	}

	public static void inputOnElement(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void clearOnElement(WebElement element) {
		element.clear();
	}

	public static void robotClass() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void quit(WebElement element) {
		driver.quit();
	}

	public static void close(WebElement element) {
		driver.close();
	}

	public static void navigateTo(WebElement element) {
		driver.navigate().to("Url");
	}

	public static void refersh(WebElement element) {
		driver.navigate().refresh();
	}

	public static void forward(WebElement element) {
		driver.navigate().forward();
	}

	public static void back(WebElement element) {
		driver.navigate().back();
	}

	public static void iframe(WebElement elements) {
		elements.click();
		driver.switchTo().frame(elements);
	}

	public static void scrollUp(Object element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("Window.ScrollBy(0,1000)");
	}

	public static void ScrollDown(Object element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.ScrollBy(0,-1000)");
	}
	public static void screenShot(String filename) throws IOException{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File(System.getProperty("user.dir")+"\\takesScreenshot\\" +filename); 
		FileUtils.copyFile(sourcefile, destfile);
		}
}
