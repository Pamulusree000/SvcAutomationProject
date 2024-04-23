package com.svc.testLayer;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.svc.testBase.TestBase;
import com.svc.utilities.ReadExcelData;

public class StaffRegistrationTest extends TestBase {
	
	
	@DataProvider(name="staffregistrationdata")
	public Object [][]staffRegistrationData() throws Exception
	{
		Object [][]data=ReadExcelData.excelTestData("staffregistration");
		return data;
				
	}

	
	@Test(dataProvider="staffregistrationdata")
	public void verifyStaffRegistration(String Username,String LoginOtp,String StaffName,String StaffGender,String StaffMaritalStatus,String StaffAadharNo,String StaffMobileNo,String Otp,
			String StaffEmailId,String StaffRole,String Svc,String StaffCountry,String StaffState,String StaffCity,String StaffHouseNo,String StaffStreet,String StaffAreaName,String StaffPincode,String 
			StaffCollege,String StaffDegree,String StaffYear) throws InterruptedException
	{
		
		signinviaotp.clickOnHomeSignInButton();
		signinviaotp.setUsername(Username);
		signinviaotp.clickOnSignInViaOtpButton();
		signinviaotp.setOTP(LoginOtp);
		signinviaotp.clickOnSignInButton();
		staffregistration.clickOnAdminModule();
		staffregistration.clickOnStaffRegistration();
		staffregistration.clickOnAddStaffbutton();
		staffregistration.setStaffName(StaffName);
		staffregistration.selectStaffGender(StaffGender);
		staffregistration.selectStaffMaritalStatus(StaffMaritalStatus);
		staffregistration.setStaffAadharNo(StaffAadharNo);
		Thread.sleep(2000);
		staffregistration.setStaffMobileNo(StaffMobileNo, Otp);
		Thread.sleep(2000);
		staffregistration.setStaffEmailId(StaffEmailId);
		Thread.sleep(2000);
		staffregistration.selectStaffRole(StaffRole);
		Thread.sleep(2000);
		staffregistration.selectSvc(Svc);
		Thread.sleep(2000);
		staffregistration.selectStaffCountry(StaffCountry);
		Thread.sleep(2000);
		staffregistration.selectStaffState(StaffState);
		Thread.sleep(2000);
		staffregistration.selectStaffCity(StaffCity);
		Thread.sleep(2000);
		staffregistration.setStaffHouseNo(StaffHouseNo);
		staffregistration.setStaffStreet(StaffStreet);
		staffregistration.setStaffAreaName(StaffAreaName);
		staffregistration.setStaffPincode(StaffPincode);
		staffregistration.setStaffCollege(StaffCollege);
		Thread.sleep(2000);
		staffregistration.selectStaffDegree(StaffDegree);
		Thread.sleep(2000);
		staffregistration.selectStaffYear(StaffYear);
		staffregistration.clickOnSaveButton();
		staffregistration.clickOnConfirmOkButton();

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
