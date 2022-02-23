import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteAlert {
	
	  private WebDriver driver;
		
	    
	    
			@Before
			public void inicializa() {
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
			}
			
			@After
			public void encerra() {
				driver.quit();
			}
			
	
	@Test
	public void deveInteragirComAletSimples(){
	
		driver.findElement(By.id("alert")).click();
		Alert alert = driver.switchTo().alert();
		String texto = alert.getText();
		Assert.assertEquals("Alert Simples", texto);
		alert.accept();
		
		driver.findElement(By.id("elementosForm:nome")).sendKeys(texto);
	}
	   
	
	
	
	@Test
	public void deveInteragirComAletConfirma(){
		
//		driver.findElement(By.id("confirm")).click();
//		Alert alert = driver.switchTo().alert();	
//		Assert.assertEquals("Confirm Simples", alert.getText());
//		alert.accept();
//		Assert.assertEquals("Confirmado", alert.getText());
//		driver.quit();
		
		driver.findElement(By.id("confirm")).click();
		Alert alert = driver.switchTo().alert();	
		Assert.assertEquals("Confirm Simples", alert.getText());
		alert.dismiss();
		Assert.assertEquals("Negado", alert.getText());
		
	}
	
	@Test
	public void deveInteragirComPrompt(){
		
		driver.findElement(By.id("prompt")).click();
		Alert alerta = driver.switchTo().alert();
		Assert.assertEquals("Digite um numero", alerta.getText());
		alerta.sendKeys("12");
		alerta.accept();
		Assert.assertEquals("Era 12?", alerta.getText());
		alerta.accept();
		Assert.assertEquals(":D", alerta.getText());
		alerta.accept();
	  
	}

}
