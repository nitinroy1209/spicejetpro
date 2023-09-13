package com.spicejet.utils;

import org.openqa.selenium.support.PageFactory;


import com.spicejet.pages.ValidateCheckInFlightStatusManageBooking;
import com.spicejet.pages.Dummy;
import com.spicejet.pages.ProceedToBookingPage;
import com.spicejet.pages.TwoWay;
import com.spicejet.pages.OneTrip;
import org.testng.Assert;
import com.spicejet.utils.*;
import com.spicejet.pages.NavigateToSpiceJet;
import com.spicejet.pages.Login;
import com.spicejet.pages.SignUpPage;
import com.spicejet.utils.SeWrappers;

public class W3Wrappers extends SeWrappers {
	SeWrappers se= new SeWrappers();
	
	//This class would contain all the reusable methods for W3Schools application
	
	public void loginFunctionality(String mo,String mobphn) {
		
		try
		{
			
			
		Login lpPage= PageFactory.initElements(driver, Login.class);//all the webelemnts and methods have been initialized of SignInpage with help of initelement method 
			
		lpPage.loginCheck(mo,mobphn);
		
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
		
		public void SignU(String MR, String NITIN, String ROY, String IN,String l, String ll, String lll, String nitinroy12, String nRu953,String nRu9536) {
			
			try
			{
			
			
				SignUpPage sppages = PageFactory.initElements(driver,SignUpPage.class);
			
			sppages.signUpPageFunc(MR,NITIN,ROY,IN,l,ll,lll,nitinroy12,nRu953,nRu9536);
			
			
		}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
		
		}
		
		
		
		
		public void OnWay(String k,String maj)
		{
			try
			{
				OneTrip tp1= PageFactory.initElements(driver, OneTrip.class);
				tp1.oneWy(k,maj);
			}

			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
		
				}
		public void TwoWay(String kk,String majj)
		{
			try
			{
				TwoWay tp2= PageFactory.initElements(driver, TwoWay.class);
				tp2.twoWays(kk,majj);
			}

			catch(Exception ex)
			{
				ex.printStackTrace();
		
		
				
				
				
				
				
			
		
			
		}
		
		}
		
		
		public void proceed(String kkk, String jjj) {
			
			
			try
			{
				ProceedToBookingPage  tp3= PageFactory.initElements(driver, ProceedToBookingPage .class);
				tp3.proceedToBook(kkk,jjj);
				
				
			}
			
			

			catch(Exception ex)
			{
				ex.printStackTrace();
		}
}
		
		
		
		
		
		
	public void proceedDummyPag(String kkk, String jjj,String mk, String lo, String lp,String li, String lii, String lu, String lh,String lq) {
			
			
			try
			{
				Dummy  dp1= PageFactory.initElements(driver, Dummy.class);
				dp1.proceedToDummy(kkk,jjj,mk,lo,lp,li,lii,lu,lh,lq);
				
				
			}
			
			

			catch(Exception ex)
			{
				ex.printStackTrace();
		}
}
		
		
	public void flght() {
		try
		{
		ValidateCheckInFlightStatusManageBooking  fg1= PageFactory.initElements(driver, ValidateCheckInFlightStatusManageBooking.class);
		fg1.CheckI();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
	}
}
		
	
	
	
	public void flight1() {
		
		try
		{
			
		
		
		ValidateCheckInFlightStatusManageBooking  fg2= PageFactory.initElements(driver, ValidateCheckInFlightStatusManageBooking.class);
		fg2.flight();
		
		
	}
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void flight3() {
		
		
		try
		{
		ValidateCheckInFlightStatusManageBooking  fg3= PageFactory.initElements(driver, ValidateCheckInFlightStatusManageBooking.class);
		fg3.ManageBookin();

		
	}
		
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
		
		
		
}





