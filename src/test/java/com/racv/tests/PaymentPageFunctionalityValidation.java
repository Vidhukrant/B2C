package com.racv.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.racv.pages.CompareTravelInsurancePage;
import com.racv.pages.DetailsPage;
import com.racv.pages.GetAQuotePage;
import com.racv.pages.MedicalAssessmentPage;
import com.racv.pages.MedicalConditionPage;
import com.racv.pages.PaymentDetails;
import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.JavascriptExecutor;

public class PaymentPageFunctionalityValidation extends BaseTest
{
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

 /*   @Test(description = "Validate blank card holder name error message")
    public void validateBlankCardHolderName() throws InterruptedException {
    GetAQuotePage Page1 = new GetAQuotePage(d);
            Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
            CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
            Page2.getSingleTripClickContinue();
            DetailsPage Page3 = new DetailsPage(d);
            Page3.getNoMedicalConditionWithoutDependent("Ross", "Tyler", "03/01/2000", "Mr", "Bean", "03/01/1995",
                            "Address1", "SUBRB", "5000", "test@gmail.com", "test@gmail.com", "8892414134");
            //Page3.pdsCondition();
            //Page3.marketCondition();
            Page3.getNoRACMedicalCondition();
            Page3.confirmAndFinaliseQuoteRAC();
            PaymentDetails page4 = new PaymentDetails(d);
            page4.forBlankCCName();

            assertThat(page4.ErrorMsgCCName().trim().equalsIgnoreCase("Please fill out a cardholder name."));
    }
	
 @Test(description="Validate blank card number error message")
    public void validateBlankCardNumber() throws InterruptedException {

            GetAQuotePage Page1 = new GetAQuotePage(d);
            Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
            CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
            Page2.getSingleTripClickContinue();
            DetailsPage Page3 = new DetailsPage(d);
            Page3.getNoMedicalConditionWithoutDependent("Ross", "Tyler", "03/01/2000", "Mr", "Bean", "03/01/1995",
                            "Address1", "SUBRB", "5000", "test@gmail.com", "test@gmail.com", "8892414134");
            Page3.getNoRACMedicalCondition();
            Page3.confirmAndFinaliseQuoteRAC();
            Page3.pdsCondition();
            Page3.marketCondition();
            PaymentDetails page4 = new PaymentDetails(d);
            page4.forBlankCCNumber();
            assertThat(page4.ErrorCCNumber().trim().equalsIgnoreCase("Please fill out a card number."));

    }
@Test(description="Validate blank expiry date error message")
    public void validateBlankExpDate() throws InterruptedException {
    GetAQuotePage Page1 = new GetAQuotePage(d);
            Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
            CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
            Page2.getSingleTripClickContinue();
            DetailsPage Page3 = new DetailsPage(d);
            Page3.getNoMedicalConditionWithoutDependent("Ross", "Tyler", "03/01/2000", "Mr", "Bean", "03/01/1995",
                            "Address1", "SUBRB", "5000", "test@gmail.com", "test@gmail.com", "8892414134");
            Page3.getNoRACMedicalCondition();
            Page3.confirmAndFinaliseQuoteRAC();	
            Page3.pdsCondition();
            Page3.marketCondition();
            PaymentDetails page4 = new PaymentDetails(d);            
            page4.forBlankExpDate();
            assertThat(page4.ErrorMsgExpDate().trim().equalsIgnoreCase("Please fill out an expiration date."));
    }
@Test(description="Validate blank CVV number error message")
    public void validateBlankCVV() throws InterruptedException {
            GetAQuotePage Page1 = new GetAQuotePage(d);
            Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
            CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
            Page2.getSingleTripClickContinue();
            DetailsPage Page3 = new DetailsPage(d);
            Page3.getNoMedicalConditionWithoutDependent("Ross", "Tyler", "03/01/2000", "Mr", "Bean", "03/01/1995",
                            "Address1", "SUBRB", "5000", "test@gmail.com", "test@gmail.com", "8892414134");
            Page3.getNoRACMedicalCondition();
            Page3.confirmAndFinaliseQuoteRAC();
            Page3.pdsCondition();
            Page3.marketCondition();
            PaymentDetails page4 = new PaymentDetails(d);
            page4.forBlankCVV();
            assertThat(page4.ErrorMsgCVV().trim().equalsIgnoreCase("Please fill out a CVV."));
    }*/
/*@Test(description="Validate invalid card number error message")
    public void validateInvalidCard() throws InterruptedException {
            GetAQuotePage Page1 = new GetAQuotePage(d);
            Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
            CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
            Page2.getSingleTripClickContinue();
            DetailsPage Page3 = new DetailsPage(d);
            Page3.getNoMedicalConditionWithoutDependent("Ross", "Tyler", "03/01/2000", "Mr", "Bean", "03/01/1995",
                            "Address1", "SUBRB", "5000", "test@gmail.com", "test@gmail.com", "8892414134");
            Page3.getNoRACMedicalCondition();
            Page3.confirmAndFinaliseQuoteRAC();
            Page3.pdsCondition();
            Page3.marketCondition();
            PaymentDetails page4 = new PaymentDetails(d);
            page4.forValidateInvalidCard();
            assertThat(page4.ErrorInvalidCard().trim().equalsIgnoreCase("This card number is not valid."));
    }*/
/*@Test(description="Validate past expiry date error message")
    public void validateWithPastExpDate() throws InterruptedException {
            GetAQuotePage Page1 = new GetAQuotePage(d);
            Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
            CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
            Page2.getSingleTripClickContinue();
            DetailsPage Page3 = new DetailsPage(d);
            Page3.getNoMedicalConditionWithoutDependent("Ross", "Tyler", "03/01/2000", "Mr", "Bean", "03/01/1995",
                            "Address1", "SUBRB", "5000", "test@gmail.com", "test@gmail.com", "8892414134");
            Page3.getNoRACMedicalCondition();
            Page3.confirmAndFinaliseQuoteRAC();
            Page3.pdsCondition();
            Page3.marketCondition();
            PaymentDetails page4 = new PaymentDetails(d);
            page4.validateInvalidExpDate();
            assertThat(page4.ErrorInvalidExpDate().trim().equalsIgnoreCase("This expiration date is not valid."));

    }*/
@Test(description="Validate invalid CVV number error message")
    public void validateCardWithInvalidCVV() throws InterruptedException {
            GetAQuotePage Page1 = new GetAQuotePage(d);
            Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
            CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
            Page2.getSingleTripClickContinue();
            DetailsPage Page3 = new DetailsPage(d);
            Page3.getNoMedicalConditionWithoutDependent("Ross", "Tyler", "03/01/2000", "Mr", "Bean", "03/01/1995",
                            "Address1", "SUBRB", "5000", "test@gmail.com", "test@gmail.com", "8892414134");
            Page3.getNoRACMedicalCondition();
            Page3.confirmAndFinaliseQuoteRAC();
            Page3.pdsCondition();
            Page3.marketCondition();
            PaymentDetails page4 = new PaymentDetails(d);
            page4.validateWithInvalidCVV();
            assertThat(page4.ErrorInvalidCVV().trim().equalsIgnoreCase("This security code is not valid."));
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
