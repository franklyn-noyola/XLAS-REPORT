package eTransactions;

import org.junit.Test;
import javax.swing.JOptionPane;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

public class BEForm extends HRSCFormSubmission {

  public static String[] TypeOfBank;
  public static String Submit;
  public static String DateNL= "img[alt=\"Kalender\"]";
  public static String Date;
  public static String DateEN= "img[alt=\"Calendar\"]";

  
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
 
public static void LanguageChange() throws Exception{
	if (LAN.equals("NL")){
	  		TypeOfBank = new String[] {"//input[@value='Hoofdbankrekening']","//input[@value='Tweede bankrekening']","//input[@value='Onkostenrekening']"};
	  		Submit 					= SubmitButton[3];
	  		Date					=  DateNL;
	  	}
	  	if (LAN.equals("EN")){
	  		TypeOfBank = new String[] {"//input[@value='Main bank account']","//input[@value='Second bank account']","//input[@value='Expenses account']"};
	  		Submit 					= SubmitButton[0];
	  		Date					= DateEN;
	  	}
}
 //BAnk Details Change
 public static void BankDetails() throws Exception {
	 LanguageChange();
	 Thread.sleep(1000);
	  			String AccountHolderName		=	"T007190012F109";
	  			String IBAN						=	"T007190012F097";
	  			String StandardValue			=	"T007190012F055";
	  			String StandarPercentage		=	"T007190012F059"; 	
	  	try{
	  		
	 	driver.switchTo().window(parentHandle);
	 	driver.switchTo().frame(0);
	 	driver.findElement(By.cssSelector(Date)).click();
    	Thread.sleep(3000);
    		CalendarPopupHandle();
    	Thread.sleep(6000);
    	driver.findElement(By.linkText("12")).click();
    	driver.switchTo().window(parentHandle);
    	driver.switchTo().frame(0);
    	driver.findElement(By.xpath(TypeOfBank[1])).click();
     	driver.findElement(By.name(AccountHolderName)).clear();
     	driver.findElement(By.name(AccountHolderName)).sendKeys("Franklyn Noyola");
     	driver.findElement(By.name(IBAN)).clear();
     	driver.findElement(By.name(IBAN)).sendKeys("BE126543219874126898989899989898");
     	driver.findElement(By.name(StandardValue)).clear();
     	driver.findElement(By.name(StandardValue)).sendKeys("1200");
     	driver.findElement(By.name(StandarPercentage)).clear();
     	driver.findElement(By.name(StandarPercentage)).sendKeys("10");
     	driver.findElement(By.xpath(Submit)).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath(Submit)).click();
    	Thread.sleep(7000);
    	driver.close();
    	JOptionPane.showMessageDialog(null, "Transaction has been processed and sent to ODM", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
  }catch(Exception e){
	  driver.close();
	  JOptionPane.showMessageDialog(null, "A Field has been changed or does not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
	  fail("Test Has been Failed");
  }
 }
}