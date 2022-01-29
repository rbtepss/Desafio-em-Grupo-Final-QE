package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.After;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import utilities.Base;

public class CasoAceitarCookiesx extends Base{
	//WebDriverWait	wait	=	new	WebDriverWait(driver,	10);		
	

	/**************** contexto **************/
	@Dado("abro as configurações de cookies")
	public void abro_as_configurações_de_cookies() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-pc-btn-handler")));
		driver.findElement(By.id("onetrust-pc-btn-handler")).click();
	}
	@Dado("clico em Confirmar minhas escolhas")
	public void clico_em_confirmar_minhas_escolhas() {
	    driver.findElement(By.xpath("//*[@id=\"onetrust-pc-sdk\"]/div[3]/div[1]/button[1]")).click();
	}
	
	/**************** cenário 1 Aceitar o cookie LGPD  ***************/
	//WebDriver driver = new Definitions().iniciarDriver();
	

		/*@Dado("que estou no site da accenture")
		public void que_estou_no_site_da_accenture() {
			driver.get("https://www.accenture.com/br-pt");	    
		}*/

		@Então("deve fechar o modal")
		public void deve_fechar_o_modal() {
			assertEquals("Accenture | Brasil| Que venha a mudança", driver.getTitle());
			System.out.println(driver.getTitle());
		}
	/**************** cenário 2  Configuracoes do cookie **************/


		/*@Quando("abro as configuracoes de cookies")
		public void abro_as_configura_es_de_cookies() throws Exception {
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.id("onetrust-pc-btn-handler")).click();

		}*/


		/*@Quando("clico em Confirmar minhas escolhas")
		public void clico_em_confirmar_minhas_escolhas() {
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"onetrust-pc-sdk\"]/div[3]/div[1]/button[1]")).click();


		}*/

		@Quando("clico em configuracoes de cookie")
		public void clico_em_configura_es_de_cookie() {
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"optanon-minimize-button\"]")).click();

		}

		@Entao("devo ver o item de {string}")
		public void devo_ver_o_item_de(String string) {
			driver.findElement(By.id("privacy-text")).click();		
		}

		@Entao("devo ver {string}")
		public void devo_ver(String string)  {
			if(string.equals("Cookies estritamente necessarias")) {
				driver.findElement(By.id("ot-header-id-1")).click();
			}

			if(string.equals("Cookies Analiticos de Primeira Parte")) {
				driver.findElement(By.id("ot-header-id-2")).click();
			}

			if(string.equals("Cookies de Desempenho e Cookies Funcionais")) {
				driver.findElement(By.id("ot-header-id-3")).click();
			}

			if(string.equals("Cookies de Publicidade e Redes Sociais")) {
				driver.findElement(By.id("ot-header-id-4")).click();
			}

		}	


		
}
