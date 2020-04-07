package com.w2c.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rac.pages.CompareTravelInsurancePage;
import com.rac.pages.GetAQuotePage;
import com.rac.pages.GetAQuotePage_W2CQA;
import com.rac.tests.BaseTest;

public class CompareAndTravelFunctionalityValidationTest extends BaseTest {

	GetAQuotePage_W2CQA Page1;
	CompareTravelInsurancePage Page2;

	@BeforeClass
	public void openurl() {
		d.get("https://w2cqa.tmmatravel.com");
		 Page1 = new GetAQuotePage_W2CQA(d);
			Page1.getSingleTripGetQuote("ENGLAND", "25/02/2020", "23", "25", "2");
			
	}

	@Test(priority=5)
	public void testContinueClick() throws InterruptedException 
	{
		
		CompareTravelInsurancePage page2=new CompareTravelInsurancePage(d);
		page2.getSingleTripClickContinue();
		d.navigate().back();
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	public void testChooseYourExcess()

	{
		 
		CompareTravelInsurancePage page2=new CompareTravelInsurancePage(d);
		page2.getChooseYourExcess();	
	}
	
	@Test(priority=2)
	public void testgetGoingOnCruiseNo()
	{
		 
		CompareTravelInsurancePage page2=new CompareTravelInsurancePage(d);
		page2.getGoingOnCruiseNo();

	}
	@Test(priority=6)
	public void testgetEditFunctionality()
	{
		
		CompareTravelInsurancePage page2=new CompareTravelInsurancePage(d);
		page2.getEditFunctionality();
	}

	@Test(priority=3)
	public void testgetSkiWinterNo()
	{
		
		CompareTravelInsurancePage page2=new CompareTravelInsurancePage(d);
		page2.getSkiWinterNo();
	}
	@Test(priority=4)
	public void testgetValidateAllBenefit()
	{
		 
		CompareTravelInsurancePage page2=new CompareTravelInsurancePage(d);
		page2.getValidateAllBenefit();
	}

	@AfterMethod
	public void refreshBrowser() {
		
	}
	
}
