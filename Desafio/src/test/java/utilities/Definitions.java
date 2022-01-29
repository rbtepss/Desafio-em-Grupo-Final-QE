package utilities;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Definitions {
	private static String pathDriver = System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver.exe";
	protected static WebDriver driver;
	
	public WebDriver iniciarDriver() {
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", pathDriver);
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		}
		return driver;
	}
	
	public static void finalizarDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
	
}
