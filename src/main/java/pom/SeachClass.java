package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeachClass {

	public void search(String searchKeyword) {

		BaseClass.getWebDriver().findElement(By.id("search_query_top")).clear();
		BaseClass.getWebDriver().findElement(By.id("search_query_top")).sendKeys(searchKeyword);
		BaseClass.getWebDriver().findElement(By.name("submit_search")).click();

	}

	public List<WebElement> getInstockButtons() {

		List<WebElement> itemsList = BaseClass.getWebDriver().findElements(By.className("availability"));

		return itemsList;
	}

}
