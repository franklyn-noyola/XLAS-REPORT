package eTransactions;

import javax.swing.JOptionPane;

import org.junit.Test;
import org.openqa.selenium.By;

public class AgentSelect extends AgentPortalFormConfig {


@Test
public  void NoExecute() throws Exception{
	 driver.close();
	 JOptionPane.showMessageDialog(null,"Sorry. This cannot be executed from here. Please Execute eTransactionSelection Script to Execute this Script", "ERROR", JOptionPane.ERROR_MESSAGE);
	 driver.quit();
	 return;
	 
}
public  static void Workflow() throws Exception{
	AgentPortalFormConfig.CountrySelectionCombo();
	switch (Selection){
		case "UK": 
					switch (eFormSelection){	
					case "Defined Benefit Pension Plan":
								AgentGMIN = UKForm.DefinedBenefitGMINField; 
								GMINValidation(); ValidationGMINMsg(); WindowsAuthorization(); MainWindow();
								driver.findElement(By.xpath(UKForms[4])).click(); Thread.sleep(3000); AgenteFormlogin(); UKForm.DefinedBenefit();
								break;	
							 
					case "Defined Contribution Pension Plan":
								AgentGMIN = UKForm.DefinedContributionField;
								GMINValidation(); ValidationGMINMsg(); WindowsAuthorization(); MainWindow();
								driver.findElement(By.xpath(UKForms[5])).click();Thread.sleep(3000); AgenteFormlogin(); UKForm.DefinedContributionPension();
								break;
							
					case "HR Pension Form":
								AgentGMIN = UKForm.HRPensionGMINField;
								GMINValidation(); ValidationGMINMsg(); WindowsAuthorization(); MainWindow(); 
								driver.findElement(By.xpath(UKForms[11])).click(); Thread.sleep(3000);AgenteFormlogin(); UKForm.HRPensionForm();
								break;
					case "Department Transfer":
								AgentGMIN = UKForm.DepartmentTransferField;
								GMINValidation(); ValidationGMINMsg(); WindowsAuthorization(); MainWindow(); 
								driver.findElement(By.xpath(UKForms[6])).click(); Thread.sleep(3000);AgenteFormlogin(); UKForm.DepartmentTransfer();
								break;
						
					default:driver.close();
							JOptionPane.showMessageDialog(null, eFormSelection + " not Ready to Test", "ERROR", JOptionPane.ERROR_MESSAGE);
								break;
						}
					break;
		default: 	driver.close();
	 				JOptionPane.showMessageDialog(null, Selection  + " Country not Ready to Test", "ERROR", JOptionPane.ERROR_MESSAGE);
	 }
}
}

