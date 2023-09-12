package com.spicejet.pages;
import com.spicejet.utils.SeWrappers;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigateToSpiceJet  extends SeWrappers{
	
	@FindBy (xpath="/html/body/div[2]/div/div/div[1]/div[3]/div[1]/div[4]/div[2]")
	 WebElement manageBooking;
	 

	 public void setManageBooking() 
		{
		 
		 //frameByIndex(0);
		
		 //acceptAlert();

		 click(manageBooking);
		
			
		}
	
	

}
