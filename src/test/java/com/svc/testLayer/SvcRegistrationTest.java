package com.svc.testLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.svc.testBase.TestBase;
import com.svc.utilities.ReadExcelData;

public class SvcRegistrationTest extends TestBase{
	
	@DataProvider(name="svcregistrationdata")
	public Object [][] svcRegistrationData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("svcregistration");
		return data;
	}
	
	@Test(dataProvider="svcregistrationdata")
	public void verifySvcRegistration(String Username,String LoginOtp,String SvcCode,String SvcName,String SvcShortName,String SvcAddress,String SvcLandMark,String SvcMobileNo,
			String SvcConstitency,String SvcWard,String SvcPincode,String SvcContactName) throws InterruptedException
	{
		
		signinviaotp.clickOnHomeSignInButton();
		signinviaotp.setUsername(Username);
		signinviaotp.clickOnSignInViaOtpButton();
		signinviaotp.setOTP(LoginOtp);
		signinviaotp.clickOnSignInButton();
		svcregistration.clickOnAdmin();
		svcregistration.clickOnStaffRegistration();
		svcregistration.clickOnCreateSvcButton();
		svcregistration.setSvcCode(SvcCode);
		svcregistration.setSvcName(SvcName);
		svcregistration.setSvcShortName(SvcShortName);
		svcregistration.setSvcAddress(SvcAddress);
		svcregistration.setSvcLandMark(SvcLandMark);
		svcregistration.setSvcMobileNo(SvcMobileNo);
		Thread.sleep(2000);
		svcregistration.selectSvcConstituency(SvcConstitency);
		Thread.sleep(2000);
		svcregistration.selectSvcWard(SvcWard);
		svcregistration.setSvcPincode(SvcPincode);
		svcregistration.setSvcContactName(SvcContactName);
		svcregistration.clickOnSaveButton();
		
		
	}
	
	
	
	
	
	
	
}
