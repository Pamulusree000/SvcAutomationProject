package com.svc.testLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.svc.testBase.TestBase;
import com.svc.utilities.ReadExcelData;

public class CommandCenterTest extends TestBase{

	
	@DataProvider(name="commandcenterdata")
	public Object [][] commandCenterData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("commandcenter");
		return data;
	}

	
	@Test(dataProvider="commandcenterdata")
	public void verifyCommandCenter(String Username,String LoginOtp,String CommandCenterCode,String CommandCenterName,String CommandCenterShortName,String CommandCenterMobileNo,
			String CommandCenterPincode,String CommandCenterContactName )
	{
		signinviaotp.clickOnHomeSignInButton();
		signinviaotp.setUsername(Username);
		signinviaotp.clickOnSignInViaOtpButton();
		signinviaotp.setOTP(LoginOtp);
		signinviaotp.clickOnSignInButton();
		commandcenter.clickOnMasterModule();
		commandcenter.clickOnCommandCenter();
		commandcenter.clickOnNewButton();
		commandcenter.setCommandCenterCode(CommandCenterCode);
		commandcenter.setCommandCenterName(CommandCenterName);
		commandcenter.setCommandCenterShortName(CommandCenterShortName);
		commandcenter.setCommandCenterMobileNo(CommandCenterMobileNo);
		commandcenter.setCommandCenterPincode(CommandCenterPincode);
		commandcenter.setCommandCenterContactName(CommandCenterContactName);
		commandcenter.clickOnSaveButton();
		commandcenter.clickOnConfirmOkButton();
			
	}
	
	
	
	
	
	
	
	
	
	
}
