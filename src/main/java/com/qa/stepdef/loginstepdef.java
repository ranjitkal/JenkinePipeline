package com.qa.stepdef;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class loginstepdef {
	
	
	@Given ("^user navigates to the website javatpoint.com$")
	public void navigate() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","src/main/java/com/qa/stepdef/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		driver.findElement(By.xpath("//*[@id='content']/button")).click();
		Thread.sleep(3000);
		//Alert alert=driver.switchTo().alert();
		Alert alert = driver.switchTo().alert();
		String print = alert.getText();
		System.out.println(print);
		alert.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='content']/button")).click();
		Thread.sleep(3000);
		alert.dismiss();
		
		driver.close();
	    
	}
	
    @And ("^there user logs in through Login Window by using$")
    public void lognwindow()
    {
    	System.out.println("login window");
    }
    @Then ("^login must be successful.$")
    public void sucess()
    {
    	System.out.println("login scuessfully");
    }

}
