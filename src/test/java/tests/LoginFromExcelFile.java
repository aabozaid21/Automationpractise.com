package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.BaseClass;
import pom.HomePage;
import pom.LoginPage;

public class LoginFromExcelFile extends BaseClass {

	@DataProvider(name = "UsersList")
	public Object[][] users() {

		return new Object[][] { { "", "" }, { "", "" } };

	}

	@Test
	public void loginFromExcelFile() {

		HomePage HP = new HomePage();
		HP.clickOnSignIn();

		LoginPage LP = new LoginPage();
		LP.SignIn(null, null);

	}

}
