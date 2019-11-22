package casestud;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casetud22 {
	WebDriver driver;
	@Given("User opens the application")
	public void user_opens_the_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pramod.sidhartha.b\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	
	  
	}

	@When("user click on signin link")
	public void user_click_on_signin_link() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	   
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		  driver.findElement(By.id("userName")).sendKeys(username);
		  driver.findElement(By.id("password")).sendKeys(password);
		  driver.findElement(By.name("Login")).click();
		  driver.findElement(By.linkText("SignOut")).click();
		  driver.close();
		
	   
	}

	@Then("message displayed login successfully")
	public void message_displayed_login_successfully() {
	System.out.println("Login successful");
		
	  
	}
}
