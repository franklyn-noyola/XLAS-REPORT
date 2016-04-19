package ODM;

//import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.Object;










//import java.awt.Robot;
//import java.awt.Toolkit;
//import java.awt.datatransfer.StringSelection;
//import java.awt.event.KeyEvent;
//import java.util.regex.Pattern;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;









import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.support.ui.Select;

public class ODMRouteDocument extends _ODM_Public_Variables {
  public String RouteActions;
  public String DayToSearch;
  public String GMINID;  public boolean Close;
  public int DEP;  public Object LanguageSel;
  public String eFormSelection;  public String Sel;  public String NotFoundText;
  public String LANG;  public boolean InvalidGMIN;  public boolean InvalidDate;
  public String Resolution;  public String Pending;  public String PeerCheck;  public String PreDataEntry;public String YearToSearchE;
  public String DocReturns;  public String AllDate;  public String YearToSearch;  public String MonthToSearch; public boolean AssertDate;
  public String[] CountrySel; public boolean InvalidYear;public String IndexerError; public boolean APR; public boolean AGR; 
  public String C_RouteToBuild_B; public String C_Reject_B;public String C_PeerPreview_B="Peer Review";public String C_Pending_B;
  public String C_Completed_B;public String C_Route_B;public String C_Route_C;public String MonthSel;public int MonthLE;public int MonthE;
  public String QueueFound;public String C_Approve_B;public int DayV;public int DayVE;public int YearTo;public int YearToE;
  public String DUPGMIN;public boolean asserToday=false;public boolean SameEnDate;public boolean DifEnDate;public String CMonth;
  public static boolean EnDateAssert;String whandle = driver.getWindowHandle();public String DayToSearchE;public int ComDate;
  public int Month;public int MonthL;public boolean GoForward;public boolean GoForwardE;public String AllDateE;public int ComDateE;
  public static String MonthS;public static String DayS;
 @Before
  public void setUp() throws Exception {
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }
 
 public void RouteActions() throws Exception{
	 RouteActions = (String) JOptionPane.showInputDialog(null, "Select Route Actions To Test ", "Route Actions Selection", JOptionPane.INFORMATION_MESSAGE,null, 
				new Object [] {"To Resolution", "Reject","Approve","RouteToBuild","Pending","Peer Review","Completed","Duplicate RouteToBuild"},"Actions");

 }

  @Test
  public void Execute() throws Exception{
  	 driver.close();
  	 JOptionPane.showMessageDialog(null,"Sorry. This cannot be executed from here. Please Execute ODMActionToTake Script to Execute this Script", "ERROR", JOptionPane.ERROR_MESSAGE);
  	 driver.quit();
  	 return;
  	 
  }
  //UK Eforms Definition
  public void UKFormDefinition() throws Exception {
	  DEP = 6;
	  LANG = "1";
	  eFormSelection = (String) JOptionPane.showInputDialog(null, "Select Routable Form to Test", "Routable Form Selection", JOptionPane.INFORMATION_MESSAGE,null, 
			  												UKRoutable, UKRoutable[0]);
	  Sel = eFormSelection.toString();
	  NotFoundText = "No Documents Found";
	  Pending = "UK GM Pending";
	  Resolution = "UK GM Resolution";
	  PeerCheck = "UK GM Peer Check";
	  DocReturns = "Returned";
	  CountrySel = EnMonth;
	  C_RouteToBuild_B = C_RouteToBuild[0];
	  C_Reject_B = Reject_B[0];
	  C_Pending_B = Pending_B[0];
	  C_Route_C = "Route";
	  C_Completed_B = "Completed";
	  C_Approve_B = "Approve";
	  IndexerError = "Indexer Error";
	  
	  return;
  }
  //FR Eforms Definition
  public void FRFormDefinition() throws Exception {
	  DEP = 2;
	  LANG = "11";
	  eFormSelection = (String) JOptionPane.showInputDialog(null, "Select Routable Form to Test", "Routable Form Selection", JOptionPane.INFORMATION_MESSAGE,null, 
			  												FRRoutable, FRRoutable[0]);
	  Sel = eFormSelection.toString();
	  NotFoundText = "Aucun document correspondant à votre recherche";
	  Pending = "FR GM Pending";
	  Resolution = "FR GM Resolution";	  PeerCheck = "FR GM Peer Check";	  DocReturns = "Retour";
	  CountrySel = FrMonth;
	  C_RouteToBuild_B = C_RouteToBuild[4];
	  C_Reject_B = Reject_B[6];
	  C_Pending_B = Pending_B[5];
	  C_Completed_B = "Finalisé";
	  C_Approve_B= "Approuver";
	  C_Route_C = "Route";
	  IndexerError = "Erreur d";
	  return;
  }
  //SPAIN Form Definition
  public void ESFormDefinition() throws Exception {
	  DEP = 7;
	  LANG = "10";
	  eFormSelection = (String) JOptionPane.showInputDialog(null, "Select Routable Form to Test", "Routable Form Selection", JOptionPane.INFORMATION_MESSAGE,null, 
			  														ESRoutable, ESRoutable[0]);
	  Sel = eFormSelection.toString();
	  NotFoundText = "No se encontraron documentos";
	  Pending = "ES GM Pending";
	  Resolution = "ES GM Resolution";
	  PeerCheck = "ES GM Peer Check";
	  PreDataEntry = "ES GM Pre-Data Entry";
	  C_Completed_B = "Finalizar";
	  DocReturns = "devueltos";
	  CountrySel = EsMonth;
	  C_RouteToBuild_B = C_RouteToBuild[1];
	  C_Pending_B = Pending_B[1];  
	  C_Reject_B = Reject_B[1];
	  C_Route_C = "Enviar";
	  C_Approve_B = "Aprobar";
	  C_Completed_B = "Finalizar";
	  IndexerError = "Error de Indexa";
	  
  	  return;
  }
  //Portugal Form Definition
  public void PTFormDefinition() throws Exception {
	  DEP = 5;
	  LANG = "12";
	  eFormSelection = (String) JOptionPane.showInputDialog(null, "Select Routable Form to Test", "Routable Form Selection", JOptionPane.INFORMATION_MESSAGE,null, 
			  														PTRoutable, PTRoutable[0]);
	  Sel = eFormSelection.toString();
	  NotFoundText = "Não Foram Encontrados Documentos";
	  Pending = "PT GM Pendente";
	  Resolution = "PT GM Resolução";
	  PeerCheck = "PT GM Peer Check";
	  DocReturns = "Devolução";
	  CountrySel = PtMonth;
	  C_RouteToBuild_B = C_RouteToBuild[0];
	  C_Reject_B = Reject_B[3];
	  C_Pending_B = Pending_B[1];
	  C_Route_C = "Encaminhar";
	  C_Approve_B = "Aprovar";
	  C_Completed_B = "Terminar";
	  IndexerError = "Erro de";
	  
  	  return;
  }
  //Germany Form Definition
  public void DEFormDefinition() throws Exception {
	  DEP = 3;
	  LANG = "13";
	  eFormSelection = (String) JOptionPane.showInputDialog(null, "Select Routable Form to Test", "Routable Form Selection", JOptionPane.INFORMATION_MESSAGE,null, 
			  														DERoutable, DERoutable[0]);
	  Sel = eFormSelection.toString();
	  NotFoundText = "Keine Dokumente gefunden.";
	  Pending = "DE GM Pending";
	  Resolution = "DE GM Resolution";
	  PeerCheck = "DE GM Peer Check";
	  DocReturns = "Zurückgesandte";
	  CountrySel = DeMonth;
	  C_RouteToBuild_B = C_RouteToBuild[2];
	  C_Reject_B = Reject_B[2];
	  C_Pending_B = Pending_B[2];
	  C_Route_C = "Weiterleiten";
	  C_Completed_B = "Erledigt";
	  C_Approve_B = "Genehmigen";
	  IndexerError = "Indexfehler";
  	  return;
  }
  //Poland Form Definition
  public void PLFormDefinition() throws Exception {
	  DEP = 4;
	  LANG = "16";
	  eFormSelection = (String) JOptionPane.showInputDialog(null, "Select Routable Form to Test", "Routable Form Selection", JOptionPane.INFORMATION_MESSAGE,null, 
		  														PLRoutable, PLRoutable[0]);
	  Sel = eFormSelection.toString();
	  NotFoundText = "Nie Znaleziono Dokumentów";
	  Pending = "PL GM Pending";
	  Resolution = "PL GM Resolution";
	  PeerCheck = "PL GM Peer Check";
	  DocReturns = "Zwrócone";
	  CountrySel = PlMonth;
	  C_Pending_B = Pending_B[4];
	  C_Route_C = "Zatwierdź";
	  C_RouteToBuild_B = C_RouteToBuild[3];
	  C_Reject_B = Reject_B[5];
	  C_Completed_B = "Zakończ";
	  C_Approve_B = "Zatwierdź";
	  IndexerError = "Błąd indeksu";
  	  return;
  }
  
 public void ATFormDefinition() throws Exception{
	  DEP = 0;
	  LANG = "13";
	  eFormSelection = (String) JOptionPane.showInputDialog(null, "Select Routable Form to Test", "Routable Form Selection", JOptionPane.INFORMATION_MESSAGE,null, 
																		ATRoutable,ATRoutable[0]);
	  Sel = eFormSelection.toString();
	  NotFoundText = "Keine Dokumente gefunden.";
	  Pending = "AT GM Pending";
	  Resolution = "AT GM Resolution";
	  PeerCheck = "AT GM Peer Check";
	  PreDataEntry = "AT GM Pre-Data Entry Hold";
	  DocReturns = "Zurückgesandte";
	  CountrySel = DeMonth;
	  C_RouteToBuild_B = C_RouteToBuild[2];
	  C_Reject_B = Reject_B[2];
	  C_Pending_B = Pending_B[2];
	  C_Route_C = "Weiterleiten";
	  C_Completed_B= "Erledigt";
	  C_Approve_B = "Genehmigen";
	  IndexerError = "Indexfehler";
	  return;
 }
 public void BEFormDefinition() throws Exception{
	  DEP = 1;
		LanguageSel = JOptionPane.showInputDialog(null, "Select Language to Select Form", "Language Selection", JOptionPane.QUESTION_MESSAGE,null, 
				new Object[] {"Dutch", "English"}, "Language");
		if (LanguageSel.equals("Dutch")){
			eFormSelection = (String) JOptionPane.showInputDialog(null, "Select Routable Form to Test", "Routable Form Selection", JOptionPane.QUESTION_MESSAGE,null, 
					BelgiumNL, BelgiumNL[0]);
				Sel = eFormSelection.toString();
				NotFoundText= "Geen Documenten Gevonden";
				LANG = "14";
				  Pending = "BE GM Pending";
				  Resolution = "BE GM Resolutie";  PeerCheck = "BE GM Peer Check";
				  DocReturns = "teruggestuurd";  CountrySel = NlMonth;
				  C_Reject_B = Reject_B[4];
				  C_RouteToBuild_B = C_RouteToBuild[0];
				  C_Pending_B = Pending_B[3];
				  C_Route_C = "Doorsturen";
				  IndexerError = "Indexeerder fout";
				  C_Completed_B = "Volledig";
				  C_Approve_B = "Goedkeuren";
				return;
	}else{
				eFormSelection = (String) JOptionPane.showInputDialog(null, "Select Routable Form to Test", "Routable Form Selection", JOptionPane.QUESTION_MESSAGE,null, 
				BelgiumEN, BelgiumEN[0]);
				Sel = eFormSelection.toString();
				NotFoundText = "No Documents Found";
				LANG = "1";
				Pending = "BE GM Pending";
				  Resolution = "BE GM Resolution";  PeerCheck = "BE GM Peer Check";
				  DocReturns = "Returned";
				  CountrySel = EnMonth;
				  C_RouteToBuild_B = C_RouteToBuild[5];
				  C_Reject_B = Reject_B[0];
				  C_Pending_B = Pending_B[0];
				  C_Completed_B = "Completed";
				  C_Approve_B = "Approve";
				  IndexerError = "Indexer Error";
				  C_Route_C = "Route";
				return;
	}
	  
}
  

  public void StartLoadDate() throws Exception{
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
public void EndLoadDate() throws Exception{
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
	private  void LoadStartDateRequest() throws Exception{
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
	
	private void LoadEndDateRequest() throws Exception{
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
	
	  private void GMINValidation() throws Exception{
		  GMINID = JOptionPane.showInputDialog(null, "Type GMIN to Search", "GMIN Selection", JOptionPane.QUESTION_MESSAGE);
			String GMINL = new String(GMINID);
		 	if(GMINL.length()< 9 ||GMINL.length()>9){
		 		InvalidGMIN = true;
		 		return;
		 	}
	  }
	  private void DateValidation() throws Exception{
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
	  private void DateInvalid() throws Exception{
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
	  public void LoginSearch() throws Exception {
		  driver.get(baseUrl);
			 driver.findElement(By.id(Usarname)).sendKeys("franklyn.noyola");
			 driver.findElement(By.id(Password)).sendKeys("ezekiel.2024");
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
	  public void RouteDocument() throws Exception{
		driver.switchTo().window(whandle);
		driver.switchTo().frame("content");
		driver.switchTo().window(whandle);
		driver.switchTo().frame("content");
		new Select (driver.findElement(By.id(DocType))).selectByVisibleText(Sel);
		Thread.sleep(500);
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
	      	if(Found){
	      	WebElement DCNFind = driver.findElement(By.xpath("//a[contains(@onclick, 'openDCN')]"));
   	       	java.util.List<WebElement> queue = driver.findElements(By.xpath("//tr[2]/td"));
	      	WebElement que2 = queue.get(60);
	      	QueueFound = new String (que2.getText());
		      String DCNFound = DCNFind.getText();
	          String CQ = "COMPLETE"; 
	          if(QueueFound.contains(CQ)){
		    	  	driver.close();
		    	  	JOptionPane.showMessageDialog(null, "Document is already in COMPLETE queue", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
		      		return;
		      		}
	          
		    	  driver.switchTo().window(whandle);
		    	  driver.switchTo().frame("code");
	      			driver.findElement(By.partialLinkText(QueueFound)).click();
	      			driver.switchTo().window(whandle);
	      			driver.switchTo().frame("content");
	      			Thread.sleep(1000);
	      			driver.findElement(By.partialLinkText(DCNFound)).click();
	      			driver.switchTo().window(whandle);
	      			driver.switchTo().frame("content");
	      			driver.switchTo().frame("document_top");
	      			Thread.sleep(1000);
	      		if (RouteActions.equals("RouteToBuild")){
	      			DUPGMIN = driver.findElement(By.xpath("//span[@id='dgIndexFields__ctl2_lblIndexField3']")).getText();
		    		if (DUPGMIN.startsWith("?")){
		    			driver.close();
		    			JOptionPane.showMessageDialog(null, "Document has a Duplicate GMIN. Please run Duplicate RouteTobuild script to Route", "ERROR", JOptionPane.ERROR_MESSAGE);
	      				return;
		    		}
	      			try{
	      							driver.findElement(By.xpath("//input[@value='"+C_RouteToBuild_B+"']")).click();
	      							Thread.sleep(3000);
	      							driver.close();
	      							JOptionPane.showMessageDialog(null, "Document was Routed To Build", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
	      							return;
	      				}catch (Exception e){
	      				JOptionPane.showMessageDialog(null, "Document is placed in an invalid Queue To Route To Build", "ERROR", JOptionPane.ERROR_MESSAGE);
	      				driver.close();
	      				return;
	      			}
	      		}
	      		if (RouteActions.equals("Completed")){
	      			try{
	      				driver.findElement(By.xpath("//input[@value='"+C_Completed_B+"']")).click();
	      							Thread.sleep(3000);
	      							driver.close();
	      							JOptionPane.showMessageDialog(null, "Document was sent to next corresponding queue", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
	      							return;
	      				}catch (Exception e){
	      				JOptionPane.showMessageDialog(null, "Document is placed in an invalid Queue to send to next corresponding queue", "ERROR", JOptionPane.ERROR_MESSAGE);
	      				driver.close();
	      				return;
	      			}
	      		}
	      		if (RouteActions.equals("Approve")){
	      			try{
	      				driver.findElement(By.xpath("//input[@value='"+C_Approve_B+"']")).click();
	      							Thread.sleep(3000);
	      							driver.close();
	      							JOptionPane.showMessageDialog(null, "Document was sent to next corresponding queue", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
	      							return;
	      				}catch (Exception e){
	      				JOptionPane.showMessageDialog(null, "Document is placed in an invalid Queue to send to next corresponding queue", "ERROR", JOptionPane.ERROR_MESSAGE);
	      				driver.close();
	      				return;
	      			}
	      		}
	      		if (RouteActions.equals("To Resolution")){
	      			if (QueueFound.toString().contains("Pend") || QueueFound.toString().contains("de wacht")){
      					C_Route_B = C_Route_C;
	      			}else{
      					C_Route_B = IndexerError;
      				}
      				
	      			try{	      		
	      				driver.findElement(By.xpath("//input[contains(@value, '"+C_Route_B+"')]")).click();
	      							Thread.sleep(3000);
	      							driver.close();
	      							JOptionPane.showMessageDialog(null, "Document was sent to Resolution Queue", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
	      							return;
	      				}catch (Exception e){
	      				System.out.println(C_Route_B);
	      				JOptionPane.showMessageDialog(null, "Document is placed in an invalid queue to send Resolution queue", "ERROR", JOptionPane.ERROR_MESSAGE);
	      				driver.close();
	      				return;
	      			}
	      		}
	      	}
	      	if (RouteActions.equals("Reject")){
	      		try{
	      		if (QueueFound.toString().contains("BE GM In de wacht")){
	      			C_Reject_B = "Actie 2";
	      		}
	      		if (QueueFound.toString().contains("Pend") || QueueFound.toString().contains("de wacht") || QueueFound.toString().contains("Resolut")){
	      			AGR = true;
	      			APR = false;
	      		}else{
	      			AGR = false;
	      			APR = true;
	      		}
      				driver.findElement(By.xpath("//input[@value='"+C_Reject_B+"']")).click();
      				Thread.sleep(3000);
      				if (AGR){
      					driver.switchTo().window(whandle);
      					driver.switchTo().frame("content");
      					new Select (driver.findElement(By.id("cboQueues"))).selectByVisibleText("GME Rejected");
      					Thread.sleep(2000);
      					driver.findElement(By.id("btnReject")).click();
      					Thread.sleep(2000);
      					driver.close();
							JOptionPane.showMessageDialog(null, "Document has been Rejected", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
							return;
      				}
      				if (APR){
      					String parentHandle = driver.getWindowHandle();
							for (String winHandle : driver.getWindowHandles()) {
							    driver.switchTo().window(winHandle); 
							}
							new Select (driver.findElement(By.id("cboQueues"))).selectByVisibleText("GME Rejected");
							driver.findElement(By.id("txtNotes")).sendKeys("THIS HAS BEEN REJECTED");
							Thread.sleep(2000);
							driver.findElement(By.id("btnReject")).click();
							Thread.sleep(3000);
							driver.switchTo().window(parentHandle);
							driver.close();
							JOptionPane.showMessageDialog(null, "Document has been rejected", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
							return;
      				}
      				}catch (Exception e){
      				JOptionPane.showMessageDialog(null, "Document is placed in an invalid queue to Reject", "ERROR", JOptionPane.ERROR_MESSAGE);
      				driver.close();
      				return;
      			}
      		}
	      	if (RouteActions.equals("Pending")){
	      		DUPGMIN = driver.findElement(By.xpath("//span[@id='dgIndexFields__ctl2_lblIndexField3']")).getText();
	    		if (DUPGMIN.startsWith("?")){	    			
      				driver.close();
      				JOptionPane.showMessageDialog(null, "Document has a Duplicate GMIN. Please Run Duplicate RouteTobuild script to Route", "ERROR", JOptionPane.ERROR_MESSAGE);
      				return;
	    		}
      			try{
      				if (QueueFound.contains("ES GM Data Entry")){
      					C_Pending_B = "Pendiente";
      				}
      				if (QueueFound.contains("FR GM Data Entry")){
      					C_Pending_B = "En Attente";
      				}
      				if (QueueFound.contains("BE GM Data Input")){
      					C_Pending_B = "In de wacht";
      				}
      				if (QueueFound.contains("Peer Check")){
      					C_Pending_B = "Pending";
      				}
      				if (QueueFound.contains("DE GM Dateneingabe")){
      					C_Pending_B = "Unerledigt";
      				}
      				driver.findElement(By.xpath("//input[@value='"+C_Pending_B+"']")).click();
      				driver.switchTo().window(whandle);
  					driver.switchTo().frame("content");
  					Thread.sleep(2000);
  					driver.findElement(By.id("btnComplete")).click();
  					Thread.sleep(2000);
  					driver.close();
      				JOptionPane.showMessageDialog(null, "Document was sent to Pending Queue", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
      				return;
      				}catch (Exception e){
      				JOptionPane.showMessageDialog(null, "Document is placed in an invalid queue to send Pending queue", "ERROR", JOptionPane.ERROR_MESSAGE);
      				driver.close();
      				return;
      			}
      		}
	     	if (RouteActions.equals("Peer Review")){
      			try{
      				driver.findElement(By.xpath("//input[@value='"+C_PeerPreview_B+"']")).click();
      							Thread.sleep(3000);
      							String parentHandle = driver.getWindowHandle();
      							for (String winHandle : driver.getWindowHandles()) {
      							    driver.switchTo().window(winHandle); 
      							}
      							new Select (driver.findElement(By.id("cboQueues"))).selectByVisibleText("GME Approved Waiting for WebDe");
      							driver.findElement(By.id("txtNotes")).sendKeys("THIS HAS BEEN PEERCHECKED");
      							driver.findElement(By.id("btnComplete")).click();
      							Thread.sleep(3000);
      							driver.switchTo().window(parentHandle);
      							driver.close();
      							JOptionPane.showMessageDialog(null, "Document was sent to Complete Queue", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
      							return;
      				}catch (Exception e){
      				JOptionPane.showMessageDialog(null, "Document is placed in an invalid queue to send Peer Check queue", "ERROR", JOptionPane.ERROR_MESSAGE);
      				driver.close();
      				return;
      			}
      		}
	    	if (RouteActions.equals("Duplicate RouteToBuild")){
	    	try{
	    		DUPGMIN = driver.findElement(By.xpath("//span[@id='dgIndexFields__ctl2_lblIndexField3']")).getText();
	    		if (DUPGMIN.startsWith("?")){
	    			driver.findElement(By.id("dgIndexFields__ctl2_lnkbutEdit")).click();
	    			driver.switchTo().window(whandle);
	      			driver.switchTo().frame("content");
	      			driver.switchTo().frame("document_top");
	    			driver.findElement(By.id("dgIndexFields__ctl2_txtIndexField3")).clear();
	    			driver.findElement(By.id("dgIndexFields__ctl2_txtIndexField3")).sendKeys(GMINID);
	    			driver.findElement(By.id("dgIndexFields__ctl2_lnkbutUpdate")).click();
	    			driver.switchTo().window(whandle);
	      			driver.switchTo().frame("content");
	      			driver.switchTo().frame("document_top");
      				driver.findElement(By.xpath("//input[@value='"+C_RouteToBuild_B+"']")).click();
      				Thread.sleep(3000);
      				driver.close();
      				JOptionPane.showMessageDialog(null, "Document was Routed To Build", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
      				return;
      			}	
	    		}catch (Exception e){
      				JOptionPane.showMessageDialog(null, "Document has not a GMIN duplicated", "ERROR", JOptionPane.ERROR_MESSAGE);
      				driver.close();
      				return;
      			}
	    		
	    	}
	      Thread.sleep(5000);
	      	
			}
	public void RouteAll() throws Exception{
	switch (Selection){
		case "UK":					UKFormDefinition();
									break;
		case "ES":					ESFormDefinition();
									break;
		case "AT":					ATFormDefinition();
									break;
		case "DE":					DEFormDefinition();
									break;
		case "FR":					FRFormDefinition();
									break;
		case "BE":					BEFormDefinition();
									break;
		case "PT":					PTFormDefinition();
									break;
		case "PL":					PLFormDefinition();
									break;
	}
	GMINValidation();
			if (InvalidGMIN){
				driver.close();
				JOptionPane.showMessageDialog(null, "GMIN is invalid", "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			DateValidation();if (InvalidDate){DateInvalid();return;}
			LoginSearch();
			RouteDocument();
			 if (Close){
				 	driver.quit();
				 JOptionPane.showMessageDialog(null, "No Document has been found", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);	 
				 	return;
			  }
		}	  

}