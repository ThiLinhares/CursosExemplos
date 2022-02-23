package stepDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {
	
	LoginPage lp = new LoginPage();
	
	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String usuario) {
	   lp.usuario(usuario);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
	    lp.senha(senha);
	}

	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
	   lp.btnLogin();
	}

	@Entao("o sistema exibe a mensagem de usuario invalido")
	public void oSistemaExibeAMensagemDeUsuarioInvalido() {
		 assertEquals("Invalid credentials", driver.findElement(By.id("spanMessage")).getText());
	}

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
	    assertEquals("Welcome Paul", driver.findElement(By.id("welcome")).getText());
	}   

}
