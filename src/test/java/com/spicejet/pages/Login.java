package com.spicejet.pages;
import com.spicejet.utils.SeWrappers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Login extends SeWrappers {
	
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginbutton;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='circle'][1]")
	WebElement mobileno;
	@FindBy(xpath ="//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-1yadl64 r-1loqt21 r-tmtnm0 r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-b8lwoo']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n']//*[name()='svg']")
	WebElement drop; //after this
	@FindBy(xpath="//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-1yadl64 r-1loqt21 r-tmtnm0 r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-b8lwoo']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n']//*[name()='svg']")
	WebElement india;//this1
	
	@FindBy(xpath ="//input[@data-testid='user-mobileno-input-box']")
	WebElement mobile;// type in mobile field2
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pass;
	
	@FindBy(xpath ="//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement login;
	public void loginCheck (String mob,String mobphone) 
	{

		//dismissAlert();
		//actionClick(loginbutton);
		click(loginbutton);		
		click(mobileno);
		
		click(drop);
		click(india);
		click(mobile);
		typeText(mobile,mob);// in mobile type in mob no
		click(pass);
		typeText(pass,mobphone);
		click( login);
	}

}
