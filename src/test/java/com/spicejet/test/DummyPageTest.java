package com.spicejet.test;
import org.testng.Assert;

import org.testng.annotations.Test;
import com.spicejet.utils.SeWrappers;
import com.spicejet.utils.Reports;
import com.spicejet.utils.W3Wrappers;


public class DummyPageTest extends SeWrappers {
	
	W3Wrappers wn= new W3Wrappers ();
	
	@Test
	public void dummyTest() {
		
		
		
		try
		{
			launchBrowser("https://www.spicejet.com/");
			wn.proceedDummyPag("CCU","DEL","nitin","roy","7001805977","niroy@gmail.com","bengaluru","nitin","roy","7001805977");
			
			
		}
		
		
		catch(Exception ex)
		{
	
			ex.printStackTrace();
		}
	}
	}
	


