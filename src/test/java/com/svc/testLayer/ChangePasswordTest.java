package com.svc.testLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.svc.testBase.TestBase;
import com.svc.utilities.ReadExcelData;

public class ChangePasswordTest extends TestBase{

	
	@DataProvider(name="changepassworddata")
	public Object [][] getChangePassword() throws Exception
	{
		Object [][] data =ReadExcelData.excelTestData("changepassword");
		return data;
	}
	
	
	
	@Test(dataProvider="changepassworddata")
	public void verifyChangePassword(String CurrentPassword,String NewPassword,String ConfirmPassword)
	{
		
		//sign in
		
		signin.clickOnSigninButton();
		signin.setUsername("8944944948");
		signin.setPassword("Idea@1234");
		signin.clickOnLoginbutton();
		
		//change password
		
		changepassword.clickOnOthersLink();
		changepassword.clickOnChangePasswordLink();
		changepassword.setCurrentPassword(CurrentPassword);
		changepassword.setNewPassword(NewPassword);
		changepassword.setConfirmPassword(ConfirmPassword);
		changepassword.clickOnUpdateBtn();
		
		
	}
	
}
