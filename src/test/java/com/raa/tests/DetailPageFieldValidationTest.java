package com.raa.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import com.raa.pages.CompareTravelInsurancePage;
import com.raa.pages.DetailsPage;
import com.raa.pages.GetAQuotePage;
import static org.assertj.core.api.Assertions.assertThat;

public class DetailPageFieldValidationTest extends BaseTest {
	GetAQuotePage Page1;
	CompareTravelInsurancePage Page2;
	DetailsPage Page3;

	@BeforeClass
	public void openurl() {
		d.get("https://raauat.tmmatravel.com");
		GetAQuotePage Page1 = new GetAQuotePage(d);
		Page1.getSingleTripGetQuote("ENGLAND", "23/02/2020", "20", "25", "");
		CompareTravelInsurancePage Page2 = new CompareTravelInsurancePage(d);
		Page2.getSingleTripClickContinue();

	}

	@Test(description = "Blank field validation For Primary Traveller First Name", priority = 1)
	public void testBlankFieldForPrimarytravellerFirstName() throws InterruptedException {

		DetailsPage Page3 = new DetailsPage(d);
		Page3.validateFname();
		assertThat(Page3.getPrimaryFirstNameBlankFieldErrorMsg().trim()
				.equalsIgnoreCase("Please enter the First Name of the Primary Traveller"));

	}

	@Test(description = "Blank field validation For Primary Traveller Last Name ", priority = 2)
	public void testBlankFieldForPrimarytravellerLasttName() throws InterruptedException {
		DetailsPage Page3 = new DetailsPage(d);
		Page3.validateLname();
		assertThat(Page3.getPrimaryLastNameBlankFieldErrorMsg().trim()
				.equalsIgnoreCase("Please enter the Last Name of the Primary Traveller"));

	}

	@Test(description = "Blank field validation For Primary Traveller DOB", priority = 3)
	public void testBlankFieldForPrimarytravellerDOB() throws InterruptedException {
		DetailsPage Page3 = new DetailsPage(d);
		Page3.validateDOB();
		assertThat(Page3.getPrimaryDOBBlankFieldErrorMsg().trim().equalsIgnoreCase("Please enter the Date of Birth"));

	}

	@Test(description = "Blank field validation For Secondary Traveller First Name", priority = 4)
	public void testBlankFieldForSecondarytravellerFirstName() throws InterruptedException {

		DetailsPage Page3 = new DetailsPage(d);
		Page3.validateSecondryFname();
		assertThat(Page3.getSecondaryFirstNameBlankFieldErrorMsg().trim()
				.equalsIgnoreCase("Please enter the First Name of the Secondary Traveller"));
	}

	@Test(description = "Blank field validation For Secondary Traveller Last Name", priority = 5)
	public void testBlankFieldForSecondarytravellerLastName() throws InterruptedException {

		DetailsPage Page3 = new DetailsPage(d);
		Page3.validateSecondryLname();
		assertThat(Page3.getSecondaryLastNameBlankFieldErrorMsg().trim()
				.equalsIgnoreCase("Please enter the Last Name of the Secondary Traveller"));
	}

	@Test(description = "Blank field validation For Secondary Traveller DOB", priority = 6)
	public void testBlankFieldForSecondarytravellerDOB() throws InterruptedException {

		DetailsPage Page3 = new DetailsPage(d);
		Page3.validatesecondryDOB();
		assertThat(Page3.getSecondaryDOBBlankFieldErrorMsg().trim().equalsIgnoreCase("Please enter the Date of Birth"));
	}

	@Test(description = "Blank field validation For Street", priority = 7)
	public void testBlankFieldForStreet() throws InterruptedException {

		DetailsPage Page3 = new DetailsPage(d);
		Page3.getStreetAdressFieldBlank("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
				"SALISBURY DOWNS", "5108", "ss@gmail.com", "ss@gmail.com", "8892414134", "Swathi", "Rajan",
				"22/02/2010");
		assertThat(Page3.getStreetFieldBlankErrorMsg().trim().equalsIgnoreCase("Please enter the Street Address"));
	}

	@Test(description = "Blank field validation For Suburb", priority = 8)
	public void testBlankFieldForSuburb() throws InterruptedException {

		DetailsPage Page3 = new DetailsPage(d);
		Page3.getSuburbAddressFieldBlank("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1",
				"5108", "ss@gmail.com", "ss@gmail.com", "8892414134", "Swathi", "Rajan", "22/02/2010");
		assertThat(Page3.getSuburbFieldBlankErrorMsg().trim().equalsIgnoreCase("Please enter the Suburb"));
	}

	@Test(description = "Blank field validation For PinCode", priority = 9)
	public void testBlankFieldForPinCode() throws InterruptedException {

		DetailsPage Page3 = new DetailsPage(d);
		Page3.getPincodeFieldBlank("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1",
				"SALISBURY DOWNS", "ss@gmail.com", "ss@gmail.com", "8892414134", "Swathi", "Rajan", "22/02/2010");
		assertThat(Page3.getPincodeFieldBlankErrorMsg().trim().equalsIgnoreCase("Please enter the Postcode"));
	}

	@Test(description = "Blank field validation For Email Address", priority = 10)
	public void testBlankFieldForEmail() throws InterruptedException {

		DetailsPage Page3 = new DetailsPage(d);
		Page3.getEmailFieldBlank("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1",
				"SALISBURY DOWNS", "5108", "ss@gmail.com", "8892414134", "Swathi", "Rajan", "22/02/1987");
		assertThat(Page3.getEmailFieldBlankErrorMsg().trim().equalsIgnoreCase("Please enter the Email Address"));

	}

	@Test(description = "Blank field validation For Confirm Email Address", priority = 11)
	public void testBlankFieldForConfirmEmail() throws InterruptedException {

		DetailsPage Page3 = new DetailsPage(d);
		Page3.getConfirmEmailFieldBlank("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1",
				"SALISBURY DOWNS", "5108", "ss@gmail.com", "8892414134", "Swathi", "Rajan", "22/02/1987");
		assertThat(Page3.getConfirmEmailFieldBlankErrorMsg().trim()
				.equalsIgnoreCase("Please enter the Confirm Email Address"));
	}

	@Test(description = "Blank field validation For Mobile Phone No", priority = 12)
	public void testBlankFieldForPhoneNo() throws InterruptedException {

		DetailsPage Page3 = new DetailsPage(d);
		Page3.getMobileFieldBlank("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1",
				"SALISBURY DOWNS", "5108", "ss@gmail.com", "ss@gmail.com", "Swathi", "Rajan", "22/02/1987");
		assertThat(Page3.getMobileFieldBlankErrorMsg().trim().equalsIgnoreCase("Please enter a valid Phone number"));
	}

	@Test(description = "Validation For InValid PinCode", priority = 13)
	public void testInvalidPinCode() throws InterruptedException {

		DetailsPage Page3 = new DetailsPage(d);
		Page3.getPincodeInValid("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1",
				"SALISBURY DOWNS", "11");
		assertThat(Page3.getPincodeInValidErrorMsg().trim().equalsIgnoreCase("Please enter a valid Postcode"));
		Page3.page3Reset();
	}

	@Test(description = "Validation For InValid Email", priority = 14)
	public void testForInvalidEmailFormat() throws InterruptedException {

		DetailsPage Page3 = new DetailsPage(d);
		Page3.getEmailInValid("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1",
				"SALISBURY DOWNS", "5108", "ss");
		assertThat(Page3.getEmailInValidErrorMsg().trim().equalsIgnoreCase("Please enter a valid Email address"));
		Page3.page3Reset();
	}

	@Test(description = "Validation For InValid ConFirmEmail", priority = 15)
	public void testForInvalidConFirmEmailFormat() throws InterruptedException {

		DetailsPage Page3 = new DetailsPage(d);
		Page3.getConfirmEmailInValid("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1",
				"SALISBURY DOWNS", "5108", "ss@gmail.com", "ss");
		assertThat(Page3.getConfirmEmailInValidErrorMsg().trim()
				.equalsIgnoreCase("Please enter a valid Email address"));
		Page3.page3Reset();
	}

	@Test(description = "Validation For Email And ConFirm Email MisMatch", priority = 16)
	public void testForMisMatchOfEmailAndConfirmEmail() throws InterruptedException {

		DetailsPage Page3 = new DetailsPage(d);
		Page3.getEmailMismatch("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1",
				"SALISBURY DOWNS", "5108", "ss@gmail.com", "ssww@gmail.com");
		assertThat(Page3.getEmailMismatchErrorMsg().trim()
				.equalsIgnoreCase("Confirm Email address does not match with the email Address"));
		Page3.page3Reset();
	}

	@Test(description = "Validation For Invalid Mobile No", priority = 17)
	public void testForInvalidMobileNo() throws InterruptedException {

		DetailsPage Page3 = new DetailsPage(d);
		Page3.getMobileInvalidNo("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995", "Address1",
				"SALISBURY DOWNS", "5108", "ss@gmail.com", "ss@gmail.com", "892");
		assertThat(Page3.getMobileInvalidNoErrorMsg().trim()
				.equalsIgnoreCase("Phone number cannot be less than 10 digits."));
		Page3.page3Reset();
	}

	@Test(description = "Adding Dependent", priority = 18)
	public void testAddDependent() {

		DetailsPage Page3 = new DetailsPage(d);
		Reporter.log("Dependent Added");
		Page3.addDependent();
		Assert.assertTrue(Page3.validateAddDependentIsEnabled(), "Add Dependent button displayed for adding dependent");
		Page3.getDependentDetails("Saran", "Rajan", "03/05/2010");
	}

	@Test(description = "Delete Dependent", priority = 19)
	public void testDeleteDependent() {
		DetailsPage Page3 = new DetailsPage(d);
		Reporter.log("Dependent Added");
		Page3.addDependent();
		Page3.getDependentDetails("Saran", "Rajan", "03/05/2010");
		Assert.assertTrue(Page3.validateDeleteIsEnabled(), "Delete Fuctionality Is Enabled");
		Page3.deleteDependent();
		Reporter.log("Dependent Deleted");
	}

	// not in scope
	/*
	 * @Test(description = "Edit Quote Summary") public void testEditQuoteSummary()
	 * {
	 * 
	 * DetailsPage Page3 = new DetailsPage(d);
	 * Assert.assertTrue(Page3.validateEditQuoteIsEnabled(),
	 * "Edit Quote Fuctionality Is Enabled"); Page3.getEditQuoteSummaryClick();
	 * Page1.getClearGetAQuote(); Page1.getEditForPage3GetQuote("INDIA",
	 * "23/03/2020", "25/03/2020", "20", "25");
	 * assertThat(Page1.getPageHeading().trim().
	 * equalsIgnoreCase("Compare Travel Insurance")); }
	 * 
	 * @Test(description = "Edit Quote Summary Cancel") public void testEditCancel()
	 * { DetailsPage Page3 = new DetailsPage(d); Page3.getEditQuoteSummaryClick();
	 * Assert.assertTrue(Page3.validateEditQuoteSummaryCancel(),
	 * "Cancel is Displayed in Edit Summary Page");
	 * Page3.getEditQuoteSummaryCancel();
	 * assertThat(Page3.getDetailsPageHeading().trim().
	 * equalsIgnoreCase("Who's Travelling?")); }
	 */
	@Test(description = "Age of Traveler must be between 18-85 if Ski/Winter Sports is opted", priority = 20)
	public void getPrimaryAgeDetails18to85SkiWinterSPorts() {
		DetailsPage Page3 = new DetailsPage(d);
		Page3.getPrimaryBtwn18And85Validation("Sowmi", "Ranjan", "23/03/2020");
		assertThat(Page3.getPrimaryAgeBetween18and85ErrorMsg()
				.equalsIgnoreCase("Age of Traveller must be between 18-110"));
		Page3.page3Reset();
	}

	@Test(description = "Age of Traveler must be between 18-85 if Ski/Winter Sports is opted", priority = 21)
	public void getSecondaryAgeDetails18to85SkiWinterSPorts() {

		DetailsPage Page3 = new DetailsPage(d);
		Page3.getSecondaryAgeBtwn18And85Validation("Sowmi", "Ranjan", "01/01/2000", "Jenifer", "Kajal", "01/02/2020");
		assertThat(Page3.getSecondaryAgeBetween18and85ErrorMsg()
				.equalsIgnoreCase("Age of Traveller must be between 18-110"));
		Page3.page3Reset();
	}

	@Test(description = "DOB MisMatch With GetAQuote", priority = 22)
	public void getDOBDetailsPageMismatchWithGetAQuote() {

		DetailsPage Page3 = new DetailsPage(d);
		Page3.getPrimaryMismatchWithPremium("Sowmi", "Ranjan", "01/01/1995");
		assertThat(Page3.getPrimaryMismatchWithPremiumErrorMsg().equalsIgnoreCase(
				"Date of Birth entered does not match the age entered. Premium may be recalculated based on the Date of Birth entered."));
		// Page3.getPrimaryMismatchWithPremiumYes();
		Page3.page3Reset();
	}

	// @Test(description = "SendEmail",priority=23)
	public void getSendEmail() {

		DetailsPage Page3 = new DetailsPage(d);
		Page3.sendACopyOfQuoteEmail("ss@gmail.com");
		assertThat(Page3.getEmailSuccessMsg().equalsIgnoreCase("Email sent successfully"));
	}

	@AfterMethod
	public void refreshBrowser() throws InterruptedException {
		DetailsPage Page3 = new DetailsPage(d);

	}

}
