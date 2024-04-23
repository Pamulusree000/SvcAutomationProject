package com.svc.testLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.svc.testBase.TestBase;
import com.svc.utilities.ReadExcelData;

public class SignInViaOtpTest extends TestBase {

	
	@DataProvider(name="signinviaotpdata")
	public Object[][] getSignInViaOtpData() throws Exception
	{
		Object[][] data = ReadExcelData.excelTestData("signinviaotp");
		return data;
	}
	
	
	@Test (dataProvider = "signinviaotpdata")
	public void verifySignInViaOtp(String Username,String LoginOtp,String pagetitle,String exceptedvalidation)
	{
		
		signinviaotp.clickOnHomeSignInButton();
		signinviaotp.setUsername(Username);
		signinviaotp.clickOnSignInViaOtpButton();
		signinviaotp.setOTP(LoginOtp);
		signinviaotp.clickOnSignInButton();
		
		String title=driver.getTitle();
		//System.out.println(title);
		
		Assert.assertEquals(title, pagetitle);
		
		if(title.equals("i~Virtual Vaidya"))
		{
			Assert.assertTrue(signinviaotp.getErrorText().contains(exceptedvalidation));
		}
		
		
		
		
	}
	
}
