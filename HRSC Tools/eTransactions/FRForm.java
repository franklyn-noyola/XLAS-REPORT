package eTransactions;

import org.junit.Test;

import javax.swing.JOptionPane;

import static org.junit.Assert.*;

import org.openqa.selenium.*;


public class FRForm extends _eTransactions_Variables {
	public static String BancairesGMIN =		"T000900034F001";
  
 
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
 	public static void HRinput() throws Exception{
		driver.switchTo().window(whandle);
		driver.switchTo().frame(0);
	   	driver.findElement(By.name(AgentGMIN)).sendKeys(GMIN);
     	driver.findElement(By.id(LookUp)).click();
 	}

  //Datos Bancarios
 public static void Changementcoordbancaires () throws Exception {
	  			String Datedeffet				=	"img[alt=\"Calendrier\"]";
	  			String Appointements 			=	"T000900034F079";
	  			String Mutuelle 				=	"T000900034F080";
	  			String Remboursement 			=	"T000900034F081";
	  			String IBAN						=	"T000900034F091";
	  			String Bénéficiaire 			=	"T000900034F090";
	  			String Téléphone				=	"T000900034F041";
	  			String Nom_prénom				=	"T000900034F046";
	
	  	try{
	  		if (NoAgent){
	  			driver.switchTo().window(parentHandle);
	  			driver.switchTo().frame(0);
	  		}
     	driver.findElement(By.cssSelector(Datedeffet)).click();
     	Thread.sleep(3000);
     				CalendarPopupHandle();
     	Thread.sleep(6000);
     	driver.findElement(By.linkText("24")).click();
     	driver.switchTo().window(parentHandle);
     	driver.switchTo().frame("formframe");
     	driver.findElement(By.name(Appointements)).click();
     	driver.findElement(By.name(Mutuelle)).click();
     	driver.findElement(By.name(Remboursement)).click();
     	driver.findElement(By.name(IBAN)).sendKeys("FR9874665632326568989656699");
     	driver.findElement(By.name(Bénéficiaire)).sendKeys("Franklyn Noyola");
     	driver.findElement(By.name(Téléphone)).sendKeys("6598944548");
     	driver.findElement(By.name(Nom_prénom)).sendKeys("Franklyn Noyola");
     	Thread.sleep(1000);
     	driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
    	Thread.sleep(5000);    	
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