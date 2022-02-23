import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DesafioCadastro {
	
	  private WebDriver driver;
	  private DSL dsl;
	  private CampoTreinamentoPage page;
		
	    
	    
			@Before
			public void inicializa() {
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
				dsl = new DSL(driver);
				page = new CampoTreinamentoPage(driver); 
			}
			
			@After
			public void encerra() {
				driver.quit();
			}
			
	
	@Test
	public void Desafio(){
		
		page.setNome("Thiago");
		page.setSobrenome("Linhares");
		page.setSexoMasculino();
		page.setComidaFavoritaCarne();
		page.setEscolaridade2GrauCompleto();
		page.setEscreverTexto("Treinando, amanhã é importante!");
		page.cadastrar();
		page.obterResultadoCadastro("Nome: Thiago");
		
	  
	}

}
