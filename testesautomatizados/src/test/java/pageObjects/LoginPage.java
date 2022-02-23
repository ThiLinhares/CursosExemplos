package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait; 

public class LoginPage {
//	
//	public void informaCampoUsuario(String usuario) {		
//		driver.findElement(By.name("txtUsername")).sendKeys(usuario);
//	}
//	
//	public void informaCampoSenha(String senha) {
//		driver.findElement(By.name("txtPassword")).sendKeys(senha);
//	}
//
//	public void acionarBotaoLogin() {
//		driver.findElement(By.name("Submit")).click();
//	}
	
	
	public void LoginPage(WebDriver driver) {
		
		protected WebDriver driver; 
		
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy (how = How.ID, using= "txtUsername")
	private WebElement usuario;
	
	@FindBy (how = How.ID, using= "txtPassword")
	private WebElement senha;
	
	@FindBy (how = How.ID, using= "btnLogin")
	private WebElement btnLogin;
	
	@FindBy (how = How.CSS, using= "h1:contains('dashboard')")
	private WebElement dashboard;
	
	
	public void esperarElemento(WebElement elemento) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(elemento));
	}
	
	public void preencherUsuario(String nomeUsuario) {		
		esperarElemento(usuario);
		usuario.sendKeys(nomeUsuario);
	}
	
	public void preencherSenha(String senhaUsuario) {	
		esperarElemento(senha);
		senha.sendKeys(senhaUsuario);
	}
	
	public void clicarBotaoLogin() {
		esperarElemento(btnLogin);
		btnLogin.click();
	}
}
