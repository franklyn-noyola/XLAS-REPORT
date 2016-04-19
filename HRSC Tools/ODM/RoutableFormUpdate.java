package ODM;



import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.junit.Test;


public class RoutableFormUpdate extends _ODM_Public_Variables {
	public static String Selection;


public static void setUp() throws Exception {
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		  }

public static void CountrySelectionCombo() throws Exception {
		Selection = (String) JOptionPane.showInputDialog(null, "Select Country to Test", "Country Selection", JOptionPane.INFORMATION_MESSAGE,null, 
		new Object[] {"UK", "ES", "BE","DE","PT","PL","FR","AT"}, "Country");
	}
@Test
public void Execute() throws Exception{
 	 driver.close();
 	 JOptionPane.showMessageDialog(null,"Sorry. This cannot be executed from here. Please Execute ODMActionToTake Script to Execute this Script", "ERROR", JOptionPane.ERROR_MESSAGE);
 	 driver.quit();
 	 return;
  }

	public static void RoutableUpdate() throws Exception{
		setUp();
		CountrySelectionCombo();
	switch (Selection){
		case "UK":		 	RoutableFormUpdateConfig.UKUpdate();
	  						break;
	 
		case "ES": 		 	RoutableFormUpdateConfig.ESUpdate();
	 	 					break;
	 
	 	default: 	 	JOptionPane.showMessageDialog(null, Selection+" Country Not Ready to Test", "ERROR", JOptionPane.ERROR_MESSAGE);driver.close();break;
}
	}


}
