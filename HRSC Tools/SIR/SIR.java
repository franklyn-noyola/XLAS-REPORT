package SIR;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.junit.Test;
import static org.junit.Assert.fail;

import java.util.Calendar;

import javax.swing.JOptionPane;

import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.WebDriverWait;

public class SIR extends _SIR_Variables {
public static boolean InvalidGMIN;
public static boolean SameDate;
public static boolean InvalidYear;
public static boolean InvalidDate;
public static boolean OneDate; public static String Country; 
public static String  YearToSearch;public static String  YearToSearchE;
public static int YearTo;public static boolean SeveralFound;public static boolean OneFound;public static int YearToE;
public static String  MonthToSearch;public static String  MonthToSearchE;
public static int Month;
public static String MonthC;
public static int DayV;public static boolean Asser1;public static int DayVE;
public static String DayToSearch;public static String DayToSearchE;  
public static String DayC;public static String DateC1;public static String DateC2;
public static boolean DiffDate;public static String GMINS;
  

public static void WindowPopupHandle() throws Exception{
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

}

private static void DateInvalid() throws Exception{
		if (InvalidDate){
			driver.close();	
			JOptionPane.showMessageDialog(null, "Day is invalid of Selected Month", "ERROR", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (InvalidYear){
			driver.close();
			JOptionPane.showMessageDialog(null, "Year is invalid", "ERROR", JOptionPane.ERROR_MESSAGE);
			return;
		}  
		
}

public static void CreationFrom() throws Exception{
	  YearToSearch = JOptionPane.showInputDialog(null, "Type Year to Search for Creation Date From", "Creation Date From Year Request", JOptionPane.QUESTION_MESSAGE);
	  YearTo = Integer.parseInt(YearToSearch);
	  if(YearToSearch.isEmpty()){
	 		InvalidYear = true;
	 		return;
	 	}
	 	if(YearTo < 2004 || YearTo  > 2015){
	 		InvalidYear = true;
	 		return;
	 	}
	MonthToSearch = (String) JOptionPane.showInputDialog(null, "Select Month to Search for End Date", "End Date Month Selection", JOptionPane.INFORMATION_MESSAGE, null,
				  EnMonth, EnMonth[0]);
		int i;
			for (i=0; i<12; i++){
				if (MonthToSearch.equals(EnMonth[i])){
					Month = i;
					
				}
		  }
		String Month1 = Integer.toString(Month+1);
				if (Month1.length()<2){
					MonthC = "0"+ Month1;
				}else{
					MonthC = Month1;
				}
			
			   Calendar calendar = Calendar.getInstance();
			   calendar.set(YearTo, Month, 1);
			   int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			   DayToSearch = JOptionPane.showInputDialog(null, "Type Day to Search for End Date", "End Date Day Selection", JOptionPane.QUESTION_MESSAGE);
				DayV = Integer.parseInt(DayToSearch);
				if(DayV < 1 || DayV  > lastDay || DayToSearch.isEmpty()){
			 		InvalidDate = true;
			 		return;
			 	}
				if (DayToSearch.length()<2){
					DayC = "0"+DayToSearch;
				}else{
					DayC = DayToSearch;
				}
				DateC1 = DayC+"/"+MonthC+"/"+YearToSearch;
				
 	 
}
public static void CreationTo() throws Exception{
	  YearToSearchE = JOptionPane.showInputDialog(null, "Type Year to Search for Creation Date From", "Creation Date From Year Request", JOptionPane.QUESTION_MESSAGE);
	  YearToE = Integer.parseInt(YearToSearchE);
	  if(YearToSearchE.isEmpty()){
	 		InvalidYear = true;
	 		return;
	 	}
	 	if(YearToE < 2004 || YearToE  > 2015){
	 		InvalidYear = true;
	 		return;
	 	}
	MonthToSearchE = (String) JOptionPane.showInputDialog(null, "Select Month to Search for End Date", "End Date Month Selection", JOptionPane.INFORMATION_MESSAGE, null,
				  EnMonth, EnMonth[0]);
		int i;
			for (i=0; i<12; i++){
				if (MonthToSearchE.equals(EnMonth[i])){
					Month = i;
				}
		  }
		String Month1 = Integer.toString(Month+1);
				if (Month1.length()<2){
					MonthC = "0"+ Month1;
				}else{
					MonthC = Month1;
				}
			
			   Calendar calendar = Calendar.getInstance();
			   calendar.set(YearToE, Month, 1);
			   int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			   DayToSearchE = JOptionPane.showInputDialog(null, "Type Day to Search for End Date", "End Date Day Selection", JOptionPane.QUESTION_MESSAGE);
				DayVE = Integer.parseInt(DayToSearchE);
				if(DayVE < 1 || DayVE > lastDay || DayToSearchE.isEmpty()){
			 		InvalidDate = true;
			 		return;
			 	}
				if (DayToSearchE.length()<2){
					DayC = "0"+DayToSearchE;
				}else{
					DayC = DayToSearchE;
				}
				DateC2 = DayC+"/"+MonthC+"/"+YearToSearchE;	
	 
}

  public static void GMINValidation() throws Exception{
	  	
	 	GMINS = JOptionPane.showInputDialog(null, "TYPE NEW GMIN TO TEST", "GMIN Request", JOptionPane.QUESTION_MESSAGE);
	 	if(GMINS.length()< 9 ||GMINS.length()>9){
	 		InvalidGMIN = true;
	 		return;
	 	}
}
  
  private static void DateValidation() throws Exception{
	  CreationFrom();
	  if (InvalidDate || InvalidYear){
		  return;
	  }
	  int CreationFromDate = JOptionPane.showConfirmDialog(null, "Do you want to use the Creaton To date field with same date as Creation From Date", "Creation From Date Request", JOptionPane.YES_NO_OPTION);
	  if (CreationFromDate== JOptionPane.YES_OPTION){
		  SameDate = true;  
		  OneDate = false;
		  return;
	  }
	  if (!SameDate){
		 int CreationToReq = JOptionPane.showConfirmDialog(null, "Do you want to use the Creation To Date with another Date Range", "Creation To Date Range Request", JOptionPane.YES_NO_OPTION);
		 if (CreationToReq== JOptionPane.YES_OPTION){
			  DiffDate = true;
			  SameDate=false;
			  OneDate = false;
			  CreationTo();
			  return;
		}else{
			 DiffDate = false;
			 OneDate = true;
			 
		 }
	  }
  }  
  public static void WindowsAuth() throws Exception{
  	  		driver.get(baseUrl);
  	  		Thread.sleep(4000);
  	  		driver.findElement(By.name(UserName)).sendKeys(username);
  	  		driver.findElement(By.name(Password)).sendKeys(password);
  	  		driver.findElement(By.name(Login)).click();
  	  		Thread.sleep(2000);
  	  		WindowPopupHandle();
  	  		driver.findElement(By.id(Accept)).click();
  	  		driver.findElement(By.name(Submit)).click();
  	  		Thread.sleep(4000);
  	  		driver.switchTo().window(parentHandle);
  	  		driver.findElement(By.linkText(LookUP)).click();
  }
  public static void Search() throws Exception{
  		driver.findElement(By.name(GMIN)).sendKeys(GMINS);
  		new Select (driver.findElement(By.name(CountryF))).selectByValue(Country);
  		new Select (driver.findElement(By.name(DocType))).deselectAll();
  		new Select (driver.findElement(By.name(DocType))).selectByValue("FORM");
  		new Select (driver.findElement(By.name(FormType))).deselectAll();  		
  		new Select (driver.findElement(By.name(FormType))).selectByVisibleText(eFormSelection);
  		if (SameDate){
  			driver.findElement(By.name(CreationDateFrom)).sendKeys(DateC1);
  			driver.findElement(By.name(CreationDateTo)).sendKeys(DateC1);
  		}
  		if (!SameDate){
  			driver.findElement(By.name(CreationDateFrom)).sendKeys(DateC1);
  			driver.findElement(By.name(CreationDateTo)).sendKeys(DateC2);
  		}
  		if (!OneDate){
  			driver.findElement(By.name(CreationDateFrom)).sendKeys(DateC1);
  		}
  		new Select (driver.findElement(By.name(Reject))).selectByVisibleText(RejectOP[0]);
  		driver.findElement(By.xpath("//img[contains(@src, 'images/EN/btn_search2.gif')]")).click();
  		Thread.sleep(3000);
  		driver.switchTo().window(parentHandle); 
  		WebDriverWait wait = new WebDriverWait(driver, 1);
  		Asser1 = true;
  		while (Asser1){
  		try{
  			if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='images/EN/nav_user_bookmark.gif']"))).isDisplayed()){
  				JOptionPane.showMessageDialog(null, "One Document has been found and viewed", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
  				Asser1 = false;
  				driver.close();
  				return;
  			}
  		}catch (Exception e){}
  		try{
  			if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains (@alt,'Perform A New Search')]"))).isDisplayed()){
  				driver.findElement(By.xpath("//*[@id='results']/table[2]/tbody/tr[1]/td[11]/a")).click();
  				Thread.sleep(500);
  				driver.findElement(By.xpath("//*[@id='results']/table[2]/tbody/tr[1]/td[11]/a")).click();
  				Thread.sleep(500);
  				driver.findElement(By.xpath("//*[@id='results']/table[2]/tbody/tr[2]/td[2]/a")).click();
  				Thread.sleep(5000);
  				JOptionPane.showMessageDialog(null, "Document has been found and viewed", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
  				Asser1 = false;
  				driver.close();
  				return;
  			}
  		}catch (Exception e){}
			JOptionPane.showMessageDialog(null, "No Records Found", "ERROR", JOptionPane.ERROR_MESSAGE);
  			Asser1 = false;
  			fail ("No Records Found");
  			return;
  		}
  		  	driver.close();
  	
}

 @Test 
 	public void Execute() throws Exception{
	 Country = (String) JOptionPane.showInputDialog(null, "Select a Country to Search in SIR", "Country Selection", JOptionPane.QUESTION_MESSAGE, null,
			 								ListOfCountry, ListOfCountry[0]);
	 switch (Country){
	 	case "GB":				eFormSelection = (String) JOptionPane.showInputDialog(null, "Select eForm to Search", "eForm Selection", JOptionPane.INFORMATION_MESSAGE,null, 
	 								UKeForms, UKeForms[0]);	
	 							break;
	 	case "ES":				eFormSelection = (String) JOptionPane.showInputDialog(null, "Select eForm to Search", "eForm Selection", JOptionPane.INFORMATION_MESSAGE,null, 
	 								ESeForms, ESeForms[0]);	
	 							break;
	 	case "DE":				eFormSelection = (String) JOptionPane.showInputDialog(null, "Select eForm to Search", "eForm Selection", JOptionPane.INFORMATION_MESSAGE,null, 
	 								DEeForms, DEeForms[0]);
								break;	 							
	 	default:				JOptionPane.showMessageDialog(null, "Country Not Ready to Search", "ERROR", JOptionPane.ERROR_MESSAGE);
	 }
		GMINValidation();
		if (InvalidGMIN){
			MsgGMIN();return;
		}
		DateValidation();
		if (InvalidDate || InvalidYear){
			DateInvalid();return;
		}
		WindowsAuth();
		Search();
 }
 

}