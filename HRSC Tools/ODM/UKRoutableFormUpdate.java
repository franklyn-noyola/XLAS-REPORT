package ODM;

//import static org.junit.Assert.*;


import org.junit.Test;

//import java.awt.Robot;
//import java.awt.Toolkit;
//import java.awt.datatransfer.StringSelection;
//import java.awt.event.KeyEvent;
//import java.util.regex.Pattern;

import org.openqa.selenium.By;


import javax.swing.JOptionPane;

import org.openqa.selenium.support.ui.Select;


public class UKRoutableFormUpdate extends _ODM_Public_Variables{

@Test
public void Execute() throws Exception{
	 driver.close();
	 JOptionPane.showMessageDialog(null,"Sorry. This cannot be executed from here. Please Execute ODMActionToTake Script to Execute this Script", "ERROR", JOptionPane.ERROR_MESSAGE);
	 driver.quit();
	 return;
}
	
public static void DefinedBenefitFields() throws Exception {
		//ROUTABLE FORMS FIELDS DEFINITION
		//Defined Benefit Pension Plan
		driver.findElement(By.name("CHECKBOX13")).click();
		driver.findElement(By.name("DATETEXTzzz14")).clear();
		driver.findElement(By.name("DATETEXTzzz14")).sendKeys("10/02/2014");
		driver.findElement(By.name("CHECKBOX17")).click();
		driver.findElement(By.name("DATETEXTzzz18")).clear();
		driver.findElement(By.name("DATETEXTzzz18")).sendKeys("13/02/2014");
		driver.findElement(By.name("CHECKBOX22")).click();
		driver.findElement(By.name("DATETEXTzzz23")).clear();
		driver.findElement(By.name("DATETEXTzzz23")).sendKeys("17/02/2014");
		driver.findElement(By.name("CHECKBOX37")).click();
		driver.findElement(By.name("DATETEXTzzz38")).clear();
		driver.findElement(By.name("DATETEXTzzz38")).sendKeys("25/02/2014");
		driver.findElement(By.name("TEXTBOXzzz39")).clear();
		driver.findElement(By.name("TEXTBOXzzz39")).sendKeys("N");
		driver.findElement(By.name("TEXTBOXzzz42")).clear();
		driver.findElement(By.name("TEXTBOXzzz42")).sendKeys("123456789");
		driver.findElement(By.name("TEXTBOXzzz43")).clear();
		driver.findElement(By.name("TEXTBOXzzz43")).sendKeys("Franklyn Noyola");
		driver.findElement(By.name("TEXTBOXzzz44")).clear();
		driver.findElement(By.name("TEXTBOXzzz44")).sendKeys("franklyn.noyola@gmail.com");
		driver.findElement(By.id(UpdateForm)).click();
		Thread.sleep(2000);
		driver.quit();
		JOptionPane.showMessageDialog(null, "Routable Form has been UPDATED successfully", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
		return;
}
  
//HR Pension Plan Routable Form
  public static void HRPensionPlanFields() throws Exception{
		driver.findElement(By.name("CHECKBOX8")).click();												//Stop Pension Plan
		driver.findElement(By.name("DATETEXTzzz9")).clear();											//Effective Date
		driver.findElement(By.name("DATETEXTzzz9")).sendKeys("05/02/2014");
		driver.findElement(By.name("CHECKBOX12")).click();												//Please Tick This
		driver.findElement(By.name("CHECKBOX14")).click();												//Please Tick This
		driver.findElement(By.name("DATETEXTzzz15")).clear();											
		driver.findElement(By.name("DATETEXTzzz15")).sendKeys("10/02/2014");							//Effective Date of Fixed Prot.
		new Select (driver.findElement(By.name("DROPDOWNzzz17"))).selectByValue("Top");					//Amend Tier To
		driver.findElement(By.name("DATETEXTzzz18")).clear();			
		driver.findElement(By.name("DATETEXTzzz18")).sendKeys("18/02/2014");							//Effective Date
		driver.findElement(By.name("TEXTBOXzzz19")).clear();
		driver.findElement(By.name("TEXTBOXzzz19")).sendKeys("THERE IS A REASON");						//Reason 1
		driver.findElement(By.name("DATETEXTzzz22")).clear();
		driver.findElement(By.name("DATETEXTzzz22")).sendKeys("20/02/2014");							//DB Stop Date
		driver.findElement(By.name("DATETEXTzzz23")).clear();
		driver.findElement(By.name("DATETEXTzzz23")).sendKeys("26/02/2014");							//DB Start Date 
		driver.findElement(By.name("TEXTBOXzzz24")).clear();
		driver.findElement(By.name("TEXTBOXzzz24")).sendKeys("REASON 2");				//Reason 2
		driver.findElement(By.name("TEXTBOXzzz30")).clear();
		driver.findElement(By.name("TEXTBOXzzz30")).sendKeys("115432199");
		driver.findElement(By.name("TEXTBOXzzz31")).clear();
		driver.findElement(By.name("TEXTBOXzzz31")).sendKeys("Noyola, Franklyn");
		driver.findElement(By.id(UpdateForm)).click();
		Thread.sleep(2000);
		driver.quit();
		JOptionPane.showMessageDialog(null, "Routable Form has been UPDATED successfully", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
		return;
}
//Defined Contribution Plan Routable Form
  public static void DefinedContributionFields () throws Exception{
	  	driver.findElement(By.name("CHECKBOX18")).click();														//Stop Pension Plan
		driver.findElement(By.name("DATETEXTzzz19")).clear();													//Opt In Effective Date
		driver.findElement(By.name("DATETEXTzzz19")).sendKeys("05/02/2014");
		new Select (driver.findElement(By.name("DROPDOWNzzz23"))).selectByValue("NONSMART");					//SMART/NONSMART
		driver.findElement(By.name("DATETEXTzzz24")).clear();												
		driver.findElement(By.name("DATETEXTzzz24")).sendKeys("10/02/2014");									//Effective Date
		new Select (driver.findElement(By.name("DROPDOWNzzz27"))).selectByValue("Employee 2%, Employer 2%");	//Contribution Tier
		driver.findElement(By.name("CHECKBOX56")).click();														//I Agree
		driver.findElement(By.name("DATETEXTzzz57")).clear();
		driver.findElement(By.name("DATETEXTzzz57")).sendKeys("20/02/2014");									//Date
		driver.findElement(By.name("TEXTBOXzzz58")).clear();
		driver.findElement(By.name("TEXTBOXzzz58")).sendKeys("N");												//Signature
		driver.findElement(By.name("TEXTBOXzzz61")).clear();
		driver.findElement(By.name("TEXTBOXzzz61")).sendKeys("115432199");										//Telephone Contact
		driver.findElement(By.name("TEXTBOXzzz62")).clear();
		driver.findElement(By.name("TEXTBOXzzz62")).sendKeys("Noyola, Franklyn");								//Contact Name
		driver.findElement(By.name("TEXTBOXzzz63")).clear();
		driver.findElement(By.name("TEXTBOXzzz63")).sendKeys("franklyn.noyola@gmail.com");						//Contact Email.
		driver.findElement(By.id(UpdateForm)).click();
		Thread.sleep(2000);
		driver.quit();
		JOptionPane.showMessageDialog(null, "Routable Form has been UPDATED successfully", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
		return;
}
 
}