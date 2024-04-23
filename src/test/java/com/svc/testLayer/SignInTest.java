package com.svc.testLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.svc.testBase.TestBase;
import com.svc.utilities.ReadExcelData;

public class SignInTest extends TestBase{
	
	@DataProvider(name="signindata")
	public Object[][] getSignInData() throws Exception
	{
		Object[][] data = ReadExcelData.excelTestData("signin");
		return data;
	}

	
	@Test(dataProvider = "signindata")
	public void verifyLogin (String Username,String Password, String PageTitle, String expectedValidation) throws InterruptedException
	{
		
		signin.clickOnSigninButton();
		signin.setUsername(Username);
		signin.setPassword(Password);
		signin.clickOnLoginbutton();
		Thread.sleep(2000);
		String title=driver.getTitle();
		//System.out.println(title);
		
			Assert.assertEquals(title, PageTitle);
			if(title.equals("i~Virtual Vaidya"))
				Assert.assertTrue(signin.getErrorText().contains(expectedValidation));
		
	}
	
}
