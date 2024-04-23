package com.svc.testLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.svc.testBase.TestBase;
import com.svc.utilities.ReadExcelData;

public class ForgotPasswordTest extends TestBase {


	
	@DataProvider(name="forgotpassworddata")
	public Object [][] getForgotPassword() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("forgotpassword");
		return data;
	}
	
	
	
	@Test(dataProvider="forgotpassworddata")
	public void verifyForgotPassword(String Username,String Otp,String NewPassword,String ConfirmPassword)
	{
		
		forgotpassword.clickOnHomeSignInBtn();
		forgotpassword.clickOnForgotPasswordLinkTxt();
		forgotpassword.setUsername(Username);
		forgotpassword.clickOnSubmitBtn();
		forgotpassword.setOtp(Otp);
		forgotpassword.clickOnOtpSubmitBtn();
		forgotpassword.setNewPassword(NewPassword);
		forgotpassword.setConfirmPassword(ConfirmPassword);
		forgotpassword.clickOnUpdateBtn();
		
	}

	
}
