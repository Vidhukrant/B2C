package com.aant.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aant.pages.BasePage;
import com.aant.pages.CompareTravelInsurancePage;
import com.aant.pages.DetailsPage;
import com.aant.pages.GetAQuotePage;
import com.aant.pages.MedicalAssessmentPage;
import com.aant.pages.MedicalConditionPage;
import com.aant.pages.PaymentDetails;

public class RACRegressionTestSuite extends BaseTest {

	BasePage Basepage;
	GetAQuotePage Page1;
	CompareTravelInsurancePage Page2;
	DetailsPage Page3;
	MedicalConditionPage MPage3;
	MedicalAssessmentPage AssessPage;
	PaymentDetails page4;
	JavascriptExecutor js = (JavascriptExecutor) d;

	@BeforeClass
	public void visitsingleTripGetQQuotePage() {

	}

	//@Test
	public void testSingleTripInternationalNoMedicalCondition() throws InterruptedException {

		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
		CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
		Page2.getSingleTripClickContinue();
		DetailsPage Page3 = new DetailsPage(d);
		Page3.getRACNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan",
				"03/01/1995", "Address1", "SALISBURY DOWNS", "5108", "ss@gmail.com", "ss@gmail.com", "8892414134");
		Page3.getNoRACMedicalCondition();
		Page3.confirmAndFinaliseQuoteRAC();
		PaymentDetails page4 = new PaymentDetails(d);
		page4.getCard("Suru", "4111111111111111", "12/23", "943");
	}

	// @Test(priority=1)
	public void testAnnualMulTiTripInternationalNoMedicalCondition() throws InterruptedException {

		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getMultiTripGetAQuote("ENGLAND", "20/02/2020", "23/02/2020", "20", "25", "");
		CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
		Page2.getAMTClickContinue();
		DetailsPage Page3 = new DetailsPage(d);
		Page3.getRACNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan",
				"03/01/1995", "Address1", "SALISBURY DOWNS", "5108", "ss@gmail.com", "ss@gmail.com", "8892414134");
		Page3.getNoRACMedicalCondition();

		Page3.confirmAndFinaliseQuoteRAC();
		PaymentDetails page4 = new PaymentDetails(d);
		page4.getCard("Suru", "4111111111111111", "12/23", "943");
	}

	// @Test(priority=2)
	public void testforDomesticAMTNoMedicalCondition() throws InterruptedException {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getMultiTripDomestic("AUSTRALIA", "20/02/2020", "23/02/2020", "20", "25", "");
		CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
		Page2.getSingleTripClickContinue();
		DetailsPage Page3 = new DetailsPage(d);
		Page3.getRACNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan",
				"03/01/1995", "Address1", "SALISBURY DOWNS", "5108", "ss@gmail.com", "ss@gmail.com", "8892414134");
		Page3.getNoRACMedicalCondition();
		Page3.confirmAndFinaliseQuoteRAC();
		PaymentDetails page4 = new PaymentDetails(d);
		page4.getCard("Suru", "4111111111111111", "12/23", "943");
	}

	// @Test(priority=3)
	public void testforDomesticSingleTripNoMedicalCondition() throws InterruptedException {

		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getSingleTripDomestic("AUSTRALIA", "20/02/2020", "20", "25", "");
		CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
		DetailsPage Page3 = new DetailsPage(d);
		Page3.getRACNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan",
				"03/01/1995", "Address1", "SALISBURY DOWNS", "5108", "ss@gmail.com", "ss@gmail.com", "8892414134");
		Page3.getNoRACMedicalCondition();
		Page3.confirmAndFinaliseQuoteRAC();
		PaymentDetails page4 = new PaymentDetails(d);
		page4.getCard("Suru", "4111111111111111", "12/23", "943");
	}

	// @Test(priority=4)
	public void testSingleTripDomesticYesMedicalCondition() throws InterruptedException {

		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getSingleTripDomestic("AUSTRALIA", "20/02/2020", "20", "25", "");
		CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
		Page2.getSingleTripClickContinue();
		DetailsPage Page3 = new DetailsPage(d);
		Page3.getRACNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan",
				"03/01/1995", "Address1", "SALISBURY DOWNS", "5108", "ss@gmail.com", "ss@gmail.com", "8892414134");
		Page3.getYesRACMedicalCondition();
		// assertThat((Page3.getNoMedicalConditionErrorMessage().trim().equalsIgnoreCase(
		// "You are automatically covered for 38 Medical Conditions.Any Medical
		// Condition not declared will result in you having no cover for any
		// claims arising from, related to, or made worse by that Medical
		// Condition.")));
		Page3.confirmAndFinaliseQuoteRAC();
		MedicalConditionPage MPage3 = new MedicalConditionPage(d);
		MPage3.getRACYesMedicalConditionDeclaration();
		MPage3.getRACAccessMedicalConditionDeclaration();
		MedicalAssessmentPage AssessPage = new MedicalAssessmentPage(d);
		AssessPage.getMedicalAssessment();
		AssessPage.getMedicalAssessmentSearch("Diabetes");
		MPage3.getMedicalConditionCOntinueLaststage();
		Page3.pdsCondition();
		Page3.marketCondition();
		PaymentDetails page4 = new PaymentDetails(d);
		page4.getCard("Suru", "4111111111111111", "12/23", "943");
	}

	@Test(priority = 5)
	public void testforDomesticAMTYesMedicalCondition() throws InterruptedException {
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getMultiTripDomestic("AUSTRALIA", "20/02/2020", "23/02/2020", "20", "25", "");
		CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
		Page2.getSingleTripClickContinue();
		DetailsPage Page3 = new DetailsPage(d);
		Page3.getRACNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan",
				"03/01/1995", "Address1", "SALISBURY DOWNS", "5108", "ss@gmail.com", "ss@gmail.com", "8892414134");
		Page3.getYesRACMedicalCondition();
		Page3.confirmAndFinaliseQuoteRAC();
		MedicalConditionPage MPage3 = new MedicalConditionPage(d);
		MPage3.getRACYesMedicalConditionDeclaration();
		MPage3.getRACAccessMedicalConditionDeclaration();
		MedicalAssessmentPage AssessPage = new MedicalAssessmentPage(d);
		AssessPage.getMedicalAssessment();
		AssessPage.getMedicalAssessmentSearch("Diabetes");
		MPage3.getMedicalConditionCOntinueLaststage();
		Page3.pdsCondition();
		Page3.marketCondition();
		PaymentDetails page4 = new PaymentDetails(d);
		page4.getCard("Suru", "4111111111111111", "12/23", "943");
	}

	@AfterClass
	public void refreshBrowser() {
	}

}
