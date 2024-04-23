package com.svc.testLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.svc.testBase.TestBase;
import com.svc.utilities.ReadExcelData;

public class SignUpTest extends TestBase {

	
	@DataProvider(name="signupdata")
	public Object [][] getSignUpData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("signup");
		return data;
	}
	
	
	@Test(dataProvider="signupdata")
	public void verifySignup(String MobileNumber,String Name,String EmailId,String Password,String ConfirmPassword,String Gender,String Otp) throws InterruptedException
	{
		
		signup.clickOnHomeSigninButton();
		signup.setMobileNumber(MobileNumber);
		signup.setName(Name);
		signup.setEmailId(EmailId);
		signup.setPassword(Password);
		signup.setConfirmPassword(ConfirmPassword);
		signup.selectGenderRadioButton(Gender);
		signup.clickOnSubmitButton();
		signup.selectTermsandUsageCheckBox();
		signup.clickOnProceedButton();
		signup.setOtp(Otp);
		signup.clickonSignUpButton();
		
	}
	
}
