package tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import pom.BaseClass;
import pom.HomePage;

public class HomePageTest extends BaseClass {

	@Test
	public void checkHomePageCount() {

		HomePage HP = new HomePage();

		assertEquals(HP.getHomePageItemsCount(), 14);
	}

}
