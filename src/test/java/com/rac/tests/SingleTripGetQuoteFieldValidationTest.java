package com.rac.tests;

import org.testng.annotations.*;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.rac.pages.GetAQuotePage;
import com.rac.pages.NextPage;

import static org.assertj.core.api.Assertions.*;

import org.openqa.selenium.JavascriptExecutor;

public class SingleTripGetQuoteFieldValidationTest extends BaseTest {
	GetAQuotePage Page1;

	@BeforeMethod
	public void openurl() {
		d.get("https://racqa.tmmatravel.com");
	}

	@Test(priority = 5)
	public void testsingletripselected() {
		Page1 = new GetAQuotePage(d);
		Page1.switchToSingleTrip();
		// Reporter.log(Page1.switchToSingleTripTitl().trim());
		assertThat(Page1.switchToSingleTripTitl().trim().equalsIgnoreCase("SINGLE TRIP"));
	}

	@Test(priority = 4)
	public void testgetaquote() {
		Page1 = new GetAQuotePage(d);
		Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "23", "25", "2");
		assertThat(Page1.getPageHeading().trim().equalsIgnoreCase("Compare Travel Insurance"));

	}

	@Test(priority = 11)
	public void testgetdomestic_Internationaltravel() {
		Page1 = new GetAQuotePage(d);
		Page1.getdomesticinternationalcountry("AUSTRALIA", "INDIA");
		assertThat(Page1.errorMsgDomesticInternational().trim().equalsIgnoreCase(
				"We can not complete your request.  You cannot mix Domestic and International travel on a single policy.   AUSTRALIA,LORD HOWE ISLAND,NORFOLK ISLAND  AUSTRALIA,LORD HOWE ISLAND,NORFOLK ISLAND"));
	}

	@Test(priority = 2)
	public void test_traveldestfieldblankvalidation() throws InterruptedException {
		Page1 = new GetAQuotePage(d);
		Page1.getTravelDestinationFieldBlank("22/02/2020", "", "21", "25", "1");
		assertThat(Page1.gettravelerrormsg().trim().equalsIgnoreCase("Please select the Travel Destination"));

	}

	@Test(priority = 1)
	public void test_leavingonfieldblankvalidation() throws InterruptedException {
		Page1 = new GetAQuotePage(d);
		Page1.getleavingonfieldblank("INDIA", "", "23", "21", "1");
		assertThat(Page1.getleavingserrorms().trim().equalsIgnoreCase("Please select the Leaving On date"));
		// assertThat(Page1.getreturnserrormsg().trim().equalsIgnoreCase("Please
		// select the Return Date"));

	}

	@Test(priority = 6)
	public void test_leavingandretruningdatesame() {
		GetAQuotePage Page1 = new GetAQuotePage(d);

		Page1.getleavingandreturndatesame("INDIA", "22/02/2020", "", "23", "21", "1");
		assertThat(Page1.getleaveandreturnserrormsg().trim()
				.equalsIgnoreCase("Return Date cannot be the same as Leaving on Date."));
	}

	@Test(priority = 7)
	public void test_ageprimaryagefieldblankvalidation() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getSTagePrimarytravellerfieldblank("INDIA", "22/02/2021", "21", "1");
		assertThat(Page1.getage_errormsg().trim().equalsIgnoreCase("Please enter the age of the Primary Traveller"));
	}

	@Test(priority = 8)
	public void test_agebelow18andmore110() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getagesingletriptraveller_agebelow18andmore110("INDIA", "22/02/2021", "22/03/2021", "17", "21", "1");
		assertThat(Page1.getSingleTripage_errormsgforbelow18and110().trim()
				.equalsIgnoreCase("Age1 of Traveller must be between 18-110"));

	}

	@Test(priority = 9)
	public void test_pastdate() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getpastdate("INDIA", "15/01/2020");
		assertThat(Page1.getpastdateerrormsg().trim()
				.equalsIgnoreCase("Leaving On date cannot be date before the current date"));
	}

	@Test(priority = 10)
	public void test_singletrip_leavingdate_548days() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getsingletrip_leavingdate_548days("INDIA", "15/01/2022");
		assertThat(Page1.getsingletrip_leavingdate_548dayserrormsg().trim()
				.equalsIgnoreCase("Departure Date can not be greater than 548 days from the current date."));

	}

	@Test(priority = 3)
	public void test_singletripreturningdate_365days() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getsingletrip365days("INDIA", "22/02/2020", "22/06/2021");
		Assert.assertEquals(Page1.getsingletrip365daysfromdeparterrormsg().trim(),
				"Return date cannot be more than 365 days from the Leaving date");
	}

	@AfterMethod
	public void refreshBrowser() {
		// d.manage().deleteAllCookies();
		d.manage().deleteAllCookies();
		d.navigate().refresh();
		JavascriptExecutor js = (JavascriptExecutor) d;
		// js.executeScript("window.localStorage.clear();");

		js.executeScript("window.sessionStorage.clear();");
	}

}
