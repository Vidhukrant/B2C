package com.aant.tests;

import org.testng.annotations.*;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.Assert;

import com.aant.pages.GetAQuotePage;
import com.aant.pages.NextPage;
import static org.assertj.core.api.Assertions.*;

import org.openqa.selenium.JavascriptExecutor;

public class SingleTripGetQuoteFieldValidationTest extends BaseTest {
	GetAQuotePage Page1;

	@BeforeMethod
	public void openurl() {
		d.get("https://aantqa.tmmatravel.com");
		/*d.get("https://racvuat.tmmatravel.com");*/
	}

	@Test
	public void testsingletripselected() {
		Page1 = new GetAQuotePage(d);
		Page1.switchToSingleTrip();
		// Reporter.log(Page1.switchToSingleTripTitl().trim());
		assertThat(Page1.switchToSingleTripTitl().trim().equalsIgnoreCase("SINGLE TRIP"));
	}

   @Test
	public void testgetaquote() {
		Page1 = new GetAQuotePage(d);
		Page1.getSingleTripGetQuote("ENGLAND", "23/04/2020", "23", "25", "");
		assertThat(Page1.getPageHeading().trim().equalsIgnoreCase("Compare Travel Insurance"));

	}

	@Test
	public void testgetdomestic_Internationaltravel() {
		Page1 = new GetAQuotePage(d);
		Page1.getdomesticinternationalcountry("AUSTRALIA", "INDIA");
		assertThat(Page1.errorMsgDomesticInternational().trim().equalsIgnoreCase(
				"We can not complete your request.  You cannot mix Domestic and International travel on a single policy.   AUSTRALIA,LORD HOWE ISLAND,NORFOLK ISLAND  AUSTRALIA,LORD HOWE ISLAND,NORFOLK ISLAND"));
	}

	@Test
	public void test_traveldestfieldblankvalidation() {
		Page1 = new GetAQuotePage(d);
		Page1.getTravelDestinationFieldBlank("22/04/2020", "", "21", "25", "1");
		assertThat(Page1.gettravelerrormsg().trim().equalsIgnoreCase("Please select the Travel Destination"));

	}

	@Test
	public void test_leavingonfieldblankvalidation() {
		Page1 = new GetAQuotePage(d);
		Page1.getleavingonfieldblank("INDIA", "", "23", "21", "1");
		assertThat(Page1.getleavingserrorms().trim().equalsIgnoreCase("Please select the Departure Date"));
		// assertThat(Page1.getreturnserrormsg().trim().equalsIgnoreCase("Please
		// select the Return Date"));

	}

	@Test
	public void test_leavingandretruningdatesame() {
		GetAQuotePage Page1 = new GetAQuotePage(d);

		Page1.getleavingandreturndatesame("INDIA", "25/03/2020", "", "23", "21", "1");
		assertThat(Page1.getleaveandreturnserrormsg().trim()
				.equalsIgnoreCase("Return Date cannot be the same as the Departure Date"));
	}

	@Test
	public void test_ageprimaryagefieldblankvalidation() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getSTagePrimarytravellerfieldblank("INDIA", "22/04/2021", "21", "1");
		assertThat(Page1.getage_errormsg().trim().equalsIgnoreCase("Please enter the age of the Primary Traveller"));
	}

	@Test
	public void test_agebelow18andmore110() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getagesingletriptraveller_agebelow18andmore110("INDIA", "22/04/2021", "22/05/2021", "17", "21", "1");
		assertThat(Page1.getSingleTripage_errormsgforbelow18and110().trim()
			.equalsIgnoreCase("Age of Traveller must be between 18-110"));

	}

	@Test
	public void test_pastdate() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getpastdate("INDIA", "15/01/2020");
		assertThat(Page1.getpastdateerrormsg().trim()
				.equalsIgnoreCase("Departure date cannot be date before the current date"));
	}

	@Test
	public void test_singletrip_leavingdate_548days() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getsingletrip_leavingdate_548days("INDIA", "15/01/2022");
		assertThat(Page1.getsingletrip_leavingdate_548dayserrormsg().trim()
				.equalsIgnoreCase("Departure Date can not be greater than 548 days from the current date."));

	}

	@Test
	public void test_singletripreturningdate_365days() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getsingletrip365days("INDIA", "22/02/2020", "22/06/2021");
		Assert.assertEquals(Page1.getsingletrip365daysfromdeparterrormsg().trim(),
				"Return Date cannot be more than 365 days from the Departure Date");
	}

	@AfterMethod
	public void refreshBrowser() {
		d.manage().deleteAllCookies();
		d.navigate().refresh();
		JavascriptExecutor js = (JavascriptExecutor) d;
		// js.executeScript("window.localStorage.clear();");

		js.executeScript("window.sessionStorage.clear();");
	}

}
