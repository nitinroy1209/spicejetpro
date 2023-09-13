package com.spicejet.pages;
import com.spicejet.utils.SeWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Dummy extends SeWrappers {
	
	
		
		@FindBy(xpath="//div[@class='css-76zvg2 r-jwli3a r-ubezar r-1ozqkpa']")
		WebElement flight;
		@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/div[1]")
		WebElement radiobuttononeside;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input[1]")
		WebElement FRomField;
		@FindBy (xpath ="/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]/div[2]/input")
	WebElement ToField;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div/div")
		WebElement Date;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")
		WebElement last;
		
		@FindBy(xpath="//*[@data-testid='spicesaver-flight-select-radio-button-0']")
		WebElement pri;
		@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
		WebElement fin;
		
		
		@FindBy(xpath="//*[@id=\"primary-contact-details\"]/div[3]/div[2]/div/div/div[2]/input")
		WebElement firstName;
		
		@FindBy(xpath="//*[@id=\"primary-contact-details\"]/div[3]/div[3]/div/div/div[2]/input")
		WebElement lastname;
		
		@FindBy(xpath="//*[@id=\"primary-contact-details\"]/div[3]/div[4]/div/div[2]/input")
		WebElement Contactno;
		
		@FindBy(xpath="//*[@id=\"primary-contact-details\"]/div[4]/div[1]/div/div/div[2]/input")
		WebElement emailaddress;
		
		@FindBy(xpath="//*[@id=\"primary-contact-details\"]/div[4]/div[3]/div/div/div[2]/input")
		WebElement towncity;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div[5]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[1]")
		WebElement checkbox;
		
		
		@FindBy(xpath="/html/body/div[2]/div/div/div[5]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/input")
		WebElement firstnam;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div[5]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/div[2]/div[3]/div/div/div[2]/input")
		WebElement lastnam;
		
		@FindBy(xpath="//input[@data-testid='sc-member-mobile-number-input-box']")
		WebElement mobno;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div[5]/div/div[2]/div/div/div[2]")
		WebElement continu;
		
		@FindBy(xpath="/html/body/div[3]/div/div/div[5]/div/div/div[2]/div/div/div[4]")
		WebElement continueee;
		
		
		public void proceedToDummy(String Agra,String ma,String nitin,String roy,String contact, String niroy ,String beng ,String nitini, String royyy, String mbn) throws InterruptedException
		{
			
			click(flight);
			click(radiobuttononeside);
			click(FRomField);
			typeText(FRomField,Agra);
			Thread.sleep(4000);
			
			
			click(ToField);
			typeText(ToField,ma);
			//click(agartala);
			
			click(Date);
			
			click(last);
			Thread.sleep(4000);
			
			
			//click(pri);
			click(fin);
			
			click(firstName);
			typeText(firstName,nitin);
			click(lastname);
			typeText(lastname,roy);
			click(Contactno);
			typeText(Contactno,contact);
			click(emailaddress);
		
			typeText(emailaddress,niroy);
			click(towncity);
			typeText(towncity,beng);
			click(checkbox);
			click(firstnam);
			typeText(firstnam,nitini);
			click(lastnam);
			
			typeText(lastnam,royyy);
			click(mobno);
			typeText(mobno,mbn);
			click(continu);
			
			click( continueee);
			Thread.sleep(5000);
			
			
			
			
			
			
		}
		
		
	



		
		
		
		
		
		
		
		
	}


