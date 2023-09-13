package com.spicejet.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.spicejet.utils.SeWrappers;
import com.spicejet.utils.Reports;
import com.spicejet.utils.W3Wrappers;


public class ChckFsatusManage  extends SeWrappers{
	
	W3Wrappers w1= new W3Wrappers();
	
	@Test
	public void chkValidateTest() {
		try
		{
		
		launchBrowser("https://www.spicejet.com/");
		w1.flght() ;
		
		}
		catch(Exception ex)
		{
	
			ex.printStackTrace();
		}
	}

@Test	
public void chkValidateTest1() {
	
	
	try
	{
	
	launchBrowser("https://www.spicejet.com/");
	w1. flight1();
	
	}
	catch(Exception ex)
	{

		ex.printStackTrace();
	}
}

@Test
public void checkValidateTest2() {
	
	
	try
	{
	
	launchBrowser("https://www.spicejet.com/");
	w1. flight3();
	
	}
	catch(Exception ex)
	{

		ex.printStackTrace();
	}
}
	
}
	
		
			



	
	
	
