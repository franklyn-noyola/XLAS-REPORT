package eTransactions;

import static org.junit.Assert.fail;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;


import org.openqa.selenium.support.ui.Select;

public class AllNewHires extends DEForm{


	
public static void Eintritt() throws Exception{
		//String Maßnahmenart				=  	"T008900047F032";
		String [] MabnahmenartOpt		= 	new String [] {"Einstellung", "Wiedereinstellung"};
		String Personalbereich1			= 	"T008900047F706";
		String []PersonalbereichOpt		= 	new String[] {"Adam Opel AG Bochum","Adam Opel AG Eisenach","Adam Opel AG Kaiserslautern","Adam Opel AG Rüsselsheim","Gedächtnisstiftung AO AG","GM Europe GmbH",
														"GM Powertrain Germany GmbH","GM PWT BO Germany GmbH","GM PWT KL Germany GmbH","GM PWT RÜ Germany GmbH","Opel Special Vehicles GmbH","Opel Eisenach GmbH"};							
		String [] ArtdesEntgeltsOpt		= 	new String[] {"Leistungsentgelt","Zeitentgelt", "OFK"};
		String ArtdesEntgelts1			= 	"T008900047F259";
		String Anrede					=  	"T008900047F003";
		String [] AnredeOpt				=	new String[] {"Herr","Frau"};
		String Vorname					=	"T008900047F000";
		String Nachname					=  	"T008900047F001";
		String Geburtsdatum				=  	"(//img[@alt='Kalender'])[2]";
		String Geburtsort				=	"T008900047F344";
		String Familienstand			=	"T008900047F002";
		String[] FamilienstandOpt		=	new String[] {"ledig/nicht verheiratet"," verheiratet"," eingetragene Partnerschaft"," geschieden"," verwitwet"};
		String Anzahl 					= 	"T008900047F233";
		String Staatsangehörigkeit		=	"T008900047F028";
		String Arbeitserlaubnis			=	"T008900047F250";
		String[] ArbeitserlaubnisOpt	=	new String[] {"ja", "nein"};
		String Hausnummer				=	"T008900047F004";
		String Postleitzahl				=	"T008900047F007";
		String Ort						=	"T008900047F006";
		String Entfernung 				=	"T008900047F137";
		String von						=	"(//img[@alt='Kalender'])[8]";
		String bis						=	"(//img[@alt='Kalender'])[9]";
		String Schulische				=	"T008900047F009";
		String [] SchulischeOpt			=	new String[] {"Grund-/Hauptschule","Realschule","Gymnasium","Fachoberschule","Gesamtschule","sonstige"};
		String Abschluss				=	"T008900047F069";
		String[] AbschlussOpt			=	new String[] {"Hauptschulabschluss","Realschulabschluss","Abitur","Fachabitur","Fachoberschulreife","kein Abschluss","sonstiger"};
		String Telefonnummer			=	"T008900047F011";
		String JobCode					= 	"T008900047F039";
		String Funktionsfach			= 	"T008900047F253";
		String Submit	=	"//input[@value='Formular übermitteln']";
		try{
		driver.switchTo().frame("formframe");
	   	driver.findElement(By.xpath("//input[@value='"+MabnahmenartOpt[0]+"']")).click();
	   	String PersonalArea = driver.findElement(By.name(Personalbereich1)).getText();
		    if(PersonalArea.contains(PersonalbereichOpt[1])){
		    	new Select (driver.findElement(By.name(Personalbereich1))).selectByVisibleText(PersonalbereichOpt[1]);
		    }else{
		    	driver.close();
		    	JOptionPane.showMessageDialog(null, "Value: " +PersonalbereichOpt[1]+ " has been changed or does not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
		  	  	fail("Field/Value does belong to this eForm anymore");
		  	  return; 
		    }
		    	new Select (driver.findElement(By.name(ArtdesEntgelts1))).selectByVisibleText(ArtdesEntgeltsOpt[2]);
		    	new Select (driver.findElement(By.name(Anrede))).selectByVisibleText(AnredeOpt[0]);
		       	driver.findElement(By.name(Vorname)).clear();
		       	driver.findElement(By.name(Vorname)).sendKeys("Franklyn");
		       	driver.findElement(By.name(Nachname)).clear();
		       	driver.findElement(By.name(Nachname)).sendKeys("Noyola");
		    	driver.findElement(By.xpath(Geburtsdatum)).click();
		    	Thread.sleep(3000);
		    		for(String winHandle : driver.getWindowHandles()){
		    			driver.switchTo().window(winHandle);
		    		}
		    	Thread.sleep(6000);
		    	driver.findElement(By.linkText("20")).click();
		    	driver.switchTo().window(parentHandle);
		    	driver.switchTo().frame("formframe");
		   	   	Thread.sleep(3000);
		       	driver.findElement(By.name(Geburtsort)).clear();
		       	driver.findElement(By.name(Geburtsort)).sendKeys("Ezekiel Garcia");
		       	new Select (driver.findElement(By.name(Familienstand))).selectByValue(FamilienstandOpt[2]);
		       	driver.findElement(By.name(Anzahl )).clear();
		       	driver.findElement(By.name(Anzahl )).sendKeys("35");
		       	driver.findElement(By.name(Staatsangehörigkeit)).clear();
		       	driver.findElement(By.name(Staatsangehörigkeit)).sendKeys("Cornella de Llobregat");
		       	driver.findElement(By.xpath("//input[@name='"+Arbeitserlaubnis+"' and @value='"+ArbeitserlaubnisOpt[1]+"']")).click();
		       	driver.findElement(By.name(Hausnummer)).clear();
		       	driver.findElement(By.name(Hausnummer)).sendKeys("Vista Alegre No. 48 1-2");
		       	driver.findElement(By.name(Postleitzahl)).clear();
		       	driver.findElement(By.name(Postleitzahl)).sendKeys("9806588");
		       	driver.findElement(By.name(Ort)).clear();
		       	driver.findElement(By.name(Ort)).sendKeys("Barcelona");
		       	driver.findElement(By.name(Entfernung )).clear();
		     

		       	driver.findElement(By.name(Entfernung )).sendKeys("51");
		    	driver.findElement(By.xpath(von)).click();
		       	Thread.sleep(3000);
	    		for(String winHandle : driver.getWindowHandles()){
	    			driver.switchTo().window(winHandle);
	    		}
	    		Thread.sleep(6000);
	    		driver.findElement(By.linkText("12")).click();
	    		driver.switchTo().window(parentHandle);
	   			driver.switchTo().frame(0);
	   			Thread.sleep(3000);
		    	driver.findElement(By.xpath(bis)).click();
		       	Thread.sleep(2000);
	    		for(String winHandle : driver.getWindowHandles()){
	    			driver.switchTo().window(winHandle);
	    		}
	    		Thread.sleep(6000);
	    		driver.findElement(By.linkText("18")).click();
	    		driver.switchTo().window(parentHandle);
	   			driver.switchTo().frame(0);
	   			new Select (driver.findElement(By.name(Schulische))).selectByVisibleText(SchulischeOpt[4]);
	   			new Select (driver.findElement(By.name(Abschluss))).selectByVisibleText(AbschlussOpt[2]);
		       	driver.findElement(By.name(Telefonnummer)).clear();
		       	driver.findElement(By.name(Telefonnummer)).sendKeys("853456789123");
		       	driver.findElement(By.name(JobCode )).clear();
		       	driver.findElement(By.name(JobCode )).sendKeys("TEST MANAGER XEROX");
		   		driver.findElement(By.name(Funktionsfach)).clear();
		   	    driver.findElement(By.name(Funktionsfach)).sendKeys("AS2001");
		   	   	driver.findElement(By.xpath(Submit)).click();
		       	Thread.sleep(1000);
		       	driver.findElement(By.xpath(Submit)).click();
		       	Thread.sleep(3000);
		   	   	driver.close();
		   	   	JOptionPane.showMessageDialog(null, "Transaction has been processed and sent to ODM", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
		 }catch(org.openqa.selenium.NoSuchElementException e){
			  driver.close();
			  JOptionPane.showMessageDialog(null, "A Field/Value has been changed or does not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
			  fail("Field/Value does belong to this eForm anymore");
			  return; 
		 }
		 
	
	
}
	

}
