package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty" }, // console imprime informacoes mais organizadas
		features = "src\\main\\resources\\features", // local das features
		glue = "steps", // local dos steps
		snippets = SnippetType.CAMELCASE, // nome dos metodos
		monochrome = true, // melhora formatacao e leitura console
		dryRun = true // executa cenario sem abrir o navegador/app e traz os metodos
)
public class RunnerTest {

}
