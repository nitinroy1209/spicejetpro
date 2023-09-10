package com.spicejet.pages;
import com.spicejet.utils.SeWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Login extends SeWrappers {
	
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginbutton;
	
	
	public void loginCheck () throws InterruptedException 
	{

		//dismissAlert();
		//actionClick(loginbutton);
		click(loginbutton);		
		Thread.sleep(30000);
	}

}
