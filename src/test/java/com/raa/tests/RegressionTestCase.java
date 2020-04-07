package com.raa.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.raa.pages.CompareTravelInsurancePage;
import com.raa.pages.DetailsPage;
import com.raa.pages.GetAQuotePage;
import com.raa.pages.MedicalAssessmentPage;
import com.raa.pages.MedicalConditionPage;
// import com.racv.pages.MedicalAssessmentPage;
// import com.racv.pages.MedicalConditionPage;
import com.raa.pages.PaymentDetails;

public class RegressionTestCase extends BaseTest {

	GetAQuotePage Page1;
	CompareTravelInsurancePage Page2;
	DetailsPage Page3;
	// MedicalConditionPage MPage3;
	// MedicalAssessmentPage AssessPage;
	PaymentDetails page4;

	@BeforeMethod
	public void openurl() {
		d.get("https://raaqa.tmmatravel.com");
	}

	@Test
	public void testSingleTripInternationalNoMedicalCondition() throws InterruptedException {

		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
		CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
		Page2.getSingleTripClickContinue();
		DetailsPage Page3 = new DetailsPage(d);
		Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
				"Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
				"8892414134");
		Page3.pdsCondition();
		Page3.marketCondition();
		Page3.getNoMedicalCondition();
		Page3.confirmAndFinaliseQuote();
		
		PaymentDetails page4 = new PaymentDetails(d);
		page4.getCard("Suru", "4111111111111111", "12/23", "943");
	}

	@Test
	public void testAnnualMulTiTripInternationalNoMedicalCondition() throws InterruptedException {

		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getMultiTripGetAQuote("ENGLAND", "20/02/2020", "23/02/2020", "20", "25", "");
		CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
		Page2.getAMTClickContinue();
		DetailsPage Page3 = new DetailsPage(d);
		Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
				"Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
				"8892414134");
		Page3.pdsCondition();
		Page3.marketCondition();
		Page3.getNoMedicalCondition();
		Page3.confirmAndFinaliseQuote();
		PaymentDetails page4 = new PaymentDetails(d);
		page4.getCard("Suru", "4111111111111111", "12/23", "943");
	}

	@Test
	public void testforDomesticAMTNoMedicalCondition() throws InterruptedException {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getMultiTripDomestic("AUSTRALIA", "20/02/2020", "23/02/2020", "20", "25", "");
		CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
		Page2.getSingleTripClickContinue();
		DetailsPage Page3 = new DetailsPage(d);
		Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
				"Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
				"8892414134");
		Page3.pdsCondition();
		Page3.marketCondition();
		Page3.getNoMedicalCondition();
		Page3.confirmAndFinaliseQuote();
		PaymentDetails page4 = new PaymentDetails(d);
		page4.getCard("Suru", "4111111111111111", "12/23", "943");
	}

	@Test
	public void testforDomesticSingleTripNoMedicalCondition() throws InterruptedException {

		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getSingleTripDomestic("AUSTRALIA", "20/02/2020", "20", "25", "");
		CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
		Page2.getSingleTripClickContinue();
		DetailsPage Page3 = new DetailsPage(d);
		Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
				"Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
				"8892414134");
		Page3.pdsCondition();
		Page3.marketCondition();
		Page3.getNoMedicalCondition();
		Page3.confirmAndFinaliseQuote();
		PaymentDetails page4 = new PaymentDetails(d);
		page4.getCard("Suru", "4111111111111111", "12/23", "943");
	}

	@Test
	public void testSingleTripDomesticYesMedicalCondition() throws InterruptedException {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getSingleTripDomestic("AUSTRALIA", "20/02/2020", "20", "25", "");
		CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
		Page2.getSingleTripClickContinue();
		DetailsPage Page3 = new DetailsPage(d);
		Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
				"Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
				"8892414134");
		Page3.pdsCondition();
		Page3.marketCondition();
		Page3.getYesMedicalCondition();
		Page3.confirmAndFinaliseQuote();
		MedicalConditionPage MPage3 = new MedicalConditionPage(d);
		MPage3.getYesMedicalConditionDeclaration();
		MPage3.getAccessMedicalConditionDeclaration();
		MedicalAssessmentPage AssessPage = new MedicalAssessmentPage(d);
		AssessPage.getMedicalAssessment();
		AssessPage.getMedicalAssessmentSearch("Diabetes");
		MPage3.getMedicalConditionCOntinueLaststage();
		//Page3.pdsCondition();
		//Page3.marketCondition();
		PaymentDetails page4 = new PaymentDetails(d);
		page4.getCard("Suru", "4111111111111111", "12/23", "943");
	}

@Test
	public void testforDomesticAMTYesMedicalCondition() throws InterruptedException {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getMultiTripDomestic("AUSTRALIA", "20/02/2020", "23/02/2020", "20", "25", "");
		CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
		Page2.getAMTClickContinue();
		DetailsPage Page3 = new DetailsPage(d);
		Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
				"Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
				"8892414134");
		Page3.pdsCondition();
		Page3.marketCondition();
		Page3.getYesMedicalCondition();
		Page3.confirmAndFinaliseQuote();
		MedicalConditionPage MPage3 = new MedicalConditionPage(d);
		MPage3.getYesMedicalConditionDeclaration();
		MPage3.getAccessMedicalConditionDeclaration();
		MedicalAssessmentPage AssessPage = new MedicalAssessmentPage(d);
		AssessPage.getMedicalAssessment();
		AssessPage.getMedicalAssessmentSearch("Diabetes");
		MPage3.getMedicalConditionCOntinueLaststage();
		//Page3.pdsCondition();
		//Page3.marketCondition();
		PaymentDetails page4 = new PaymentDetails(d);
		page4.getCard("Suru", "4111111111111111", "12/23", "943");
	}

	@Test
	public void testSingleTripInternationalYesMedicalCondition() throws InterruptedException {

		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
		CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
		Page2.getSingleTripClickContinue();
		DetailsPage Page3 = new DetailsPage(d);
		Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
				"Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
				"8892414134");
		Page3.pdsCondition();
		Page3.marketCondition();
		Page3.getYesMedicalCondition();
		Page3.confirmAndFinaliseQuote();
		MedicalConditionPage MPage3 = new MedicalConditionPage(d);
		MPage3.getYesMedicalConditionDeclaration();
		MPage3.getAccessMedicalConditionDeclaration();
		MedicalAssessmentPage AssessPage = new MedicalAssessmentPage(d);
		AssessPage.getMedicalAssessment();
		AssessPage.getMedicalAssessmentSearch("Diabetes");
		MPage3.getMedicalConditionCOntinueLaststage();
		//Page3.pdsCondition();
		//Page3.marketCondition();
		PaymentDetails page4 = new PaymentDetails(d);
		page4.getCard("Suru", "4111111111111111", "12/23", "943");
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
