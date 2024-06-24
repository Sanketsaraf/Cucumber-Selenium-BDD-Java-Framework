package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps {

	WebDriver driver;
	LoginPage loginPage;

	@Given("User is on Login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		loginPage = new LoginPage(driver);
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
	}

	@Then("User is navigated to the Home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("User is navigated to the Home page");
		driver.quit();
	}

}
