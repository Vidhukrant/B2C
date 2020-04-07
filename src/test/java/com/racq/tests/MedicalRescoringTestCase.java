package com.racq.tests;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.racq.pages.CompareTravelInsurancePage;
import com.racq.pages.DetailsPage;
import com.racq.pages.GetAQuotePage;
import com.racq.pages.MedicalAssessmentPage;
import com.racq.pages.MedicalConditionPage;
import com.racq.pages.MedicalRescoringPage;
import com.racq.pages.PaymentDetails;

public class MedicalRescoringTestCase extends BaseTest {
    GetAQuotePage Page1;
    CompareTravelInsurancePage Page2;
    DetailsPage Page3;
    MedicalConditionPage MPage3;
    MedicalAssessmentPage AssessPage;
    PaymentDetails page4;

    @BeforeMethod
    public void openurl()
    {
        d.get("https://racqqa.tmmatravel.com/");
    }

   @Test
    public void testChangeFinancialRatingParameter() throws InterruptedException {

        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/03/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
                "Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
                "8892414134");
        Page3.pdsCondition();
        Page3.getYesMedicalCondition();
        Page3.confirmAndFinaliseQuote();
        MedicalConditionPage MPage3 = new MedicalConditionPage(d);
        MPage3.getYesMedicalConditionDeclaration();
        MPage3.getAccessMedicalConditionDeclaration();
        MedicalAssessmentPage AssessPage = new MedicalAssessmentPage(d);
        AssessPage.getMedicalAssessment();
        AssessPage.getMedicalAssessmentSearch("Diabetes");
        MedicalRescoringPage scn1 = new MedicalRescoringPage(d);

        String totaltravelbeforechange = scn1.gettotaltravelcarebeforechange();
        String Medicalconditionbeforechange = scn1.getMedicalCondition();
        String TotalValuebeforechange = scn1.getTotalValue();

        Reporter.log("Before Changing The Travel Plan");

		Reporter.log("totaltravelbeforechange: " + totaltravelbeforechange);
		Reporter.log("Medicalconditionbeforechange: " + Medicalconditionbeforechange);
		Reporter.log("TotalValuebeforechange: " + TotalValuebeforechange);


        scn1.geteditquoteclick();
        scn1.getEditTravel();
        scn1.getSingleTripClickContinueAfterUpdate();
        scn1.getYesMedicalCondition3();
        scn1.confirmAndFinaliseQuote1();
        scn1.getResume();
        scn1.acceptPremiumafterchange();


        String totaltravelafterchange = scn1.gettotaltravelcareafterchange();
        String Medicalconditionafterchange = scn1.getmedicalConditionafterChange();
        String TotalValueafterchange = scn1.getTotalValueAfterChange();

       Reporter.log("After Changing The Travel Plan");

        Reporter.log("totaltravelafterchange: " + totaltravelafterchange);
        Reporter.log("Medicalconditionafterchange: " + Medicalconditionafterchange);
        Reporter.log("TotalValueafterchange: " + TotalValueafterchange);
		SoftAssertions softly = new SoftAssertions();


        //Assert.assertEquals(totaltravelbeforechange, totaltravelafterchange);

		softly.assertThat(totaltravelbeforechange).as("Total Travel").isNotEqualTo(totaltravelafterchange);
		softly.assertThat(Medicalconditionbeforechange).as("Medical Condition").isNotEqualTo(Medicalconditionafterchange);
		softly.assertThat(TotalValuebeforechange).as("Total Value").isNotEqualTo(TotalValueafterchange);
        softly.assertAll();

    }
  /*@Test
	public void testChangeNonFinancialRatingParameter() throws InterruptedException {

	  GetAQuotePage Page1 = new GetAQuotePage(d);
	  Page1.getSingleTripGetQuote("ENGLAND", "23/03/2020", "20", "25", "");
	  CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
	  Page2.getSingleTripClickContinue();
	  DetailsPage Page3 = new DetailsPage(d);
	  Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
			  "Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
			  "8892414134");

	  Page3.getYesMedicalCondition();
	  Page3.confirmAndFinaliseQuote();
	  MedicalConditionPage MPage3 = new MedicalConditionPage(d);
	  MPage3.getYesMedicalConditionDeclaration();
	  MPage3.getAccessMedicalConditionDeclaration();
	  MedicalAssessmentPage AssessPage = new MedicalAssessmentPage(d);
	  AssessPage.getMedicalAssessment();
	  AssessPage.getMedicalAssessmentSearch("Diabetes");
	  Medicalrescoring scn2 = new Medicalrescoring(d);

	  String totaltravelbeforechange = scn2.gettotaltravelcarebeforechange();
	  String Medicalconditionbeforechange = scn2.getMedicalCondition();
	  String TotalValuebeforechange = scn2.getTotalValue();

	  Reporter.log("totaltravelbeforechange: " + totaltravelbeforechange);
	  Reporter.log("Medicalconditionbeforechange: " + Medicalconditionbeforechange);
	  Reporter.log("TotalValuebeforechange: " + TotalValuebeforechange);
	  scn2.geteditquoteclick();
	  scn2.getSingleTripClickContinueAfterUpdate();

      Page3.getNameChange("Anusha","Akash","Diwakar","John");
      Page3.getStreetAddress("Change","Downs","5108","9087672111");
      scn2.getYesMedicalCondition3();
        scn2.confirmAndFinaliseQuote1();
        scn2.getResume();
        scn2.acceptPremiumafterchange();

	  String totaltravelafterchange = scn2.gettotaltravelcareafterchange();
	  String Medicalconditionafterchange = scn2.getmedicalConditionafterChange();
	  String TotalValueafterchange = scn2.getTotalValueAfterChange();

	  Reporter.log("totaltravelafterchange: " + totaltravelafterchange);
	  Reporter.log("Medicalconditionafterchange: " + Medicalconditionafterchange);
	  Reporter.log("TotalValueafterchange: " + TotalValueafterchange);
	  SoftAssertions softly = new SoftAssertions();
}
  @Test
  public void testReplacingDestination() throws InterruptedException {

      GetAQuotePage Page1 = new GetAQuotePage(d);
      Page1.getSingleTripGetQuote("ENGLAND", "23/03/2020", "20", "25", "");
      CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
      Page2.getSingleTripClickContinue();
      DetailsPage Page3 = new DetailsPage(d);
      Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
              "Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
              "8892414134");
      Page3.getYesMedicalCondition();
      Page3.confirmAndFinaliseQuote();
      MedicalConditionPage MPage3 = new MedicalConditionPage(d);
      MPage3.getYesMedicalConditionDeclaration();
      MPage3.getAccessMedicalConditionDeclaration();
      MedicalAssessmentPage AssessPage = new MedicalAssessmentPage(d);
      AssessPage.getMedicalAssessment();
      AssessPage.getMedicalAssessmentSearch("Diabetes");
      Medicalrescoring scn3 = new Medicalrescoring(d);

      String totaltravelbeforechange = scn3.gettotaltravelcarebeforechange();
      String Medicalconditionbeforechange = scn3.getMedicalCondition();
      String TotalValuebeforechange = scn3.getTotalValue();

      Reporter.log("totaltravelbeforechange: " + totaltravelbeforechange);
      Reporter.log("Medicalconditionbeforechange: " + Medicalconditionbeforechange);
      Reporter.log("TotalValuebeforechange: " + TotalValuebeforechange);
      scn3.geteditquoteclick();
      scn3.getedittripclick();
      scn3.getClearGetAQuote();
      scn3.getChangeDestination("CANADA");
      scn3.getSingleTripClickContinueAfterUpdate();
        scn3.getYesMedicalCondition3();
        scn3.confirmAndFinaliseQuote1();
        scn3.getResume();
        scn3.acceptPremiumafterchange();

      String totaltravelafterchange = scn3.gettotaltravelcareafterchange();
      String Medicalconditionafterchange = scn3.getmedicalConditionafterChange();
      String TotalValueafterchange = scn3.getTotalValueAfterChange();

      Reporter.log("totaltravelafterchange: " + totaltravelafterchange);
      Reporter.log("Medicalconditionafterchange: " + Medicalconditionafterchange);
      Reporter.log("TotalValueafterchange: " + TotalValueafterchange);
      SoftAssertions softly = new SoftAssertions();
  }
    @Test
    public void testAddDestination() throws InterruptedException {

        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/03/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
                "Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
                "8892414134");
        Page3.getYesMedicalCondition();
        Page3.confirmAndFinaliseQuote();
        MedicalConditionPage MPage3 = new MedicalConditionPage(d);
        MPage3.getYesMedicalConditionDeclaration();
        MPage3.getAccessMedicalConditionDeclaration();
        MedicalAssessmentPage AssessPage = new MedicalAssessmentPage(d);
        AssessPage.getMedicalAssessment();
        AssessPage.getMedicalAssessmentSearch("Diabetes");
        Medicalrescoring scn4 = new Medicalrescoring(d);

        String totaltravelbeforechange = scn4.gettotaltravelcarebeforechange();
        String Medicalconditionbeforechange = scn4.getMedicalCondition();
        String TotalValuebeforechange = scn4.getTotalValue();

        Reporter.log("totaltravelbeforechange: " + totaltravelbeforechange);
        Reporter.log("Medicalconditionbeforechange: " + Medicalconditionbeforechange);
        Reporter.log("TotalValuebeforechange: " + TotalValuebeforechange);
        scn4.geteditquoteclick();
        scn4.getedittripclick();
        scn4.getAddDestination("CANADA");

        scn4.getSingleTripClickContinueAfterUpdate();
        scn4.getYesMedicalCondition3();
        scn4.confirmAndFinaliseQuote1();
        scn4.getResume();
        scn4.acceptPremiumafterchange();

        String totaltravelafterchange = scn4.gettotaltravelcareafterchange();
        String Medicalconditionafterchange = scn4.getmedicalConditionafterChange();
        String TotalValueafterchange = scn4.getTotalValueAfterChange();

        Reporter.log("totaltravelafterchange: " + totaltravelafterchange);
        Reporter.log("Medicalconditionafterchange: " + Medicalconditionafterchange);
        Reporter.log("TotalValueafterchange: " + TotalValueafterchange);
        SoftAssertions softly = new SoftAssertions();
    }
*/

    /*@Test
	public void testChangeAgeOfTraveller() throws InterruptedException {

	   GetAQuotePage Page1 = new GetAQuotePage(d);
	   Page1.getSingleTripGetQuote("ENGLAND", "23/03/2020", "20", "25", "");
	   CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
	   Page2.getSingleTripClickContinue();
	   DetailsPage Page3 = new DetailsPage(d);
	   Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
			   "Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
			   "8892414134");
	   Page3.getYesMedicalCondition();
	   Page3.confirmAndFinaliseQuote();
	   MedicalConditionPage MPage3 = new MedicalConditionPage(d);
	   MPage3.getYesMedicalConditionDeclaration();
	   MPage3.getAccessMedicalConditionDeclaration();
	   MedicalAssessmentPage AssessPage = new MedicalAssessmentPage(d);
	   AssessPage.getMedicalAssessment();
	   AssessPage.getMedicalAssessmentSearch("Diabetes");
	   Medicalrescoring scn5 = new Medicalrescoring(d);

	   String totaltravelbeforechange = scn5.gettotaltravelcarebeforechange();
	   String Medicalconditionbeforechange = scn5.getMedicalCondition();
	   String TotalValuebeforechange = scn5.getTotalValue();

	   Reporter.log("totaltravelbeforechange: " + totaltravelbeforechange);
	   Reporter.log("Medicalconditionbeforechange: " + Medicalconditionbeforechange);
	   Reporter.log("TotalValuebeforechange: " + TotalValuebeforechange);
	   
	   scn5.geteditquoteclick();
	   scn5.getedittripclick();
	   scn5.getChangeAge("30");
	   scn5.getSingleTripClickContinueAfterUpdate();
	   scn5.getDOBChange("01/01/1990");
       scn5.getYesMedicalCondition3();
        scn5.confirmAndFinaliseQuote1();
        scn5.getResume();
	   scn5.acceptPremiumafterchange();

	   String totaltravelafterchange = scn5.gettotaltravelcareafterchange();
	   String Medicalconditionafterchange = scn5.getmedicalConditionafterChange();
	   String TotalValueafterchange = scn5.getTotalValueAfterChange();

	   Reporter.log("totaltravelafterchange: " + totaltravelafterchange);
	   Reporter.log("Medicalconditionafterchange: " + Medicalconditionafterchange);
	   Reporter.log("TotalValueafterchange: " + TotalValueafterchange);
	   SoftAssertions softly = new SoftAssertions();
		}
*/
		@AfterMethod
    public void refreshBrowser() {
        d.manage().deleteAllCookies();
        d.navigate().refresh();
        JavascriptExecutor js = (JavascriptExecutor) d;
        // js.executeScript("window.localStorage.clear();");

        js.executeScript("window.sessionStorage.clear();");
    }
}
