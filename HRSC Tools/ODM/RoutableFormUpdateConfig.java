package ODM;

//import static org.junit.Assert.*;


import org.junit.Test;
import org.openqa.selenium.WebElement;
//import java.awt.Robot;
//import java.awt.Toolkit;
//import java.awt.datatransfer.StringSelection;
//import java.awt.event.KeyEvent;
//import java.util.regex.Pattern;
import org.openqa.selenium.By;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;



import java.util.Date;

import javax.swing.JOptionPane;

import org.openqa.selenium.support.ui.Select;
public class RoutableFormUpdateConfig extends _ODM_Public_Variables{
  public static boolean EnDateAssert;
  public static boolean asserToday;
  public static int Month;public static int MonthE;
  public static int MonthL;public static int MonthLE;
  public static int DayV;public static int DayVE;
  public static String whandle = driver.getWindowHandle();
  public static int DEP;
  public static boolean Unable;
  public static int ComDate;public static int ComDateE;
  public static int YearTo;public static String YearToSearchE;
  public static boolean GoForward;public static int YearToE;
  public static boolean SameEnDate;public static String CMonth;
  public static boolean GoForwardE;public static String MonthS;public static String DayS;
  public static boolean DifEnDate;public static String AllDateE;public static String DayToSearchE;

@Test
	public void Execute() throws Exception{
		 driver.close();
		 JOptionPane.showMessageDialog(null,"Sorry. This cannot be executed from here. Please Execute ODMActionToTake Script to Execute this Script", "ERROR", JOptionPane.ERROR_MESSAGE);
		 driver.quit();
		 return;
		 
	}
public static void StartLoadDate() throws Exception{
	driver.findElement(By.id(StartLoadDate)).click();
	AssertDate = false;
	do{
		Thread.sleep(1000);
		boolean Monthtitle = driver.findElement(By.xpath("//td[contains(@class, 'calendarMonthTitle')]")).getText().contains(AllDate);
		if (Monthtitle){
			if (asserToday){
				driver.findElement(By.xpath("//td[(@class='calendarDayToday') and contains(text(),'"+DayToSearch+"')]")).click();
				AssertDate = false;
				break;
			}
			driver.findElement(By.xpath("//td[(@class='calendarDay') and contains(text(),'"+DayToSearch+"')]")).click();
			AssertDate = false;
			break;
			
		}if (GoForward){
			driver.findElement(By.xpath("//div[contains(@class,'calendarArrowRight')]")).click();
		}else{	
			driver.findElement(By.xpath("//div[contains(@class,'calendarArrowLeft')]")).click();
			}
		
	}while (AssertDate=true);
}
public static void EndLoadDate() throws Exception{
	  driver.switchTo().window(whandle);
	  driver.switchTo().frame("content");
	  driver.findElement(By.id(EndLoadDate)).click();
		do{
			Thread.sleep(1000);
			int ETRCount = 0;
			int ETDCount = 0;
			if (SameEnDate){
				boolean Monthtitle = driver.findElement(By.cssSelector("#_Calendar2mover > tbody > tr > td.calendarMonthContainer > table.calendarMonth > tbody > tr > td.calendarMonthTitle")).getText().contains(AllDate);
				if (Monthtitle){
					if (DayV > 22){
					ETRCount = 7;
				}
				for (ETRCount = 3; ETRCount <9;ETRCount++){
					for (ETDCount = 1;ETDCount <8;ETDCount++){
						String Catch = driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[5]/td[2]/table/tbody/tr/td[5]/div/div/table/tbody/tr/td/table/tbody/tr["+ETRCount+"]/td["+ETDCount+"]")).getText();
						if (Catch.equals(DayToSearch)){
							driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[5]/td[2]/table/tbody/tr/td[5]/div/div/table/tbody/tr/td/table/tbody/tr["+ETRCount+"]/td["+ETDCount+"]")).click();
							AssertDate = false;
						}
				}
			}break;	
			}
			}
			if (DifEnDate){
				boolean MonthtitleE = driver.findElement(By.cssSelector("#_Calendar2mover > tbody > tr > td.calendarMonthContainer > table.calendarMonth > tbody > tr > td.calendarMonthTitle")).getText().contains(AllDateE);
				if (MonthtitleE){
					if (DayVE > 22){
						ETRCount = 7;
					}
					for (ETRCount = 3; ETRCount <9;ETRCount++){
						for (ETDCount = 1;ETDCount <8;ETDCount++){
							String Catch = driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[5]/td[2]/table/tbody/tr/td[5]/div/div/table/tbody/tr/td/table/tbody/tr["+ETRCount+"]/td["+ETDCount+"]")).getText();
							if (Catch.equals(DayToSearchE)){
								driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[5]/td[2]/table/tbody/tr/td[5]/div/div/table/tbody/tr/td/table/tbody/tr["+ETRCount+"]/td["+ETDCount+"]")).click();
								AssertDate = false;
							}
					}
				}break;	
				}
			}	if (GoForward||GoForwardE){
					driver.findElement(By.xpath("//div[contains(@onclick,'oboutCalendar_Calendar2.aa(0)')]")).click();
			}else{	
						driver.findElement(By.xpath("//div[contains(@onclick,'oboutCalendar_Calendar2.aa(1)')]")).click();
			}
		}while (AssertDate=true);
}
private  static void LoadStartDateRequest() throws Exception{
	  YearToSearch = JOptionPane.showInputDialog(null, "Type Year to Search", "Year Selection", JOptionPane.QUESTION_MESSAGE);
	  YearTo = Integer.parseInt(YearToSearch);
	  if(YearToSearch.isEmpty()){
	 		InvalidYear = true;
	 		return;
	 	}
	 	if(YearTo < 2004 || YearTo  > 2015){
	 		InvalidYear = true;
	 		return;
	 	}
	  MonthToSearch = (String) JOptionPane.showInputDialog(null, "Select Month to Search", "Month Selection", JOptionPane.INFORMATION_MESSAGE, null,
			  EnMonth, EnMonth[0]);
	  int i = 0;
	  Month = 0;
	  MonthL = 0;
			  for (i=0; i<12; i++){
				 if (MonthToSearch.equals(EnMonth[i])){
					EnMonth[i] = CountrySel[i];
					MonthSel = EnMonth[i];
					Month = i;
					MonthL = i+1;
				}
			  }
			   Calendar calendar = Calendar.getInstance();
			   calendar.set(YearTo, Month, 1);
			   int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			   DateFormat dateFormat = new SimpleDateFormat("dd");
			   DateFormat Yearformat = new SimpleDateFormat("yyyy");
			   DateFormat Monthformat = new SimpleDateFormat("MM");
			   Date Today = new Date();
			   String Tod = dateFormat.format(Today);
			   String Year1 = Yearformat.format(Today);
			   String Month1 = Monthformat.format(Today);
			   				   
			   String YearC = Year1.concat(Month1);
			   ComDate = Integer.parseInt(YearC);
			   
			   String CDate = Integer.toString(YearTo);
			   String CDate1 = Integer.toString(MonthL);   
			   if (CDate1.length()<2){
				   CMonth = "0".concat(CDate1);
			   }else{
				   CMonth = CDate1;
			   }   
			   String CDate3 = CDate.concat(CMonth);
			   int Datecomp = Integer.parseInt(CDate3);
			   if (Datecomp > ComDate){
				   GoForward = true;
			   }
	  DayToSearch = JOptionPane.showInputDialog(null, "Type Day to Search", "Day Selection", JOptionPane.QUESTION_MESSAGE);
		DayV = Integer.parseInt(DayToSearch);
		String CdateC = Year1.concat(Month1).concat(Tod);
		String MonthT = Integer.toString(Month+1);
			if (MonthT.length()<2){
				MonthS = "0".concat(MonthT);
			}else{
				MonthS = MonthT;
			}	
			if (DayToSearch.length()<2){
				DayS = "0"+DayToSearch;
			}else{
				DayS = DayToSearch;
			}
		String CdateC1 = YearToSearch.concat(MonthS).concat(DayS);
		int CompDate1 = Integer.parseInt(CdateC);
		int CompDate2 = Integer.parseInt(CdateC1);
		if (CompDate1 == CompDate2){
			asserToday = true;
		}else{
			asserToday = false;
		}
	 	if(DayV < 1 || DayV  > lastDay || DayToSearch.isEmpty()){
	 		InvalidDate = true;
	 		return;
	 	}
	  AllDate = MonthSel+" " + YearToSearch;
	  
}

private static void LoadEndDateRequest() throws Exception{
	  YearToSearchE = JOptionPane.showInputDialog(null, "Type Year to Search for End Date", "End Date Year Selection", JOptionPane.QUESTION_MESSAGE);
	  YearToE = Integer.parseInt(YearToSearchE);
	  if(YearToSearchE.isEmpty()){
	 		InvalidYear = true;
	 		return;
	 	}
	 	if(YearToE < 2004 || YearToE  > 2015){
	 		InvalidYear = true;
	 		return;
	 	}
	  MonthToSearch = (String) JOptionPane.showInputDialog(null, "Select Month to Search for End Date", "End Date Month Selection", JOptionPane.INFORMATION_MESSAGE, null,
			  EnMonth, EnMonth[0]);
	  int i = 0;
	  MonthE = 0;
	  MonthLE = 0;
			  for (i=0; i<12; i++){
				 if (MonthToSearch.equals(EnMonth[i])){
					EnMonth[i] = CountrySel[i];
					MonthSel = EnMonth[i];
					MonthE = i;
					MonthLE = i+1;
				}
			  }
			   Calendar calendar = Calendar.getInstance();
			   calendar.set(YearToE, MonthE, 1);
			   int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			   //DateFormat dateFormat = new SimpleDateFormat("dd");
			   DateFormat Yearformat = new SimpleDateFormat("yyyy");
			   DateFormat Monthformat = new SimpleDateFormat("MM");
			   Date Today = new Date();
			   
			   String Year1 = Yearformat.format(Today);
			   String Month1 = Monthformat.format(Today);
			   String YearC = Year1.concat(Month1);
			   ComDateE = Integer.parseInt(YearC);
			   
			   String CDate = Integer.toString(YearToE);
			   String CDate1 = Integer.toString(MonthLE);
			   if (CDate1.length()<2){
				   CMonth = "0".concat(CDate1);
			   }else{
				   CMonth = CDate1;
			   }   
			   String CDate3 = CDate.concat(CMonth);    
			   int DatecompE = Integer.parseInt(CDate3);
			   if (DatecompE > ComDateE){
				   GoForwardE= true;
			   }
	  DayToSearchE = JOptionPane.showInputDialog(null, "Type Day to Search for End Date", "End Date Day Selection", JOptionPane.QUESTION_MESSAGE);
		DayVE = Integer.parseInt(DayToSearchE);
		
	 	if(DayVE < 1 || DayV  > lastDay || DayToSearchE.isEmpty() || DayToSearchE.length()>2){
	 		InvalidDate = true;
	 		return;
	 	}
	  AllDateE = MonthSel+" " + YearToSearchE;  
}

private static void GMINValidation() throws Exception{
	  GMINID = JOptionPane.showInputDialog(null, "Type GMIN to Search", "GMIN Selection", JOptionPane.QUESTION_MESSAGE);
		String GMINL = new String(GMINID);
	 	if(GMINL.length()< 9 ||GMINL.length()>9){
	 		InvalidGMIN = true;
	 		return;
	 	}
}
	  private static void DateValidation() throws Exception{
		  int LoadEndate = JOptionPane.showConfirmDialog(null, "Do you want to use the Load EndDate field with same date as Load StartDate", "Load EndDate Selection", JOptionPane.YES_NO_OPTION);
		  if (LoadEndate== JOptionPane.YES_OPTION){
			  EnDateAssert = true;
			  SameEnDate = true;
			  LoadStartDateRequest();
		  }else{
			  EnDateAssert = false;
		  }
		  if (!SameEnDate){
			 int LoadEndateReq = JOptionPane.showConfirmDialog(null, "Do you want to use the Load EndDate field with another Date Range", "Load EndDate Range Request", JOptionPane.YES_NO_OPTION);
			 if (LoadEndateReq== JOptionPane.YES_OPTION){
				  EnDateAssert = true;
				  DifEnDate = true;
				  SameEnDate=false;
				  LoadStartDateRequest();
				  LoadEndDateRequest();
			 }else{
				 EnDateAssert = false;
				 DifEnDate = false;
				 LoadStartDateRequest();
				 
			 }
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
	  public static void LoginSearch() throws Exception {
		  driver.get(baseUrl);
			 driver.findElement(By.id(Usarname)).sendKeys("franklyn.noyola");
			 driver.findElement(By.id(Password)).sendKeys("ezekiel.2018");
			 driver.findElement(By.id(Login)).click();
			 driver.findElement(By.id(Accept)).click();
			 driver.findElement(By.id(Submit)).click();
		Thread.sleep(800);
		String whandle = driver.getWindowHandle();
		driver.switchTo().window(whandle);
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector(("[id=aPreferences]"))).click();
		driver.switchTo().window(whandle);
		driver.switchTo().frame("content");
		new Select (driver.findElement(By.id("cboLanguages"))).selectByValue(LANG);
		driver.findElement(By.cssSelector(("[id=btnUpdateLanguages]"))).submit();
		driver.switchTo().window(whandle);
		driver.switchTo().frame(0);
			 driver.findElement(By.cssSelector(("[id=aDocSearch]"))).click();
				driver.switchTo().window(whandle);
				driver.switchTo().frame("content");
				new Select (driver.findElement(By.name(DocSubType))).selectByValue(Departments[DEP]);
				driver.switchTo().window(whandle);
				driver.switchTo().frame("content");
				new Select (driver.findElement(By.name(WorkGroup))).selectByValue(HR[DEP]);

	  }
	  public static void RouteDocument() throws Exception{
		driver.switchTo().window(whandle);
		driver.switchTo().frame("content");
		driver.findElement(By.name(GMIN)).sendKeys(GMINID);
		Thread.sleep(500);
		driver.switchTo().window(whandle);
		driver.switchTo().frame("content");
			StartLoadDate();
				if (EnDateAssert){
						EndLoadDate();
				}
		driver.findElement(By.id(Search)).click();
		
			 //java.util.List<WebElement> DCN = driver.findElements(By.xpath("//td[@align='right']"));
		       //  for(WebElement suggestion1 : DCN){
		       //     System.out.println(suggestion1.getText());
		       //  }
		driver.switchTo().window(whandle);
		driver.switchTo().frame("content");
		 if(driver.getPageSource().contains(NotFoundText)){
			 driver.close();
			 Close = true;
			 return;		
		 }
			 	boolean Found = driver.findElement(By.xpath("//span[@id='lblDocsReturned']")).getText().contains(DocReturns);
			 	String DocNumbers = driver.findElement(By.xpath("//span[@id='lblCountReturned']")).getText();
			 	System.out.println(DocNumbers);
		      	if(Found){
		      	WebElement DCNFind = driver.findElement(By.xpath("//a[contains(@onclick, 'openDCN')]"));
	   	       	java.util.List<WebElement> queue = driver.findElements(By.xpath("//tr[2]/td"));
		      	WebElement que2 = queue.get(60);
		      	QueueFound = new String (que2.getText());
		      	
			      String DCNFound = DCNFind.getText();
		          String CQ = "COMPLETE";
	        
		          if(QueueFound.contains(CQ)){
			    	  	driver.close();
			    	  	Unable = true;
			    	  	return;
			      		}
		          else{ 
		    	  driver.switchTo().window(whandle);
		    	  driver.switchTo().frame("code");
		      		driver.findElement(By.partialLinkText(QueueFound)).click();
		      		driver.switchTo().window(whandle);
		      		driver.switchTo().frame("content");
		      		Thread.sleep(1000);
		      		driver.findElement(By.partialLinkText(DCNFound)).click();
		      		Thread.sleep(1000);
		      		driver.switchTo().window(whandle);
		      		driver.switchTo().frame("content");
		      		driver.switchTo().frame("image");
		      		driver.switchTo().frame("RoutableForm");
		          }		
		      	}
	  }
  public static void UKUpdate() throws Exception{
	  eFormSelection = (String) JOptionPane.showInputDialog(null, "Select Routable Form to Test", "Routable Form Selection", JOptionPane.INFORMATION_MESSAGE,null, 
				UKRoutable, UKRoutable[0]);
	  DEP = 6; LANG = "1"; CountrySel = EnMonth; DocReturns = "Returned"; NotFoundText = "No Documents Found";
	  Sel = eFormSelection.toString();
	  GMINValidation();
		if (InvalidGMIN){
			driver.close();
			JOptionPane.showMessageDialog(null, "GMIN is invalid", "ERROR", JOptionPane.ERROR_MESSAGE);
			return;
		}
		DateValidation();if (InvalidDate){DateInvalid();return;}
		LoginSearch();
		String whandle = driver.getWindowHandle();
		driver.switchTo().window(whandle);
		driver.switchTo().frame("content");
		new Select (driver.findElement(By.id(DocType))).selectByVisibleText(Sel);
		Thread.sleep(500);
		RouteDocument();
		 if (Close){
			 	driver.quit();
			 JOptionPane.showMessageDialog(null, "No Document has been found", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);	 
			 	return;
		 } 
		 if (Unable){
			 	driver.quit();
			 	JOptionPane.showMessageDialog(null, "UNABLE to update Routable Form. Document is already in COMPLETE queue", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
	    	  	return;
		 }
		 switch (Sel){
		 	case "T01210 Defined Benefit Pension Plan Form":	  			UKRoutableFormUpdate.DefinedBenefitFields();break;
		 	case "T01208 Defined Contribution Pension Plan Form":			UKRoutableFormUpdate.DefinedContributionFields();break;
		 	case "T01209 HR Pension Form":									UKRoutableFormUpdate.HRPensionPlanFields();break;
		 }  
  } 

  public static void ESUpdate() throws Exception{
	  eFormSelection = (String) JOptionPane.showInputDialog(null, "Select Routable Form to Test", "Routable Form Selection", JOptionPane.INFORMATION_MESSAGE,null, 
				ESRoutable, ESRoutable[0]);
	  DEP = 7; LANG="10"; CountrySel = EsMonth; DocReturns = "devueltos";NotFoundText = "No se encontraron documentos";
	  System.out.println(Departments[DEP]);
	  Sel = eFormSelection.toString();
	  GMINValidation();
		if (InvalidGMIN){
			driver.close();
			JOptionPane.showMessageDialog(null, "GMIN is invalid", "ERROR", JOptionPane.ERROR_MESSAGE);
			return;
		}
		DateValidation();if (InvalidDate){DateInvalid();return;}
		LoginSearch();
		String whandle = driver.getWindowHandle();
		driver.switchTo().window(whandle);
		driver.switchTo().frame("content");
		new Select (driver.findElement(By.id(DocType))).selectByVisibleText(Sel);
		Thread.sleep(500);
		RouteDocument();
		 if (Close){
			 	driver.quit();
			 JOptionPane.showMessageDialog(null, "No Document has been found", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);	 
			 	return;
		 } 
		 if (Unable){
			 	driver.quit();
			 	JOptionPane.showMessageDialog(null, "UNABLE to update Routable Form. Document is already in COMPLETE queue", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
	    	  	return;
		 }
		 switch (Sel){
		 	case "T00717 Datos bancarios": 		ESRoutableFormUpdate.DatosBancarios();break;
	  }

  }
}