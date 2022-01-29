package steps;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import utilities.Base;

public class CaseProcurandoUmaVagaSteps extends Base {
	
	/*WebDriver driver;
	WebDriverWait wait;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 15);

	}
*/
	/*@Dado("que eu estou no site da Accenture")
	public void dado_que_eu_estou_no_site_da_accenture() {
		driver.get("https://www.accenture.com/br-pt");
	}*/

	@Quando("acesso a area de carreiras")
	public void acesso_a_area_de_carreiras() {	
		
		System.out.println("PASSOU 1");
		WebElement item = driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/nav/div/div[1]/div[3]/div[1]/div[4]/div[1]/span"));
		item.click();

	}

	@Quando("clico em procurar vagas")
	public void clico_em_procurar_vagas() {
		System.out.println("PASSOU 2");	
		
		
		WebElement search = driver.findElement(By.linkText("Procure Por Vagas"));
		search.click();
	}

	@Quando("digito no campo de busca {string}")
	public void digito_no_campo_de_busca(String carreira) {
		WebElement searchPosition = driver.findElement(By.id("job-search-hero-bar"));
		searchPosition.sendKeys(carreira);

	}

	@Quando("clico no botão procurar")
	public void clico_no_botão_procurar() {
		WebElement button = driver.findElement(By.className("btn-primary"));
		button.click();
	}

	@Então("devo encontrar vagas para {string}")
	public void devo_encontrar_vagas_para(String vagas) throws InterruptedException {

		synchronized (driver) {
			driver.wait(2 * 1000);
		}

		List<WebElement> jobList = driver.findElements(By.className("job-listing-description"));
		int jobListLen = jobList.size();

		if (jobListLen> 0 ) {

			for (int i = 0; i < jobListLen; i++) {
				String job = jobList.get(i).getText();
				if (job.contains(vagas)) {
					assertEquals(1, 1);
					break;
				
				}else {
					assertEquals(1, 0);
				}
				
			}
			
		} else {

			assertEquals(1, 0);
		}
	}

	/*@After
	public void dps() {
		driver.quit();
	}*/

}