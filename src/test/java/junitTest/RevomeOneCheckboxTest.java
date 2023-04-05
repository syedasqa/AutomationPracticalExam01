package junitTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import page.RemoveOneCheckBoxpage;
import util.BrowserFactory;

public class RevomeOneCheckboxTest extends BrowserFactory {

	@Test
	public void revomeOneCheckboxTest() {
		RemoveOneCheckBoxpage removeOneCheckBoxpage = PageFactory.initElements(driver, RemoveOneCheckBoxpage.class);

		removeOneCheckBoxpage.removeOneCheckBox();
		
		Assert.assertTrue("Not able to delete the check boxes!", removeOneCheckBoxpage.ifCheckboxDeleted());

	}

}
