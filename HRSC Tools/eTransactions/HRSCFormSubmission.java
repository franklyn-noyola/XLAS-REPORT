package eTransactions;


import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.junit.Test;
import org.junit.Before;


public class HRSCFormSubmission extends _eTransactions_Variables{
	  
	  public static String Selection;

@Before
public static void setUp() throws Exception {
		StringSelection stringSelection = new StringSelection(password);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

}
public static void CountrySelectionCombo() throws Exception {
	Selection = (String) JOptionPane.showInputDialog(null, "Select Country to Test", "Country Selection", JOptionPane.INFORMATION_MESSAGE,null, 
	new Object[] {"UK", "ES", "BE","DE","PT","PL","FR","AT"}, "Country");
}
@Test
public  void NoExecute() throws Exception{
	 driver.close();
	 JOptionPane.showMessageDialog(null,"Sorry. This cannot be executed from here. Please Execute eTransactionSelection Script to Execute this Script", "ERROR", JOptionPane.ERROR_MESSAGE);
	 driver.quit();
	 return;
	 
}

	public static void Workflow() throws Exception{
		CountrySelectionCombo();
		
	switch (Selection){
	case "UK": 		CountryData = "GB"; eFormsC = UKForms;SelCountry=0;LANSQ = ENSQ;
		 			HRSCFormConfig.UKTransaction();
		 			break;
		 			
	case "ES":		CountryData = "ES";eFormsC = ESEforms;LANSQ = ESSQ;SelCountry=1;
					HRSCFormConfig.ESTransaction();
		 			break;
		 			
	case "BE": 		CountryData = "BE";;LANSQ = BESQ; SelCountry=3;
					HRSCFormConfig.BETransaction();
		 			break;
		 			
	case "DE": 		CountryData = "DE";SelCountry=2;LANSQ = DESQ;eFormsC = DEEforms;
					HRSCFormConfig.DETransaction();
		 			break;
		 			
	case "AT": 		CountryData = "AT";SelCountry=7;LANSQ = DESQ;eFormsC = ATEforms;
					HRSCFormConfig.ATTransaction();
					break;
					
	case "FR": 		CountryData = "FR";SelCountry=4;LANSQ = FRSQ;eFormsC = FREforms;
					HRSCFormConfig.FRTransaction();
					break;

	case "PL": 		CountryData = "PL";SelCountry=6;LANSQ = PLSQ;eFormsC = PLEforms;
					HRSCFormConfig.PLTransaction();
					break;
					
	case "PT": 		CountryData = "PT";SelCountry=5;LANSQ = PTSQ;eFormsC = PTEforms;
					HRSCFormConfig.PTTransaction();
					break;
					
	default: 	 	JOptionPane.showMessageDialog(null, Selection + " COUNTRY not Ready to Test", "Confirmation Message", JOptionPane.ERROR_MESSAGE);
					driver.close();
					break;
	 }
}

}

