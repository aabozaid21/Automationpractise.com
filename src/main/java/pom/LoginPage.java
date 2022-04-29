package pom;

import org.openqa.selenium.By;

public class LoginPage {

	public void SignIn(String UserName, String Password) {

		BaseClass.getWebDriver().findElement(By.name("email")).sendKeys(UserName);

		BaseClass.getWebDriver().findElement(By.id("passwd")).sendKeys(Password);

		BaseClass.getWebDriver().findElement(By.name("SubmitLogin")).click();

	}

	public String PasswordErrorMessage() {

		return BaseClass.getWebDriver().findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();

	}

	public void CreateAccount(String Email) {

		BaseClass.getWebDriver().findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys(Email);

		BaseClass.getWebDriver().findElement(By.id("SubmitCreate")).click();

	}

	public String getCreateAccountErrorMessage() {

		return BaseClass.getWebDriver().findElement(By.xpath("//*[@id=\"create_account_error\"]/ol/li")).getText();

	}

}
