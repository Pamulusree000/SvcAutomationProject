package com.svc.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.svc.testBase.TestBase;

public class CommandCenterPage extends TestBase{

	
	public CommandCenterPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------------------------------Variables-----------------------------------------
	
	
	@FindBy(xpath="//span[text()='Master']")
	private WebElement mastermodule_link;
	
	@FindBy(xpath="//span[text()='Command Center']")
	private WebElement commandcenter_link;
	
	@FindBy(id="btnNew")
	private WebElement new_button;
	
	@FindBy(id="txtCommandCenterCode")
	private WebElement commandcentercode_txtbox;
	
	@FindBy(id="txtCommandCenterName")
	private WebElement commandcentername_txtbox;
	
	@FindBy(id="txtCommandCenterShortName")
	private WebElement commandcentershortname_txtbox;
	
	@FindBy(id="txtCommandCenterPhone")
	private WebElement commandcetnermobileno_txtbox;
	
	@FindBy(id="txtCommandCenterPinCode")
	private WebElement commandcenterpincode_txtbox;
	
	@FindBy(id="txtCommandCenterContactName")
	private WebElement commandcentercontactname_txtbox;
	
	@FindBy(id="btnSave")
	private WebElement save_button;
	
	@FindBy(css="button.confirm")
	private WebElement confirmok_button;
	
	
	//-------------------------------------Methods---------------------------------------------------
	
	
	public void clickOnMasterModule()
	{
		mastermodule_link.click();
	}
	public void clickOnCommandCenter() 
	{
		commandcenter_link.click();
	}
	public void clickOnNewButton()
	{
		new_button.click();
	}
	public void setCommandCenterCode(String CommandCenterCode) 
	{
		commandcentercode_txtbox.sendKeys(CommandCenterCode);
	}
	public void setCommandCenterName(String CommandCenterName)
	{
		commandcentername_txtbox.sendKeys(CommandCenterName);
	}
	public void setCommandCenterShortName(String CommandCenterShortName)
	{
		commandcentershortname_txtbox.sendKeys(CommandCenterShortName);
	}
	public void setCommandCenterMobileNo(String CommandCenterMobileNo)
	{
		commandcetnermobileno_txtbox.sendKeys(CommandCenterMobileNo);
	}
	public void setCommandCenterPincode(String CommandCenterPincode)
	{
		commandcenterpincode_txtbox.sendKeys(CommandCenterPincode);
	}
	public void setCommandCenterContactName(String CommandCenterContactName)
	{
		commandcentercontactname_txtbox.sendKeys(CommandCenterContactName);
	}
	public void clickOnSaveButton()
	{
		save_button.click();
	}
	public void clickOnConfirmOkButton()
	{
		confirmok_button.click();
	}
	
}
