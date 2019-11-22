package casestud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CaseStd1 {
	WebDriver driver;
	@Given("the signup page is opened")
	public void the_signup_page_is_opened() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pramod.sidhartha.b\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		driver.get(url);
		driver.findElement(By.linkText("SignUp")).click();
	   
	}
	@When("user enters pramodsiddd as username")
	public void user_enters_pramodsiddd_as_username() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("userName")).sendKeys("swarappupammi");
	}

	@Then("user enters gsjgdjhdj as First name")
	public void user_enters_gsjgdjhdj_as_First_name() {
		driver.findElement(By.id("firstName")).sendKeys("swarr");
	}

	@Then("user enters ajsghdjdjsabjab as Last name")
	public void user_enters_ajsghdjdjsabjab_as_Last_name() {
		  driver.findElement(By.id("lastName")).sendKeys("sapi"); 
	}


	@When("enters ALluArjun@{int} as password")
	public void enters_ALluArjun_as_password(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("password")).sendKeys("wermiswar148");
	}

	@When("enters ALluArjun@{int} as password for confirmation")
	public void enters_ALluArjun_as_password_for_confirmation(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("pass_confirmation")).sendKeys("wermiswar148");
	}

	@When("Select gender as male")
	public void select_gender_as_male() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label")).click();
	}
	
	@Then("enters prammoodd{int}@gmail.com as email id")
	public void enters_prammoodd_gmail_com_as_email_id(Integer int1) {
		driver.findElement(By.id("emailAddress")).sendKeys("pramswaru96@gmail.com");
	}
	
	@Then("user enters {string} as phone number")
	public void user_enters_as_phone_number(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.id("mobileNumber")).sendKeys("1234564985");
	}

	@Then("Selects {string} as his date of birth")
	public void selects_as_his_date_of_birth(String string) {
		 driver.findElement(By.name("dob")).sendKeys("18-10-1987");
	}


@Then("enters abcdef as address")
public void enters_abcdef_as_address() {
	driver.findElement(By.id("address")).sendKeys("abcdef");
}

@Then("selects security question as birth place")
public void selects_security_question_as_birth_place() {
	//driver.findElement(By.xpath("//select[@name='securityQuestion' and @value='411010']")).click();
	  Select dropdown2 = new Select(driver.findElement(By.id("securityQuestion")));
	  dropdown2.selectByIndex(0);
}

@Then("answers as mangalore")
public void answers_as_mangalore() {
	
	driver.findElement(By.id("answer")).sendKeys("mangalore");
}

@Then("Clicks on register")
public void clicks_on_register() {
	 driver.findElement(By.xpath("//input[@type='submit' and @value='Register']")).click();
  
}

@Then("User is navigated to Login Page")
public void user_is_navigated_to_Login_Page() {
	System.out.println("The page title is"+driver.getTitle());
}

}
