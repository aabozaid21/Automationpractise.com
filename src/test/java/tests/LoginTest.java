package tests;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.BaseClass;
import pom.HomePage;
import pom.LoginPage;

public class LoginTest extends BaseClass {

	WebDriver driver = super.getWebDriver();

	@DataProvider(name = "UsersList")

	public static Object[][] Users() {

		return new Object[][] { { "User1", "Password1" }, { "User2", "Password2" }, { "User3", "Password3" } };
	}

	@Test(priority = 4, dataProvider = "UsersList")

	public void testtUserWithList(String User, String Password) {

		HomePage HP = new HomePage();

		HP.clickOnSignIn();

		LoginPage LP = new LoginPage();

		LP.SignIn(User, Password);

	}

	@Test(priority = 1)

	public void missingPasswordField() {

		HomePage HP = new HomePage();

		HP.clickOnSignIn();

		LoginPage LP = new LoginPage();

		LP.SignIn("test@gmail.com", "");

		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")));

		assertEquals(LP.PasswordErrorMessage(), "Password is required.");

	}

	@Test(priority = 2)

	public void testLoginWithIncorrectPassword() {

		HomePage HP = new HomePage();

		HP.clickOnSignIn();

		LoginPage LP = new LoginPage();

		LP.SignIn("test@gmail.com", "testpass");

		assertEquals(LP.PasswordErrorMessage(), "Authentication failed.");

	}

	@Test(priority = 3)
	public void CreateAccounErrorMessage() {

		LoginPage LP = new LoginPage();

		LP.CreateAccount("test@gmail.com");

		// driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS); //implicit
		// wait

		WebDriverWait wait = new WebDriverWait(driver, 4); // explicit wait

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"create_account_error\"]/ol/li")));

		String message = LP.getCreateAccountErrorMessage();

		assertEquals(message, "An account using this email address"
				+ " has already been registered. Please enter a valid" + " password or request a new one.");

	}

	@DataProvider(name = "UsersList2")
	public static Object[][] Users2() {
		return new Object[][] { { "user1", "pass1" }, { "user2", "pass2" } };
	}

	@Test(priority = 5, dataProvider = "UsersList2")
	public void LoginWithDataProvider(String User2, String pass2) {

		HomePage HP = new HomePage();
		HP.clickOnSignIn();

		LoginPage LP = new LoginPage();
		LP.SignIn(User2, pass2);

	}
}
