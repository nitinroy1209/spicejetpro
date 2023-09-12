package com.spicejet.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.spicejet.utils.SeWrappers;
import com.spicejet.utils.Reports;
import com.spicejet.utils.W3Wrappers;

public class ProceedToBookingTest extends SeWrappers {
	
	W3Wrappers bb= new W3Wrappers();
	SeWrappers se= new SeWrappers();
	
	@Test
	public void proceedTest() {
		
		
			
			try
			{
				launchBrowser("https://www.spicejet.com/");
				//tp.oneWy("IXA");
				bb.proceed("DEL","BLR");
			}
			
			
			catch(Exception ex)
			{
		
				ex.printStackTrace();
			}
		}
}
			
		
