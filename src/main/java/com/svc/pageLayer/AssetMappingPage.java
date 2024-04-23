package com.svc.pageLayer;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.svc.testBase.TestBase;

public class AssetMappingPage extends TestBase{
	
	
	
	public AssetMappingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//------------------------Variables-------------------------------------------------------------------
	
	@FindBy(xpath="//span[text()='Asset']")
	private WebElement assetmodule_link;
	
	@FindBy(xpath="//span[text()='Asset Mapping']")
	private WebElement assetmapping_link;
	
	@FindBy(id="btnNew")
	private WebElement new_button;
	
	@FindBy(xpath="//div[@id='ddlHealthCenter_chosen']/a/span")
	private WebElement svc_listbox;
	
	@FindBy(xpath="//div[@id='ddlHealthCenter_chosen']/div/div/input")
	private WebElement svc_txtbox;
	
	@FindBy(xpath="//td[text()='EarBuds']/following::td/select")
	private WebElement assetid_listbox;
	
//	@FindBy(xpath="//td[text()='EarBuds']/following::td/select/option[2]")
//	private WebElement assetid_txtbox;
	
	@FindBy(id="btnSave")
	private WebElement save_button;
	
	@FindBy(css="button.confirm")
	private WebElement confirmok_button;
	
	
	//------------------------Methods---------------------------------------------------------------
	
	
	public void clickOnAssetModule()
	{
		assetmodule_link.click();
	}
	public void clickOnAssetMapping()
	{
		assetmapping_link.click();
	}
	public void clickOnNewButton()
	{
		new_button.click();
	}
	public void selectSvc(String Svc)
		{
		svc_listbox.click();
		svc_txtbox.sendKeys(Svc,Keys.ENTER);
		}
	public void selectAssetID(String AssetID) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement ele=wait.until(ExpectedConditions.visibilityOf(assetid_listbox));
		Select select = new Select(ele);
		select.selectByVisibleText(AssetID);
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
