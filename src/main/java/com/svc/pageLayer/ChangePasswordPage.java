package com.svc.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.svc.testBase.TestBase;

public class ChangePasswordPage extends TestBase {

	
	public ChangePasswordPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//--------------------------------------Variable-------------------------------------------------------------
	
	
	@FindBy(xpath="//div[@class=\"slimScrollDiv\"]/ul/li/a/span[text()=\"Others\"]")
	private WebElement others_link;
	
	@FindBy(xpath="//span[text()=\"Change Password\"]")
	private WebElement changepassword_link;
	
	@FindBy(id="txtCurrentPassword")
	private WebElement currentpassword_txtbox;
	
	@FindBy(id="txtUserPassword")
	private WebElement newpassword_txtbox;
	
	@FindBy(id="txtUserConfirmPassword")
	private WebElement confirmpassword_txtbox;
	
	@FindBy(id="btnUpdate")
	private WebElement update_btn;
	
	
	//-------------------------------Methods------------------------------------------------
	
	
	public void clickOnOthersLink ()
	{
		others_link.click();
	}
	
	public void clickOnChangePasswordLink()
	{
		changepassword_link.click();
	}
	
	public void setCurrentPassword(String CurrentPassword)
	{
		currentpassword_txtbox.sendKeys(CurrentPassword);
	}
	
	public void setNewPassword(String NewPassword)
	{
		newpassword_txtbox.sendKeys(NewPassword);
	}
	
	public void setConfirmPassword(String ConfirmPassword)
	{
		confirmpassword_txtbox.sendKeys(ConfirmPassword);
	}
	
	public void clickOnUpdateBtn()
	{
		update_btn.click();
	}
	

}
