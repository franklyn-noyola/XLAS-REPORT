package eTransactions;

import org.junit.Test;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.ie.InternetExplorerDriver;

public class AgentPortalFormConfig extends _eTransactions_Variables{

	
public static void CountrySelectionCombo() throws Exception {
		Selection = (String) JOptionPane.showInputDialog(null, "Select Country to Test", "Country Selection", JOptionPane.INFORMATION_MESSAGE,null,
				new Object[] {"UK", "ES", "BE","DE","PT","PL","FR","AT"}, "Country");
			if (Selection.equals("UK")){
					CountryData = "GB";
					eFormSelection = (String) JOptionPane.showInputDialog(null, "Select eForm to Test", "eForm Selection", JOptionPane.INFORMATION_MESSAGE,null, 
							UKeForms, UKeForms[0]);
							return;
					}
	}	
public static void GMINValidation() throws Exception{
  	NoCountryMatch = true;
 	GMIN = JOptionPane.showInputDialog("TYPE NEW GMIN TO TEST");
	String GMINL = new String(GMIN);
 	if(GMINL.length()< 9 ||GMINL.length()>9){
 		InvalidGMIN = true;
 		return;
 	}
 	 String connectionUrl = "jdbc:sqlserver://GMEHR-TEST01;" + "user=TestTeam; password=T3stT3am";
	    stmt = null;
	    rs = null;
      try {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection conn = DriverManager.getConnection(connectionUrl);
         stmt = conn.createStatement();
         queryString = "select top 100 * from [gmforms].[dbo].[Employees] where GMIN_ID ="+"'"+GMIN+"'";
         rs = stmt.executeQuery(queryString);
         while (rs.next()) {
        	PCD = rs.getString("Pay_Country_CD");
        	
         }
         if (PCD.equals(CountryData)){
        	 NoCountryMatch = false;
        	 return;
         }
      } catch (Exception e) {
      }
 	return;
}
public static void ValidationGMINMsg() throws Exception{
	if (InvalidGMIN){
		driver.close();
		JOptionPane.showMessageDialog(null, "GMIN is invalid", "ERROR", JOptionPane.ERROR_MESSAGE);
		return;
	}
	if (NoCountryMatch){
		driver.close();
		JOptionPane.showMessageDialog(null, "GMIN does not match with Country selected or does not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
		return;
	}
}

@Test
public  void NoExecute() throws Exception{
	 driver.close();
	 JOptionPane.showMessageDialog(null,"Sorry. This cannot be executed from here. Please Execute eTransactionSelection Script to Execute this Script", "ERROR", JOptionPane.ERROR_MESSAGE);
	 driver.quit();
	 return;
	 
}

public static  void setUp() throws Exception {
		StringSelection stringSelection = new StringSelection(password);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	  }
public static void WindowsAuthorization() throws Exception {
	driver.get(baseUrlAgent);
		Robot robot = new Robot();
	 	Alert alert= driver.switchTo().alert();
	 		alert.sendKeys(username);
	 			robot.keyPress(KeyEvent.VK_TAB);
	 			robot.keyRelease(KeyEvent.VK_TAB);
	 			robot.keyPress(KeyEvent.VK_CONTROL);
	 			robot.keyPress(KeyEvent.VK_V);
	 			robot.keyRelease(KeyEvent.VK_CONTROL);
	 			robot.keyRelease(KeyEvent.VK_V);
	 			robot.keyPress(KeyEvent.VK_ENTER);
	 			robot.keyRelease(KeyEvent.VK_ENTER);
	 Thread.sleep(4000);
}
public static void MainWindow() throws Exception {
		driver.switchTo().window(whandle);
	    driver.switchTo().frame("menu");
	    driver.findElement(By.linkText("Transaction on behalf..")).click();
	    Thread.sleep(4000);
	    driver.switchTo().window(whandle);
	    driver.switchTo().frame("main");
	    new Select(driver.findElement(By.name("country"))).selectByVisibleText(Selection.toString());
	    Thread.sleep(5000);
}
	public static void AgenteFormlogin() throws Exception{
		driver.switchTo().frame(0);
		driver.findElement(By.name("employeeid")).sendKeys(GMINS[0]);
		driver.findElement(By.xpath(Login[0])).click();
		driver.switchTo().window(whandle);
		driver.switchTo().frame(0);
		driver.findElement(By.name(AgentGMIN)).sendKeys(GMIN);
		driver.findElement(By.id(LookUp)).click();
	}


}
