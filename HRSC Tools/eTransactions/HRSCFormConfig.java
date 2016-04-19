package eTransactions;
import org.junit.Test;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;


import javax.swing.JOptionPane;

import org.openqa.selenium.*;

public class HRSCFormConfig extends _eTransactions_Variables {
public static boolean close;
  
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
 
public static void MsgGMIN() throws Exception{
	if (InvalidGMIN){
		driver.close();
		JOptionPane.showMessageDialog(null, "GMIN is invalid", "ERROR", JOptionPane.ERROR_MESSAGE);
		return;
	}
	if (NoCountryMatch){
		driver.close();
		JOptionPane.showMessageDialog(null, "GMIN does not match with Country selected or does not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
		return;
	}
	return;
}
  public static void GMINValidation() throws Exception{
	  	NoCountryMatch = true;
	  	close = true;
	 	GMIN = JOptionPane.showInputDialog(null, "TYPE NEW GMIN TO TEST", "GMIN Request", JOptionPane.QUESTION_MESSAGE);
		GMINL = new String(GMIN);
	 	if(GMINL.length()< 9 ||GMINL.length()>9){
	 		InvalidGMIN = true;
	 		close = true;
	 		return;
	 	}
	 	 String connectionUrl = "jdbc:sqlserver://GMEHR-TEST01;" + "user=TestTeam; password=T3stT3am";
		    stmt = null;
		    rs = null;
	      try {
	         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	         Connection conn = DriverManager.getConnection(connectionUrl);
	         stmt = conn.createStatement();
	         queryString = "select top 100 * from [gmforms].[dbo].[Employees] where GMIN_ID ="+"'"+GMIN+"'";
	         rs = stmt.executeQuery(queryString);
	         while (rs.next()) {
	        	PCD = rs.getString("Pay_Country_CD");
	        	
	         }
	         if (PCD.equals(CountryData)){
	        	 close = false;
	        	 NoCountryMatch = false;
	        	 return;
	         }
	      } catch (Exception e) {
	      }
	 	return;
}

  public static void WindowsAuth() throws Exception{
  	  driver.get(PortalPage[SelCountry]);
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
	 	Thread.sleep(4000);
  }
  public static void SecurityQuestionsEmployeeTab() throws Exception{
      driver.findElement(By.linkText(eLink)).click();
      driver.switchTo().window(parentHandle);
      driver.switchTo().frame(0);
      Thread.sleep(3000);
      driver.findElement(By.name("id_employee")).clear();
      driver.findElement(By.name("id_employee")).sendKeys(GMIN);
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
      	driver.findElement(By.name("answer[1]")).sendKeys("1");
      	count1 = 1;
      }else{
      	count1 = 0;
      }
          if (q2== true){
          	driver.findElement(By.name("answer[2]")).sendKeys("1");
          	count2 = 1;   	
      }else {
      	count2 = 0;
      }
       if (q3== true){
      	 driver.findElement(By.name("answer[4]")).sendKeys("1");
      	count3 = 1;
      }else{
      	count3 = 0;
      }
      count = count1 + count2+ count3;
      }while (count < 2);
      driver.findElement(By.xpath(Check[SelCountry])).click();
  	Thread.sleep(2000); 
  }
  
  public static void SecurityQuestionsManagerTab() throws Exception{
	  driver.findElement(By.linkText(ManagerTab[SelCountry])).click();
	  String parentHandle = driver.getWindowHandle();
	  driver.findElement(By.linkText(eLink)).click();
	  driver.switchTo().window(parentHandle);
      driver.switchTo().frame(0);
      Thread.sleep(3000);
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
      	driver.findElement(By.name("answer[1]")).sendKeys("1");
      	count1 = 1;
      }else{
      	count1 = 0;
      }
          if (q2== true){      	
          	driver.findElement(By.name("answer[2]")).sendKeys("1");
          	count2 = 1;   	
      }else {
      	count2 = 0;
      }
       if (q3== true){
      	 driver.findElement(By.name("answer[4]")).sendKeys("1");
      	count3 = 1;
      }else{
      	count3 = 0;
      }
      count = count1 + count2+ count3;
      }while (count < 2);
      driver.findElement(By.xpath(Check[SelCountry])).click();
  	Thread.sleep(2000); 
  }
  
  public static void SecurityQuestionsHRTab() throws Exception{
	  driver.findElement(By.linkText(Country[SelCountry])).click();
	  String parentHandle = driver.getWindowHandle();
	  driver.switchTo().window(parentHandle);
      driver.switchTo().frame(0);
      Thread.sleep(3000);
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
          driver.findElement(By.name("answer[1]")).sendKeys("1");
      	count1 = 1;
      }else{
      	count1 = 0;
      }
          if (q2== true){
          driver.findElement(By.name("answer[2]")).sendKeys("1");
          	count2 = 1;   	
      }else {
      	count2 = 0;
      }
       if (q3== true){
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
   	Thread.sleep(1000);
   	driver.switchTo().frame(0);
   	driver.findElement(By.xpath(eFormsC[FS])).click();
   	Thread.sleep(4000);
  }
  
  public static void UKTransaction() throws Exception{
		eFormSelection = (String) JOptionPane.showInputDialog(null, "Select eForm to Test", "eForm Selection", JOptionPane.INFORMATION_MESSAGE,null, 
				UKeForms, UKeForms[0]);	
		switch (eFormSelection){
				case "Bank Details Change": 			FS = 3;eLink="Change bank account details";GMINValidation();if (close){MsgGMIN();return;}WindowsAuth();SecurityQuestionsEmployeeTab();UKForm.BankDetails();break;
				case "Grievance Form":					FS = 10;eLink = "An employee has a grievance";GMINValidation(); if (close){MsgGMIN();return;}WindowsAuth();SecurityQuestionsManagerTab();AgentGMIN = UKForm.GrievanceFormField; UKForm.GrievanceForm();break;
				case "Address Marital Status": 			FS = 0;eLink="My name has changed";GMINValidation();if (close){MsgGMIN();return;}WindowsAuth();SecurityQuestionsEmployeeTab();UKForm.AddressMarital();break;
				case "Department Transfer":				FS = 6;eLink="I want to transfer an employee to another department";GMINValidation();if (close){MsgGMIN();return;};WindowsAuth();SecurityQuestionsManagerTab();
														AgentGMIN = UKForm.DepartmentTransferField; UKForm.DepartmentTransfer();break;
				case "HR Pension Form":					FS = 11;GMINValidation();if (close){MsgGMIN();return;}WindowsAuth();AgentGMIN = UKForm.HRPensionGMINField; SecurityQuestionsHRTab();break;
				case "Defined Benefit Pension Plan": 	FS = 4;eLink="Defined Benefit Pension Plan Form";GMINValidation();if (close){MsgGMIN();return;}WindowsAuth();SecurityQuestionsEmployeeTab();UKForm.DefinedBenefit();break;
				case "Defined Contribution Pension Plan":FS = 5;eLink="Defined Contribution Pension Plan Form";GMINValidation();if (close){MsgGMIN();return;}WindowsAuth();SecurityQuestionsEmployeeTab();UKForm.DefinedContributionPension();break;
				default:								JOptionPane.showMessageDialog(null, eFormSelection +" Not Ready To Test", "ERROR", JOptionPane.ERROR_MESSAGE);driver.close();break;
		}
	}
  public static void ESTransaction() throws Exception{
	  	eFormSelection = (String) JOptionPane.showInputDialog(null, "Select eForm to Test", "eForm Selection", JOptionPane.INFORMATION_MESSAGE,null, 
				ESeForms, ESeForms[0]);
	  	switch(eFormSelection){
	  			case "Datos Bancarios": 	FS = 11;eLink="Cambio de datos bancarios"; GMINValidation();if (close){MsgGMIN();return;}WindowsAuth();SecurityQuestionsEmployeeTab();ESForm.DatosBancarios();return;
	  			default:					JOptionPane.showMessageDialog(null, eFormSelection +" Not Ready To Test", "ERROR", JOptionPane.ERROR_MESSAGE);driver.close();break;
	  	}
		
	 }		
 
  public static void DETransaction() throws Exception{
	  eFormSelection = (String) JOptionPane.showInputDialog(null, "Select eForm to Test", "eForm Selection", JOptionPane.INFORMATION_MESSAGE,null, 
				DEeForms, DEeForms[0]);
	  switch(eFormSelection){
	  case "Werkswechsel": 									FS = 30; GMINValidation();if (close){MsgGMIN();return;}WindowsAuth();SecurityQuestionsHRTab();DEForm.Werkswechsel();break;
	  case "Eintritt": 										FS = 17;WindowsAuth();SecurityQuestionsHRTab();AllNewHires.Eintritt();break;
	  case "Änderung - Entgelt, Tätigkeit u. Versetzung":	FS = 0;eLink="Ich möchte für meinen Mitarbeiter eine Versetzung initiieren";GMINValidation();if (close){MsgGMIN();return;}WindowsAuth();SecurityQuestionsManagerTab();DEForm.Versetzung();break;
	  case "Änderung - Entgelt, Tätigkeit":					FS = 8;;eLink="Ich möchte für meinen Mitarbeiter eine Tätigkeitsänderung initiieren";GMINValidation();if (close){MsgGMIN();return;}WindowsAuth();SecurityQuestionsManagerTab();DEForm.Tatigkeit();break;
	  default:												JOptionPane.showMessageDialog(null, eFormSelection +" Not Ready To Test", "ERROR", JOptionPane.ERROR_MESSAGE);driver.close();break;
	  }
  }		
  public static void BETransaction() throws Exception{
		LanguageSel = (String) JOptionPane.showInputDialog(null, "Select Language to Select Form", "Language Selection", JOptionPane.QUESTION_MESSAGE,null, 
					new Object[] {"Dutch", "English"}, "Language");
			switch (LanguageSel){
			case "Dutch":
								LANSQ = BESQ;
								SelCountry = 3;
								BEEformS=BEEformsNL;LAN="NL";
								eFormSelection = (String) JOptionPane.showInputDialog(null, "Select eForm to Test", "eForm Selection", JOptionPane.INFORMATION_MESSAGE,null, 
																BEeFormsNL, BEeFormsNL[0]);
								
								switch (eFormSelection){
								case "Aanpassing bankrekening":	FS = 0;eLink="Ik wil een nieuw bankrekeningnummer doorgeven";eFormSel=1;}
								break;
			
			case "English":
								LANSQ = ENSQ;
								SelCountry = 3;
								BEEformS=BEEformsEN;LAN="EN";
								eFormSelection = (String) JOptionPane.showInputDialog(null, "Select eForm to Test", "eForm Selection", JOptionPane.INFORMATION_MESSAGE,null, 
																							BEeFormsEN, BEeFormsEN[0]);
								switch (eFormSelection){
								case "Change bank details":	  FS = 3;eLink="I want to inform on a new bank account number";eFormSel=1;}		
								break;
  	}
						
			switch (eFormSel){
				case 1:		GMINValidation();if (close){MsgGMIN();return;}WindowsAuth();if (LAN.equals("EN")){driver.findElement(By.linkText("English")).click();SelCountry=0;}
							SecurityQuestionsEmployeeTab();BEForm.BankDetails();break;
				default:	JOptionPane.showMessageDialog(null, eFormSelection +" Not Ready To Test", "ERROR", JOptionPane.ERROR_MESSAGE);driver.close();break;
							}
  
}
  public static void ATTransaction() throws Exception{
	  	eFormSelection = (String) JOptionPane.showInputDialog(null, "Select eForm to Test", "eForm Selection", JOptionPane.INFORMATION_MESSAGE,null, 
				ATeForms, ATeForms[0]);
	  	switch(eFormSelection){
	  			case "Änderung - Bankverbindung": 	FS = 2;eLink="Änderung der Bankverbindung"; GMINValidation();if (close){MsgGMIN();return;}WindowsAuth();SecurityQuestionsEmployeeTab();ATForm.Bankverbindung();return;
	  			default:							JOptionPane.showMessageDialog(null, eFormSelection +" Not Ready To Test", "ERROR", JOptionPane.ERROR_MESSAGE);driver.close();break;
	  	}
		
	 }
  public static void FRTransaction() throws Exception{
	  	eFormSelection = (String) JOptionPane.showInputDialog(null, "Select eForm to Test", "eForm Selection", JOptionPane.INFORMATION_MESSAGE,null, 
				FReForms, FReForms[0]);
	  	switch(eFormSelection){
	  			case "Changement coord. bancaires": FS = 3;eLink="Changement coordonnées bancaires"; GMINValidation();if (close){MsgGMIN();return;}WindowsAuth();SecurityQuestionsEmployeeTab();FRForm.Changementcoordbancaires();return;
	  			default:							JOptionPane.showMessageDialog(null, eFormSelection +" Not Ready To Test", "ERROR", JOptionPane.ERROR_MESSAGE);driver.close();break;
	  	}
		
	 }
  public static void PLTransaction() throws Exception{
	  	eFormSelection = (String) JOptionPane.showInputDialog(null, "Select eForm to Test", "eForm Selection", JOptionPane.INFORMATION_MESSAGE,null, 
				PLeForms, PLeForms[0]);
	  	switch(eFormSelection){
	  			case "Konto bankowe": FS = 5;eLink="Chcę zgłosić zmianę numeru konta bankowego"; GMINValidation();if (close){MsgGMIN();return;}WindowsAuth();SecurityQuestionsEmployeeTab();PLForm.Kontobankowe();return;
	  			default:							JOptionPane.showMessageDialog(null, eFormSelection +" Not Ready To Test", "ERROR", JOptionPane.ERROR_MESSAGE);driver.close();break;
	  	}
		
	 }
  public static void PTTransaction() throws Exception{
	  	eFormSelection = (String) JOptionPane.showInputDialog(null, "Select eForm to Test", "eForm Selection", JOptionPane.INFORMATION_MESSAGE,null, 
				PTeForms, PTeForms[0]);
	  	switch(eFormSelection){
	  			case "Confirmação de dados bancários": FS = 11;eLink="Alteração de nº de conta bancária / NIB"; GMINValidation();if (close){MsgGMIN();return;}WindowsAuth();SecurityQuestionsEmployeeTab();PTForm.Confirmaçãodedadosbancários();return;
	  			default:							JOptionPane.showMessageDialog(null, eFormSelection +" Not Ready To Test", "ERROR", JOptionPane.ERROR_MESSAGE);driver.close();break;
	  	}
		
	 }
}