package com.cucumber.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver localdriver;
	
	public LoginPage(WebDriver lodriver)
	{
		localdriver=lodriver;
		PageFactory.initElements(lodriver, this);
				
	}
	
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement butoonlogin;
	
	public void enteremail(String emailadd)
	{
		username.sendKeys(emailadd);
	}
	
    public void enterpassword(String pass)
    {
    	password.sendKeys(pass);
    }
    
    public void cicklogin()
    {
    	butoonlogin.click();
    }
}
