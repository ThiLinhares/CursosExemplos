package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Utils {
	
	public static AppiumDriver<WebElement> driver;
	
	public static void acessarApp() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "com.microsoft.todos");
		desiredCapabilities.setCapability("appActivity", "com.microsoft.todos.ui.LaunchActivity");


		driver = new AppiumDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
	}
	

//	public static File gerarScreenshot(Scenario cenario) {
//		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//		cenario.embed(screenshot, "image/png");
//		File imagem = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		try {
//			
//			FileUtils.copyFile(imagem,(new File("./target/screenshots", cenario.getName() + "-" + cenario.getStatus()+".png")));
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		return  imagem;
//		
//		
//	}
}
