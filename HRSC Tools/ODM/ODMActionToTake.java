package ODM;

import javax.swing.JOptionPane;



import org.junit.Test;


public class ODMActionToTake {
	public String SelectionAction;
	
	public void CountrySelectionCombo() throws Exception {
		SelectionAction = (String) JOptionPane.showInputDialog(null, "Please Select Action To Take in ODM", "Action Selection", JOptionPane.INFORMATION_MESSAGE,null, 
		new Object[] {"Route", "Update Routable Form"}, "Action");
	}

	

@Test
	public void RoutableUpdate() throws Exception{
	 CountrySelectionCombo();
	 
	 switch(SelectionAction){
	 case "Route":			 			DocumentRoute.Route();
	 	 								break;
	 	 								
	 case "Update Routable Form":  		RoutableFormUpdate.RoutableUpdate();
	 	  								break;	 
	 }
	 
}
}


