package com.cucumber.stepdef;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.io.File;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.Scenario;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	
	WebDriver driver;
	
	@Given("^Open the Firefox and launch the application$")				
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {	
		System.setProperty("webdriver.edge.driver", "src/main/java/com/driver/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/v4/");
		//mngr482336
		//myjysyb
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
    	driver.findElement(By.name("uid")).sendKeys("mngr482336");
    	driver.findElement(By.name("password")).sendKeys("myjysyb");
    	
    }		

    @Then("^click login button$")					
    public void Reset_the_credential() throws Throwable 							
    {    	
    	driver.findElement(By.name("btnLogin")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
    }	
    
    @Then("^validate login$")
    		
    	public void checklogin()
    	{
    	String actual=driver.findElement(By.xpath("//*[contains(text(),'Site')]")).getText();
        System.out.println(actual);    
        String expected="Site Demo";
       
    	
    }
    
    
    @AfterStep
    public void addScreenShot(Scenario scenrio)
    {
    	final byte[] screnshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES); 
        scenrio.attach(screnshot, "image/png",scenrio.getName());
    }
    @Before
    public void teatup()
    {
    	System.out.println("execution started");
    }
   // @After 
    public void teardown(Scenario sc)
    {
		System.out.println("Tear Down method executed..");
		if(sc.isFailed()==true)
		{
			//Convert web driver object to TakeScreenshot

			String fileWithPath = "D:\\Ranjit\\Ranjit_workspace\\SeleniumPractice\\ScreenShot\\abc.png";
			TakesScreenshot scrShot =((TakesScreenshot)driver);

			//Call getScreenshotAs method to create image file
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

			//Move image file to new destination
			File DestFile=new File(fileWithPath);

			//Copy file at destination

			try {
				FileUtils.copyFile(SrcFile, DestFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		driver.quit();
    }
}
