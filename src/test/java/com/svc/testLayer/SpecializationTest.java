package com.svc.testLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.svc.testBase.TestBase;
import com.svc.utilities.ReadExcelData;

public class SpecializationTest extends TestBase{

	
	@DataProvider(name="specializationdata")
	public Object [][] getSpecializationData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("specialization");
		return data;
	}
	
	
	
	@Test(dataProvider="specializationdata")
	public void verifySpecialization(String Username,String LoginOtp,String SpecializationName,String SpecializationDescription,
			String SpecializationAliasName,String SpecializationNoOfSlots) throws InterruptedException
	{
		signinviaotp.clickOnHomeSignInButton();
		signinviaotp.setUsername(Username);
		signinviaotp.clickOnSignInViaOtpButton();
		signinviaotp.setOTP(LoginOtp);
		signinviaotp.clickOnSignInButton();
		specialization.clickOnAdminModule();
		specialization.clickOnSpecialization();
		specialization.clickOnNewButton();
		specialization.setSpecializationName(SpecializationName);
		specialization.setSpecializationDescription(SpecializationDescription);
		specialization.setSpecializationAliasName(SpecializationAliasName);
		specialization.setSpecializationNoOfSlots(SpecializationNoOfSlots);
		specialization.clickOnSaveButton();
		Thread.sleep(2000);
		specialization.clickOnConfirmOkButton();
		Thread.sleep(2000);
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
