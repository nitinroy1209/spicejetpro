package com.spicejet.test;
import org.testng.Assert;

import org.testng.annotations.Test;
import com.spicejet.utils.SeWrappers;
import com.spicejet.utils.Reports;
import com.spicejet.utils.W3Wrappers;
import com.spicejet.pages.OneTrip;


public class OneTripTest extends SeWrappers {
	
	SeWrappers se= new SeWrappers();
	W3Wrappers w3 = new W3Wrappers();
	
	@Test
	public void testOfOneWay() {
		
		try
		{
			launchBrowser("https://www.spicejet.com/");
			//tp.oneWy("IXA");
			w3.OnWay("IXA","MAA");
		}
		
		
		catch(Exception ex)
		{
	
			ex.printStackTrace();
		}
	}
		
	}
	
		
	


