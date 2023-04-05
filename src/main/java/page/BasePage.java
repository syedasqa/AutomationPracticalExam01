package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	WebDriver driver;

	public void removeAllcheckbox() throws InterruptedException {
		// First check all check box
		driver.findElement(By.name("allbox")).click();

		// Next deleting all the check boxes
		driver.findElement(By.cssSelector("input[name='submit'][value='Remove']")).click();
	}
}
