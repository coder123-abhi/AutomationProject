package facebooktesting;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;


public class FBLogin {
	
	WebDriver driver;

	@Given("the user is on the login page of Facebook")
	public void the_user_is_on_the_login_page_of_facebook() {
	    
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BrowserDriver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(options);
		
		String url="https://www.facebook.com/login.php/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@When("the user provides valid username and valid password")
	public void the_user_provides_valid_username_and_valid_password() throws InterruptedException {
	    
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("7896979686");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Trishala99");
		
		Thread.sleep(3000);
		
	}



	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() throws InterruptedException {
	   
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
	}

	@Then("user is redirected to the landing page of Facebook")
	public void user_is_redirected_to_the_landing_apge_of_facebook() {
	    
		System.out.println("Website accessed!");
		
		driver.close();
	}
	
	
}
