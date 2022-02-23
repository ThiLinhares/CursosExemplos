package pageObjects;



	import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

	public class ToDoPage {

	public ToDoPage(AppiumDriver<?> driver) {
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
		
	}
//			
//		@AndroidFindBy(id = "com.microsoft.todos:id/email_phone_edit_text")
//				private MobileElement email;
//		
//		@AndroidFindBy(id = "i0118")
//				private MobileElement senha;
////		
//		@AndroidFindBy(id = "android:id/button1")
//				private MobileElement botaoOk;
//		
//		@AndroidFindBy(id = "com.google.android.deskclock:id/edit_label")
//				private MobileElement campoLabel;
//		
//		@AndroidFindBy(xpath = "//android.widget.EditText")
//				private MobileElement editText;
//		
//		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Default (Cesium)']")
//				private MobileElement textCombo;
//		
//		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Barium']")
//				private MobileElement opcaoCombo;
//		
//		@AndroidFindBy(xpath = "//android.widget.Switch[@text='ON'][1]")
//				private MobileElement switchApp;
//		
//		@AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Repeat']")
//				private MobileElement check; 
//				
//	
//				
//				
//		public void acessarMenuAlarme() throws Exception {
//			System.out.println("AcessandoMenuAlarme");
//	
//	
//			botaoAlarme.click();
//			
//		}
//
//		public void acionarBotaoNovoAlarme() throws Exception {
//			System.out.println("adicionando novo alarme");
//
//			botaoAddAlarm.click();
//			
//		}
//
//		public void acionarBotaoOK() throws Exception {
//	
//			botaoOk.click();
//			
//		}
//
//		public void interagirComElementos() throws Exception {
//
//		}
//
//		@Test
//		public void interagirComEditText() throws Exception {
//
//			acessarMenuAlarme();
//			acionarBotaoNovoAlarme();
//			interagirComElementos();
//
//			campoLabel.click();
//
//			editText.click();
//			editText.sendKeys("Teste");
//			
//		}

//		public void interagirComCombo() throws Exception {
//
//			acessarMenuAlarme();
//			acionarBotaoNovoAlarme();
//
//			System.out.println("interagindo com o combo");
//			textCombo.click();
//			
//			opcaoCombo.click();
//			
//		}
//
//		public void interagindoComSwitch() throws Exception {
//			System.out.println("interagindo com o switch");
//			acessarMenuAlarme();
//			acionarBotaoNovoAlarme();
//
//			switchApp.click();
//			
//
//			assertEquals("false", switchApp.getAttribute("checked"));
//		}
//
//		public void interagindoComCheckBox() throws Exception {
//			acessarMenuAlarme();
//			acionarBotaoNovoAlarme();
//
//			check.click();
//			
//
//			assertEquals("true", check.getAttribute("checked"));
//		}
//
//		public void clicarNaHora(String hora) throws Exception {
//			MobileElement clickHora = (MobileElement) driver.findElement(MobileBy.AccessibilityId(hora));
//			clickHora.click();
//			
//		}
//
//		public void clicarNoMinuto(String minuto) throws Exception {
//			MobileElement clickMinuto = (MobileElement) driver.findElement(MobileBy.AccessibilityId(minuto));
//			clickMinuto.click();
//			
//		}
//		
//		public void selecionarOPeriodo(String periodo) throws Exception {
//			
//			String periodoModificado = periodo.toLowerCase();
//			MobileElement clickPeriodo = (MobileElement) driver.findElement(MobileBy.id("android:id/"+periodoModificado+"_label"));
//			clickPeriodo.click();
//			
//		}
//		
//		
//	
//		public void validarInformacoes (List<String> dados) {
//			MobileElement infos;
//			for (String info : dados) {
//				infos = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='"+ info +"']"));
//				
//			System.out.println("Infos Tela" + infos.getText());
//			assertEquals(info, infos.getText());
//			}
//		}
//
//
//		
//
//	}

