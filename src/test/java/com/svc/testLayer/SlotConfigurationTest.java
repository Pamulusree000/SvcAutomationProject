package com.svc.testLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.svc.testBase.TestBase;
import com.svc.utilities.ReadExcelData;

public class SlotConfigurationTest extends TestBase{

	@DataProvider(name="slotconfigurationdata")
	public Object [][]slotConfigurationData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("slotconfiguration");
		return data;
	}
	
	
	
	@Test(dataProvider="slotconfigurationdata")
	public void verifySlotConfiguration(String Username,String LoginOtp,String FromTime,String ToTime,String TimeInterval,String Date) throws InterruptedException
	{
		
		
		signinviaotp.clickOnHomeSignInButton();
		signinviaotp.setUsername(Username);
		signinviaotp.clickOnSignInViaOtpButton();
		signinviaotp.setOTP(LoginOtp);
		signinviaotp.clickOnSignInButton();
		slotconfiguration.clickOnMasterModule();
		slotconfiguration.clickOnSlotConfiguration();
		slotconfiguration.setFromTime(FromTime);
		slotconfiguration.setToTime(ToTime);
		slotconfiguration.setTimeInterval(TimeInterval);
		slotconfiguration.selectDatePicker(Date);
		slotconfiguration.clickOnUpdateButton();
		Thread.sleep(2000);
		slotconfiguration.clickOnConfirmOkButton();
		Thread.sleep(2000);
		slotconfiguration.clickOnHealthCenterSlotButton();
		Thread.sleep(3000);
		slotconfiguration.clickOnHealthCenterStatusButton();
		slotconfiguration.clickOnHealthCenterSlotSaveButton();
		Thread.sleep(2000);
		slotconfiguration.clickOnHealthCenterConfirmOkButton();
		Thread.sleep(2000);
		slotconfiguration.clickOnDoctorSlotButton();
		Thread.sleep(3000);
		slotconfiguration.clickOnDoctorStatusButton();
		slotconfiguration.clickOnDoctorSlotSaveButton();
		Thread.sleep(2000);
		slotconfiguration.clickOnDoctorSlotConfrimOkButton();
		Thread.sleep(2000);
		
		
		
	}	
	
}
