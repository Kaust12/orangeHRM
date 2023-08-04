package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginPageStepDef {

	public static WebDriver driver;
@Given("User open orange hrm url")
public void user_open_orange_hrm_url() 
{
    driver=new ChromeDriver();
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
}

@When("user enter valid username and valid password")
public void user_enter_valid_username_and_valid_password() throws InterruptedException
{
	Thread.sleep(5000);
  driver.findElement(By.name("username")).sendKeys("Admin");
  driver.findElement(By.name("password")).sendKeys("admin123");
  driver.findElement(By.xpath("//button[text()=' Login ']")).click();
  
}

@Then("user is on homepage")
public void user_is_on_homepage()
{
   String actualTitle= driver.getTitle();
   Assert.assertEquals(actualTitle, "OrangeHRM");
}
}
