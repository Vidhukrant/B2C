package com.aant.tests;

//import org.assertj.core.api.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aant.pages.CompareTravelInsurancePage;
import com.aant.pages.DetailsPage;
import com.aant.pages.GetAQuotePage;
import com.aant.pages.MedicalAssessmentPage;
import com.aant.pages.MedicalConditionPage;
import com.aant.pages.Medicalrescoring;
import com.aant.pages.PaymentDetails;

public class MedicalRescore extends BaseTest{
              GetAQuotePage Page1;
              CompareTravelInsurancePage Page2;
              DetailsPage Page3;
              MedicalConditionPage MPage3;
              MedicalAssessmentPage AssessPage;
              PaymentDetails page4;

              @BeforeMethod
              public void openurl() {
                             d.get("https://racvqa.tmmatravel.com/");
              }
                             
   @Test
              public void testChangeFinancialRatingParameter() throws InterruptedException {

                             GetAQuotePage Page1 = new GetAQuotePage(d);
                             Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
                             CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
                             Page2.getSingleTripClickContinue();
                             DetailsPage Page3 = new DetailsPage(d);
                             Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
                                                          "Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
                                                          "8892414134");
                             /*Page3.pdsCondition();
                             Page3.marketCondition();*/
                             Page3.getYesMedicalCondition();
                             Page3.confirmAndFinaliseQuote();
                             MedicalConditionPage MPage3 = new MedicalConditionPage(d);
                             MPage3.getYesMedicalConditionDeclaration();
                             MPage3.getAccessMedicalConditionDeclaration();
                             MedicalAssessmentPage AssessPage = new MedicalAssessmentPage(d);
                             AssessPage.getMedicalAssessment();
                             AssessPage.getMedicalAssessmentSearch("Diabetes");
        Medicalrescoring scn1=new Medicalrescoring(d);
        
                  String totaltravelbeforechange=scn1.gettotaltravelcarebeforechange();
                             String Medicalconditionbeforechange=scn1.getMedicalCondition();
                             String TotalValuebeforechange=scn1.getTotalValue();
                            
                             Reporter.log(totaltravelbeforechange);
                             Reporter.log(Medicalconditionbeforechange);
                             Reporter.log(TotalValuebeforechange);
                             
                             scn1.getEditPage2();
                             scn1.getEditTravel();
                             scn1.getSingleTripClickContinueAfterUpdate();
                             
                             Page3.getYesMedicalCondition();
                             Page3.confirmAndFinaliseQuote();
                             
                             String totaltravelafterchange=scn1.gettotaltravelcareafterchange();
                             String Medicalconditionafterchange= scn1.getmedicalConditionafterChange();
                             String TotalValueafterchange=scn1.getTotalValueAfterChange();
                             
                             Reporter.log(totaltravelafterchange);
                             Reporter.log(Medicalconditionafterchange);
                             Reporter.log(TotalValueafterchange);
                             
                             //Assert.assertEquals(totaltravelbeforechange, totaltravelafterchange);
                             
                             
                             
}
   
  /* @Test
              public void testChangeNonFinancialRatingParameter() throws InterruptedException {

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
                             Medicalrescoring scn1=new Medicalrescoring(d);
                  String totaltravelbeforechange=scn1.gettotaltravelcarebeforechange();
                             String Medicalconditionbeforechange=scn1.getMedicalCondition();
                             String TotalValuebeforechange=scn1.getTotalValue();
                             Medicalrescoring scn2=new Medicalrescoring(d);
                             scn2.getEditPage3();
                             Page3.getNoMedicalConditionWithoutDependent("Aravind", "Akash", "03/01/2000", "Somu", "Prakash", "03/01/1995",
                                                          "Address", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
                                                          "8892414131");
                             Page3.getYesMedicalCondition();
                             Page3.confirmAndFinaliseQuote();
                             String totaltravelafterchange=scn1.gettotaltravelcareafterchange();
                             String Medicalconditionafterchange= scn1.getmedicalConditionafterChange();
                             String TotalValueafterchange=scn1.getTotalValueAfterChange();
                             Reporter.log(totaltravelbeforechange);
                             Reporter.log(Medicalconditionbeforechange);
                             Reporter.log(TotalValuebeforechange);
                             Reporter.log(totaltravelafterchange);
                             Reporter.log(Medicalconditionafterchange);
                             Reporter.log(TotalValueafterchange);
                             //Assert.assertEquals(totaltravelbeforechange, totaltravelafterchange);
}
   @Test
              public void testReplacingDestination() throws InterruptedException {

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
                             Medicalrescoring scn1=new Medicalrescoring(d);
                 String totaltravelbeforechange=scn1.gettotaltravelcarebeforechange();
                             String Medicalconditionbeforechange=scn1.getMedicalCondition();
                             String TotalValuebeforechange=scn1.getTotalValue();
                             
                             Medicalrescoring scn3=new Medicalrescoring(d);
                             scn3.getEditPage3();
                             Page3.getEditQuoteSummaryClick();
                             Page1.getClearGetAQuote();
        Page1.getEditForPage3GetQuote("INDIA", "23/03/2020", "25/03/2020", "20", "25");
        Page2.getSingleTripClickContinue();
                             Page3.getYesMedicalCondition();
                             Page3.confirmAndFinaliseQuote();
                             String totaltravelafterchange=scn1.gettotaltravelcareafterchange();
                             String Medicalconditionafterchange= scn1.getmedicalConditionafterChange();
                             String TotalValueafterchange=scn1.getTotalValueAfterChange();
                             Reporter.log(totaltravelbeforechange);
                             Reporter.log(Medicalconditionbeforechange);
                             Reporter.log(TotalValuebeforechange);
                             Reporter.log(totaltravelafterchange);
                             Reporter.log(Medicalconditionafterchange);
                             Reporter.log(TotalValueafterchange);
                             //Assert.assertEquals(totaltravelbeforechange, totaltravelafterchange);
                             }
   */
   
                             
                             
                             
              @AfterMethod
              public void refreshBrowser() {
//                            /* d.manage().deleteAllCookies();
//                             d.navigate().refresh();
//                             JavascriptExecutor js = (JavascriptExecutor) d;
//                             // js.executeScript("window.localStorage.clear();");
//
//                             js.executeScript("window.sessionStorage.clear();");*/
              }
}
