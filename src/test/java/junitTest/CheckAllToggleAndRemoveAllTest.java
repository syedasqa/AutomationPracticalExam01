package junitTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import page.CheckAllToggleAndRemoveAllPage;
import util.BrowserFactory;

public class CheckAllToggleAndRemoveAllTest extends BrowserFactory {

	// validation of all check box deleted
	@Test
	public void checkAllToggleAndRemoveAllTest() {

			int nubOfCheckboxes = 4;
		
		CheckAllToggleAndRemoveAllPage checkAllToggleAndRemoveAllPage = PageFactory.initElements(driver,
				CheckAllToggleAndRemoveAllPage.class);
		
		checkAllToggleAndRemoveAllPage.removeAllcheckbox();
		checkAllToggleAndRemoveAllPage.addSomeCheckBoxs(nubOfCheckboxes);
		checkAllToggleAndRemoveAllPage.selectAllToggleCheckBOx();
		
		Assert.assertTrue("Checkbox is not selected!", checkAllToggleAndRemoveAllPage.checkIfAllCheckBoxesSelected(nubOfCheckboxes));
	}

}
