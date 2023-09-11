package com.spicejet.pages;
import com.spicejet.utils.SeWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TwoWay extends SeWrappers {
	

	@FindBy(xpath="//div[@class='css-76zvg2 r-jwli3a r-ubezar r-1ozqkpa']")
	WebElement flight;
	
	@FindBy(xpath =" //*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]")
	WebElement radio;
	
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input[1]")
	WebElement FRomField;
	@FindBy (xpath ="/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]/div[2]/input")
WebElement ToField;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div/div")
	WebElement Date;

	@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[5]/div[7]/div/div")
	WebElement Date2;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")
	WebElement last;


public void twoWays(String Agra,String ma)  {
	
	click(flight);
	click(radio);
	click(FRomField);
	typeText(FRomField,Agra);
	
	
	click(ToField);
	typeText(ToField,ma);
	
	click (Date);
	click(Date2);
	click( last);

	
	
	
	
	
	
	
	
}
	
}
	

