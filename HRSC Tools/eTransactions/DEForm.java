package eTransactions;

import org.junit.Test;
import org.openqa.selenium.support.ui.Select;
import javax.swing.JOptionPane;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

public class DEForm extends _eTransactions_Variables {

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
 public static void Werkswechsel() throws Exception {
	  //DEFINE NEW FORM FIELDS
	  			String GMIN_Field				=	"T010320031F052";
	  			String Personalbereich1			= 	"T010320031F065";
	  			String []PersonalbereichOpt		= new String[] {"Adam Opel AG Bochum","Adam Opel AG Eisenach","Adam Opel AG Kaiserslautern","Adam Opel AG Rüsselsheim","Gedächtnisstiftung AO AG","GM Europe GmbH",
	  															"GM Powertrain Germany GmbH","GM PWT BO Germany GmbH","GM PWT KL Germany GmbH","GM PWT RÜ Germany GmbH","Opel Special Vehicles GmbH"};
	  			String [] ArtdesEntgeltsOpt		= new String[] {"Leistungsentgelt","Zeitentgelt"};
	  			String ArtdesEntgelts1			= 	"T010320031F080";
	  			String Buchungskreis1			=  	"T010320031F062";
	  			String Abrechnungskreis1		=	"T010320031F027";
	  			String Teilbereich1				=  	"T010320031F066";
	  			String Kostenstelle				=	"T010320031F000";
	  			String DUVONummer				= 	"T010320031F006";
	  			String GMLevel					=	"T010320031F001";
	  			String DirektIndirekt			=	"T010320031F002";
	  			String Mitarbeiterkreis			=	"T010320031F022";
	  			String Mitarbeitergruppe		=	"T010320031F023";
	  			String Belastungsgruppe			=	"T010320031F088";
	  			String Tätigkeitsbezeichnung	=	"T010320031F004";
	  			String OperationPosition		=	"T010320031F003";
	  			/*String Geburtsdatum				=  	"img[alt=\"Kalender\"]";
	  			String EintrittinKonzern		=	"(//img[@alt='Kalender'])[2]";*/
	  			String IRMAZ					=	"T010320031F026";
	  			String IRMAZ2					=	"//input[@name='T010320031F026'][2]";
	  			String von						=	"(//img[@alt='Kalender'])[3]";
	  			String bis						=	"(//img[@alt='Kalender'])[4]";
	  			String Personalbereich2			= 	"T010320031F079";
	  			String ArtdesEntgelts2			= 	"T010320031F081";
	  			String DepartmentID				=	"T010320031F091";
	  			String Buchungskreis2			=  	"T010320031F032";
	  			String Abrechnungskreis2		=	"T010320031F029";
	  			String Teilbereich2				=  	"T010320031F035";
	  			String NueKostenstelle			=	"T010320031F048";
	  			String NueBelastungsgruppe		=	"T010320031F089";
	  			String GMINPersonalreferenten	=	"T010320031F045";	
	  			String GMINVorgesetzten			=	"T010320031F046";

   	try{
	 driver.switchTo().frame("formframe");
   	driver.findElement(By.name(GMIN_Field)).clear();
   	driver.findElement(By.name(GMIN_Field)).sendKeys(GMIN);
    driver.findElement(By.id(LookUp)).click();
    Thread.sleep(4000);
    new Select (driver.findElement(By.name(Personalbereich1))).selectByVisibleText(PersonalbereichOpt[4]);
      	new Select (driver.findElement(By.name(ArtdesEntgelts1))).selectByVisibleText(ArtdesEntgeltsOpt[1]);
       	driver.findElement(By.name(Buchungskreis1)).clear();
       	driver.findElement(By.name(Buchungskreis1)).sendKeys("6541");
       	driver.findElement(By.name(Abrechnungskreis1)).clear();
       	driver.findElement(By.name(Abrechnungskreis1)).sendKeys("PB");
       	driver.findElement(By.name(Teilbereich1)).clear();
       	driver.findElement(By.name(Teilbereich1)).sendKeys("2200");
       	driver.findElement(By.name(Kostenstelle)).clear();
       	driver.findElement(By.name(Kostenstelle)).sendKeys("658123471122");
       	driver.findElement(By.name(DUVONummer)).clear();
       	driver.findElement(By.name(DUVONummer)).sendKeys("54712012");
       	driver.findElement(By.name(GMLevel)).clear();
       	driver.findElement(By.name(GMLevel)).sendKeys("5412");
       	driver.findElement(By.name(DirektIndirekt)).clear();
       	driver.findElement(By.name(DirektIndirekt)).sendKeys("D");
       	driver.findElement(By.name(Mitarbeiterkreis)).clear();
       	driver.findElement(By.name(Mitarbeiterkreis)).sendKeys("B0");
       	driver.findElement(By.name(Mitarbeitergruppe)).clear();
       	driver.findElement(By.name(Mitarbeitergruppe)).sendKeys("2");
       	driver.findElement(By.name(Belastungsgruppe)).clear();
       	driver.findElement(By.name(Belastungsgruppe)).sendKeys("54787998");
       	driver.findElement(By.name(Tätigkeitsbezeichnung)).clear();
       	driver.findElement(By.name(Tätigkeitsbezeichnung)).sendKeys("GME HR TESTING");
       	driver.findElement(By.name(OperationPosition)).clear();
       	driver.findElement(By.name(OperationPosition)).sendKeys("TEST MANAGER XEROX");
       /*	Thread.sleep(3000);
    	driver.findElement(By.cssSelector(Geburtsdatum)).click();
    	Thread.sleep(3000);
    		CalendarPopupHandle();
    	Thread.sleep(6000);
    	driver.findElement(By.linkText("24")).click();
    	driver.switchTo().window(parentHandle);
    	driver.switchTo().frame("formframe");
   	   	Thread.sleep(3000);
   	   	driver.findElement(By.xpath(EintrittinKonzern)).click();
   	   	Thread.sleep(2000);
   			CalendarPopupHandle();
   		Thread.sleep(7000);
   			driver.findElement(By.linkText("13")).click();
   			driver.switchTo().window(parentHandle);
   			driver.switchTo().frame(0);*/
   		driver.findElement(By.name(IRMAZ)).clear();
   	    driver.findElement(By.name(IRMAZ)).sendKeys("500");
   	    driver.findElement(By.xpath(IRMAZ2)).clear();
	    driver.findElement(By.xpath(IRMAZ2)).sendKeys("20");
	    Thread.sleep(3000);
    	driver.findElement(By.xpath(von)).click();
    	Thread.sleep(3000);
    		CalendarPopupHandle();
    	Thread.sleep(10000);
    	driver.findElement(By.linkText("10")).click();
    	driver.switchTo().window(parentHandle);
    	driver.switchTo().frame("formframe");
   	   	Thread.sleep(3000);
   	   	driver.findElement(By.xpath(bis)).click();
   	   	Thread.sleep(1000);
   			CalendarPopupHandle();
   		Thread.sleep(11000);
   			driver.findElement(By.linkText("13")).click();
   			driver.switchTo().window(parentHandle);
   			driver.switchTo().frame(0);
   		new Select (driver.findElement(By.name(Personalbereich2))).selectByVisibleText(PersonalbereichOpt[1]);
   	    new Select (driver.findElement(By.name(ArtdesEntgelts2))).selectByVisibleText(ArtdesEntgeltsOpt[0]);
   		driver.findElement(By.name(DepartmentID)).clear();
   	   	driver.findElement(By.name(DepartmentID)).sendKeys("GB65645451");
   	   	driver.findElement(By.name(Buchungskreis2)).clear();
    	driver.findElement(By.name(Buchungskreis2)).sendKeys("8541");
    	driver.findElement(By.name(Abrechnungskreis2)).clear();
    	driver.findElement(By.name(Abrechnungskreis2)).sendKeys("PA");
    	driver.findElement(By.name(Teilbereich2)).clear();
    	driver.findElement(By.name(Teilbereich2)).sendKeys("2200");
    	driver.findElement(By.name(NueKostenstelle)).clear();
    	driver.findElement(By.name(NueKostenstelle)).sendKeys("986123471122");
       	driver.findElement(By.name(NueBelastungsgruppe)).clear();
       	driver.findElement(By.name(NueBelastungsgruppe)).sendKeys("96487998");
       	driver.findElement(By.name(GMINPersonalreferenten)).clear();
    	driver.findElement(By.name(GMINPersonalreferenten)).sendKeys("123456789");
       	driver.findElement(By.name(GMINVorgesetzten)).clear();
       	driver.findElement(By.name(GMINVorgesetzten)).sendKeys("987654321");
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
 public static void Versetzung() throws Exception {
	  //DEFINE NEW FORM FIELDS
	  			String GMIN_Field				=	"T010200061F002";
	  			String Mabnahmenart				= 	"T010200061F082";
	  			String []MabnahmenartOpt		= 	new String[] {"Versetzung/Ummeldung","Organisationsänderung","Tätigkeitsänderung","Werkswechsel (Übernahme)","Entgeltveränderung","Personenkreiswechsel",
	  															"Arbeitszeitänderung","Rückkehr/Wiederaufnahme","Status Ruhend","Freigabe/Übernahme"};
	  			String Anmerkungen				=  	"T010200061F334";
	  			String gültig_ab				=  	"img[alt=\"Kalender\"]";
	  			String geplant_bis				=	"(//img[@alt='Kalender'])[2]";
	  			String NueKostenstelle			=	"T010200061F045";
	  			String GMINVorgesetzten			=	"T010200061F368";
	  			String [] ArtdesEntgeltsOpt		= new String[] {"Leistungsentgelt","Zeitentgelt"};
	  			String ArtdesEntgelts1			= 	"T010200061F363";  			

  	try{
  	driver.switchTo().window(parentHandle);
    driver.switchTo().frame(0);
  	driver.findElement(By.name(GMIN_Field)).clear();
  	driver.findElement(By.name(GMIN_Field)).sendKeys(GMIN);
   driver.findElement(By.id(LookUp)).click();
   Thread.sleep(4000);
   new Select (driver.findElement(By.name(Mabnahmenart))).selectByVisibleText(MabnahmenartOpt[4]);
     	new Select (driver.findElement(By.name(ArtdesEntgelts1))).selectByVisibleText(ArtdesEntgeltsOpt[1]);
      	driver.findElement(By.name(Anmerkungen)).clear();
      	driver.findElement(By.name(Anmerkungen)).sendKeys("this is a test for this field");
      	driver.findElement(By.cssSelector(gültig_ab)).click();
       	Thread.sleep(3000);
       		CalendarPopupHandle();
       	Thread.sleep(7000);
       	driver.findElement(By.linkText("24")).click();
       	driver.switchTo().window(parentHandle);
       	driver.switchTo().frame("formframe");
      	driver.findElement(By.xpath(geplant_bis)).click();
      	Thread.sleep(3000);
      			CalendarPopupHandle();
      	Thread.sleep(8000);
      			driver.findElement(By.linkText("13")).click();
      			driver.switchTo().window(parentHandle);
      			driver.switchTo().frame(0);
      	driver.findElement(By.name(NueKostenstelle)).clear();
      	driver.findElement(By.name(NueKostenstelle)).sendKeys("986123471122");
      	driver.findElement(By.name(GMINVorgesetzten)).clear();
      	driver.findElement(By.name(GMINVorgesetzten)).sendKeys("987654321");
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
 public static void Tatigkeit() throws Exception {
	  //DEFINE NEW FORM FIELDS
	  			String GMIN_Field				=	"T010230040F002";
	  			String LookUp 					= 	"lookitup_affected";
	  			String Mabnahmenart				= 	"T010230040F103";
	  			String []MabnahmenartOpt		= 	new String[] {"Tätigkeitsänderung","Entgeltveränderung","Arbeitszeitänderung"};
	  			String Anmerkungen				=  	"T010230040F325";
	  			String gültig_ab				=  	"img[alt=\"Kalender\"]";
	  			String geplant_bis				=	"(//img[@alt='Kalender'])[2]";
	  			String Tätigkeitsbezeichnung	=	"T010230040F074";
	  			String Belastungsgruppe			=	"T010230040F374";
	  			String Funktionsfach			= 	"T010230040F375";  			

 	try{
 	driver.switchTo().window(parentHandle);
   driver.switchTo().frame(0);
 	driver.findElement(By.name(GMIN_Field)).clear();
 	driver.findElement(By.name(GMIN_Field)).sendKeys(GMIN);
  driver.findElement(By.id(LookUp)).click();
  Thread.sleep(4000);
  new Select (driver.findElement(By.name(Mabnahmenart))).selectByVisibleText(MabnahmenartOpt[1]);
     	driver.findElement(By.name(Anmerkungen)).clear();
     	driver.findElement(By.name(Anmerkungen)).sendKeys("this is a test for this field");
     	driver.findElement(By.cssSelector(gültig_ab)).click();
      	Thread.sleep(3000);
      		CalendarPopupHandle();
      	Thread.sleep(7000);
      	driver.findElement(By.linkText("24")).click();
      	driver.switchTo().window(parentHandle);
      	driver.switchTo().frame("formframe");
     	driver.findElement(By.xpath(geplant_bis)).click();
     	Thread.sleep(3000);
     			CalendarPopupHandle();
     	Thread.sleep(8000);
     			driver.findElement(By.linkText("13")).click();
     			driver.switchTo().window(parentHandle);
     			driver.switchTo().frame(0);
     	driver.findElement(By.name(Tätigkeitsbezeichnung)).clear();
     	driver.findElement(By.name(Tätigkeitsbezeichnung)).sendKeys("986123471122");
     	driver.findElement(By.name(Belastungsgruppe)).clear();
     	driver.findElement(By.name(Belastungsgruppe)).sendKeys("987654321");
     	driver.findElement(By.name(Funktionsfach)).clear();
     	driver.findElement(By.name(Funktionsfach)).sendKeys("ASF4001");
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