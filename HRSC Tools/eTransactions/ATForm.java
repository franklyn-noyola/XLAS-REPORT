package eTransactions;

import org.junit.Test;
//import org.openqa.selenium.support.ui.Select;
import javax.swing.JOptionPane;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

public class ATForm extends _eTransactions_Variables {

  @Test
  public void NoExecute() throws Exception{
 	 driver.close();
 	 JOptionPane.showMessageDialog(null,"Sorry. This cannot be executed from here. Please Execute HRSCFormSubmission Script to Execute this Script", "ERROR", JOptionPane.ERROR_MESSAGE);
 	 return;
 	 
  }
public static void CalendarPopupHandle() throws Exception{
	for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
	    }
}
 		
 //Werkswechsel Form
 public static void Bankverbindung() throws Exception {
	  //DEFINE NEW FORM FIELDS
	  			String Gültigkeitsdatum			=  	"img[alt=\"Kalender\"]";
	  			String IBAN						= 	"T004540014F007";
	  			String Bankkarte 				= 	"T004540014F048";
	  			String Telefonnummer			=  	"T004540014F017";
	  			String Email					=	"T004540014F034";
	  			
   	try{
   	driver.switchTo().window(parentHandle);
	 driver.switchTo().frame(0);
   	Thread.sleep(3000);
    	driver.findElement(By.cssSelector(Gültigkeitsdatum)).click();
    	Thread.sleep(3000);
    		CalendarPopupHandle();
    	Thread.sleep(6000);
    	driver.findElement(By.linkText("24")).click();
    	driver.switchTo().window(parentHandle);
    	driver.switchTo().frame("formframe");
   	   	driver.findElement(By.name(IBAN)).sendKeys("AT345678901234567890123456789012");
   	    driver.findElement(By.name(Bankkarte)).click();
   	    driver.findElement(By.name(Telefonnummer)).sendKeys("65987454587989");
   	   	driver.findElement(By.name(Email)).sendKeys("franklyn.noyola@gmail.com");
    	driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
       	Thread.sleep(1000);
       	driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
       	Thread.sleep(3000);
   	   	driver.close();
   	   	JOptionPane.showMessageDialog(null, "Transaction has been processed and sent to ODM", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
   	   	return;
 }catch(org.openqa.selenium.NoSuchElementException e){
	  driver.close();
	  JOptionPane.showMessageDialog(null, "A Field/Value has been changed or does not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
	  fail("Field/Value does belong to this eForm anymore");
	  return; 
 		}
  }
 
}
 