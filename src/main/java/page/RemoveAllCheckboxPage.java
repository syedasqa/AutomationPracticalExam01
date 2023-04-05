package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveAllCheckboxPage {

	WebDriver driver;

	public RemoveAllCheckboxPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addSomeCheckBoxs(int n) {

		// Adding four check boxes that we will select later
		Random rnd = new Random();
		for (int i = 0; i < n; i++) {
			driver.findElement(By.name("data")).sendKeys("CheckBox" + rnd.nextInt());
			driver.findElement(By.cssSelector("input[name='submit'][value='Add']")).click();
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void selectAllToggleCheckBOx() {
		driver.findElement(By.name("allbox")).click();	
	}
	
	public void removeAllcheckbox() {
		selectAllToggleCheckBOx();

		// Next deleting all the check boxes
		driver.findElement(By.cssSelector("input[name='submit'][value='Remove']")).click();
	}

	public boolean checkIfAnyCheckBoxExists() {
		Boolean checkboxExist = (driver.findElements(By.cssSelector("input[type='checkbox'][name^='todo']"))
				.size() > 0);
		return checkboxExist;
	}

}
