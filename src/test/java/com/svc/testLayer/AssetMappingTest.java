package com.svc.testLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.svc.testBase.TestBase;
import com.svc.utilities.ReadExcelData;

public class AssetMappingTest extends TestBase{

	@DataProvider(name="assetmappingdata")
	public Object [][]assetMappingData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("assetmapping");
		return data;
	}
	
	
	@Test(dataProvider="assetmappingdata")
	public void verifyAssetMapping(String Username,String LoginOtp,String Svc,String AssetID) throws InterruptedException
	{
		signinviaotp.clickOnHomeSignInButton();
		signinviaotp.setUsername(Username);
		signinviaotp.clickOnSignInViaOtpButton();
		signinviaotp.setOTP(LoginOtp);
		signinviaotp.clickOnSignInButton();
		assetmapping.clickOnAssetModule();
		assetmapping.clickOnAssetMapping();
		assetmapping.clickOnNewButton();
		Thread.sleep(2000);
		assetmapping.selectSvc(Svc);
		Thread.sleep(2000);
		assetmapping.selectAssetID(AssetID);
		assetmapping.clickOnSaveButton();
		assetmapping.clickOnConfirmOkButton();
		
	}
	
	
	
}
