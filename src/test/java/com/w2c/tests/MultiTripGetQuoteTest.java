
package com.w2c.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.*;

import com.raa.pages.GetAQuotePage;

public class MultiTripGetQuoteTest extends BaseTest {

	GetAQuotePage Page1;

	@BeforeMethod
	public void openurl() {
		d.get("https://w2cuat.tmmatravel.com");
	}

	@Test
	public void testSwitchTolAMTselected() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.switchToAMTtrip();
		assertThat(Page1.switchToAMTtripTitle().trim().equalsIgnoreCase("Annual Multi-Trip"));
	}

	@Test
	public void testAMTGetaquote() throws InterruptedException {

		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.switchToAMTtrip();
		Page1.getMultiTripGetAQuote("ENGLAND", "23/02/2020", "25/02/2020", "23", "25", "2");
		assertThat(Page1.getPageHeading().trim().equalsIgnoreCase("Compare Travel Insurance"));
	}

	@Test
	public void testAMTgetdomesticAndInternationaltravel() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.switchToAMTtrip();
		Page1.getdomesticinternationalcountry("AUSTRALIA", "INDIA");
		assertThat(Page1.errorMsgDomesticInternational().trim().equalsIgnoreCase(
				"We can not complete your request.  You cannot mix Domestic and International travel on a single policy.   AUSTRALIA,LORD HOWE ISLAND,NORFOLK ISLAND   AUSTRALIA,LORD HOWE ISLAND,NORFOLK ISLAND"));
	}

	@Test
	public void testAMTtraveldestfieldblankvalidation() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.switchToAMTtrip();
		Page1.getTravelDestinationFieldBlank("22/02/2020", "24/02/2020", "21", "25", "1");
		assertThat(Page1.gettravelerrormsg().trim().equalsIgnoreCase("Please select the Travel Destination"));

	}

	@Test
	public void testAMTleavingonfieldblankvalidation() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.switchToAMTtrip();
		Page1.getleavingonfieldblank("INDIA", "22/02/2021", "23", "21", "1");
		assertThat(Page1.getleavingserrorms().trim().equalsIgnoreCase("Please select the Departure Date"));

	}

	@Test
	public void test_leavingandretruningdatesame() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.switchToAMTtrip();
		Page1.getleavingandreturndateAMT("ENGLAND", "22/01/2021", "22/01/2021", "23", "21", "1");
		assertThat(Page1.getAMTleaveandreturnerrormsg().trim()
				.equalsIgnoreCase("Return Date can't be same as Leaving on Date."));
	}

	@Test
	public void test_ageprimaryagefieldblankvalidation() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.switchToAMTtrip();
		Page1.getAMTagePrimarytravellerfieldblank("INDIA", "22/02/2021", "25/02/2021", "21", "1");
		assertThat(Page1.getage_errormsg().trim().equalsIgnoreCase("Please enter the age of the Primary Traveller"));

	}

	@Test
	public void test_AMTtraveller_agebelow18andmore75() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.switchToAMTtrip();
		Page1.getageAMTtraveller_agebelow18andmore75("ENGLAND", "22/02/2021", "25/02/2021", "17", "21", "1");
		assertThat(Page1.getAMTage_errormsgforbelow18andmore75().trim()
				.equalsIgnoreCase("Traveller's age must be less than or equal to 75."));

	}

	

	public void test_pastdate() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.switchToAMTtrip();
		Page1.getpastdate("INDIA", "15/01/2020");
		assertThat(Page1.getpastdateerrormsg().trim()
				.equalsIgnoreCase("Departure date cannot be date before the current date"));
	}

	@Test
	public void test_amtannualtrip_leavingdate_548days() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.switchToAMTtrip();
		Page1.getsingletrip_leavingdate_548days("INDIA", "15/01/2022");
		assertThat(Page1.getsingletrip_leavingdate_548dayserrormsg().trim()
				.equalsIgnoreCase("Departure Date can not be greater than 548 days from the current date."));
	}

	@Test
	public void test_annualamtreturningdate_60days() {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.switchToAMTtrip();
		Page1.getsingletrip365days("INDIA", "22/02/2020", "22/06/2021");
		assertThat(Page1.getAMTtrip60daysfromdeparterrormsg().trim()
				.equalsIgnoreCase("Returning On date must be less than or equal to 60 days from Leaving On date."));
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
