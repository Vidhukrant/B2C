package com.rac.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rac.pages.CompareTravelInsurancePage;
import com.rac.pages.GetAQuotePage;

public class CompareAndTravelFunctionalityValidationTest extends BaseTest {

	GetAQuotePage Page1;
	CompareTravelInsurancePage Page2;

	@BeforeMethod
	public void openurl() {
		d.get("https://racqa.tmmatravel.com");
	}

	@Test
	public void testContinueClick() 
	{
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getSingleTripGetQuote("ENGLAND", "25/02/2020", "23", "25", "2");
		CompareTravelInsurancePage page2=new CompareTravelInsurancePage(d);
		page2.getSingleTripClickContinue();
	}
	
	@Test
	public void testChooseYourExcess()

	{
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getSingleTripGetQuote("ENGLAND", "25/02/2020", "23", "25", "2");
		CompareTravelInsurancePage page2=new CompareTravelInsurancePage(d);
		page2.getChooseYourExcess();	
	}
	
	@Test
	public void testgetGoingOnCruiseNo()
	{
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "23", "25", "2");
		CompareTravelInsurancePage page2=new CompareTravelInsurancePage(d);
		page2.getGoingOnCruiseNo();

	}
	@Test
	public void testgetEditFunctionality()
	{
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "23", "25", "2");
		CompareTravelInsurancePage page2=new CompareTravelInsurancePage(d);
		page2.getEditFunctionality();
	}

	@Test
	public void testgetSkiWinterNo()
	{
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "23", "25", "2");
		CompareTravelInsurancePage page2=new CompareTravelInsurancePage(d);
		page2.getSkiWinterNo();
	}
		@Test
	public void testgetValidateAllBenefit()
	{
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "23", "25", "2");
		CompareTravelInsurancePage page2=new CompareTravelInsurancePage(d);
		page2.getValidateAllBenefit();
	}

	@AfterMethod
	public void refreshBrowser() {
		d.manage().deleteAllCookies();
		//d.get("https://racvqa.tmmatravel.com/");
		d.navigate().refresh();
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.localStorage.clear();");

		js.executeScript("window.sessionStorage.clear();");
	}
	
}
