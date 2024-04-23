package com.svc.pageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.svc.testBase.TestBase;

public class AssetMasterPage extends TestBase{

	
	public AssetMasterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//-----------------------------------Variables---------------------------------------------------------------
	
	
	@FindBy(xpath="//span[text()='Asset']")
	private WebElement assetmodule_link;
	
	@FindBy(xpath="//span[text()='Asset Master']")
	private WebElement assetmaster_link;
	
	@FindBy(id="btnNew")
	private WebElement new_button;
	
	@FindBy(id="txtAssetMasterName")
	private WebElement assetmastername_txtbox;
	
	@FindBy(id="txtAssetMasterSpecification")
	private WebElement assetmasterspecification_txtbox;
	
	@FindBy(xpath="//div[@id='ddlAssetMasterType_chosen']/a/span")
	private WebElement assetmastertype_listbox;
	
	@FindBy(xpath="//div[@id='ddlAssetMasterType_chosen']/div/div/input")
	private WebElement assetmastertype_txtbox;
	
	@FindBy(xpath="//div[@id='ddlAssetMasterSpecialization_chosen']/a/span")
	private WebElement assetmasterspecialization_listbox;
	
	@FindBy(xpath="//div[@id='ddlAssetMasterSpecialization_chosen']/div/div/input")
	private WebElement assetmasterspecialization_txtbox;
	
	@FindBy(xpath="//a[text()='Maintainance Activity']")
	private WebElement maintainanceactivity_tab;
	
	@FindBy(xpath="//div[@id='ddlAssetMasterFrequency_chosen']/a/span")
	private WebElement frequency_listbox;
	
	@FindBy(xpath="//div[@id='ddlAssetMasterFrequency_chosen']/div/div/input")
	private WebElement frequency_txtbox;
	
	@FindBy(xpath="//div[@id='ddlAssetMasterMaintainanceOn_chosen']/a/span")
	private WebElement type_listbox;
	
	@FindBy(xpath="//div[@id='ddlAssetMasterMaintainanceOn_chosen']/div/div/input")
	private WebElement type_txtbox;
	
	@FindBy(id="AssetMaintananceSteps1")
	private WebElement activityofmaintainance_txtbox;
	
	@FindBy(id="AssetMaintananceDescription1")
	private WebElement description_txtbox;
	
	@FindBy(id="DivProtocol")
	private WebElement usageprotocol_tab;
	
	@FindBy(id="UsageProtocolStepDesc1")
	private WebElement step1_txtbox;
	
	@FindBy(id="addButtonForSave")
	private WebElement add_button;
	
	@FindBy(id="removeButton")
	private WebElement remove_button;
	
	@FindBy(id="btnSave")
	private WebElement save_button;
	
	@FindBy(css="button.confirm")
	private WebElement confirmok_button;
	
	
	
	//--------------------------------------Methods----------------------------------------------
	
	
	public void clickOnAssetModule()
	{
		assetmodule_link.click();
	}
	public void clickOnAssetMaster()
	{
		assetmaster_link.click();
	}
	public void clickOnNewButton()
	{
		new_button.click();
	}
	public void setAssetMasterName(String AssetMasterName)
	{
		assetmastername_txtbox.sendKeys(AssetMasterName);
	}
	public void setAssetMasterSpecification(String AssetMasterSpecification)
	{
		assetmasterspecification_txtbox.sendKeys(AssetMasterSpecification);
	}
	public void selectAssetMasterType(String AssetMasterType)
	{
		assetmastertype_listbox.click();
		assetmastertype_txtbox.sendKeys(AssetMasterType,Keys.ENTER);
	}
	
	public void selectAssetMasterSpecialization(String AssetMasterSpecialization)
	{
		assetmasterspecialization_listbox.click();
		assetmasterspecialization_txtbox.sendKeys(AssetMasterSpecialization,Keys.ENTER);
	}
	public void clickOnMaintainanceTab()
	{
		maintainanceactivity_tab.click();
	}
	public void selectFrequency(String Frequency)
	{
		frequency_listbox.click();
		frequency_txtbox.sendKeys(Frequency,Keys.ENTER);
	}
	public void selectType(String Type)
	{
		type_listbox.click();
		type_txtbox.sendKeys(Type,Keys.ENTER);
	}
	public void setActivityOfMaintainance(String ActivityOfMaintainance)
	{
		activityofmaintainance_txtbox.sendKeys(ActivityOfMaintainance);
	}
	public void setDescription(String Description)
	{
		description_txtbox.sendKeys(Description);
	}
	public void clickOnUsageProtocol() 
	{
		usageprotocol_tab.click();
	}
	public void setStep1(String Step1)
	{
		step1_txtbox.sendKeys(Step1);
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
