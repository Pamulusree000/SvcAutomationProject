package com.svc.testLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.svc.testBase.TestBase;
import com.svc.utilities.ReadExcelData;

public class DoctorRegistrationTest extends TestBase {

	@DataProvider (name="doctorregistrationdata")
	public Object [][] doctorregistrationdata() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("doctorregistration");
		return data;
	}
	
	@Test(dataProvider="doctorregistrationdata")
	public void verifyDoctorRegistration(String Username,String UserOtp,String DoctorName,String Gender,String MobileNo,String Otp,String EmailId,String DateOfBirth,String Country,String State,String District,String Pincode,String Specialization,
			String LicenseNo,String LicenseCountry,String LicenseState,String DoctorType,String CommandCenter,String DoctorCollege,String Degree,String Year) throws InterruptedException
	{
		signinviaotp.clickOnHomeSignInButton();
		signinviaotp.setUsername(Username);
		signinviaotp.clickOnSignInViaOtpButton();
		signinviaotp.setOTP(UserOtp);
		signinviaotp.clickOnSignInButton();
		doctorregistration.clickOnDoctorRegistrationlink();
		doctorregistration.clickOnAddDoctorBtn();
		doctorregistration.setDoctorName(DoctorName);
		doctorregistration.selectgender(Gender);
		Thread.sleep(2000);
		doctorregistration.setMobileNo(MobileNo, Otp);
		Thread.sleep(2000);
		doctorregistration.setEmailId(EmailId);
		Thread.sleep(2000);
		doctorregistration.selectDateOfBirth(DateOfBirth);
		doctorregistration.selectCountry(Country);
		Thread.sleep(2000);
		doctorregistration.selectState(State);
		Thread.sleep(2000);
		doctorregistration.selectDistrict(District);
		Thread.sleep(2000);
		doctorregistration.setPincode(Pincode);
		doctorregistration.selectSpecialization(Specialization);
		doctorregistration.setLicenseNo(LicenseNo);
		Thread.sleep(2000);
		doctorregistration.selectLicenseCountry(LicenseCountry);
		Thread.sleep(2000);
		doctorregistration.selectLicenseState(LicenseState);
		Thread.sleep(2000);
		doctorregistration.selectDoctorType(DoctorType);
		doctorregistration.clickOnVirtualClinicToggleBtn();
		Thread.sleep(2000);
		doctorregistration.selectCommandCenter(CommandCenter);
		doctorregistration.setDoctorCollge(DoctorCollege);
		doctorregistration.selectDegree(Degree);
		doctorregistration.selectYear(Year);
		doctorregistration.clickOnSaveBtn();
		Thread.sleep(2000);
		doctorregistration.clickOnOkBtn();
		
	}
	
}
