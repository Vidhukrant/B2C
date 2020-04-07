package com.racv.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import com.racv.pages.CompareTravelInsurancePage;
import com.racv.pages.DetailsPage;
import com.racv.pages.GetAQuotePage;
import com.racv.pages.PaymentDetails;

import static org.assertj.core.api.Assertions.assertThat;


public class DetailPageFieldValidationTest extends BaseTest {
    GetAQuotePage Page1;
    CompareTravelInsurancePage Page2;
    DetailsPage Page3;

    @BeforeMethod
	public void openurl() {
		d.get("https://racvqa.tmmatravel.com/");
	/*	d.get("https://racvuat.tmmatravel.com");*/
	}

    @Test(description = "Blank field validation For Primary Traveller First Name")
    public void testBlankFieldForPrimarytravellerFirstName() throws InterruptedException {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.validateFname();
        //Page3.getPrimaryFirstNameBlankFieldWithDependent("Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1", "SALISBURY DOWNS", "5108", "ss@gmail.com", "ss@gmail.com", "8892414134", "Swathi", "Rajan", "22/02/1987");
        assertThat(Page3.getPrimaryFirstNameBlankFieldErrorMsg().trim().equalsIgnoreCase("Please enter the First Name of the Primary Traveller"));

    }

    @Test(description = "Blank field validation For Primary Traveller Last Name ")
    public void testBlankFieldForPrimarytravellerLasttName() throws InterruptedException {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.validateLname();
       // Page3.getPrimaryLastNameBlankFieldWithDependent("Jenifer", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1", "SALISBURY DOWNS", "5108", "ss@gmail.com", "ss@gmail.com", "8892414134", "Swathi", "Rajan", "22/02/1987");
        assertThat(Page3.getPrimaryLastNameBlankFieldErrorMsg().trim().equalsIgnoreCase("Please enter the Last Name of the Primary Traveller"));

    }

    @Test(description = "Blank field validation For Primary Traveller DOB")
    public void testBlankFieldForPrimarytravellerDOB() throws InterruptedException {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.validateDOB();
        //Page3.getPrimaryDOBBlankFieldWithDependent("Jenifer", "Rajan", "Sowmiya", "Rajan", "03/01/1995", "Address1", "SALISBURY DOWNS", "5108", "ss@gmail.com", "ss@gmail.com", "8892414134", "Swathi", "Rajan", "22/02/1987");
        assertThat(Page3.getPrimaryDOBBlankFieldErrorMsg().trim().equalsIgnoreCase("Please enter Date of Birth"));

    }

    @Test(description = "Blank field validation For Secondary Traveller First Name")
    public void testBlankFieldForSecondarytravellerFirstName() throws InterruptedException {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.validateSecondryFirstName();
        //Page3.getSecondaryFirstNameBlankFieldWithDependent("Sowmiya", "Rajan", "03/01/2000", "Rajan", "03/01/1995", "Address1", "SALISBURY DOWNS", "5108", "ss@gmail.com", "ss@gmail.com", "8892414134", "Swathi", "Rajan", "22/02/1987");
        assertThat(Page3.getSecondaryFirstNameBlankFieldErrorMsg().trim().equalsIgnoreCase("Please enter the First Name of the Secondary Traveller"));
    }

    @Test(description = "Blank field validation For Secondary Traveller Last Name")
    public void testBlankFieldForSecondarytravellerLastName() throws InterruptedException {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.validateSecondryLastName();
        //Page3.getSecondaryLastNameBlankFieldWithDependent("Sowmiya", "Rajan", "03/01/2000", "Jenifer", "03/01/1995", "Address1", "SALISBURY DOWNS", "5108", "ss@gmail.com", "ss@gmail.com", "8892414134", "Swathi", "Rajan", "22/02/1987");
        assertThat(Page3.getSecondaryLastNameBlankFieldErrorMsg().trim().equalsIgnoreCase("Please enter the Last Name of the Secondary Traveller"));
    }

    @Test(description = "Blank field validation For Secondary Traveller DOB")
    public void testBlankFieldForSecondarytravellerDOB() throws InterruptedException {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.validateSecondryLastName();
        //Page3.getSecondaryDOBBlankFieldWithDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "Address1", "SALISBURY DOWNS", "5108", "ss@gmail.com", "ss@gmail.com", "8892414134", "Swathi", "Rajan", "22/02/2010");
        assertThat(Page3.getSecondaryDOBBlankFieldErrorMsg().trim().equalsIgnoreCase("Please enter Date of Birth"));
    }

    @Test(description = "Blank field validation For Street")
    public void testBlankFieldForStreet() throws InterruptedException {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        //Page3.validateSecondryStreetAdd();
        Page3.getStreetAdressFieldBlank("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "SALISBURY DOWNS", "5108", "ss@gmail.com", "ss@gmail.com", "8892414134", "Swathi", "Rajan", "22/02/2010");
        assertThat(Page3.getStreetFieldBlankErrorMsg().trim().equalsIgnoreCase("Please enter the Street Address"));
    }

    @Test(description = "Blank field validation For Suburb")
    public void testBlankFieldForSuburb() throws InterruptedException {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.getSuburbAddressFieldBlank("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1", "5108", "ss@gmail.com", "ss@gmail.com", "8892414134", "Swathi", "Rajan", "22/02/2010");
        assertThat(Page3.getSuburbFieldBlankErrorMsg().trim().equalsIgnoreCase("Please enter the Suburb"));
    }

    @Test(description = "Blank field validation For PinCode")
    public void testBlankFieldForPinCode() throws InterruptedException {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.getPincodeFieldBlank("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1", "SALISBURY DOWNS", "ss@gmail.com", "ss@gmail.com", "8892414134", "Swathi", "Rajan", "22/02/2010");
        assertThat(Page3.getPincodeFieldBlankErrorMsg().trim().equalsIgnoreCase("Please enter the Postcode"));
    }

    @Test(description = "Blank field validation For Email Address")
    public void testBlankFieldForEmail() throws InterruptedException {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.getEmailFieldBlank("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1", "SALISBURY DOWNS", "5108", "ss@gmail.com", "8892414134", "Swathi", "Rajan", "22/02/1987");
        assertThat(Page3.getEmailFieldBlankErrorMsg().trim().equalsIgnoreCase("Please enter the Email Address"));

    }

    @Test(description = "Blank field validation For Confirm Email Address")
    public void testBlankFieldForConfirmEmail() throws InterruptedException {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.getConfirmEmailFieldBlank("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1", "SALISBURY DOWNS", "5108", "ss@gmail.com", "8892414134", "Swathi", "Rajan", "22/02/1987");
        assertThat(Page3.getConfirmEmailFieldBlankErrorMsg().trim().equalsIgnoreCase("Please enter the Confirm Email Address"));
    }

    @Test(description = "Blank field validation For Mobile Phone No")
    public void testBlankFieldForPhoneNo() throws InterruptedException {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.getMobileFieldBlank("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1", "SALISBURY DOWNS", "5108", "ss@gmail.com", "ss@gmail.com", "Swathi", "Rajan", "22/02/1987");
        assertThat(Page3.getMobileFieldBlankErrorMsg().trim().equalsIgnoreCase("Please enter a valid Phone number"));
    }

    @Test(description = "Validation For InValid PinCode")
    public void testInvalidPinCode() throws InterruptedException {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.getPincodeInValid("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1", "SALISBURY DOWNS", "11");
        assertThat(Page3.getPincodeInValidErrorMsg().trim().equalsIgnoreCase("Please enter a valid Postcode that matches the state"));
    }

    @Test(description = "Validation For InValid Email")
    public void testForInvalidEmailFormat() throws InterruptedException {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.getEmailInValid("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1", "SALISBURY DOWNS", "5108", "ss");
        assertThat(Page3.getEmailInValidErrorMsg().trim().equalsIgnoreCase("Please enter a valid Email address"));
    }

    @Test(description = "Validation For InValid ConFirmEmail")
    public void testForInvalidConFirmEmailFormat() throws InterruptedException {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.getConfirmEmailInValid("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1", "SALISBURY DOWNS", "5108", "ss@gmail.com", "ss");
        assertThat(Page3.getConfirmEmailInValidErrorMsg().trim().equalsIgnoreCase("Confirm Email address does not match with email Address"));
    }

    @Test(description = "Validation For Email And ConFirm Email MisMatch")
    public void testForMisMatchOfEmailAndConfirmEmail() throws InterruptedException {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.getEmailMismatch("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1", "SALISBURY DOWNS", "5108", "ss@gmail.com", "ssww@gmail.com");
        assertThat(Page3.getEmailMismatchErrorMsg().trim().equalsIgnoreCase("Confirm Email address does not match with email Address"));
    }

    @Test(description = "Validation For Invalid Mobile No")
    public void testForInvalidMobileNo() throws InterruptedException {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.getMobileInvalidNo("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1", "SALISBURY DOWNS", "5108", "ss@gmail.com", "ss@gmail.com", "892");
        assertThat(Page3.getMobileInvalidNoErrorMsg().trim().equalsIgnoreCase("Phone number cannot be less than 10 digits."));
    }

    @Test(description = "Adding Dependent")
    public void testAddDependent() {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Reporter.log("Dependent Added");
        Page3.addDependent();
        Assert.assertTrue(Page3.validateAddDependentIsEnabled(), "Add Dependent button displayed for adding dependent");
        Page3.getDependentDetails("Saran", "Rajan", "03/05/2010");
    }

    @Test(description = "Delete Dependent")
    public void testDeleteDependent() {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Reporter.log("Dependent Added");
        Page3.addDependent();
        Page3.getDependentDetails("Saran", "Rajan", "03/05/2010");
        Assert.assertTrue(Page3.validateDeleteIsEnabled(), "Delete Fuctionality Is Enabled");
        Page3.deleteDependent();
        Reporter.log("Dependent Deleted");
    }

    @Test(description = "Edit Quote Summary")
    public void testEditQuoteSummary() {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Assert.assertTrue(Page3.validateEditQuoteIsEnabled(), "Edit Quote Fuctionality Is Enabled");
        Page3.getEditQuoteSummaryClick();
        Page1.getClearGetAQuote();
        Page1.getEditForPage3GetQuote("INDIA", "23/03/2020", "25/03/2020", "20", "25");
        assertThat(Page1.getPageHeading().trim().equalsIgnoreCase("Compare Travel Insurance"));
    }

//    @Test(description = "Edit Quote Summary Cancel")
//    public void testEditCancel() {
//        GetAQuotePage Page1 = new GetAQuotePage(d);
//        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
//        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
//        Page2.getSingleTripClickContinue();
//        DetailsPage Page3 = new DetailsPage(d);
//        Page3.getEditQuoteSummaryClick();
//        Assert.assertTrue(Page3.validateEditQuoteSummaryCancel(), "Cancel is Displayed in Edit Summary Page");
//        Page3.getEditQuoteSummaryCancel();
//        assertThat(Page3.getDetailsPageHeading().trim().equalsIgnoreCase("Who's Travelling?"));
//    }

    @Test(description = "Age of Traveler must be between 18-85 if Ski/Winter Sports is opted")
    public void getPrimaryAgeDetails18to85SkiWinterSPorts() {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.getPrimaryBtwn18And85Validation("Sowmi", "Ranjan", "23/03/2020");
        assertThat(Page3.getPrimaryAgeBetween18and85ErrorMsg().equalsIgnoreCase("Age of Traveler must be between 18-85 if Ski/Winter Sports is opted"));
    }

    @Test(description = "Age of Traveler must be between 18-85 if Ski/Winter Sports is opted")
    public void getSecondaryAgeDetails18to85SkiWinterSPorts() {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.getSecondaryAgeBtwn18And85Validation("Sowmi", "Ranjan", "01/01/2000", "Jenifer", "Kajal", "01/02/2020");
        assertThat(Page3.getSecondaryAgeBetween18and85ErrorMsg().equalsIgnoreCase("Age of Traveler must be between 18-85 if Ski/Winter Sports is opted"));
    }

    @Test(description = "DOB MisMatch With GetAQuote")
    public void getDOBDetailsPageMismatchWithGetAQuote() {
        GetAQuotePage Page1 = new GetAQuotePage(d);
        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
        Page2.getSingleTripClickContinue();
        DetailsPage Page3 = new DetailsPage(d);
        Page3.getPrimaryMismatchWithPremium("Sowmi", "Ranjan", "01/01/1995");
        assertThat(Page3.getPrimaryMismatchWithPremiumErrorMsg().equalsIgnoreCase("Date of Birth entered does not match the age entered. Premium may be recalculated based on the Date of Birth entered."));
        //Page3.getPrimaryMismatchWithPremiumYes();
    }
    //@Irfan, Email functionality is not working.

//    @Test(description = "SendEmail")
//    public void getSendEmail() {
//        GetAQuotePage Page1 = new GetAQuotePage(d);
//        Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
//        CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
//        Page2.getSingleTripClickContinue();
//        DetailsPage Page3 = new DetailsPage(d);
//        Page3.sendACopyOfQuoteEmail("ss@gmail.com");
//        assertThat(Page3.getEmailSuccessMsg().equalsIgnoreCase("Email sent successfully"));
//    }

    @AfterMethod
	public void refreshBrowser() {
    	d.manage().deleteAllCookies();
		d.navigate().refresh();
		JavascriptExecutor js = (JavascriptExecutor) d;
		// js.executeScript("window.localStorage.clear();");

		js.executeScript("window.sessionStorage.clear();");
	}

}



