package com.svc.pageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.svc.testBase.TestBase;

public class PatientProfilePage extends TestBase {
	
	

	public PatientProfilePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//----------------------------Variables--------------------------------------------------------------------
	
	@FindBy(xpath="//div[@id='remove-scroll']/div/ul//li/a/span[text()='My Profile']")
	private WebElement myProfile_link;
	
	@FindBy(xpath="//button[text()='Update Profile']")
	private WebElement updateProfile_btn;
	
	@FindBy(id="txtPatientName")
	private WebElement patientname_txtbox;
	
	@FindBy(id="txtPatientDOB")
	private WebElement patientdateofbirth_txtbox;
	
	@FindBy(id="txtPatientAge")
	private WebElement patientage_txtbox;
	
	@FindBy(css="div#ddlPatientSpouseRelation_chosen")
	private WebElement relationship_listbox;
	
	@FindBy(xpath="//div[@id='ddlPatientSpouseRelation_chosen']/div/div/input")
	private WebElement relationship_textbox;
	
	@FindBy(id="txtPatientSpouseName")
	private WebElement relationshipname_txtbox;
	
	@FindBy(id="txtPatientPinCode")
	private WebElement patientpincode_txtbox;
	
	@FindBy(css="div#ddlPatientGender_chosen")
	private WebElement gender_listbox;
	
	@FindBy(xpath="//div[@id='ddlPatientGender_chosen']/div/div/input")
	private WebElement gender_txtbox;
	
	@FindBy(id="txtPatientMobileNo")
	private WebElement patientmobileno_txtbox;
	
	@FindBy(id="VerifyOTP")
	private WebElement verify_link;
	
	@FindBy(id="txtfOTP")
	private WebElement otp_txtboxs;
	
	@FindBy(id="btnValidate")
	private WebElement validate_btn;
	
	@FindBy(css="div#ddlPreferedHealthCenter_chosen")
	private WebElement preferredsvc_listbox;
	
	@FindBy(xpath="//div[@id='ddlPreferedHealthCenter_chosen']/div/div/input")
	private WebElement preferredsvc_txtbox;
	
	@FindBy(id="btnSave")
	private WebElement update_btn;
	
	@FindBy(css="button.confirm")
	private WebElement updatedsuccesfully_popup;
	
	
	
	//------------------------------Methods---------------------------------------------------------------
	
	
	
	public void clickOnMyProfileLink()
	{
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		jse.executeScript("arguments[0].click();", myProfile_link);
	}
	
	public void clickOnUpdateProfileBtn()
	{
		JavascriptExecutor Jse=((JavascriptExecutor)driver);
		Jse.executeScript("arguments[0].click();", updateProfile_btn);
	}
	
	public void setPatientName(String patientname)
	{
		patientname_txtbox.clear();
		patientname_txtbox.sendKeys(patientname);
	}
	
	public void setPatientDateOfBirth(String date)
	{
			patientdateofbirth_txtbox.clear();
			patientdateofbirth_txtbox.sendKeys(date);
	}
	
	public void setAge(String Age) {
		
		patientage_txtbox.clear();
		patientage_txtbox.sendKeys(Age);
	}
	
	public void selectRelationship(String Relation)
	{
		relationship_listbox.click();
		relationship_textbox.sendKeys(Relation,Keys.ENTER);
		
	}
	
	public void setRelationshipname(String Relationname)
	{
		relationshipname_txtbox.clear();
		relationshipname_txtbox.sendKeys(Relationname);
	}
	
	public void setPincode(String Pincode)
	{
		patientpincode_txtbox.clear();
		patientpincode_txtbox.sendKeys(Pincode);
	}
	
	public void selectGender(String Gender)
	{
		gender_listbox.click();
		gender_txtbox.sendKeys(Gender,Keys.ENTER);
	}
	
	
	public void enterMobileNo(String MobileNo,String Otp)
	{
		patientmobileno_txtbox.clear();
		patientmobileno_txtbox.sendKeys(MobileNo);
		verify_link.click();
		otp_txtboxs.sendKeys(Otp);
		validate_btn.click();
		
	}
	
	public void selectPreferedSvc(String PreferedSvc)
	{
		preferredsvc_listbox.click();
		preferredsvc_txtbox.sendKeys(PreferedSvc,Keys.ENTER);
		
	}
	
	public void clickOnUpdateBtn()
	{
		update_btn.click();
	}
	
	public void clickOnUpdateSuccessfullPopup()
	{
		updatedsuccesfully_popup.click();
	}
	
	
	
	
	
}
