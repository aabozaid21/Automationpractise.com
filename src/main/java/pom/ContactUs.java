package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {

	public void chooseSubHeading() {

		new Select(BaseClass.getWebDriver().findElement(By.id("id_contact"))).selectByVisibleText("Webmaster");

	}

	public void fillEmailAddress() {
		BaseClass.getWebDriver().findElement(By.id("email")).sendKeys("test@gmial.com");
	}

	public void orderRefrence() {
		BaseClass.getWebDriver().findElement(By.id("id_order")).sendKeys("111");
	}

	public void fillMessage() {

		BaseClass.getWebDriver().findElement(By.id("message")).sendKeys("test message");

	}

	public void submitForm() {

		BaseClass.getWebDriver().findElement(By.id("submitMessage")).click();
	}

	public String getMessage() {

		return BaseClass.getWebDriver().findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
	}

}
