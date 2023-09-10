package com.spicejet.pages;
import com.spicejet.utils.SeWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignUpPage extends SeWrappers{
	
	@FindBy(xpath="//div[contains(text(),'Signup')]")
	WebElement SignUp;
	
	@FindBy(xpath="//select[@class='form-control form-select ']")
	WebElement Title;// MR // dropdown
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement Firstname;// 
	
	@FindBy(xpath ="//input[@id='last_name']")
	WebElement LastName;
	
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement Country;//AT
	
	@FindBy(xpath = "//img[@alt='date']")
	WebElement Date; //click here

	
		@FindBy(xpath="//select[@class='react-datepicker__month-select']")
		WebElement month;// value="8"
		
		@FindBy(xpath="//select[@class='react-datepicker__year-select']")
		WebElement year;// value="2000"
		
		
		@FindBy(xpath="//div[@aria-label='Choose Thursday, September 8th, 2005']")

		WebElement date;
		/*
		 * //div[@aria-label='Choose Friday, September 8th, 2000']
		 * 
		 * 
		 */
		@FindBy(xpath="//input[@placeholder='+91 01234 56789']")
		WebElement phoneno;
		
		@FindBy(xpath="//input[@id='email_id']")
		WebElement  emailid;
		
		@FindBy(xpath ="//input[@id='new-password']")
		WebElement password;
		
		@FindBy(xpath ="//input[@id='c-password']")
		WebElement confirmpassword;
		
		@FindBy(xpath="//button[@type='button']")
		WebElement submitbutton;
		
		
		@FindBy (xpath ="//input[@id='defaultCheck1']")

		WebElement checkbox;
		
		@FindBy (xpath ="//a[@class='nav-link'][normalize-space()='Flights']")
		WebElement flight;
		
		 public void signUpPageFunc(String TitleValue, String Nitin, String Roy,String Indi, String nine, String twothousand, String ph,String nitinroy1, String nRu953,String nn) throws InterruptedException  
			{
			// dismissAlert();
			 //driver.switchTo().defaultContent();
			 
			 
				click(SignUp);
				//frameByname();
				
				switchWindows();
				
				
				//click (flight);
				actionClick(Title);//dropdown MR 
				//Thread.sleep(40000);
				selectByValue(Title,TitleValue);
				
				click(Firstname);
				typeText(Firstname, Nitin );
				
				click(LastName);
				typeText(LastName,Roy);
				
				click( Country);
				
				selectByValue(Country,Indi);//IN
				
				click(Date);//1
				
				//selectByValue(month, nine);
				click(month);
				selectByValue(month, nine);
				click(year);
				selectByValue(year,twothousand);
				//click(year);
				
				
				click(date);
				//selectByValue(date, eight);
				//click(date);//
				
				click(phoneno);
				typeText(phoneno,ph);
				Thread.sleep(4000);
				
				click(emailid);
				typeText(emailid,nitinroy1);
				
				click(password);
				typeText(password,nRu953);
				click(confirmpassword);
				Thread.sleep(4000);
				typeText(confirmpassword, nn);
				Thread.sleep(5000);
				click(checkbox);
				
				
				
				
				
				
				
				
			}
			
		
		
		
}
