package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {

	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step - browser is open");
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is:" + projectPath);
		System.getProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		// driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		Thread.sleep(2000);
		
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.id("submit")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		driver.findElement(By.id("Logout")).isDisplayed();
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		}
}
