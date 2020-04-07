
package com.raa.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DetailsPage extends BasePage {

	// By primaryFirstName = By.id("userFirstName");
	By primaryFirstName = By.xpath("*//input[@id='userFirstName']");

	By primaryLastName = By.xpath("//input[@id='userLastName']");
	By primaryDOB = By.xpath("//input[@id='PrimaryTravelerDateOfBirth']");

	By secondaryFirstName = By.id("adUserFirstName"); // input[@id='adUserFirstName']
	By secondaryFirstName2 = By.xpath("//input[@id='adUserFirstName']");
	By secondaryLastName = By.xpath("//input[@id='adUserLastName']");
	By secondaryDOB = By.id("adTravelerDateOfBirth");
	By dobDialogBoxYesErrorMessage = By
			.xpath("//div[@class='mat-dialog-actions']/button[span[contains(text(),'Yes')]]");
	By dobDialogBoxNoErrorMessage = By.xpath("//div[@class='mat-dialog-actions']/button[span[contains(text(),'No')]]");
	By streetAddress = By.xpath("//input[@id='userStreetAddress']");//
	By suburb = By.id("userSubUrb");
	By stateDropdown = By.xpath("//mat-select[@id='mat-select-0']//div[@class='mat-select-value']");
	By stateSelect = By.xpath("//span[text()='SA']");
	By postCode = By.id("userPostcode");
	By emailAddress = By.id("userEmailAddress");
	By confirmEmailAddress = By.id("userConfirmEmailAddress");
	By mobilePhoneNo = By.xpath("//input[@id='userPhoneNumber']");
	// By addDependent = By.xpath("//i[@class='fa fa-plus-circle pl-3']");
	By addDependent = By.xpath("//span[contains(text(),'Add Dependents')]");
	By deleteDependents = By.xpath("//*[@class='fa fa-times remove-dependents']");
	By dependentFirstName = By.xpath("//input[@id='dependentFirstName0']");
	By dependentLastName = By.xpath("//input[@id='dependentLastName0']");
	By dependentDOB = By.xpath("//input[@id='dependentAgeId0']");
	By detailPageYes = By.xpath("(//button[@id='preMedicalCondition-button'])[1]");
	By detailPageRACYes = By.xpath("(//div[contains(text(),'Yes')])[3]");

	// for Racv USe //*[contains(text(),' Confirm your details > ')]

	By confirmAndFinaliseQuote = By.xpath("//*[contains(text(),' Finalize Quote ')]");
	/*
	 * By confirmAndFinaliseQuote =
	 * By.xpath("//*[contains(text(),' Confirm your details > ')]");
	 */

	By confirmAndFinalizeQuoteRAC = By.xpath("//*[text()=' Confirm & Finalize Quote ']");

	By detailPageNo = By.xpath("(//button[@id='preMedicalCondition-button'])[2]");
	By detailPageForRACNO = By.xpath("(//div[contains(text(),'No')])[3]");
	By quoteSummaryEdit = By.xpath("//*[contains(text(),'Edit quote details')]");
	By returnTrip1 = By.xpath("//span[@class='num-text'] [contains(text(),'1')]");
	By cancelDialogBoxModel = By.xpath(
			"//div[@class='modal-dialog modal-dialog-centered modal-lg']//div[@class='modal-header']//span[contains(text(),'×')]");
	By sendACopyEmail = By.xpath("//input[@id='email']");
	By saveAndSend = By.xpath("//*[contains(text(),'SAVE AND SEND')]");

	By PDS_Condition = By.xpath("(//button[@id='privacyDisclaimerID-button'])[1]");
	By Marketing_Consent = By.xpath("(//button[@id='marketingConsentCondition-button'])[1]");

	// message

	// By primaryFirstNameFieldBlankErrorMessage =
	// By.xpath("//mat-error[@id='mat-error-0']");
	By primaryFirstNameFieldBlankErrorMessage = By
			.xpath("//*[text()='Please enter the First Name of the Primary Traveller']");
	By primaryLastNameFieldBlankErrorMessage = By
			.xpath("//*[text()=' Please enter the Last Name of the Primary Traveller ']");
	By primaryDOBFieldBlankErrorMessage = By.xpath("//*[text()=' Please enter Date of Birth ']");
	By secondaryFirstNameFieldBlankErrorMessage = By
			.xpath("//*[contains(text(),'Please enter the First Name of the Secondary Traveler')]");
	By secondaryLastNameFieldBlankErrorMessage = By
			.xpath("//*[contains(text(),'Please enter the Last Name of the Secondary Traveler')]");
	By secondaryDOBFieldBlankErrorMessage = By.xpath("//*[text()=' Please enter Date of Birth ']");
	By streetFieldBlankErrorMessage = By.xpath("//*[contains(text(),'Please enter the Street Address')]");
	By suburbFieldBlankErrorMessage = By.xpath("//*[contains(text(),'Please enter the Suburb')]");
	By stateBlankeErrorMessage = By.xpath("//*[contains(text(),'Please select the State you reside in')]");
	By postcodeFieldBlankErrrorMessage = By.xpath("//*[contains(text(),' Please enter the Postcode ')]");
	By postcodeInValidErrorMessage = By.xpath("//*[text()=' Please enter a valid Postcode ']");
	By emailFieldBlankErrorMessage = By.xpath("//*[contains(text(),' Please enter the Email Address')]");
	By emailInValidErrorMessage = By.xpath("//*[contains(text(),' Please enter a valid Email address ')]");
	By confirmFieldBlankErrorMessage = By.xpath("//*[contains(text(),' Please enter the Confirm Email Address ')]");
	By confirmEmailInValidErrorMessage = By
			.xpath("//*[contains(text(),'Please enter a valid Email address')]");
	By confirmEmailmismatchErrorMessage = By
			.xpath("//*[contains(text(),' Confirm Email address does not match with email Address ')]");

	By phoneNoFieldBlankErrorMessage = By.xpath("//*[contains(text(),' Please enter a valid Phone number ')]");
	By phoneNoValidationErrorMessage = By.xpath("//*[contains(text(),'Phone number cannot be less than 9 digits.')]");
	By dependentFirstNameFieldBlankErrorMessage = By
			.xpath("//*[contains(text(),'Please enter the First Name of the Dependent')]");
	By dependentLastNameFieldBlankErrorMessage = By
			.xpath("//*[contains(text(),'Please enter the Last Name of the Dependent')]");
	By dependentDOBErrorMessage = By.xpath("//mat-error[@id='mat-error-58']");
	// By primaryDOBAgeBetween18and85ErrorMessage = By
	// .xpath("//*[contains(text(),'Age of Traveler must be between 18-85 if
	// Ski/Winter Sports is opted')]");

	By primaryDOBAgeBetween18and85ErrorMessage = By
			.xpath("//*[contains(text(),' Age of Traveler must be between 18-110')]");
	By secondaryDOBAgeBetween18and85ErrorMessage = By
			.xpath("//*[contains(text(),' Age of Traveler must be between 18-110')]");

	By primaryDOBMismatchWithQuoteErrorMessage = By.xpath(
			"//*[contains(text(),' Date of Birth entered does not match the age entered. Premium may be recalculated based on the Date of Birth entered. ')]");

	By dobDialogBoxMismatchYes = By.xpath("//div[@class='mat-dialog-actions']/button[span[contains(text(),'Yes')]]");
	By dobDialogBoxMismatchNo = By.xpath("//div[@class='mat-dialog-actions']/button[span[contains(text(),'No')]]");

	By sendingEmailVerify = By.xpath("//div[contains(text(),' Email sent successfully ')]");
	By medicalNoConditionMessage = By.xpath("//div[@class='para-left medical-notification ng-star-inserted']");
	By navigateToPaymentPageIfNo = By.xpath("//h1[@class='jumbotron-heading']");
	// Irfan Change Continue xpath.
	/*
	 * By continueinpage2foredit = By.xpath(
	 * "//button[@class='btn btn-sm font-weight-bold continue-policy continueBG border0 btn-turqoise-color custom-theme-group-two']"
	 * );
	 */
	By continueinpage2foredit = By.xpath("//*[contains(text(),'CONTINUE')]");
	By detailsTitle = By.xpath("//h1[@class='jumbotron-heading ng-star-inserted']");

	By Edit = By.xpath("//*[@class='textsize' and contains(text(),'Edit quote details')]");

	public DetailsPage(WebDriver d) {
		super(d);
		// waitForLoader();
		// TODO Auto-generated constructor stub
	}

	public void getPrimaryTravellerFirstName(String pFirstName) {
		d.findElement(primaryFirstName).sendKeys(pFirstName);
		waitFor(2);
	}

	public void getPrimaryTravellerLastName(String pLastName) {
		d.findElement(primaryLastName).sendKeys(pLastName);
		waitFor(2);
	}

	public void getPrimaryTravellerDOB(String pDOB) {
		d.findElement(primaryDOB).sendKeys(pDOB);
		waitFor(2);
	}

	public void getSecondaryTravellerFirstName(String sFirstName) {
		d.findElement(secondaryFirstName).sendKeys(sFirstName);
		waitFor(2);
	}

	public void getSecondaryTravellerLasttName(String sLastName) {
		d.findElement(secondaryLastName).sendKeys(sLastName);
		waitFor(2);
	}

	public void getSecondaryTravellerDOB(String sDOB) {
		d.findElement(secondaryDOB).sendKeys(sDOB);
		waitFor(2);
	}

	public void getStreetAddress(String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo) {
		waitFor(4);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(8);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(4);
		d.findElement(stateDropdown).click();
		d.findElement(stateSelect).click();
		waitFor(3);
		d.findElement(postCode).sendKeys(pstCode);
		waitFor(3);
		d.findElement(emailAddress).sendKeys(emilAddress);
		waitFor(3);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		waitFor(3);
		d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
	}

	public void addDependent() {
		// ((JavascriptExecutor)d).executeScript("arguments[0].scrollIntoView();",
		// addDependent);
		ScrollForLocator(By.xpath("//h5[text()='Contact Info of Primary Traveller']"));
		waitFor(2);
		waitForVisible(addDependent);
		waitFor(5);
		d.findElement(addDependent).click();
		waitFor(5);
	}

	public boolean validateAddDependentIsEnabled() {
		waitForVisible(addDependent);
		return d.findElement(addDependent).isDisplayed();
	}

	public boolean validateDeleteIsEnabled() {
		waitForVisible(deleteDependents);
		return d.findElement(deleteDependents).isDisplayed();
	}

	public void getDependentDetails(String depFirstName, String depLastName, String depDOBName) {
		d.findElement(dependentFirstName).sendKeys(depFirstName);
		waitFor(2);
		d.findElement(dependentLastName).sendKeys(depLastName);
		waitFor(2);
		d.findElement(dependentDOB).sendKeys(depDOBName);
		waitFor(2);
	}

	public void deleteDependent() {
		// ((JavascriptExecutor)d).executeScript("arguments[0].scrollIntoView();",
		// addDependent);
		waitFor(2);
		waitForVisible(deleteDependents);
		waitFor(5);
		d.findElement(deleteDependents).click();
		waitFor(2);
	}

	public void getEditQuoteSummaryClick() {
		waitForVisible(quoteSummaryEdit);
		d.findElement(quoteSummaryEdit).click();
		// WebDriverWait wait = new WebDriverWait(d, 10);
		// WebElement editquote =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("quoteSummaryEdit")));
		// editquote.click();
	}

	public boolean validateEditQuoteIsEnabled() {
		waitForVisible(quoteSummaryEdit);
		return d.findElement(quoteSummaryEdit).isDisplayed();
	}

	/*
	 * public void getToDetailsPageAfterEdit() {
	 * d.findElement(continueinpage2foredit).click(); }
	 */

	public void getEditQuoteSummaryCancel() {
		d.findElement(cancelDialogBoxModel).click();
	}

	public boolean validateEditQuoteSummaryCancel() {
		return d.findElement(cancelDialogBoxModel).isDisplayed();
	}

	public String getDetailsPageTitle() {
		return d.findElement(detailsTitle).getText();
	}

	public void sendACopyOfQuoteEmail(String sendACpyEmail) {
		scrollBy("700");
		((JavascriptExecutor) d).executeScript("arguments[0].scrollIntoView();", sendACopyEmail);
		waitFor(2);
		waitForVisible(sendACopyEmail);
		d.findElement(sendACopyEmail).sendKeys(sendACpyEmail);
		d.findElement(saveAndSend).click();
		waitFor(5);
		Boolean flag = iselementPresent(
				By.xpath("//span[text()='Something went wrong while calling API. See the log']"));
		if (flag == true) {
			assertTrue(false, "Api is not working");
		}

	}

	public String getEmailSuccessMsg() {
		waitForVisible(sendingEmailVerify);
		return d.findElement(sendingEmailVerify).getText();
	}

	public void getNoMedicalCondition() {
		waitFor(3);
		d.findElement(detailPageNo).click();
	}

	public void getYesMedicalCondition() {
		d.findElement(detailPageYes).click();
		waitFor(2);
	}

	public void getYesMedicalCondition2() {
		waitFor(22);
		scrollBy("1400");
		d.findElement(detailPageYes).click();
	}

	public void confirmAndFinaliseQuote() {
		waitFor(5);
		d.findElement(confirmAndFinaliseQuote).click();
	}

	public void getNoMedicalConditionWithoutDependent(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress, String confirmEmilAddress, String mblPhoneNo) throws InterruptedException {
		// waitForLoader();
		waitFor(18);
		scrollBy("300");
		getPrimaryTravellerFirstName(pFirstName);
		waitFor(2);
		getPrimaryTravellerLastName(pLastName);
		waitFor(2);
		getPrimaryTravellerDOB(pDOB);
		waitFor(2);
		getSecondaryTravellerFirstName(sFirstName);
		waitFor(2);
		getSecondaryTravellerLasttName(sLastName);
		waitFor(2);
		getSecondaryTravellerDOB(sDOB);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);

	}

	public void getNoMedicalConditionWithDependent(String pFirstName, String pLastName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName)
			throws InterruptedException {

		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);

	}

	public void getYesMedicalConditionWithDependent(String pFirstName, String pLastName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
	}

	public void getYesMedicalConditionWithOutDependent(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress, String confirmEmilAddress, String mblPhoneNo) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);

	}

	public String getNoMedicalConditionErrorMessage() {
		return d.findElement(medicalNoConditionMessage).getText();
	}

	public String getToPaymaentPage() {
		waitFor(4);
		return d.findElement(navigateToPaymentPageIfNo).getText();
	}

	public void validateFname() {
		waitFor(5);
		d.findElement(primaryFirstName).click();
		waitFor(2);
		d.findElement(primaryLastName).click();
	}

	public void validateLname() {
		waitFor(15);
		scrollBy("300");
		d.findElement(primaryLastName).click();

		waitFor(2);
		d.findElement(primaryFirstName).click();
	}

	public void validateDOB() {
		waitFor(2);

		ScrollForLocator(By.xpath("//h5[text()='Primary Traveller/Member']"));
		waitFor(2);
		d.findElement(primaryDOB).sendKeys(Keys.TAB);
		waitFor(4);
		d.findElement(secondaryFirstName).click();
			}

	public void validatesecondryDOB() {
		scrollBy("20");
		waitFor(2);
		d.findElement(secondaryDOB).sendKeys(Keys.TAB);
		waitFor(4);
		d.findElement(secondaryLastName).click();
		waitFor(4);

	}

	public void validateSecondryFname() {
		waitFor(15);
		d.findElement(secondaryFirstName).click();
		waitFor(2);
		d.findElement(secondaryLastName).click();
	}

	public void validateSecondryLname() {
		waitFor(15);
		d.findElement(secondaryLastName).click();
		waitFor(2);
		d.findElement(secondaryFirstName).click();
	}

	public void getPrimaryFirstNameBlankFieldWithDependent(String pLastName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		scrollBy("200");
		waitFor(15);
		getPrimaryTravellerFirstName("test");
		waitFor(2);
		d.findElement(primaryFirstName).clear();
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		addDependent();
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}

	public String getPrimaryFirstNameBlankFieldErrorMsg() {
		return d.findElement(primaryFirstNameFieldBlankErrorMessage).getText();
	}

	public void getPrimaryLastNameBlankFieldWithDependent(String pFirstName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		waitFor(2);
		getPrimaryTravellerLastName("test");
		waitFor(2);
		d.findElement(primaryLastName).clear();
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}

	public String getPrimaryLastNameBlankFieldErrorMsg() {
		return d.findElement(primaryLastNameFieldBlankErrorMessage).getText();
	}

	public void getPrimaryDOBBlankFieldWithDependent(String pFirstName, String pLastName, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}

	public String getPrimaryDOBBlankFieldErrorMsg() {
		return d.findElement(primaryDOBFieldBlankErrorMessage).getText();
	}

	public void getSecondaryFirstNameBlankFieldWithDependent(String pFirstName, String pLastName, String pDOB,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName("test");
		d.findElement(secondaryFirstName).clear();
		waitFor(2);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
	}

	public String getSecondaryFirstNameBlankFieldErrorMsg() {
		return d.findElement(secondaryFirstNameFieldBlankErrorMessage).getText();
	}

	public void getSecondaryLastNameBlankFieldWithDependent(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerDOB(sDOB);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}

	public String getSecondaryLastNameBlankFieldErrorMsg() {
		return d.findElement(secondaryLastNameFieldBlankErrorMessage).getText();
	}

	public void getSecondaryDOBBlankFieldWithDependent(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}

	public String getSecondaryDOBBlankFieldErrorMsg() {
		return d.findElement(secondaryDOBFieldBlankErrorMessage).getText();
	}

	public void getStreetAdressFieldBlank(String pFirstName, String pLastName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String sburb, String pstCode, String emilAddress, String confirmEmilAddress,
			String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		waitFor(2);
		ScrollForLocator(By.xpath("//h5[text()='Secondary Traveller']"));
		waitFor(2);
		d.findElement(streetAddress).click();
		waitFor(2);

		d.findElement(suburb).click();
		waitFor(2);
	}

	public String getStreetFieldBlankErrorMsg() {
		return d.findElement(streetFieldBlankErrorMessage).getText();
	}

	public void getSuburbAddressFieldBlank(String pFirstName, String pLastName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {

		waitFor(2);
		d.findElement(suburb).click();
		waitFor(2);
		d.findElement(postCode).click();
		waitFor(2);
	}

	public String getSuburbFieldBlankErrorMsg() {
		return d.findElement(suburbFieldBlankErrorMessage).getText();
	}

	public void getPincodeFieldBlank(String pFirstName, String pLastName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		// ((JavascriptExecutor)d).executeScript("arguments[0].scrollIntoView();",
		// d.findElement(postCode));
		waitFor(2);
		d.findElement(postCode).click();
		waitFor(2);
		d.findElement(emailAddress).click();
		waitFor(2);
	}

	public String getPincodeFieldBlankErrorMsg() {
		return d.findElement(postcodeFieldBlankErrrorMessage).getText();
	}

	public void getPincodeInValid(String pFirstName, String pLastName, String pDOB, String sFirstName, String sLastName,
			String sDOB, String strtAddress, String sburb, String pstCode) {
		// ((JavascriptExecutor)d).executeScript("arguments[0].scrollIntoView();",
		// d.findElement(postCode));
		waitFor(2);
		d.findElement(postCode).sendKeys(pstCode);
		waitFor(5);
		d.findElement(emailAddress).click();
		waitFor(5);

	}

	public String getPincodeInValidErrorMsg() {
		return d.findElement(postcodeInValidErrorMessage).getText();
	}

	public void getEmailFieldBlank(String pFirstName, String pLastName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String confirmEmilAddress,
			String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		// ((JavascriptExecutor)d).executeScript("arguments[0].scrollIntoView();",
		// d.findElement(emailAddress));
		waitFor(2);
		waitFor(5);
		d.findElement(emailAddress).click();
		waitFor(2);
		d.findElement(confirmEmailAddress).click();
		waitFor(2);
	}

	public String getEmailFieldBlankErrorMsg() {
		return d.findElement(emailFieldBlankErrorMessage).getText();
	}

	public void getEmailInValid(String pFirstName, String pLastName, String pDOB, String sFirstName, String sLastName,
			String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress) {
		// ((JavascriptExecutor)d).executeScript("arguments[0].scrollIntoView();",
		// emailAddress);
		waitFor(2);
		d.findElement(emailAddress).sendKeys(emilAddress);
		waitFor(2);
		d.findElement(confirmEmailAddress).click();
		waitFor(5);

	}

	public String getEmailInValidErrorMsg() {
		return d.findElement(emailInValidErrorMessage).getText();
	}

	public void getConfirmEmailFieldBlank(String pFirstName, String pLastName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		// ((JavascriptExecutor)d).executeScript("arguments[0].scrollIntoView();",
		// d.findElement(confirmEmailAddress));
		waitFor(2);
		d.findElement(confirmEmailAddress).click();
		waitFor(2);
		d.findElement(mobilePhoneNo).click();
		waitFor(2);

	}

	public String getConfirmEmailFieldBlankErrorMsg() {
		return d.findElement(confirmFieldBlankErrorMessage).getText();
	}

	public void getConfirmEmailInValid(String pFirstName, String pLastName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress) {
		// ((JavascriptExecutor)d).executeScript("arguments[0].scrollIntoView();",
		// confirmEmilAddress);
		waitFor(2);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		waitFor(2);
		d.findElement(mobilePhoneNo).click();
		waitFor(2);

	}

	public String getConfirmEmailInValidErrorMsg() {
		return d.findElement(confirmEmailInValidErrorMessage).getText();
	}

	public void getEmailMismatch(String pFirstName, String pLastName, String pDOB, String sFirstName, String sLastName,
			String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress) {
		// ((JavascriptExecutor)d).executeScript("arguments[0].scrollIntoView();",
		// confirmEmilAddress);
		waitFor(2);
		waitFor(2);
		d.findElement(emailAddress).sendKeys(emilAddress);
		waitFor(2);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		waitFor(2);
		d.findElement(mobilePhoneNo).click();
		waitFor(2);

	}

	public String getEmailMismatchErrorMsg() {
		return d.findElement(confirmEmailmismatchErrorMessage).getText();
	}

	public void getMobileFieldBlank(String pFirstName, String pLastName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String depFirstName, String depLastName, String depDOBName) {
		waitFor(2);
		// ((JavascriptExecutor)d).executeScript("arguments[0].scrollIntoView();",
		// d.findElement(mobilePhoneNo));
		waitFor(2);
		d.findElement(mobilePhoneNo).click();
		waitFor(2);
		d.findElement(confirmEmailAddress).click();
		waitFor(2);

	}

	public void page3Reset() {
		d.findElement(primaryFirstName).clear();
		waitFor(2);
		d.findElement(primaryLastName).clear();
		waitFor(2);
		d.findElement(secondaryFirstName).clear();
		waitFor(2);
		d.findElement(secondaryLastName).clear();
		waitFor(2);
		d.findElement(streetAddress).clear();
		waitFor(2);
		d.findElement(suburb).clear();
		waitFor(5);
		d.findElement(postCode).clear();
		waitFor(2);
		d.findElement(emailAddress).clear();
		waitFor(5);
		d.findElement(confirmEmailAddress).clear();
		waitFor(5);
		d.findElement(mobilePhoneNo).clear();
		waitFor(2);

	}

	public boolean check() {
		Boolean flag;
		try {
			d.findElement(dependentFirstName);
			flag = true;
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}

	public String getMobileFieldBlankErrorMsg() {
		return d.findElement(phoneNoFieldBlankErrorMessage).getText();
	}

	public void getMobileInvalidNo(String pFirstName, String pLastName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo) {
		// ((JavascriptExecutor)d).executeScript("arguments[0].scrollIntoView();",
		// confirmEmilAddress);
		waitFor(2);
		waitFor(2);
		d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		waitFor(2);
		d.findElement(confirmEmailAddress).click();
		waitFor(2);

	}

	public String getMobileInvalidNoErrorMsg() {
		return d.findElement(phoneNoValidationErrorMessage).getText();
	}

	public void getPrimaryBtwn18And85Validation(String pFirstName, String pLastName, String pDOB) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
	}

	public String getPrimaryAgeBetween18and85ErrorMsg() {
		waitForVisible(primaryDOBAgeBetween18and85ErrorMessage);
		return d.findElement(primaryDOBAgeBetween18and85ErrorMessage).getText();
	}

	public void getSecondaryAgeBtwn18And85Validation(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);

	}

	public String getSecondaryAgeBetween18and85ErrorMsg() {
		waitForVisible(secondaryDOBAgeBetween18and85ErrorMessage);
		return d.findElement(secondaryDOBAgeBetween18and85ErrorMessage).getText();
	}

	public void getPrimaryMismatchWithPremium(String pFirstName, String pLastName, String pDOB) {
		d.findElement(primaryDOB).sendKeys(Keys.CONTROL + "a");
		waitFor(2);
		d.findElement(primaryDOB).sendKeys(Keys.DELETE);
		waitFor(2);
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
	}

	public String getPrimaryMismatchWithPremiumErrorMsg() {
		waitFor(5);
		waitForVisible(primaryDOBMismatchWithQuoteErrorMessage);
		return d.findElement(primaryDOBMismatchWithQuoteErrorMessage).getText();
	}

	public void getPrimaryMismatchWithPremiumYes() {
		d.findElement(dobDialogBoxMismatchYes).click();
	}

	public void getPrimaryMismatchWithPremiumNo() {
		d.findElement(dobDialogBoxMismatchNo).click();
	}

	public void pdsCondition() {
		waitFor(6);
		scrollBy("600");
		waitFor(7);
		d.findElement(PDS_Condition).click();
	}

	public void marketCondition() {
		// scrollBy("300");
		waitFor(5);
		d.findElement(Marketing_Consent).click();
	}

	public void getRACNoMedicalConditionWithoutDependent(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress, String confirmEmilAddress, String mblPhoneNo) throws InterruptedException {
		// waitForLoader();
		waitFor(10);
		scrollBy("300");
		getPrimaryTravellerFirstName(pFirstName);
		waitFor(2);
		getPrimaryTravellerLastName(pLastName);
		waitFor(2);
		getPrimaryTravellerDOB(pDOB);
		waitFor(2);
		getSecondaryTravellerFirstName(sFirstName);
		waitFor(2);
		getSecondaryTravellerLasttName(sLastName);
		waitFor(2);
		getSecondaryTravellerDOB(sDOB);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		waitFor(10);
		scrollBy("150");
		pdsCondition();
		waitFor(5);
		scrollBy("100");
		marketCondition();
		waitFor(4);
		scrollBy("500");

	}

	public void getNoRACMedicalCondition() {
		waitFor(3);
		d.findElement(detailPageForRACNO).click();
	}

	public void getYesRACMedicalCondition() {
		d.findElement(detailPageRACYes).click();
	}

	public void confirmAndFinaliseQuoteRAC() {
		scrollBy("100");
		d.findElement(confirmAndFinalizeQuoteRAC).click();
		waitForLoader();
	}

	public String getDetailsPageHeading() {
		return d.findElement(detailsTitle).getText();
	}

}
