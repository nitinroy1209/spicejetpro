package com.spicejet.pages;
import com.spicejet.utils.SeWrappers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OneTrip extends SeWrappers {
	
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
	
	
	//@FindBy(xpath="//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79 r-1ozqkpa' and text()='India']")
	//WebElement India;
	//@FindBy(xpath="")
	//WebElement agartala;
	
	//@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/input[1]")
	//WebElement nio;
	
	
	public void oneWy(String Agra,String ma)  {
		
		//switchWindows();
		click(flight);
		click(radiobuttononeside);
		click(FRomField);
		typeText(FRomField,Agra);
		
		
		click(ToField);
		typeText(ToField,ma);
		//click(agartala);
		
		click(Date);
		
		click(last);
		
		//click(India);
		//click(agartala);
		//typeText(FRomField,DEL);
		
		//Thread.sleep(4000);
		
		//click(nio);
		//typeText(nio,amd);
		//Thread.sleep(4000);
		
	}
	

}
