package tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import pom.BaseClass;
import pom.HomePage;
import pom.ContactUs;

public class ContactUsTest extends BaseClass {

	@Test(priority = 1)
	public void testContactUs() throws InterruptedException {

		HomePage HP = new HomePage();
		HP.clickOnContactUs();

		Thread.sleep(3000);

		ContactUs CS = new ContactUs();

		CS.chooseSubHeading();
		CS.fillEmailAddress();
		CS.orderRefrence();
		CS.fillMessage();
		CS.submitForm();
		assertEquals(CS.getMessage(), "Your message has been successfully sent to our team.");

		Thread.sleep(4000);

	}

}
