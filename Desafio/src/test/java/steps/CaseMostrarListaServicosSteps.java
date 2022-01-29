package steps;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import utilities.Base;
import utilities.Definitions;


public class CaseMostrarListaServicosSteps extends Base{
	
	
	/************************************ CENÁRIO listar todos os serviços da Accenture *****************************/
	/*@Dado("que eu estou no site da accenture")
	public void que_eu_estou_no_site_da_accenture() {
		driver.get("https://www.accenture.com/br-pt");	
	}*/

	/*@Quando("clico no menu servicos")
	public void clico_no_menu_servicos() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='navigation-menu']/div[2]/div/span"))).click();
		
	}*/

	@Entao("devo ver os servicos abaixo")
	public void devo_ver_os_servicos_abaixo(List<String> servicosAbaixo) {
		Iterator<String> varrendoALista = servicosAbaixo.iterator();
        String servicos, listaSite;
        int contador = 1;

        while(varrendoALista.hasNext()){

           servicos = varrendoALista.next();
           listaSite = driver.findElement(By.xpath("//*[@id='primaryLink2_Servios']/div/div/ul/li["+contador+"]/a")).getText();
           if(servicos.equals(listaSite))
        	   contador++; 
        }
	
	}
	/************************************ CENÁRIO clicar no serviço cloud *****************************/

	/*@Quando("clico no menu serviços")
	public void clico_no_menu_serviços() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[2]/div[1]/span")).click();
	}*/
	
	/*@Quando("clico no item do menu cloud")
	public void clico_no_item_do_menu_cloud() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Cloud")));
	    driver.findElement(By.linkText("Cloud")).click();
	}*/

	
	@Então("devo encontrar o título {string}")
	public void devo_encontrar_o_título(String titulo) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()=\"Serviços de Cloud\"]")));
		String tituloObtido = driver.findElement(By.xpath("//h1[text()=\"Serviços de Cloud\"]")).getText(); 
	    Assert.assertEquals(titulo, tituloObtido);
	}
	
	
	
	
	
}
