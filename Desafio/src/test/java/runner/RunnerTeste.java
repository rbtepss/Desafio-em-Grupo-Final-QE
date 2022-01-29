package runner;



import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.Definitions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "steps",
		tags = "@run",
		plugin = {"pretty", "html:target/relatorios/htmls/report.html","json:target/relatorios/htmls/CucumberReport.json"}, 
		dryRun = false
		)

public class RunnerTeste{
	@AfterClass
	public static void finalizar() {
		Definitions.finalizarDriver();
	}
}