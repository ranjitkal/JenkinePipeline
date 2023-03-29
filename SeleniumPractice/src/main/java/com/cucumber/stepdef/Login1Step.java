package com.cucumber.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.cucumber.page.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Login1Step {
	
	public WebDriver driver;
	public LoginPage loginpage;
	
	@Given("User lunch browser")
	public void user_lunch_browser() {
		System.setProperty("webdriver.edge.driver", "src/main/java/com/driver/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://demo.guru99.com/v4/");
		//mngr482336
		//myjysyb
		loginpage=new LoginPage(driver);
	}

	@And("user open the url {string}")
	public void user_open_the_url(String url) {
     driver.get(url);
	}

	@And("user enter {string} and {string}")
	public void user_enter_and(String username, String passw) {
		
	   loginpage.enteremail(username);
	   loginpage.enterpassword(passw);
	}

	@And("clcik login button")
	public void clcik_login_button() {
		
		loginpage.cicklogin();
		
	}

	@And("close the browser")
	public void close_the_browser() {
	 driver.close();
	    
	}



}
