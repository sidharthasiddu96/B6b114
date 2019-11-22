package casestud;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestud4 {
	WebDriver driver;
	boolean cartAvailable;
	@Given("Alex has registered  to TestMe app")
	public void alex_has_registered_to_TestMe_app() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pramod.sidhartha.b\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		  driver.findElement(By.id("userName")).sendKeys("lalitha");
		  driver.findElement(By.id("password")).sendKeys("password123");
		  driver.findElement(By.name("Login")).click();
		
	}

	@When("Alex search a particular product like headphone")
	public void alex_search_a_particular_product_like_headphone() {
		 driver.findElement(By.id("myInput")).sendKeys("headphone");
		 driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	}

	@When("Try to proceed to payment without adding to cart")
	public void try_to_proceed_to_payment_without_adding_to_cart() {
		String cart="Cart";
		try {
			WebElement element=driver.findElement(By.partialLinkText(cart));
			element.click();
			boolean cartAvailable = true;
		}catch(org.openqa.selenium.NoSuchElementException|StaleElementReferenceException e) {
			 e.printStackTrace();
		}
				
	}

	@Then("TestMe app doesnot display the cart icon")
	public void testme_app_doesnot_display_the_cart_icon() {
		Assert.assertTrue(!cartAvailable);
	  // System.out.println("it does not display cart icon");
	}
}
