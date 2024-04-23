package com.svc.testLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.svc.testBase.TestBase;
import com.svc.utilities.ReadExcelData;

public class PatientProfileTest extends TestBase {

	
	@DataProvider(name="patientprofiledata")
	public Object [][] getPatientProfiledata () throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("patientprofile");
		return data;
		
	}
	
	@Test (dataProvider="patientprofiledata")
	public void verifyPatientProfile(String Name,String Age,String Relationship,String RelationshipName,String Pincode,String Gender,String PreferredSvc) throws InterruptedException
	{
		
		signin.clickOnSigninButton();
		signin.setUsername("8944944948");
		signin.setPassword("Idea@1234");
		signin.clickOnLoginbutton();
		Thread.sleep(3000);
		patientprofile.clickOnMyProfileLink();
		patientprofile.clickOnUpdateProfileBtn();
		patientprofile.setPatientName(Name);
		patientprofile.setAge(Age);
		patientprofile.selectRelationship(Relationship);
		patientprofile.setRelationshipname(RelationshipName);
		patientprofile.setPincode(Pincode);
		//patientprofile.enterMobileNo("8459685968", "otp");
		patientprofile.selectGender(Gender);
		patientprofile.selectPreferedSvc(PreferredSvc);
		patientprofile.clickOnUpdateBtn();
		Thread.sleep(2000);
		patientprofile.clickOnUpdateSuccessfullPopup();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
