package eTransactions;

import static org.junit.Assert.*;

import org.junit.Test;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.junit.*;
import org.openqa.selenium.*;



public class AllNewELinkValueCheck extends _eTransactions_Variables {
  public static String ValueToCheck;

  public static String DescriptionToCheck;
  public static int FRE;
  public static int LC;
  public static boolean NoWSR;
  public static boolean NoCC;
  public static boolean NoJC;
  public static boolean NoIT15; 
  public static boolean CountryNotFound;
  public boolean eLinkValidation;
  public static String COUNTRYQ;
  public static String ELINK;
  public static String ELA[];
  public static String ValueElink;
  private static StringBuffer verificationErrors = new StringBuffer();
  public static boolean ValueC;
  public static boolean DesC;

    
@Test
public void NoExecute() throws Exception{
	 driver.close();
	 JOptionPane.showMessageDialog(null,"Sorry. This cannot be executed from here. Please Execute eTransactionSelection Script to Execute this Script", "ERROR", JOptionPane.ERROR_MESSAGE);
	 return;
	 
}
  
  public static void setUp() throws Exception {
	StringSelection stringSelection = new StringSelection(password);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
  }
  
  public static void CountryConfiguration() throws Exception {
	  CountryNotFound = true;
	  COUNTRYQ = (String) JOptionPane.showInputDialog(null, "Select Country to Test", "Country Selection", JOptionPane.INFORMATION_MESSAGE,null, 
				ListOfCountry, ListOfCountry[0]);  
	  NoWSR = true; NoJC = true; NoCC = true;NoIT15 = true;
	  switch (COUNTRYQ){
	  case "Austria":				  	CountryNotFound = false;SelCountry=7;FRE = 1;LC=0;LANSQ = DESQ;
		  								NoWSR = false; NoJC = false; NoCC = false; NoIT15 = false;
		  								break;
	  		  	
	  case "Belgium": 					SelCountry=3;CountryNotFound=false;LC = 1; LANSQ = BESQ;NoIT15 = true;
										NoWSR = false; NoJC = false; NoCC = false;
										break;
	  
	  case "France": 					SelCountry=4;CountryNotFound=false;LC = 3; FRE = 0;NoJC = false; NoWSR = false; NoCC = false;
										LANSQ = FRSQ; NoIT15 = true;
										break;
	   
	  case "Germany":					SelCountry=2;CountryNotFound=false;NoIT15 = false; FRE = 4;LC = 4;NoJC = true; NoCC = true; NoWSR = false;
										LANSQ = DESQ;
										break;
	   
	  case "Poland": 					SelCountry=6;CountryNotFound=false;LC = 6;NoJC = true; NoWSR = true; NoCC = false;
										LANSQ = PLSQ;NoIT15 = true;
										break;
	  
	  case "Portugal":					SelCountry=5;CountryNotFound=false;LC = 2;NoJC = true; NoWSR = false; NoCC = false;
										LANSQ = PTSQ;NoIT15 = true;
										break;
	   
	  case "Spain": 					SelCountry=1;CountryNotFound=true;NoJC = true; NoCC = true; NoWSR = true;
										LANSQ = ESSQ;NoIT15 = true;
		
	  case "United Kingdom": 			SelCountry=0;CountryNotFound=false;LC = 5;	FRE = 3;NoWSR = true; NoCC = true;NoJC = false;
										LANSQ = ENSQ;NoIT15 = true;
										break;
	  }
		  
  }
public static void eLinkConfiguration() throws Exception{
	ELINK= (String) JOptionPane.showInputDialog(null, "Select eLink to Test", "eLink Selection", JOptionPane.INFORMATION_MESSAGE,null, 
			new Object[] {"WorkSchedule", "Job Code", "Cost Center", "IT15 WageType"},"eLink");
	switch (ELINK){
	case "WorkSchedule": 		ELA = WSR;if (NoWSR){return;}	break;
	case "Job Code": 	 		ELA = JC;if (NoJC){return;}if (COUNTRYQ.equals("France")){FRE=7;}break;
	case "Cost Center":  		ELA = CC;if(COUNTRYQ.equals("Austria")){FRE=2;}if (NoCC){return;}break;
	case "IT15 WageType": 		ELA = IT15;if (NoIT15){return;}
											switch (COUNTRYQ){
													case "Austria": FRE=5;LC=0;break;
													case "Germany": FRE=6;LC=1;break;
											}
								break;
		}
	
}	
public static void WinAuth() throws Exception{
	  String ValueToCheck = JOptionPane.showInputDialog("Type the Value to Check");
	  String DescriptionToCheck = JOptionPane.showInputDialog("Type the Description to Check");
	 driver.get(baseUrl);
	 	Robot robot = new Robot();
	 	Alert alert= driver.switchTo().alert();
	 		alert.sendKeys(username);
	 			robot.keyPress(KeyEvent.VK_TAB);
	 			robot.keyRelease(KeyEvent.VK_TAB);
	 			robot.keyPress(KeyEvent.VK_CONTROL);
	 			robot.keyPress(KeyEvent.VK_V);
	 			robot.keyRelease(KeyEvent.VK_CONTROL);
	 			robot.keyRelease(KeyEvent.VK_V);
	 			robot.keyPress(KeyEvent.VK_ENTER);
	 			robot.keyRelease(KeyEvent.VK_ENTER);
	 			Thread.sleep(3000);
    driver.findElement(By.linkText("Change Country")).click();
    String parentHandle = driver.getWindowHandle();
    driver.findElement(By.linkText(ListOfCountry[SelCountry])).click();
    driver.findElement(By.linkText(Country[SelCountry])).click();
    driver.switchTo().window(parentHandle);
    driver.switchTo().frame(0);
    driver.findElement(By.name("id_employee")).clear();
    driver.findElement(By.name("id_employee")).sendKeys(GMINS[SelCountry]);
    driver.findElement(By.xpath(Login[SelCountry])).click();
    Thread.sleep(2000);
    boolean q1 = (driver.getPageSource().contains(LANSQ[SQC1]));
    boolean q2 = (driver.getPageSource().contains(LANSQ[SQC2]));
    boolean q3 = (driver.getPageSource().contains(LANSQ[SQC3]));
    int count = 0;
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    do{
    	Thread.sleep(1000);
        if (q1 == true){
        driver.findElement(By.name("answer[1]")).clear();
    	driver.findElement(By.name("answer[1]")).sendKeys("1");
    	count1 = 1;
    }else{
    	count1 = 0;
    }
        if (q2== true){
        	driver.findElement(By.name("answer[2]")).clear();
        	driver.findElement(By.name("answer[2]")).sendKeys("1");
        	count2 = 1;   	
    }else {
    	count2 = 0;
    }
     if (q3== true){
    	 driver.findElement(By.name("answer[4]")).clear();
    	 driver.findElement(By.name("answer[4]")).sendKeys("1");
    	count3 = 1;
    }else{
    	count3 = 0;
    }
    count = count1 + count2+ count3;
    }while (count < 2);
    driver.findElement(By.xpath(Check[SelCountry])).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText(EFA[SelCountry])).click();
    Thread.sleep(4000);
    driver.switchTo().frame(0);
    driver.findElement(By.xpath(FREL[FRE])).click();
    Thread.sleep(4000);
    driver.switchTo().frame(0);
    driver.findElement(By.xpath(ELA[LC])).click();
    Thread.sleep(4000);
    for(String winHandle : driver.getWindowHandles()){
    driver.switchTo().window(winHandle);
    driver.manage().window().maximize();
    }
      
    Thread.sleep(4000);        
    		if(driver.getPageSource().contains(ValueToCheck)){
    			JOptionPane.showMessageDialog(null, ValueToCheck + " HAS been created and found sucessfully", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);}
    		 else{
    			 JOptionPane.showMessageDialog(null, ValueToCheck + " HAS NOT been created and found", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);}
    		if(driver.getPageSource().contains(DescriptionToCheck)){
    			JOptionPane.showMessageDialog(null, DescriptionToCheck + " HAS been created and found sucessfully", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);}
			else{
				JOptionPane.showMessageDialog(null, DescriptionToCheck + " HAS NOT been created or found", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);}
    Thread.sleep(1000);
    driver.quit();
}
 
 public static void eLinkWorkflow() throws Exception{
	 CountryConfiguration();
	 if (CountryNotFound){
		 	driver.close();
		 	JOptionPane.showMessageDialog(null, ListOfCountry[SelCountry]+" Country has not Link to Test", "ERROR", JOptionPane.ERROR_MESSAGE);
		 	return;
	 }
	 eLinkConfiguration();
	 switch (ELINK){
	 case "WorkSchedule" : if (NoWSR){
	 									driver.close();
	 									JOptionPane.showMessageDialog(null, ELINK+" eLink does not exist for "+ListOfCountry[SelCountry]+" country", "ERROR", JOptionPane.ERROR_MESSAGE);
	 									return;}
	 						WinAuth();
	 						break;
	 
	 case "Job Code": 	 	if (NoJC){
	 									driver.close();
	 									JOptionPane.showMessageDialog(null, ELINK+" eLink does not exist for "+ListOfCountry[SelCountry]+" country", "ERROR", JOptionPane.ERROR_MESSAGE);
	 									return;
	 									}
	 		 				WinAuth();	 	
	 		 				break;
	 
	 case "Cost Center": 	 if (NoCC){
		 								driver.close();
	 									JOptionPane.showMessageDialog(null, ELINK+" eLink does not exist for "+ListOfCountry[SelCountry]+" country", "ERROR", JOptionPane.ERROR_MESSAGE);
	 									return;
	 									}
	 		 				WinAuth();
	 		 				break;
	 	
	 case "IT15 WageType": if (NoIT15){
		 								driver.close();
		 								JOptionPane.showMessageDialog(null, ELINK+" eLink does not exist for "+ListOfCountry[SelCountry]+" country", "ERROR", JOptionPane.ERROR_MESSAGE);
		 								return;}
	 						WinAuth();
	 						break;
		 	}
 }
 
@After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

 
}
