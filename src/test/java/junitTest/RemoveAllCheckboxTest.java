package junitTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import page.RemoveAllCheckboxPage;
import util.BrowserFactory;

public class RemoveAllCheckboxTest extends BrowserFactory {

	@Test
	public void removeAllCheckboxTest() throws InterruptedException {

		RemoveAllCheckboxPage removeAllCheckboxPage = PageFactory.initElements(driver, RemoveAllCheckboxPage.class);
		
		removeAllCheckboxPage.addSomeCheckBoxs(4);
		removeAllCheckboxPage.removeAllcheckbox();
		
		Assert.assertTrue("Not able to delete all the check boxes!", !removeAllCheckboxPage.checkIfAnyCheckBoxExists());
	}

}
