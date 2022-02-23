import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	
	  private WebDriver driver;
		
	    
	    
			@Before
			public void inicializa() {
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
			}
			
//			@After
//			public void encerra() {
//				driver.quit();
//			}
			

	@Test
	public void abrindoNavegador(){
	
		Assert.assertEquals("Google", driver.getTitle());
	}
}