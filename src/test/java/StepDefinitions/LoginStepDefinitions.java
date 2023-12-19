package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

static WebDriver driver;

@Given("User is on login page")
public void user_is_on_login_page() {
   driver= new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   driver.get("https://www.saucedemo.com/v1/");
}

@When("User provides username and password")
public void user_provides_username_and_password() {
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
}

@And("User clicks Continue button")
public void user_clicks_continue_button() {
	driver.findElement(By.id("login-button")).click();
}

@Then("User navigates to Homepage")
public void user_navigates_to_homepage() {
   Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"),"User navigated to Home page");
}

@And("User closes the browser")
public void user_closes_the_browser() {
   driver.close();
}
}
