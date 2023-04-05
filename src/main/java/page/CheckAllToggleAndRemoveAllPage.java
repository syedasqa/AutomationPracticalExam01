package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckAllToggleAndRemoveAllPage {

	WebDriver driver;

	public CheckAllToggleAndRemoveAllPage(WebDriver driver) {
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

	public boolean checkIfAllCheckBoxesSelected(int n) {
		for (int i = 0; i < n; i++) {
			if(driver.findElement(By.name("todo[" + i + "]")).isSelected() != true) {
				return false;
			}		
		}
		return true;
	}

}
