package com.spicejet.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spicejet.utils.SeWrappers;
import com.spicejet.utils.Reports;
import com.spicejet.utils.W3Wrappers;
import com.spicejet.pages.OneTrip;


	
public class TwoWayTests extends SeWrappers {
	

	SeWrappers se= new SeWrappers();
	W3Wrappers w3 = new W3Wrappers();
	@Test
	public void two() {
		

		try
		{
			launchBrowser("https://www.spicejet.com/");
			w3.TwoWay("IXA","MAA");
		}
		
		
		catch(Exception ex)
		{
	
			ex.printStackTrace();
		}
	}
		
	
	
		
	


		
		
		
		
	}



