package com.svc.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.svc.pageLayer.AssetDetailsPage;
import com.svc.pageLayer.AssetMappingPage;
import com.svc.pageLayer.AssetMasterPage;
import com.svc.pageLayer.BookAppointmentPage;
import com.svc.pageLayer.ChangePasswordPage;
import com.svc.pageLayer.CommandCenterPage;
import com.svc.pageLayer.DoctorRegistrationPage;
import com.svc.pageLayer.ForgotPasswordPage;
import com.svc.pageLayer.HomePage;
import com.svc.pageLayer.PatientProfilePage;
import com.svc.pageLayer.PatientRegistrationPage;
import com.svc.pageLayer.SignInPage;
import com.svc.pageLayer.SignInViaOtpPage;
import com.svc.pageLayer.SignupPage;
import com.svc.pageLayer.SlotConfigurationPage;
import com.svc.pageLayer.SpecializationPage;
import com.svc.pageLayer.StaffRegistrationPage;
import com.svc.pageLayer.SvcRegistrationPage;
import com.svc.utilities.ExtentReportsGenerator;
import com.svc.utilities.UtilClass;

public class TestBase {
	
	public static WebDriver driver;
	public static Logger logger; 
	
	public ExtentReports reports=ExtentReportsGenerator.getExtentReprot();
	
	public UtilClass util;
	public SignInPage signin;
	public SignupPage signup;
	public SignInViaOtpPage signinviaotp;
	public ForgotPasswordPage forgotpassword;
	public ChangePasswordPage changepassword;
	
	public HomePage homepage;
	public PatientProfilePage patientprofile;
	public PatientRegistrationPage patientregistration;
	public BookAppointmentPage bookappointment;
	public DoctorRegistrationPage doctorregistration;
	public StaffRegistrationPage staffregistration;
	public SvcRegistrationPage svcregistration;
	public SpecializationPage specialization;
	public CommandCenterPage commandcenter;
	public SlotConfigurationPage slotconfiguration;
	public AssetMasterPage assetmaster;
	public AssetDetailsPage assetdetails;
	public AssetMappingPage assetmapping;
	
	
	
	@BeforeTest
	public void start()
	{
		logger = Logger.getLogger("SVC Automation framework");
		PropertyConfigurator.configure("Log4jfile.properties");
		logger.info("Framework execution started");
	}
	
	@AfterTest
	public void end()
	{
		logger.info("Framework execution stopped");
	}
	
	
	@BeforeMethod
	public void setUp() {
		
		String browser="chrome";
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
				
		}else
		{
			System.out.println("please provide correct browser name");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://sit.ivirtualvaidya.com/");
		logger.info("browser launches,url,maximize");
		
		
		//-----------------------Object Creation-------------------------------------------------
		
		util=new UtilClass();
		signin =new SignInPage();		
		signup =new SignupPage();
		signinviaotp =new SignInViaOtpPage();
		forgotpassword =new ForgotPasswordPage();
		changepassword =new ChangePasswordPage();
		homepage = new HomePage();
		patientprofile=new PatientProfilePage();
		patientregistration=new PatientRegistrationPage();
		bookappointment =new BookAppointmentPage();
		doctorregistration=new DoctorRegistrationPage();
		staffregistration=new StaffRegistrationPage();
		svcregistration=new SvcRegistrationPage();
		specialization=new SpecializationPage();
		commandcenter=new CommandCenterPage();
		slotconfiguration=new SlotConfigurationPage();
		assetmaster =new AssetMasterPage();
		assetdetails=new AssetDetailsPage();
		assetmapping=new AssetMappingPage();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
}

