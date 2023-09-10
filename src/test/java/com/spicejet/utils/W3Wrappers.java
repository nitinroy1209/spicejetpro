package com.spicejet.utils;

import org.openqa.selenium.support.PageFactory;


import org.testng.Assert;
import com.spicejet.utils.*;
import com.spicejet.pages.NavigateToSpiceJet;
import com.spicejet.pages.Login;
import com.spicejet.pages.SignUpPage;

public class W3Wrappers extends SeWrappers {
	SeWrappers se= new SeWrappers();
	
	//This class would contain all the reusable methods for W3Schools application
	
	public void loginFunctionality() {
		
		try
		{
			
			
		Login lpPage= PageFactory.initElements(driver, Login.class);//all the webelemnts and methods have been initialized of SignInpage with help of initelement method 
			
		lpPage.loginCheck();
		
		}
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
		
		
	
	
	public void navigationSpiceJet()
	{
		try
		{
			NavigateToSpiceJet lpPage= PageFactory.initElements(driver, NavigateToSpiceJet.class);
			lpPage.setManageBooking();
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
		
		public void SignU(String q, String h, String m, String k,String o, String u, String t, String b, String x,String g) {
			
			try
			{
			
			
				SignUpPage sppages = PageFactory.initElements(driver,SignUpPage.class);
			
			sppages.signUpPageFunc("MR","NITIN","ROY","IN","8","2000","7001805900","nitinroy1209@gmail.com","nRu953","nRu953");
			
			
		}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		
		
	}

}


