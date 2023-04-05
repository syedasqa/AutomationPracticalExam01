package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveOneCheckBoxpage {
	WebDriver driver;
	
	public RemoveOneCheckBoxpage(WebDriver driver) {		
		this.driver = driver;		
	}


	public void selectAllToggleCheckBOx() {
		driver.findElement(By.name("allbox")).click();	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void removeAllcheckbox() {
		selectAllToggleCheckBOx();

		// Next deleting all the check boxes
		driver.findElement(By.cssSelector("input[name='submit'][value='Remove']")).click();
	}
	
	public void addOneCheckBox() {
		driver.findElement(By.name("data")).sendKeys("CheckBoxForDelete");
		driver.findElement(By.cssSelector("input[name='submit'][value='Add']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	
	public void removeOneCheckBox() {
		// First remove all existing check boxes then we will add one
		removeAllcheckbox();
		
		addOneCheckBox();
		
		driver.findElement(By.name("todo[0]")).click();		
		driver.findElement(By.cssSelector("input[name='submit'][value='Remove']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
	}

	public boolean ifCheckboxDeleted() {
		Boolean checkboxDeleted = (driver.findElements(By.cssSelector("input[type='checkbox'][name='todo[0]']"))
				.size() == 0);
		return checkboxDeleted;
	}
}