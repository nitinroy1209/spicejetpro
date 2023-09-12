package com.spicejet.pages;
import com.spicejet.utils.SeWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProceedToBookingPage  extends SeWrappers{

	//*[@data-testid='spicesaver-flight-select-radio-button-0']
	
	//*[@data-testid="continue-search-page-cta"]
	
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
	
	public void proceedToBook(String Agra,String ma) 
	{
		
		click(flight);
		click(radiobuttononeside);
		click(FRomField);
		typeText(FRomField,Agra);
		
		
		click(ToField);
		typeText(ToField,ma);
		//click(agartala);
		
		click(Date);
		
		click(last);
		
		click(pri);
		click(fin);
		
	}
	
	
}


