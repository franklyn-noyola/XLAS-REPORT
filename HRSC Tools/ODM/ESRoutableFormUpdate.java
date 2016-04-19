package ODM;

import org.junit.Test;

import org.openqa.selenium.By;

import javax.swing.JOptionPane;


public class ESRoutableFormUpdate extends _ODM_Public_Variables{
  //private StringBuffer verificationErrors = new StringBuffer();

@Test
public void Execute() throws Exception{
	 driver.close();
	 JOptionPane.showMessageDialog(null,"Sorry. This cannot be executed from here. Please Execute ODMActionToTake Script to Execute this Script", "ERROR", JOptionPane.ERROR_MESSAGE);
	 driver.quit();
	 return;
}	 

  public static void DatosBancarios() throws Exception{
	//ROUTABLE FORM FIELDS
		  //Datos Bancarios
			driver.findElement(By.name("TEXTBOXzzz11")).clear();
			driver.findElement(By.name("TEXTBOXzzz11")).sendKeys("6541");				//IBAN
			driver.findElement(By.name("TEXTBOXzzz12")).clear();
			driver.findElement(By.name("TEXTBOXzzz12")).sendKeys("4154");				//ENTIDAD
			driver.findElement(By.name("TEXTBOXzzz13")).clear();
			driver.findElement(By.name("TEXTBOXzzz13")).sendKeys("0417");				//OFICINA
			driver.findElement(By.name("TEXTBOXzzz14")).clear();
			driver.findElement(By.name("TEXTBOXzzz14")).sendKeys("28");					//DC
			driver.findElement(By.name("TEXTBOXzzz15")).clear();
			driver.findElement(By.name("TEXTBOXzzz15")).sendKeys("8741234581");			//Numero de Cuenta
			driver.findElement(By.name("DATETEXTzzz17")).clear();
			driver.findElement(By.name("DATETEXTzzz17")).sendKeys("05/03/2014");		//Fecha
			driver.findElement(By.name("TEXTBOXzzz18")).clear();
			driver.findElement(By.name("TEXTBOXzzz18")).sendKeys("Y");					//FIRMA
			driver.findElement(By.name("TEXTBOXzzz22")).clear();
			driver.findElement(By.name("TEXTBOXzzz22")).sendKeys("6507896633");			//Telephone Number
			driver.findElement(By.name("TEXTBOXzzz23")).clear();
			driver.findElement(By.name("TEXTBOXzzz23")).sendKeys("Franklyn Noyola");	//NOMBRE
			driver.findElement(By.name("TEXTBOXzzz24")).clear();
			driver.findElement(By.name("TEXTBOXzzz24")).sendKeys("franklyn.noyola@gmail.com");// EMAIL
			driver.findElement(By.id(UpdateForm)).click();
			Thread.sleep(2000);
			driver.quit();
			JOptionPane.showMessageDialog(null, "Routable Form has been UPDATED successfully", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
			return;
	}


}