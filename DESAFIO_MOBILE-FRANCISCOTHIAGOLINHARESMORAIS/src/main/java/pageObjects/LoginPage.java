package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	
	public LoginPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}
	
	
	@AndroidFindBy(id = "com.microsoft.todos:id/email_phone_edit_text")
	private MobileElement email;

	@AndroidFindBy(id = "i0118")
	private MobileElement senha;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/sign_in_button")
	private MobileElement botaoEntrarEmail;
	
	@AndroidFindBy(id = "idSIButton9")
	private MobileElement botaoEntrarSenha;
	
	
	public void inserirEmail() {
		email.sendKeys("comprarpcxeon@hotmail.com");
		botaoEntrarEmail.click();
	}
	
	public void inserirSenha() {
		senha.sendKeys("mafred18");
		botaoEntrarSenha.click();
	}
	
}
	
	


