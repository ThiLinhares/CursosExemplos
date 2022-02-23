package stepDefinitions;

import static utils.Utils.acessarSite;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastroPage;

public class CadastroSteps {

	CadastroPage page = new CadastroPage();
	
	
	
	//==================inicio do fluxo================\\

	@Dado("que estou na pagina home do site")
	public void queEstouNaPaginaHomeDoSite() {
		acessarSite();

	}

	@E("clicar em Sign in")
	public void clicarEmSignIn() {
		page.botaoSignIn();
	}

	@E("adicionar um {string} para criacao de nova conta")
	public void adicionarUmParaCriacaoDeNovaConta(String string) {
		page.informaEmail(string);

	}

//
	@Quando("preencher todos os campos obrigatorios e clicar em Register")
	public void preencherTodosOsCamposObrigatoriosEClicarEmRegister() {
		page.preenchendoCampoTitle();
		page.preenchendoCampoFirstName();
		page.preenchendoCampoLastNameCustomer();
		page.preenchendoCampoPassword();
		page.preenchendoCampoLastNameAdress();
		page.preenchendoCampoCompany();
		page.preenchendoCampoAdress();
		page.preenchendoCampoCity();
		page.preechendoCampoState();
		page.preenchendoCampoZipcode();
		page.preenchendoCampoOther();
		page.preechendoCampoMobilePhone();
		page.clicandoBotaoRegister();

	}



	@Entao("devo ser cadastrado")
	public void devoSerCadastrado() {
	   page.cadastradoComSucesso();
	}

}