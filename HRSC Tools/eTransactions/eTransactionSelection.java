package eTransactions;



import javax.swing.JOptionPane;
import org.junit.Test;

public class eTransactionSelection extends _eTransactions_Variables{
	  
	  public static String Selection;

public static void CountrySelectionCombo() throws Exception {
	Selection = (String) JOptionPane.showInputDialog(null, "Select Action To Test", "Action Selection", JOptionPane.INFORMATION_MESSAGE,null, 
	new Object[] {"Check eLink", "Submit Form from HRSC Portal", "Submit Form from Agent Portal"}, "Action");
}
@Test
	public void Workflow() throws Exception{
		CountrySelectionCombo();
	switch(Selection){	
		case "Check eLink": 					AllNewELinkValueCheck.setUp();
		 										AllNewELinkValueCheck.eLinkWorkflow();
		 										break; 
		case "Submit Form from HRSC Portal": 	NoAgent = true;
												HRSCFormSubmission.Workflow();
	 	 										break;
	 	 										
		case "Submit Form from Agent Portal":	NoAgent = false;
												AgentSelect.Workflow();
	 	 										break;
	 } 	
	
}

}

