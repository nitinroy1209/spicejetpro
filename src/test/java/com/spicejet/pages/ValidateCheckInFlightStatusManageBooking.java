package com.spicejet.pages;
import com.spicejet.utils.SeWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ValidateCheckInFlightStatusManageBooking extends SeWrappers {
	
	
	
	@FindBy(xpath ="//*[text()='check-in']")
	WebElement CheckIn;
	
	@FindBy(xpath ="//*[text()='flight status']")
	WebElement FlightStatus;

	@FindBy(xpath ="//*[text()='manage booking']")
	WebElement ManageBooking;

	
	public void CheckI() {
		
		click(CheckIn);
		verifyEnabled(CheckIn);
		verifyDisplayed(CheckIn);
		
	}
	
	
	public void flight() {
		click(FlightStatus);
		verifyEnabled(FlightStatus);
		verifyDisplayed(FlightStatus);
	}
	
	public void ManageBookin() {
		click(ManageBooking);
		verifyEnabled(ManageBooking);
		verifyDisplayed(ManageBooking);
	}

}
