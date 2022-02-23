package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;



public class CadastroPage {
	
	

//=====================metodo auxiliar====================\\

	public void escreve(String id_campo, String texto) {
		driver.findElement(By.id(id_campo)).sendKeys(texto);

	}

//=============================================================\\

//=====================inicio dos testes==========================\\	

	public void botaoSignIn() {
		driver.findElement(By.xpath("//*[@class='login']")).click();
	}

	public void informaEmail(String string) {
		driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys(string);
		driver.findElement(By.id("SubmitCreate")).click();
	}

	// ========== preenchendo os campos obrigatorios =======\\

	public void preenchendoCampoTitle() {
		driver.findElement(By.id("id_gender1")).click();

	}

	public void preenchendoCampoFirstName() {
		escreve("customer_firstname", "Thiago");

	}

	public void preenchendoCampoLastNameAdress() {
		escreve("lastname", "Linhares");

	}

	public void preenchendoCampoLastNameCustomer() {
		escreve("customer_lastname", "Linhares");

	}

	public void preenchendoCampoPassword() {
		escreve("passwd", "12345");

	}

	public void preenchendoCampoCompany() {
		escreve("company", "Stefanini");

	}

	public void preenchendoCampoAdress() {
		escreve("address1", "rua Selenium, bairro Java");

	}

	public void preenchendoCampoCity() {
		escreve("city", "Fortaleza");

	}

	public void preechendoCampoState() {
		new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Alaska");
	}

	public void preenchendoCampoZipcode() {		
		escreve("postcode", "12345");
	

	}

	public void preenchendoCampoOther() {
		escreve("other", "Ta bom ou ta ruim? :D");

	}

	public void preechendoCampoMobilePhone() {
		escreve("phone_mobile", "999999999");
	}

	public void clicandoBotaoRegister() {
		driver.findElement(By.id("submitAccount")).click();
		
		
	}
	
	//=================validacao===============\\
	
	public void cadastradoComSucesso () {
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).isDisplayed();
		
		driver.findElement(By.id("my-account")).getAttribute("Welcome to your account. Here you can manage all of your personal information and orders.");
	}
	
	
	
	
	
	
}
