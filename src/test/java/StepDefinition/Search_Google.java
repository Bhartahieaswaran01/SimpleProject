package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_Google {
 WebDriver driver=new ChromeDriver();
	@Given("User is in google search page")
	public void user_is_in_google_search_page() {
	driver.get("https://google.com");
	}

	@When("User can able to search the keyword")
	public void user_can_able_to_search_the_keyword() {
	    driver.findElement(By.name("q")).sendKeys("selenium");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("User can able to view the search page")
	public void user_can_able_to_view_the_search_page() {

		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
	}

}
