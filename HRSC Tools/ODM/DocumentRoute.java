package ODM;

import javax.swing.JOptionPane;



import org.junit.Test;


public class DocumentRoute extends _ODM_Public_Variables{
	
	
	
@Test
public void Execute() throws Exception{
 	 driver.close();
 	 JOptionPane.showMessageDialog(null,"Sorry. This cannot be executed from here. Please Execute ODMActionToTake Script to Execute this Script", "ERROR", JOptionPane.ERROR_MESSAGE);
 	 driver.quit();
 	 return;
 	 
 }

	public static void Route() throws Exception{
		Selection = (String) JOptionPane.showInputDialog(null, "Select Country to Test", "Country Selection", JOptionPane.INFORMATION_MESSAGE,null, 
				new Object[] {"UK", "ES", "BE","DE","PT","PL","FR","AT"}, "Country");
	switch (Selection){	
		case "UK": 				 	ODMRouteDocument UK = new ODMRouteDocument ();
									UK.setUp();
									UK.RouteActions();
									UK.RouteAll();
									break;	 
	 
		case "ES":		 			ODMRouteDocument ES = new ODMRouteDocument ();
	 								ES.setUp();
	 								ES.RouteActions();
	 								ES.RouteAll();
	 								break;
	 								
		case "AT":					ODMRouteDocument AT = new ODMRouteDocument ();
	 								AT.setUp();
	 								AT.RouteActions();
	 								AT.RouteAll();
	 								break;	 
	 
		case "BE": 
									ODMRouteDocument BE = new ODMRouteDocument ();
									BE.setUp();
									BE.RouteActions();
									BE.RouteAll();
									break;	 
	 
		case "DE":				 	ODMRouteDocument DE = new ODMRouteDocument ();
	 								DE.setUp();
	 								DE.RouteActions();
	 								DE.RouteAll();
	 								break;	 
	 
		case "FR": 
									ODMRouteDocument FR = new ODMRouteDocument ();
									FR.setUp();
									FR.RouteActions();
									FR.RouteAll();
									break;	 
	 
		case "PT":				 	ODMRouteDocument PT = new ODMRouteDocument ();
	 								PT.setUp();
	 								PT.RouteActions();
	 								PT.RouteAll();
	 								break;	 
	  
		case "PL":			 		ODMRouteDocument PL = new ODMRouteDocument ();
	 								PL.setUp();
	 								PL.RouteActions();
	 								PL.RouteAll();
	 								break;	 
	 }
}

}
