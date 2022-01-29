package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	protected static WebDriver driver = new Definitions().iniciarDriver();
	protected WebDriverWait wait = new WebDriverWait(driver,5);
	
	public static void waitBase(int intSegundo) {
		try {
			synchronized (driver) {
				driver.wait(intSegundo * 1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
