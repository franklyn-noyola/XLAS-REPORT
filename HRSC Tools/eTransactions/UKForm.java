package eTransactions;

import static org.junit.Assert.fail;

import org.junit.Test;

import javax.swing.JOptionPane;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;



public class UKForm extends _eTransactions_Variables {
   public static String DefinedBenefitGMINField			=	"T012100002F000";
   public static String HRPensionGMINField				=	"T012090002F000";
   public static String DepartmentTransferField			=	"T004530035F001";
   public static String GrievanceFormField				=	"T000270030F001";
   public static String DefinedContributionField		=	"T012080002F000";
   
  @Test
  public void Execute() throws Exception{
 	 driver.close();
 	 JOptionPane.showMessageDialog(null,"Sorry. This cannot be executed from here. Please Execute AgentPortalFormsSubmission Script to Execute this Script", "ERROR", JOptionPane.ERROR_MESSAGE);
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
 	
 	
 //Defined Benefit Form 
public static void DefinedBenefit() throws Exception{
		String DB_Stop_Check			=  	"T012100002F033";
		String Effective_Date			=  	"img[alt=\"Calendar\"]";
		String DB_to_DC_Check			=	"T012100002F037";
		String Effective_Date_2			=	"(//img[@alt='Calendar'])[2]";
		String Reached_Limit_Check		=	"T012100002F042";
		String Effective_Date_3			=	"(//img[@alt='Calendar'])[3]";
		String I_Agree					=	"T012100002F050";
		String Date						=	"(//img[@alt='Calendar'])[4]";
		String Telephone_Number			=	"T012100002F056";
		String Name						=	"T012100002F058";
		String Email_Address			=	"T012100002F059";
	try{
		if (NoAgent){
				driver.switchTo().window(whandle);
				driver.switchTo().frame(0);
		}
 	driver.findElement(By.name(DB_Stop_Check)).click();
 	Thread.sleep(4000);
 	String parentHandle = driver.getWindowHandle();
 	driver.findElement(By.cssSelector(Effective_Date)).click();
 	Thread.sleep(3000);
 			CalendarPopupHandle();
 	Thread.sleep(5000);
 	driver.findElement(By.partialLinkText("8")).click();
 	driver.switchTo().window(parentHandle);
	driver.switchTo().frame(0);
	driver.findElement(By.name(DB_to_DC_Check)).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(Effective_Date_2)).click();
	Thread.sleep(3000);
				CalendarPopupHandle();
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("10")).click();
	driver.switchTo().window(parentHandle);
	driver.switchTo().frame(0);
	driver.findElement(By.name(Reached_Limit_Check)).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(Effective_Date_3)).click();
	Thread.sleep(2000);
				CalendarPopupHandle();
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("21")).click();
	driver.switchTo().window(parentHandle);
	driver.switchTo().frame(0);
	driver.findElement(By.name(I_Agree)).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(Date)).click();
	Thread.sleep(2000);
				CalendarPopupHandle();
	Thread.sleep(6000);
	driver.findElement(By.partialLinkText("16")).click();
	driver.switchTo().window(parentHandle);
	driver.switchTo().frame(0);
	driver.findElement(By.name(Telephone_Number)).sendKeys("123456789");
	driver.findElement(By.name(Name)).sendKeys("Franklyn Noyola");
	driver.findElement(By.name(Email_Address)).sendKeys("franklyn.noyola@gmail.com");
	driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Print View")).click();
	JOptionPane.showMessageDialog(null, "Transaction has been processed and sent to ODM", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
	return;
  }catch(Exception e){
	  driver.close();
	  JOptionPane.showMessageDialog(null, "A Field has been changed or does not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
	  fail("Test Has been Failed");
}
}
 //Defined Contribution Pension Form 
public static void DefinedContributionPension() throws Exception{
	String Opt_in					=  	"T012080002F007";
	String Opt_In_Effective_Date	=  	"img[alt=\"Calendar\"]";
	String [] SMART					=	new String[] {"//input[@value='SMART']", "//input[@value='NONSMART']"};
	String Effective_Date			=	"(//img[@alt='Calendar'])[2]";
	String [] EmployeeSel			=   new String[] {"//input[@value='Employee 2%, Employer 2%']", "//input[@value='Employee 3%, Employer 3%']",
													"//input[@value='Employee 4%, Employer 4%']", "//input[@value='Employee 5%, Employer 5%']",
													"//input[@value='Employee 6%, Employer 6%']", "//input[@value='Employee 7%, Employer 7%']",
													"//input[@value='Employee 8%, Employer 8%']",  "//input[@value='Employee 9%, Employer 9%']",
													"//input[@value='Employee 10%, Employer 10%']"};
	String Specified10				=	"T012080002F044";
	String I_Agree					=	"T012080002F057";
	String Date						=	"(//img[@alt='Calendar'])[3]";
	String Telephone_Number			=	"T012080002F064";
	String Name						=	"T012080002F073";
	String Email_Address			=	"T012080002F074";
	try{
			if (NoAgent){
				driver.switchTo().window(whandle);
				driver.switchTo().frame(0);
			}
				driver.findElement(By.name(Opt_in)).click();
				String parentHandle = driver.getWindowHandle();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector(Opt_In_Effective_Date)).click();
				Thread.sleep(3000);
						CalendarPopupHandle();
				Thread.sleep(5000);
				driver.findElement(By.linkText("15")).click();
				driver.switchTo().window(parentHandle);
				driver.switchTo().frame(0);
				driver.findElement(By.xpath(SMART[1])).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(Effective_Date)).click();
				Thread.sleep(3000);
						CalendarPopupHandle();
				Thread.sleep(5000);
				driver.findElement(By.linkText("10")).click();
				driver.switchTo().window(parentHandle);
				driver.switchTo().frame(0);
				driver.findElement(By.xpath(EmployeeSel[6])).click();
				driver.findElement(By.name(Specified10)).sendKeys("10");
				driver.findElement(By.name(I_Agree)).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(Date)).click();
				Thread.sleep(3000);
						CalendarPopupHandle();
					Thread.sleep(4000);
					driver.findElement(By.partialLinkText("16")).click();
					driver.switchTo().window(parentHandle);
					driver.switchTo().frame(0);
					driver.findElement(By.name(Telephone_Number)).sendKeys("123456789");
					driver.findElement(By.name(Name)).sendKeys("Franklyn Noyola");
					driver.findElement(By.name(Email_Address)).sendKeys("franklyn.noyola@gmail.com");
					driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
					Thread.sleep(5000);
					driver.quit();
					JOptionPane.showMessageDialog(null, "Transaction has been processed and sent to ODM", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
					return;
		}catch(Exception e){
			  driver.close();
			  JOptionPane.showMessageDialog(null, "A Field has been changed or does not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
			  fail("Test Has been Failed");
		}
}
//HR Pension Form
public static void HRPensionForm() throws Exception{
			String Stop_DC_Plan_Check		=  "T012090002F003";
			String Effective_Date			=  "img[alt=\"Calendar\"]";
			String Leaving_DC_Check			=	"T012090002F011";
			String Fixed_Protection_Check	=	"T012090002F015";
			String Effective_Date_Fixed		=	"(//img[@alt='Calendar'])[2]";
			String Amend					=	 "(//input[@value='Top'])";
			String Effective_Date_2			=	"(//img[@alt='Calendar'])[3]";
			String Reason1					=	"T012090002F016";
			String DB_Stop_Date				=	"(//img[@alt='Calendar'])[4]";
			String DB_Start_Date			=	"(//img[@alt='Calendar'])[5]";
			String Reason2					=	"T012090002F022";
	try{

				if (NoAgent){
					HRinput();
				}
		     	Thread.sleep(4000);
		     	driver.findElement(By.name(Stop_DC_Plan_Check)).click();
		     	Thread.sleep(4000);
		     	String parentHandle = driver.getWindowHandle();
		     	driver.findElement(By.cssSelector(Effective_Date)).click();
		     	Thread.sleep(2000);
		     			CalendarPopupHandle();
		     	Thread.sleep(5000);
		     	driver.findElement(By.linkText("12")).click();
		     	driver.switchTo().window(parentHandle);
		    	driver.switchTo().frame(0);
		    	driver.findElement(By.name(Leaving_DC_Check)).click();
		    	driver.findElement(By.name(Fixed_Protection_Check)).click();
		    	Thread.sleep(3000);
		    	driver.findElement(By.xpath(Effective_Date_Fixed)).click();
		    	Thread.sleep(3000);
		    			CalendarPopupHandle();
		    	Thread.sleep(5000);
		    	driver.findElement(By.linkText("19")).click();
		    	driver.switchTo().window(parentHandle);
		    	driver.switchTo().frame(0);
		    	driver.findElement(By.xpath(Amend)).click();
		    	Thread.sleep(3000);
		    	driver.findElement(By.xpath(Effective_Date_2)).click();
		    	Thread.sleep(3000);
		    			CalendarPopupHandle();
		    	Thread.sleep(5000);
		    	driver.findElement(By.linkText("22")).click();
		    	driver.switchTo().window(parentHandle);
		    	driver.switchTo().frame(0);
		    	driver.findElement(By.name(Reason1)).sendKeys("THERE IS NOT REASON");
		    	driver.findElement(By.xpath(DB_Stop_Date)).click();
		    	Thread.sleep(3000);
		    			CalendarPopupHandle();
		    	Thread.sleep(5000);
		    	driver.findElement(By.linkText("16")).click();
		    	driver.switchTo().window(parentHandle);
		    	driver.switchTo().frame(0);
		    	driver.findElement(By.xpath(DB_Start_Date)).click();
		    	Thread.sleep(3000);
		    			CalendarPopupHandle();
		    	Thread.sleep(5000);
		    	driver.findElement(By.linkText("28")).click();
		    	driver.switchTo().window(parentHandle);
		    	driver.switchTo().frame(0);
		    	driver.findElement(By.name(Reason2)).sendKeys("THERE IS A REASON");
		    		driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
					Thread.sleep(4000);
					driver.findElement(By.linkText("Print View")).click();
					Thread.sleep(2000);
					driver.close();
					JOptionPane.showMessageDialog(null, "Transaction has been processed and sent to ODM", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
					return;
		}catch(Exception e){
			  driver.close();
			  JOptionPane.showMessageDialog(null, "A Field has been changed or does not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
			  fail("Test Has been Failed");
		}
}
//Department Transfer Form
public static void DepartmentTransfer() throws Exception {
	  //DEFINE FORM FIELDS
	  			String EffectiveDateChange		=  "img[alt=\"Calendar\"]";
	  			String ForGMOnly				=	"T004530035F505";
	  			String CompanyField				=	"T004530035F188";
	  			String [] CompanyOpt			=	new String[] {"IBC Vehicles Limited","Vauxhall Motors"};
	  			String LocationField			=	"T004530035F486";
	  			String [] LocationOpt			=	new String[] {"VM Central","VM Ellesmere Port","VM Toddington","IBC Vehicles Limited"};
	  			String WorkSchedule				=	"T004530035F231";	
	  			String ActualHours1				=	"T004530035F485";
	  			String ActualHours2				=	"//input[@name='T004530035F485'][2]";
	  			String SAPCostCenter			=	"T004530035F236";
	  			String PSFTDepartment			=	"T004530035F497";
	  			String JobTitle					=	"T004530035F491";
	  			String LocalSubstitution		=	"T004530035F499";
	  			String [] EmployeeClass			= new String[]{"//input[@value='Permanent']","//input[@value='Temporary']","//input[@value='Apprentice']","//input[@value='Student']"}; 
	  			String [] SupervisorType		= new String[]{"//input[@value='Supervises Salaried and Hourly Employees']","//input[@value='Supervises Hourly Employees']","//input[@value='Supervises Salaried Employees']","//input[@value='Not a Supervisor']"};
	  			String FunctionalPartition		=	"T004530035F199";
	  			String [] OccupationalClass		= new String[]{"//input[@value='Direct']","//input[@value='Indirect']"};
	  			String JobCode					=	"T004530035F483";

	try{
		if (NoAgent){
			HRinput();
		}
		Thread.sleep(5000);
	driver.findElement(By.cssSelector(EffectiveDateChange)).click();
	Thread.sleep(3000);
			CalendarPopupHandle();
	Thread.sleep(6000);
	driver.findElement(By.linkText("18")).click();
	driver.switchTo().window(parentHandle);
 	driver.switchTo().frame(0);
    	driver.findElement(By.name(ForGMOnly)).sendKeys("Want to get started writing your own AppleScript programs? If so, just open the Applications folder, then the AppleScript folder, and then double-click the ScriptEditor");
   new Select (driver.findElement(By.name(CompanyField))).selectByValue(CompanyOpt[1]);
   new Select (driver.findElement(By.name(LocationField))).selectByValue(LocationOpt[1]);
 	driver.findElement(By.name(WorkSchedule)).sendKeys("6548711");
 	driver.findElement(By.name(ActualHours1)).sendKeys("20");
 	driver.findElement(By.xpath(ActualHours2)).sendKeys("30");
 	driver.findElement(By.name(SAPCostCenter)).sendKeys("65478115");
 	driver.findElement(By.name(PSFTDepartment)).sendKeys("9875441");
 	driver.findElement(By.name(JobTitle)).sendKeys("Computer Engineering");
 	driver.findElement(By.name(LocalSubstitution)).sendKeys("6541");
 	driver.findElement(By.xpath(EmployeeClass[2])).click();
 	driver.findElement(By.xpath(SupervisorType[2])).click();
 	driver.findElement(By.name(FunctionalPartition)).sendKeys("AF0900");
 	driver.findElement(By.xpath(OccupationalClass[0])).click();
 	driver.findElement(By.name(JobCode)).sendKeys("GB0098");
 	driver.findElement(By.name(ApproveName1)).sendKeys("FRANKY DE WILDE");
 	driver.findElement(By.id(Approve1)).click();
 	Thread.sleep(2000);
 	driver.findElement(By.name(ApproveName2)).sendKeys("GERRY DE WILDE");
 	driver.findElement(By.id(Approve2)).click();
 	Thread.sleep(3000);
 	driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Fill Another Transaction")).click();
	driver.close();
	JOptionPane.showMessageDialog(null, "Transaction has been processed and sent to ODM", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
	return;
}catch(Exception e){
	  driver.close();
	  JOptionPane.showMessageDialog(null, "A Field has been changed or does not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
	  fail("Test Has been Failed");
}
}
//Grievance Form
public static void GrievanceForm() throws Exception {
	  			String [] GrievanceSel			= new String[] {"//input[@value='New Grievance (Grievance ID not required)']","//input[@value='Update']"}; 
	  			String Grievance_ID				=	"T000270030F030";
	  			String Starting_Date			=  "img[alt=\"Calendar\"]";
	  			String [] GrievaceSel2			= new String[] {"//input[@value='Employee']","//input[@value='Union']"}; 	
	  			String Union_Name				=	"T000270030F066";
	  			String Location					=	"T000270030F068";
	  			String [] LocationTD			=	{"IBC Vehicles Ltd","VM Ellesmere Port", "VM Central", "VM Warehouse"};
	  			String Grievance_Type			=	"T000270030F008";
	  			String [] GrievanceTD			= new String[]{"Absence","Equal Opportunities", "Discrimination", "Harassment", "Medical", "Pay", "Other"};
	  			String Description				=	"T000270030F009";
	  			String ActionTaken				=	"T000270030F018";
	  			String [] ActionTakenTD 		= new String[]{"Stage 1", "Stage 2", "Stage 3", "Stage 4", "Stage 5"};
	  			String [] Status				= new String[]{"//input[@value='Open']","//input[@value='Settled']"}; 
	  			String ActionTakenDate			=	"(//img[@alt='Calendar'])[2]";
	  			
  	try{
	  	if (NoAgent){
	  		HRinput();
	  	}
   Thread.sleep(3000);
   	driver.findElement(By.xpath(GrievanceSel[1])).click();
      	driver.findElement(By.name(Grievance_ID)).clear();
      	driver.findElement(By.name(Grievance_ID)).sendKeys("9876543210");
   	Thread.sleep(2000);
   	driver.findElement(By.cssSelector(Starting_Date)).click();
   	Thread.sleep(3000);
   			CalendarPopupHandle();
   	Thread.sleep(4000);
   	driver.findElement(By.linkText("18")).click();
   	driver.switchTo().window(parentHandle);
   	driver.switchTo().frame(0);
   	driver.findElement(By.xpath(GrievaceSel2[1])).click();
      	driver.findElement(By.name(Union_Name)).sendKeys("Medical Union");
   	new Select (driver.findElement(By.name(Location))).selectByValue(LocationTD[1]);
   	new Select (driver.findElement(By.name(Grievance_Type))).selectByValue(GrievanceTD[2]);
      	driver.findElement(By.name(Description)).sendKeys("TO BE PERFORMED");
      	new Select (driver.findElement(By.name(ActionTaken))).selectByValue(ActionTakenTD[2]);
      	driver.findElement(By.xpath(Status[1])).click();
   	Thread.sleep(3000);
    	driver.findElement(By.xpath(ActionTakenDate)).click();
   	Thread.sleep(3000);  	
   			CalendarPopupHandle();
	Thread.sleep(4000);
  	driver.findElement(By.linkText("19")).click();
  	driver.switchTo().window(parentHandle);
  	driver.switchTo().frame(0);
  	driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
  	Thread.sleep(3000);
  	driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
  	Thread.sleep(1000);
  	driver.findElement(By.linkText("Fill Another Transaction")).click();
  	driver.close();
  	JOptionPane.showMessageDialog(null, "Transaction has been processed and sent to ODM", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
  	return;
}catch(Exception e){
	  driver.close();
	  JOptionPane.showMessageDialog(null, "A Field has been changed or does not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
	  fail("Test Has been Failed");
}
}
//Address Marital Status
public static void AddressMarital() throws Exception {
	 			String Type						=	"T002880013F090";
	 			String Marital_Status			=	"T002880013F091";
	 			String PleaseGiveNewLastName	=	"T002880013F092";
	 			String AddressLine1				=	"T002880013F007";
	 			String AddressLine2				=	"T002880013F008";
	 			String TownCity					=	"T002880013F010";
	  			String PostCode					=	"T002880013F012";
	  			String Country					=	"T002880013F061";
	  			String PhoneType1				=	"T002880013F013";
	  			String FullPhoneNumber1			=	"T002880013F015";
	  			String PhoneType2				=	"T002880013F028";
	  		  	String FullPhoneNumber2			=	"T002880013F029";
	  		  	String FullPhoneNumber3			=	"T002880013F081";
		  		String Name						=	"T002880013F082";
		  		String EmailAddress				=	"T002880013F089";  			
	 	try{
	 		if (NoAgent){
	 			driver.switchTo().window(parentHandle);
	 			driver.switchTo().frame(0);
	 		}
	 	new Select (driver.findElement(By.name(Type))).selectByValue("Mr");
	 	new Select (driver.findElement(By.name(Marital_Status))).selectByValue("Separated");
   	driver.findElement(By.name(PleaseGiveNewLastName)).sendKeys("Garcia Noyola");
	driver.findElement(By.name(AddressLine1)).sendKeys("Calle Vista Alegre No. 48");
   	driver.findElement(By.name(AddressLine2)).sendKeys("Cornella de Llobregat");
   	driver.findElement(By.name(TownCity)).sendKeys("Barcelona");
   	driver.findElement(By.name(PostCode)).sendKeys("65478124");
   	driver.findElement(By.name(Country)).sendKeys("Spain");
   	new Select (driver.findElement(By.name(PhoneType1))).selectByValue("Mobile");
   	driver.findElement(By.name(FullPhoneNumber1)).click();
   	driver.findElement(By.name(FullPhoneNumber1)).sendKeys("985441256631");
   	new Select (driver.findElement(By.name(PhoneType2))).selectByValue("Home");
   	driver.findElement(By.name(FullPhoneNumber2)).click();
   	driver.findElement(By.name(FullPhoneNumber2)).sendKeys("51185478441631");
   	driver.findElement(By.name(FullPhoneNumber3)).sendKeys("487543210148567");
   	driver.findElement(By.name(Name)).sendKeys("Franklyn Noyola");
   	driver.findElement(By.name(EmailAddress)).sendKeys("franklyn.noyola@gmail.com");
   	driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
  	Thread.sleep(3000);
  	driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
  	Thread.sleep(3000);
  	driver.findElement(By.linkText("Fill Another Transaction")).click();
  	driver.close();
  	JOptionPane.showMessageDialog(null, "Transaction has been processed and sent to ODM", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
  	return;
}catch(Exception e){
	  driver.close();
	  JOptionPane.showMessageDialog(null, "A Field has been changed or does not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
	  fail("Test Has been Failed");
}
}
//BANK DETAILS CHANGE
public static void BankDetails() throws Exception {
	  			String Effective_Date			=  	"img[alt=\"Calendar\"]";
	  			String [] BankAccount			=	new String[] {"//input[@value='Bank Account']", "//input[@value='Building Society Account (please complete both the Account Number and the Building Society Roll Number field below).']"};
	  			String SortCode					=	"T000020045F020";
	  			String AccountNumber			=	"T000020045F036";
	  			String BankSocietyNumber		=	"T000020045F068";
	  			String AccountHolderName		=	"T000020045F029";
	  			
	  	try{
	  		if (NoAgent){
	  			driver.switchTo().window(parentHandle);
	  			driver.switchTo().frame(0);
	  		}
   	driver.findElement(By.cssSelector(Effective_Date)).click();
  	Thread.sleep(3000);
  	CalendarPopupHandle();
		Thread.sleep(5000);
   	driver.findElement(By.linkText("8")).click();
   	driver.switchTo().window(parentHandle);
  	driver.switchTo().frame(0);
  	driver.findElement(By.xpath(BankAccount[1])).click();
   	driver.findElement(By.name(SortCode)).sendKeys("654874");
   	driver.findElement(By.name(AccountNumber)).sendKeys("98765414");
   	driver.findElement(By.name(BankSocietyNumber)).sendKeys("9876543210148567");
   	driver.findElement(By.name(AccountHolderName)).sendKeys("Franklyn Noyola");
   	driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
  	Thread.sleep(3000);
  	driver.findElement(By.xpath(SubmitButton[SelCountry])).click();
  	Thread.sleep(3000);
  	driver.findElement(By.linkText("Fill Another Transaction")).click();
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
