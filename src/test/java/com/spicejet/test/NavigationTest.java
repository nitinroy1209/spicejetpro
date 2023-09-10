package com.spicejet.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.spicejet.utils.SeWrappers;
import com.spicejet.utils.Reports;
import com.spicejet.utils.W3Wrappers;
import com.spicejet.pages.NavigateToSpiceJet;

public class NavigationTest  extends SeWrappers{
	W3Wrappers bb= new W3Wrappers();
	SeWrappers se= new SeWrappers();
	
	@Test
	public void click() {
		
		
		try
		{
			launchBrowser("https://www.spicejet.com/");
			bb.navigationSpiceJet();
			//screenshot("navigated to managebooking");
			
		}
		
		catch(Exception ex)
		{
	
			ex.printStackTrace();
		}
	}

	
	
	
}
