package com.svc.testLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.svc.testBase.TestBase;
import com.svc.utilities.ReadExcelData;

public class AssetMasterTest extends TestBase{
	
	
	
	@DataProvider(name="assetmasterdata")
	public Object [][] assetMasterData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("assetmaster");
		return data;
	}
	
	
	@Test(dataProvider="assetmasterdata")
	public void verifyAssetMaster(String Username,String LoginOtp,String AssetMasterName,String AssetMasterSpecification,String AssetMasterType,String AssetMasterSpecialization,
			String Frequency,String Type,String ActivityOfMaintainance,String Description,String Step1) throws InterruptedException
	{
		
		signinviaotp.clickOnHomeSignInButton();
		signinviaotp.setUsername(Username);
		signinviaotp.clickOnSignInViaOtpButton();
		signinviaotp.setOTP(LoginOtp);
		signinviaotp.clickOnSignInButton();
		assetmaster.clickOnAssetModule();
		assetmaster.clickOnAssetMaster();
		assetmaster.clickOnNewButton();
		assetmaster.setAssetMasterName(AssetMasterName);
		assetmaster.setAssetMasterSpecification(AssetMasterSpecification);
		Thread.sleep(2000);
		assetmaster.selectAssetMasterType(AssetMasterType);
		
		if(AssetMasterType.equals("Medical Component"))
			assetmaster.selectAssetMasterSpecialization(AssetMasterSpecialization);
		Thread.sleep(2000);
		assetmaster.clickOnMaintainanceTab();
		Thread.sleep(2000);
		assetmaster.selectFrequency(Frequency);
		Thread.sleep(2000);
		assetmaster.selectType(Type);
		Thread.sleep(2000);
		assetmaster.setActivityOfMaintainance(ActivityOfMaintainance);
		assetmaster.setDescription(Description);
		Thread.sleep(4000);
		assetmaster.clickOnUsageProtocol();
		assetmaster.setStep1(Step1);
		Thread.sleep(2000);
		assetmaster.clickOnSaveButton();
		assetmaster.clickOnConfirmOkButton();
		
		
		
	}

		
}
