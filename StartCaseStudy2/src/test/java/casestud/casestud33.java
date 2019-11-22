package casestud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestud33 {
	WebDriver driver;
	@Given("user logins with valid credentials")
	public void user_logins_with_valid_credentials() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pramod.sidhartha.b\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		  driver.findElement(By.id("userName")).sendKeys("lalitha");
		  driver.findElement(By.id("password")).sendKeys("password123");
		  driver.findElement(By.name("Login")).click();
		
	}

	@When("user enters the product to be searched and selects it")
	public void user_enters_the_product_to_be_searched_and_selects_it() {
		  Actions act = new Actions(driver);
		  WebElement find=driver.findElement(By.id("myInput"));
		  act.sendKeys(find,"h").pause(1000).sendKeys("e").pause(1000).sendKeys("a").pause(1000).sendKeys("d").build().perform();
		  act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Headphone')]"))).
		  click().build().perform();
	}

	@When("user clicks on find details and  adds the product to cart")
	public void user_clicks_on_find_details_and_adds_the_product_to_cart() {
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();  

	}

	@When("user goes to cart and clicks on checkout")
	public void user_goes_to_cart_and_clicks_on_checkout() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		
		  driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	}

	@When("user clicks on  proceeds to pay")
	public void user_clicks_on_proceeds_to_pay() {
		  driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	}

	@When("user selects Andhra Bank and clicks on continue")
	public void user_selects_Andhra_Bank_and_clicks_on_continue() {
		 WebDriverWait wait = new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'Andhra Bank')]"))).click();
		  driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
		  driver.findElement(By.xpath("//*[@id=\"btn\"]")).click(); 
	}

	@When("user login using his bank credentials")
	public void user_login_using_his_bank_credentials() {
		  driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys("123456");
		  driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("Pass@456");
		  driver.findElement(By.xpath("//input[@type='submit' and @value='LOGIN']")).click();
	}

	@When("user enters his transaction password")
	public void user_enters_his_transaction_password() {
		  driver.findElement(By.xpath("//input[@type='password' and @value='PASSWORD']")).sendKeys("Trans@456");
		  driver.findElement(By.xpath("//input[@type='submit' and @value='PayNow']")).click();
	}

	@Then("user should b directed to order details  page")
	public void user_should_b_directed_to_order_details_page() {
		System.out.println("The page title is"+driver.getTitle());
	}

}
