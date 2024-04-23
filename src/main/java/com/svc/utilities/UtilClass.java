package com.svc.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.svc.testBase.TestBase;

public class UtilClass extends TestBase{

	public UtilClass() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void acceptAlertPopup()
	{
		driver.switchTo().alert().accept();
	}
	
	public void scrollToElementDown(WebElement ele) throws InterruptedException {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(false);", ele);
		Thread.sleep(2000);
	}
	
	public void scrollToElementUp(WebElement ele) throws InterruptedException
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", ele);
		Thread.sleep(2000);
	}
    
	public void WindowHandles()
	{
		Set<String> set=driver.getWindowHandles();
		
		Iterator<String> itr=set.iterator();
		
		String parentwindow = itr.next();
		
		
		while(itr.hasNext()) {
			String childwindow = itr.next();
			if(!parentwindow.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
			}
			
		}
		driver.switchTo().window(parentwindow);
	}
	
	
	public void selectdropdown(WebElement ele,String visibletext)
	{
		Select sec=new Select(ele);
		sec.selectByVisibleText(visibletext);		
	}
	
	public void getScreenshorts() throws IOException
	{
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotFile, new File("./screenshots/screenshot1.jpg"));
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
