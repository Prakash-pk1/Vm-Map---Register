package org.sd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepD {
	WebDriver driver;
	
	@Given("User is on VM Maps acoount Sign In page")
	public void user_is_on_vm_maps_acoount_sign_in_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.vmmaps.com/");
		
	}
	@When("User Clicks Register button")
	public void user_clicks_register_button() {
		driver.findElement(By.id("registerHere")).click();
		
	}
	
	@When("User Enters valid Fullname, Email, mobile number, password and COnfirm password")
	public void user_enters_valid_fullname_email_mobile_number_password_and_c_onfirm_password() throws InterruptedException {
		driver.findElement(By.id("signup-username")).sendKeys("prakash");
		driver.findElement(By.id("signup-email")).sendKeys("prakashcrazy786@gmail.com");
		driver.findElement(By.id("signup-mobile")).sendKeys("8220709576");
		driver.findElement(By.id("signup-password")).sendKeys("18urcz05");
		driver.findElement(By.id("signup-confirmPassword")).sendKeys("18urcz05");
		Thread.sleep(3000);
		
	}
	@When("Click I agree button")
	public void click_i_agree_button() {
		driver.findElement(By.id("terms-vms-policy")).click();
		
	}
	@When("Click Register button")
	public void click_register_button() {
		driver.findElement(By.id("signup-submit-text")).click();
		
	}
	@Then("User Should see the Verify Email page")
	public void user_should_see_the_verify_email_page() throws InterruptedException {
	    WebElement emailcheck = driver.findElement(By.id("otp-form-text"));
	    Thread.sleep(3000);
	    String text = emailcheck.getText();
	    System.out.println(text);
		
	}
	
	@When("User Clicks Signup button")
	public void user_clicks_signup_button() {
		driver.findElement(By.xpath("(//span[@class='Sign-Up-Pop'])[2]")).click();
		
	}
	@Then("User Enters Already Registered Fullname, Email, mobile number, password and Confirm password")
	public void user_enters_already_registered_fullname_email_mobile_number_password_and_confirm_password() throws InterruptedException {
		driver.findElement(By.id("signup-username")).sendKeys("prakash");
		driver.findElement(By.id("signup-email")).sendKeys("prakashcrazy786@gmail.com");
		driver.findElement(By.id("signup-mobile")).sendKeys("8220709576");
		driver.findElement(By.id("signup-password")).sendKeys("18urcz05");
		driver.findElement(By.id("signup-confirmPassword")).sendKeys("18urcz05");
		Thread.sleep(3000);
		
	}
	@Then("Click Registration button")
	public void click_registration_button() {
		driver.findElement(By.id("signup-submit-text")).click();
		
	}
	@Then("User Should see the Invalid parameter message")
	public void user_should_see_the_invalid_parameter_message() throws InterruptedException {
	    WebElement msg = driver.findElement(By.id("signupFormError"));
	    Thread.sleep(3000);
	    String text = msg.getText();
	    System.out.println(text);
		
	}
	
	@When("User Clicks Register Here button")
	public void user_clicks_register_here_button() {
		driver.findElement(By.id("registerHere")).click();
		
	}
	@Then("User Enters  Fullname, Email, mobile number, password and Confirm password")
	public void user_enters_fullname_email_mobile_number_password_and_confirm_password() throws InterruptedException {
		driver.findElement(By.id("signup-username")).sendKeys("prakash");
		driver.findElement(By.id("signup-email")).sendKeys("prakashcrazy786@gmail.com");
		driver.findElement(By.id("signup-mobile")).sendKeys("8220709576");
		driver.findElement(By.id("signup-password")).sendKeys("18urcz05");
		driver.findElement(By.id("signup-confirmPassword")).sendKeys("18urcz05");
		Thread.sleep(3000);
		
	}
	@Then("Click Orange Register button")
	public void click_orange_register_button() {
	    driver.findElement(By.id("signup-submit-text")).click();
		
	}
	@Then("User Should see some message")
	public void user_should_see_some_message() {
	    System.out.println("***Please Check This Box If You Want To Proceed***");
		
	}
	
	@Then("User Enters  Fullname, Email, password and Confirm password")
	public void user_enters_fullname_email_password_and_confirm_password() throws InterruptedException {
		driver.findElement(By.id("signup-username")).sendKeys("prakash");
		driver.findElement(By.id("signup-email")).sendKeys("prakashcrazy786@gmail.com");
		driver.findElement(By.id("signup-password")).sendKeys("18urcz05");
		driver.findElement(By.id("signup-confirmPassword")).sendKeys("18urcz05");
		Thread.sleep(3000);
		
	}
	@Then("Still User Should see the Verify Email page")
	public void still_user_should_see_the_verify_email_page() throws InterruptedException {
		 WebElement emailcheck = driver.findElement(By.id("otp-form-text"));
		    Thread.sleep(3000);
		    String text = emailcheck.getText();
		    System.out.println(text);
		
	}
}