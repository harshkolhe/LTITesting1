package TestScript;

import cucumber.api.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestScript {
	WebDriver driver;
	
	@Given("user open chrome browser")
	public void user_open_chrome_browser() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsh Kolhe\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Given("navigates to newtours")
	public void navigates_to_newtours() {
	   driver.get("https://demo.guru99.com/test/newtours/index.php");
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
	    driver.findElement(By.name("userName")).sendKeys("mercury");
	}

	@When("user enters valid password")
	public void user_enters_valid_password() {
		driver.findElement(By.name("password")).sendKeys("mercury");
	}

	@When("user click on submit")
	public void user_click_on_submit() {
	    driver.findElement(By.name("submit")).click();
	}

	@Then("verify login success")
	public void verify_login_success() {
	    Assert.assertTrue(driver.getTitle().contains("Login"));
	}

	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	}
	
	
	@Given("users open chrome browser")
	public void users_open_chrome_browser() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsh Kolhe\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
	}

	@Given("navigate to newtours")
	public void navigate_to_newtours() {
		 driver.get("https://demo.guru99.com/test/newtours/index.php");
	}

	@When("Click on register")
	public void click_on_register() {
	    driver.findElement(By.linkText("REGISTER")).click();
	}

	@When("users enter username")
	public void users_enter_username() {
		driver.findElement(By.name("email")).sendKeys("Harsh");
	}

	@When("users enter password")
	public void users_enter_password() {
		driver.findElement(By.name("password")).sendKeys("mercury");
	}

	@When("users enter confirm password")
	public void users_enter_confirm_password() {
		driver.findElement(By.name("confirmPassword")).sendKeys("mercury");
	}

	@When("users click on submit button")
	public void users_click_on_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("verify register success")
	public void verify_register_success() {
	   String result=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table")).getText();
	   Assert.assertTrue(result.contains("Thank you"));
	}
	
	
	
	@Given("enter username as {string}")
	public void enter_username_as(String un) {
		driver.findElement(By.name("userName")).sendKeys(un);
	}

	@Given("enter password as {string}")
	public void enter_password_as(String psd) {
		driver.findElement(By.name("password")).sendKeys(psd);
	}

	@Given("user clicks on submit")
	public void user_clicks_on_submit() {
		driver.findElement(By.name("submit")).click();
	}
	
	@Given("verify login is success")
	public void verify_login_is_success() {
	    if(driver.getTitle().contains("Login")) {
	    	System.out.println("Credientials are valid");
	    }else {
	    	System.out.println("Invalid credientials");
	    }
	}
	
	
	@Given("users enter username as {string}")
	public void users_enter_username_as(String un) {
		driver.findElement(By.name("email")).sendKeys(un);
	}
	    

	@Given("users enter password as {string}")
	public void users_enter_password_as(String psd) {
		driver.findElement(By.name("password")).sendKeys(psd);
	}

	@Given("users enter confirm password as{string}")
	public void users_enter_confirm_password_as(String cpsd) {
		driver.findElement(By.name("confirmPassword")).sendKeys(cpsd);
	}

}
