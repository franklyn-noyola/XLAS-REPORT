package eTransactions;

import static org.junit.Assert.fail;

import org.junit.Test;

import javax.swing.JOptionPane;

import org.openqa.selenium.*;
//import org.openqa.selenium.support.ui.Select;



public class PTForm extends _eTransactions_Variables {
   public static String DadosBancariosGMINField			=	"T001960015F001";
   
   
  @Test
  public void Execute() throws Exception{
 	 driver.close();
 	 JOptionPane.showMessageDialog(null,"Sorry. This cannot be executed from here. Please Execute AgentPortalFormsSubmission Script to Execute this Script", "ERROR", JOptionPane.ERROR_MESSAGE);
 	 return;
  }	 
 	public static void CalendarPopupHandle() throws Exception{
 		for(String winHandle : driver.getWindowHandles()){
 				driver.switchTo().window(winHandle);
 		    }
 	}	
 	public static void HRinput() throws Exception{
		driver.switchTo().window(whandle);
		driver.switchTo().frame(0);
	   	driver.findElement(By.name(AgentGMIN)).sendKeys(GMIN);
     	driver.findElement(By.id(LookUp)).click();
 	}
 	
 	
 //Defined Benefit Form 
public static void Confirmaçãodedadosbancários () throws Exception{
		String Effective_Date			=  	"img[alt=\"Calendário\"]";
		String IBAN						=	"T001960015F058";
		String Telephone_Number			=	"T001960015F050";
		String Name						=	"T001960015F051";
		String Email_Address			=	"T001960015F032";
	try{
		if (NoAgent){
				driver.switchTo().window(whandle);
				driver.switchTo().frame(0);
		}
 	driver.findElement(By.cssSelector(Effective_Date)).click();
 	Thread.sleep(3000);
 			CalendarPopupHandle();
 	Thread.sleep(5000);
 	driver.findElement(By.partialLinkText("8")).click();
 	driver.switchTo().window(parentHandle);
	driver.switchTo().frame(0);
	driver.findElement(By.name(IBAN)).sendKeys("PT345678901234567890123456789012");
	driver.findElement(By.name(Telephone_Number)).sendKeys("934552147");
	driver.findElement(By.name(Name)).sendKeys("Franklyn Noyola");
	driver.findElement(By.name(Email_Address)).sendKeys("franklyn.noyola@gmail.com");
	driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
	Thread.sleep(5000);
	JOptionPane.showMessageDialog(null, "Transaction has been processed and sent to ODM", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
	driver.close();
	return;
  }catch(Exception e){
	  driver.close();
	  JOptionPane.showMessageDialog(null, "A Field has been changed or does not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
	  fail("Test Has been Failed");
}
}

}
