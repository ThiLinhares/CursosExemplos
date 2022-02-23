import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CampoTreinamentoPage {
	
	private DSL dsl;
	
	

	
	public CampoTreinamentoPage(WebDriver driver) {
		dsl = new DSL(driver);
	}




	public void setNome(String nome) {
		dsl.escreve("elementosForm:nome", nome);		
	}
	
	public void setSobrenome(String sobrenome) {
		dsl.escreve("elementosForm:sobrenome", "Linhares");		
	}
	
	public void setSexoMasculino() {
		dsl.clicarBotao("elementosForm:sexo:0");
	}
	
	public void setComidaFavoritaCarne() {
		dsl.clicarBotao("elementosForm:comidaFavorita:0");
	}
	
	public void setEscolaridade2GrauCompleto() {
		dsl.selecionarCombo("elementosForm:escolaridade", "2o grau completo");
	}
	
	public void setEscreverTexto(String texto) {
		dsl.escreve("elementosForm:sugestoes", texto);
	}	
	
	public void cadastrar() {
		dsl.clicarBotao("elementosForm:cadastrar");
	}
	
	public void obterResultadoCadastro(String valor) {
		Assert.assertEquals(valor, dsl.obterTexto("descNome"));
	}	
}

