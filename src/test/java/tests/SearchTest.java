package tests;

import static org.testng.Assert.assertEquals;

import java.util.List;
import org.openqa.selenium.WebElement;
import pom.BaseClass;
import pom.SeachClass;

public class SearchTest extends BaseClass {

	// @Test
	public void searchTest() throws InterruptedException {

		SeachClass SC = new SeachClass();

		SC.search("dress");

		List<WebElement> itemList = SC.getInstockButtons();

		// emList.get().getText()

		for (WebElement item : itemList) {

			assertEquals(item.getText(), "In stock");
		}

		Thread.sleep(3000);
	}

//DataProvider(name="")

	/*
	 * @Test public void searchWithMultipleSearchKeyWords () {
	 * 
	 * SeachClass Sc= new SeachClass();
	 * 
	 * Sc.search(null);
	 * 
	 * }
	 */

}
