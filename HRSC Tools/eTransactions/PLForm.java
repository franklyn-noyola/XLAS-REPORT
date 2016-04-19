package eTransactions;

import static org.junit.Assert.fail;

import org.junit.Test;

import javax.swing.JOptionPane;

import org.openqa.selenium.*;
//import org.openqa.selenium.support.ui.Select;



public class PLForm extends _eTransactions_Variables {
   public static String KontobankoweGMINField			=	"T011740005F002";
   
   
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
public static void Kontobankowe() throws Exception{
		String Effective_Date			=  	"img[alt=\"Kalendarz\"]";
		String [] Numero 				=	new String [] {"T011740005F040","//input[@name='T011740005F040'][2]","//input[@name='T011740005F040'][3]"};
		String nazwa					=	"T011740005F023";
		String Telephone_Number			=	"T011740005F017";
		String Name						=	"T011740005F018";
		String Email_Address			=	"T011740005F019";
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
	driver.findElement(By.name(Numero[0])).sendKeys("65");
	driver.findElement(By.xpath(Numero[1])).sendKeys("63598744");
	driver.findElement(By.xpath(Numero[2])).sendKeys("6569189899898998");
	driver.findElement(By.name(nazwa)).sendKeys("Franklyn Garcia Noyola");
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
