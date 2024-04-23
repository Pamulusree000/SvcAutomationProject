package com.svc.testLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.svc.testBase.TestBase;
import com.svc.utilities.ReadExcelData;

public class AssetDetailsTest extends TestBase{

	
	@DataProvider(name="assetdetailsdata")
	public Object [][] assetDetailsData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("assetdetails");
		return data;
	}
	
	
	
	@Test(dataProvider="assetdetailsdata")
	public void verifyAssetDetails(String Username,String LoginOtp,String AssetMasterName,String AssetId,String Manufacturer,String PurchaseDate,String WarrantyPeriod,
			String InvoiceAmount,String Svc) throws InterruptedException
	{
		signinviaotp.clickOnHomeSignInButton();
		signinviaotp.setUsername(Username);
		signinviaotp.clickOnSignInViaOtpButton();
		signinviaotp.setOTP(LoginOtp);
		signinviaotp.clickOnSignInButton();
		assetdetails.clickOnAssetModule();
		assetdetails.clickOnAssetDetails();
		assetdetails.clickOnAddAssetDetailsButton();
		Thread.sleep(2000);
		assetdetails.selectAssetMasterName(AssetMasterName);
		assetdetails.setAssetId(AssetId);
		Thread.sleep(2000);
		assetdetails.selectManufacturer(Manufacturer);
		Thread.sleep(3000);
		assetdetails.clickOnPurchaseDatePicker();
		Thread.sleep(2000);
		assetdetails.setWarrantyPeriod(WarrantyPeriod);
		assetdetails.setInvoiceAmount(InvoiceAmount);
		Thread.sleep(2000);
		assetdetails.selectSvc(Svc);
		assetdetails.clickOnSaveButton();
		Thread.sleep(2000);
		assetdetails.clickOnConfirmOkButton();
		
	
		
	}
	
}
