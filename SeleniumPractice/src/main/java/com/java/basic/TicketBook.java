package com.java.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TicketBook {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver", "src/main/java/com/driver/msedgedriver.exe");

		//Creating an object of EdgeDriver
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
            
		//Deleting all the cookies
		//driver.manage().deleteAllCookies();

		//Specifiying pageLoadTimeout and Implicit wait
		//driver.man//input[@id="fromCity"]//following::div//page().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(5000);
		driver.findElement(By.id("fromCity")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@id=\"fromCity\"]//following::div//p[contains(text(),'Pune, India')]")).click();
	    driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Mumbai");
	    
		List <WebElement> list=driver.findElements(By.xpath("//input[@id='fromCity']//following::div//p"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		driver.close();


	}
}
