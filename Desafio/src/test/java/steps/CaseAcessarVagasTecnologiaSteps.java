package steps;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import utilities.Base;

public class CaseAcessarVagasTecnologiaSteps extends Base {

	/*WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver(); 	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}*/
	
	/*@Dado("que eu estou no site da accenture")
	public void que_eu_estou_no_site_da_accenture() {
		driver.get("https://www.accenture.com/br-pt");
	}*/

	/*@Dado("clico no menu carreiras")
	public void clico_no_menu_carreiras() {
	    driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[4]/div[1]/span")).click();
	}*/

	/*@Dado("clico no item do menu vagas em tecnologia")
	public void clico_no_item_do_menu_vagas_em_tecnologia() {
	    driver.findElement(By.linkText("Vagas em tecnologia")).click();
	}*/

	/*@Então("devo ver o destaque em {string}")
	public void devo_ver_o_destaque_em(String string) {
		String frase = driver.findElement(By.xpath("//*[@id=\"aoi-hero\"]/div/div/div[1]/div/article/div/h1")).getText();
		assertEquals(frase, "Carreiras em tecnologia");		  
	}*/
	
	/*@After
	public void dps() { 
		driver.quit(); 
	}*/

}