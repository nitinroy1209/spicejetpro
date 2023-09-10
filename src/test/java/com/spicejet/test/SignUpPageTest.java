package com.spicejet.test;
import org.testng.Assert;



import org.testng.annotations.Test;
import com.spicejet.utils.Reports;
import com.spicejet.utils.W3Wrappers;
import com.spicejet.utils.SeWrappers;
import com.spicejet.pages.SignUpPage;
public class SignUpPageTest  extends SeWrappers{

	W3Wrappers bb= new W3Wrappers();
	SeWrappers se= new SeWrappers();
	
	
	
	
	@Test
	public void signUpPgTest( ) {
		
		try
		{
		
		W3Wrappers bb= new W3Wrappers();
		SeWrappers se= new SeWrappers();
		SignUpPage pages= new SignUpPage();
		
		launchBrowser("https://www.spicejet.com/");
		
		
	bb.SignU("MR","NITIN","ROY","IN","8","2000","7001805900","nitinroy1209@gmail.com","nRu953","nRu953");
		}
		
	catch(Exception ex)
	{
		screenshot("not success");
		ex.printStackTrace();
	}

	
		
		
		
		
	}
		
		
	
	
	

}
