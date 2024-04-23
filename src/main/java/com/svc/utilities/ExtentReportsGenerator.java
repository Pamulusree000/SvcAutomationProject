package com.svc.utilities;

import java.io.File;
import java.util.Date;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.svc.testBase.TestBase;

public class ExtentReportsGenerator extends TestBase {

	
	
	public static ExtentReports getExtentReprot()
	{
		
		Date date=new Date();
		
		String Timestamp =	date.toString().replace(" ", "-")+".html";
		
		String reportfilepath="ExtentReports/ereport-"+Timestamp;
		
		ExtentReports ereport=new ExtentReports(reportfilepath, true, DisplayOrder.NEWEST_FIRST);
		
		File reportconfigfile =new File("./src/test/resources/configs/ReportsConfig.xml");
		
		ereport.loadConfig(reportconfigfile);
		
		ereport.addSystemInfo("Testng version", "6.14.3");
		ereport.addSystemInfo("WebDriver version", "3.13.0");
		ereport.addSystemInfo("Windows version", "11.0");
		ereport.addSystemInfo("executed by", "pamulu sreekanth");
		ereport.addSystemInfo("project name", "smart virtual clinic");
		
		return ereport;
		
	}
	
	public void Listerns()
	{
		ExtentTest eTest=reports.startTest("svc automation started here");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
