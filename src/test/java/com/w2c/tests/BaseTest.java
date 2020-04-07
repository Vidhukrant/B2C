package com.w2c.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.NgWebDriver;
import com.racq.pages.GetAQuotePage;

public class BaseTest {
	protected WebDriver d;
	protected NgWebDriver ngd;
	protected String url;

	@BeforeClass
	public void setup() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./D1/chromedriver.exe");
		d = new ChromeDriver();
		ngd = new NgWebDriver((JavascriptExecutor) d);
		ngd.waitForAngularRequestsToFinish();

		// d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().window().maximize();
		
	}
	
	


	/*close close c*/

	@AfterClass
	public void aftersuite() {
		//d.quit();
	}
}
