import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteCampoTreinamento {
	
	    private WebDriver driver;
	    private DSL dsl;
	
	    
	    
		@Before
		public void inicializa() {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
			dsl = new DSL(driver);
		}
		
		@After
		public void encerra() {
			driver.quit();
		}
		
		
		
		

		@Test
		public void testeTextFild(){
			dsl.escreve("elementosForm:nome", "Teste de escrita");
		    Assert.assertEquals("Teste de escrita", dsl.obterValorCampo("elementosForm:nome"));
	    }
		

        @Test
	     public void deveInteragirComTextArea(){
        	dsl.escreve("elementosForm:sugestoes", "Teste");			
			Assert.assertEquals("Teste", dsl.obterValorCampo("elementosForm:sugestoes"));					
        }
 	

		@Test
		public void deveInteragirComRadioButton(){				
			dsl.clicarRadio("elementosForm:sexo:0");
			Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());			
		}
		
		
		@Test
		public void deveInteragirCheckBox(){			
			dsl.clicarRadio("elementosForm:comidaFavorita:0");
			Assert.assertTrue(dsl.isRadioMarcado("elementosForm:comidaFavorita:0"));			
		}
		
		
		@Test
		public void deveInteragirComCombo(){
			dsl.selecionarCombo("elementosForm:escolaridade","2o grau completo");
			Assert.assertEquals("2o grau completo", dsl.obterValorCombo("elementosForm:escolaridade"));
		}
		
		
		@Test
		public void deveInteragirComBotoes(){					
			dsl.clicarBotao("buttonSimple");
			Assert.assertEquals("Obrigado!", dsl.obterValorCampo("buttonSimple"));
		}
		
		
		@Test
		public void deveInteragirComLinks(){			
		    dsl.clicarLink("Voltar");
			Assert.assertEquals("Voltou!", dsl.obterTexto("resultado"));
		}
		
		
		@Test
		public void deveBuscarTextosNaPagina(){                           
		
			
//			Assert.assertTrue(driver.findElement(By.tagName("Body")).getText().contains("Campo de Treinamento"));  //indicadoParaHtmlPequenos
			
			Assert.assertEquals("Cuidado onde clica, muitas armadilhas...", dsl.obterTexto(By.className("facilAchar"))); //PesqNomeDaClasse
			
//			Assert.assertEquals("Campo de Treinamento", dsl.obterTexto(By.tagName("h3"))); //PesqNomeDaTag
		}
		
		
}

		