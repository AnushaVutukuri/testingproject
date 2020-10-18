package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Logintestmedium {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	//private ScreenShot screenShot;

	@BeforeTest
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		
		FileInputStream inStream = new FileInputStream("./src/main/resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	
	@Test(priority=1)
	public void Testcase1() throws InterruptedException {
		loginPOM.sendUserName("Nha");
		loginPOM.sendPassword("neha2345");
		loginPOM.clickLoginBtn(); 
		System.out.println("login failed");
		System.out.println("testcase1 passed");
	}
	
	@Test(priority=2)
	public void Testcase2() throws InterruptedException {
		Thread.sleep(2000);
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		loginPOM.clickCatelogicon();
		System.out.println("clicked on catolog,categorylink and add icon successfully");
		Thread.sleep(2000);
		loginPOM.clickcategoryname();
		System.out.println("clicked on catolog,categorylink and add icon successfully");
		Thread.sleep(1000);
		loginPOM.clickcategorydesc();
		
		loginPOM.clickmetatag();
		Thread.sleep(2000);
		System.out.println("entered");
		loginPOM.clickmetatagdesc();
		loginPOM.clickmetatagkeywords();
		Thread.sleep(2000);
		loginPOM.clicksavetag();
		System.out.println("saved successfully");
		System.out.println("testcase2 passed");
	}

	@Test(priority=3)
	public void Testcase3() throws InterruptedException {
		Thread.sleep(2000);
		loginPOM.clickCatelogicon1();
		System.out.println("clicked on catolog,categorylink and modify icon successfully");
		Thread.sleep(2000);

		
		loginPOM.clickmetatag1();
		System.out.println("cleared and entered in metatag BLZ 05");
		Thread.sleep(2000);
		loginPOM.clickmetatagdesc1();
		System.out.println("cleared and entered in descriptiontag");
		Thread.sleep(2000);
		loginPOM.clicksavetag1();
		System.out.println("saved successfully");
		System.out.println("testcase3 passed");
	}
	
}
