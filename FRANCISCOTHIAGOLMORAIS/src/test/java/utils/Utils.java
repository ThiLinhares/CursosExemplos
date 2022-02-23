package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {
	
	public static WebDriver driver;
		
	public static void acessarSite(){
		System.setProperty("webdriver.chrome.drive", "C:\\Windows\\DriverPlugin");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		
		driver.get("http://automationpractice.com/");
	
	}

}
