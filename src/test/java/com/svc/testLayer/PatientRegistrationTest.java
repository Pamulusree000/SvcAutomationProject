package com.svc.testLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.svc.testBase.TestBase;
import com.svc.utilities.ReadExcelData;

public class PatientRegistrationTest  extends TestBase{

	@DataProvider(name="patientregistrationdata")
	public Object [][]getPatientRegistrationdata() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("patientregistration");
		return data;
	}
	
	
	
	@Test(dataProvider="patientregistrationdata")
	public void verifyPatientRegistration(String Username,String Otp,String RegName,String RegAge,String RegRelationship,String RegRelationshipName,String
			RegPincode,String RegGender,String RegMobileno,String RegOtp,String RegPreferredSvc) throws InterruptedException
	{
		
		signinviaotp.clickOnHomeSignInButton();
		signinviaotp.setUsername(Username);
		signinviaotp.clickOnSignInViaOtpButton();
		signinviaotp.setOTP(Otp);
		signinviaotp.clickOnSignInButton();
		patientregistration.clickOnPatientRegistrationLink();
		patientregistration.clickOnAddPatientBtn();
		patientregistration.setPatientRegName(RegName);
		patientregistration.setPatientRegAge(RegAge);
		patientregistration.selectPatientRegRelationship(RegRelationship);
		patientregistration.setPatientRegRelationshipName(RegRelationshipName);
		patientregistration.setPatientRegPincode(RegPincode);
		patientregistration.selectPatientRegGender(RegGender);
		patientregistration.enterRegMobileNo(RegMobileno, RegOtp);
		patientregistration.selectPatientRegReferredsvc(RegPreferredSvc);
		patientregistration.clickOnPatientRegSaveBtn();
		Thread.sleep(2000);
		patientregistration.clickOnPatientSuccessfullOkBtn();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
