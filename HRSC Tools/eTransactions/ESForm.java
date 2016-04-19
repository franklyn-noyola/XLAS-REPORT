package eTransactions;

import org.junit.Test;
import javax.swing.JOptionPane;
import static org.junit.Assert.*;
import org.openqa.selenium.*;


public class ESForm extends _eTransactions_Variables {
  
 
@Test 
 public void NoExecute() throws Exception{
	 driver.close();
	 JOptionPane.showMessageDialog(null,"Sorry. This cannot be executed from here. Please Execute HRSCFormSubmission Script to Execute this Script", "ERROR", JOptionPane.ERROR_MESSAGE);
	 driver.quit();
	 return; 
 }

public static void CalendarPopupHandle() throws Exception{
	for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
	    }
}

  //Datos Bancarios
 public static void DatosBancarios() throws Exception {
	 			Thread.sleep(1000);
	  			String Codigo_IBAN				=  	"T007170011F084";
	  			String Entidad					=	"T007170011F044";
	  			String Oficina					=	"T007170011F071";
	  			String DC						=	"T007170011F072";
	  			String Numero_Cuenta			=	"T007170011F073";
	  			String Numero_Telefono			=	"T007170011F050";
	  			String Apellidos_Nombre			=	"T007170011F051";
	  			String Correo_Electronico		=	"T007170011F032";
	
	  	try{
	 	driver.switchTo().window(parentHandle);
	 	driver.switchTo().frame(0);
     	driver.findElement(By.name(Codigo_IBAN)).clear();
     	driver.findElement(By.name(Codigo_IBAN)).sendKeys("ES21");
     	driver.findElement(By.name(Entidad)).clear();
     	driver.findElement(By.name(Entidad)).sendKeys("9189");
     	driver.findElement(By.name(Oficina)).clear();
     	driver.findElement(By.name(Oficina)).sendKeys("6541");
     	driver.findElement(By.name(DC)).clear();
     	driver.findElement(By.name(DC)).sendKeys("21");
     	driver.findElement(By.name(Numero_Cuenta)).clear();
     	driver.findElement(By.name(Numero_Cuenta)).sendKeys("6547894455");
     	driver.findElement(By.name(Numero_Telefono)).clear();
     	driver.findElement(By.name(Numero_Telefono)).sendKeys("650147985");
     	driver.findElement(By.name(Apellidos_Nombre)).clear();
     	driver.findElement(By.name(Apellidos_Nombre)).sendKeys("Franklyn Noyola");
     	driver.findElement(By.name(Correo_Electronico)).clear();
     	driver.findElement(By.name(Correo_Electronico)).sendKeys("franklyn.noyola@gmail.com");
     	driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
    	Thread.sleep(3000);
    	driver.findElement(By.linkText("Completar otra transacción")).click();
    	driver.close();
    	JOptionPane.showMessageDialog(null, "Transaction has been processed and sent to ODM", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
    	return;
  }catch(Exception e){
	  driver.close();
	  JOptionPane.showMessageDialog(null, "A Field has been changed or does not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
	  fail("Test Has been Failed");
  }
 }
}