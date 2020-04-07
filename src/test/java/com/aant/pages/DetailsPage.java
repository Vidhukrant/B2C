package com.aant.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DetailsPage extends BasePage {

	By primaryFirstName = By.id("userFirstName");
	By primaryLastName = By.cssSelector("#userLastName");
	By primaryDOB = By.id("PrimaryTravelerDateOfBirth");
	By secondaryFirstName = By.id("adUserFirstName");
	By secondaryLastName = By.id("adUserLastName");
	By secondaryDOB = By.id("adTravelerDateOfBirth");
	By dobDialogBoxYesErrorMessage = By
			.xpath("//div[@class='mat-dialog-actions']/button[span[contains(text(),'Yes')]]");
	By dobDialogBoxNoErrorMessage = By.xpath("//div[@class='mat-dialog-actions']/button[span[contains(text(),'No')]]");
	By streetAddress = By.id("userStreetAddress");
	By suburb = By.id("userSubUrb");
	By stateDropdown = By.xpath("//mat-select[@id='mat-select-0']//div[@class='mat-select-value']");
	By stateSelect = By.xpath("//span[text()='SA']");
	By postCode = By.id("userPostcode");
	By emailAddress = By.id("userEmailAddress");
	By confirmEmailAddress = By.id("userConfirmEmailAddress");
	By mobilePhoneNo = By.xpath("//input[@id='userPhoneNumber']");
	//By addDependent = By.xpath("//i[@class='fa fa-plus-circle pl-3']");
	By addDependent=By.xpath("//*[text()='Add Dependents']");
	By deleteDependents = By.xpath("//*[@class='fa fa-times remove-dependents']");
	By dependentFirstName = By.xpath("//input[@id='dependentFirstName0']");
	By dependentLastName = By.xpath("//input[@id='dependentLastName0']");
	By dependentDOB = By.xpath("//input[@id='dependentAgeId0']");
	By detailPageYes = By.xpath("(//div[contains(text(),'Yes')])[3]");
	By detailPageRACYes=By.xpath("(//div[contains(text(),'Yes')])[3]");

	By confirmAndFinaliseQuote = By.xpath("(//*[@type='submit'])[1]");
	
	By confirmAndFinalizeQuoteRAC=By.xpath("//button[@data-auto-id='ConfirmBtnText']");
	
	By detailPageNo = By.xpath("(//*[@class='mat-button-toggle-label-content'])[6]");
	By detailPageForRACNO=By.xpath("(//div[contains(text(),'No')])[4]");
	By quoteSummaryEdit = By.xpath("//*[@class='textsize']");
	By cancelDialogBoxModel = By.xpath(
			"//div[@class='modal-dialog modal-dialog-centered modal-lg']//div[@class='modal-header']//span[contains(text(),'×')]");
	By sendACopyEmail = By.xpath("//input[@id='email']");
	By saveAndSend = By.xpath("//*[contains(text(),'SAVE AND SEND')]");
	
	
	By PDS_Condition=By.xpath("//*[@data-auto-id='privacyDisclaimerIDYes']");
	By Marketing_Consent=By.xpath("//*[@data-auto-id='marketingConsentConditionYes']");

	// message

	//By primaryFirstNameFieldBlankErrorMessage = By.xpath("//mat-error[@id='mat-error-0']");
	By primaryFirstNameFieldBlankErrorMessage=By.xpath("//*[text()='Please enter the First Name of the Primary Traveller']");
	By primaryLastNameFieldBlankErrorMessage = By.xpath("//*[text()=' Please enter the Last Name of the Primary Traveller ']");
	By primaryDOBFieldBlankErrorMessage = By.xpath("//*[@data-auto-id='PrimaryTravelerDateOfBirthErrorOne']");
	By secondaryFirstNameFieldBlankErrorMessage = By
			.xpath("//*[contains(text(),' Please enter the First Name of the Secondary Traveller ')]");
	By secondaryLastNameFieldBlankErrorMessage = By
			.xpath("//*[contains(text(),'Please enter the Last Name of the Secondary Traveller')]");
	By secondaryDOBFieldBlankErrorMessage = By.xpath("//*[@data-auto-id='adTravelerDateOfBirthErrorOne']");
	By streetFieldBlankErrorMessage = By.xpath("//*[contains(text(),'Please enter the Street Address')]");
	By suburbFieldBlankErrorMessage = By.xpath("//*[contains(text(),'Please enter the Suburb')]");
	By stateBlankeErrorMessage = By.xpath("//*[contains(text(),'Please select the State you reside in')]");
	By postcodeFieldBlankErrrorMessage = By.xpath("//*[contains(text(),' Please enter the Postcode ')]");
	By postcodeInValidErrorMessage = By.xpath("//*[text()=' Please enter a valid Postcode ']");
	By emailFieldBlankErrorMessage = By.xpath("//*[contains(text(),' Please enter the Email Address')]");
	By emailInValidErrorMessage = By.xpath("//*[@data-auto-id='userEmailAddressErrorTwo']");
	By confirmFieldBlankErrorMessage = By.xpath("//*[contains(text(),' Please enter the Confirm Email Address ')]");
	By confirmEmailInValidErrorMessage = By.xpath("//*[contains(text(),' Confirm Email address does not match with email Address ')]");
	By confirmEmailmismatchErrorMessage = By
			.xpath("//*[contains(text(),' Confirm Email address does not match with email Address ')]");
	
	By phoneNoFieldBlankErrorMessage = By.xpath("//*[@data-auto-id='userPhoneNumberErrorOne']");
	By phoneNoValidationErrorMessage = By.xpath("//*[@data-auto-id='userPhoneNumberErrorTwo']");
	By dependentFirstNameFieldBlankErrorMessage = By
			.xpath("//*[contains(text(),'Please enter the First Name of the Dependent')]");
	By dependentLastNameFieldBlankErrorMessage = By
			.xpath("//*[contains(text(),'Please enter the Last Name of the Dependent')]");
	By dependentDOBErrorMessage = By.xpath("//mat-error[@id='mat-error-58']");
	//By primaryDOBAgeBetween18and85ErrorMessage = By
			//.xpath("//*[contains(text(),'Age of Traveler must be between 18-85 if Ski/Winter Sports is opted')]");
	
	By primaryDOBAgeBetween18and85ErrorMessage=By.xpath("//*[text()=' Age of Traveler must be between 18-110 ']");
	By secondaryDOBAgeBetween18and85ErrorMessage=By.xpath("//*[text()=' Age of Traveler must be between 18-110 ']");
	
	
	By primaryDOBMismatchWithQuoteErrorMessage = By.xpath("//*[contains(text(),' Date of Birth entered does not match the age entered. Premium may be recalculated based on the Date of Birth entered. ')]");
 
	By dobDialogBoxMismatchYes=By.xpath("//div[@class='mat-dialog-actions']/button[span[contains(text(),'Yes')]]");
	By dobDialogBoxMismatchNo=By.xpath("//div[@class='mat-dialog-actions']/button[span[contains(text(),'No')]]");

	By sendingEmailVerify = By.xpath("//div[contains(text(),' Email sent successfully ')]");
	By medicalNoConditionMessage = By.xpath("//div[@class='para-left medical-notification ng-star-inserted']");
	By navigateToPaymentPageIfNo = By.xpath("//h1[@class='jumbotron-heading']");

	By continueinpage2foredit = By.xpath(
			"//button[@class='btn btn-sm font-weight-bold continue-policy continueBG border0 btn-turqoise-color custom-theme-group-two']");

	By detailsTitle = By.xpath("//h1[@class='jumbotron-heading ng-star-inserted']");
	By DOBCalneder=By.xpath("//*[@fill='currentColor']");

	public DetailsPage(WebDriver d) {
		super(d);
		//waitForLoader();
		// TODO Auto-generated constructor stub
	}

	public void getPrimaryTravellerFirstName(String pFirstName) {
		waitFor(15);
		scrollBy("300");

		d.findElement(primaryFirstName).sendKeys(pFirstName);
	}

	public void getPrimaryTravellerLastName(String pLastName) {
		waitFor(15);
		scrollBy("300");

		d.findElement(primaryLastName).sendKeys(pLastName);
	}
	
	public void validateFname() {
		waitFor(15);
		scrollBy("300");
		d.findElement(primaryFirstName).click();
		waitFor(2);
		d.findElement(primaryLastName).click();
	}
	public void validateLname() {
		waitFor(17);
		scrollBy("300");
		d.findElement(primaryLastName).click();
		
		waitFor(2);
		d.findElement(primaryFirstName).click();
	}
    public void validateDOB() {
        waitFor(15);
        
        ScrollForLocator(By.xpath("//h5[text()='Primary traveller/member']"));
        waitFor(2);
        d.findElement(primaryDOB).sendKeys(Keys.TAB);
        waitFor(4);
        d.findElement(secondaryFirstName).click();;
}
    public void validatesecondryDOB() {
    	waitFor(15);
    	scrollBy("20");
        
        d.findElement(secondaryDOB).sendKeys(Keys.TAB);
        waitFor(4);
        d.findElement(secondaryLastName).click();
        waitFor(4);
    }
	public void validateSecondryFname() {
		waitFor(15);
		scrollBy("300");
		d.findElement(primaryFirstName).sendKeys("test");
		waitFor(2);
		d.findElement(primaryLastName).sendKeys("validation");
		waitFor(2);
		d.findElement(primaryDOB).sendKeys("14/02/2000");
		waitFor(4);
		d.findElement(secondaryFirstName).click();
		waitFor(2);
		d.findElement(secondaryLastName).click();
	}
	public void validateSecondryLname() {
		waitFor(15);
		scrollBy("300");
		d.findElement(primaryFirstName).sendKeys("test");
		waitFor(2);
		d.findElement(primaryLastName).sendKeys("validation");
		waitFor(2);
		d.findElement(primaryDOB).sendKeys("14/02/2000");
		waitFor(4);
		d.findElement(secondaryFirstName).sendKeys("Test2");
		waitFor(2);
		d.findElement(secondaryLastName).click();
		waitFor(2);
		d.findElement(secondaryFirstName).click();
	}

	public void getPrimaryTravellerDOB(String pDOB) {
		 waitFor(15);
	        scrollBy("300");
		d.findElement(primaryDOB).sendKeys(pDOB);
	}

	public void getSecondaryTravellerFirstName(String sFirstName) {
		 waitFor(15);
	        scrollBy("300");
		d.findElement(secondaryFirstName).sendKeys(sFirstName);
	}

	public void getSecondaryTravellerLasttName(String sLastName) {
		d.findElement(secondaryLastName).sendKeys(sLastName);
	}

	public void getSecondaryTravellerDOB(String sDOB) {
		d.findElement(secondaryDOB).sendKeys(sDOB);
	}

	public void getStreetAddress(String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo) {
		 waitFor(18);
	        scrollBy("300");
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(1);
		d.findElement(suburb).click();
		waitFor(3);
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
		waitForVisible(addDependent);
		waitFor(5);
		d.findElement(addDependent).click();
	}
	
	public boolean validateAddDependentIsEnabled()
	{
		waitForVisible(addDependent);
		return d.findElement(addDependent).isDisplayed();
	}
	
	public boolean validateDeleteIsEnabled()
	{
		waitForVisible(deleteDependents);
		return d.findElement(deleteDependents).isDisplayed();
	}

	public void getDependentDetails(String depFirstName, String depLastName, String depDOBName) {
		 waitFor(18);
	     scrollBy("300");
		d.findElement(dependentFirstName).sendKeys(depFirstName);
		d.findElement(dependentLastName).sendKeys(depLastName);
		d.findElement(dependentDOB).sendKeys(depDOBName);
	}

	public void deleteDependent() {
		waitForVisible(deleteDependents);
		waitFor(5);
		d.findElement(deleteDependents).click();
	}

	public void getEditQuoteSummaryClick() {
		waitForVisible(quoteSummaryEdit);
		d.findElement(quoteSummaryEdit).click();
		//WebDriverWait wait = new WebDriverWait(d, 10); 
		//WebElement editquote = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("quoteSummaryEdit")));
		//editquote.click();
	}
	
	public boolean validateEditQuoteIsEnabled()
	{
		waitForVisible(quoteSummaryEdit);
		return d.findElement(quoteSummaryEdit).isDisplayed();
	}

	/*public void getToDetailsPageAfterEdit() {
		d.findElement(continueinpage2foredit).click();
	}*/

	public void getEditQuoteSummaryCancel() {
		waitFor(15);
		scrollBy("300");

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
		waitForVisible(sendACopyEmail);
		d.findElement(sendACopyEmail).sendKeys(sendACpyEmail);
		d.findElement(saveAndSend).click();
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
	}
	public void getYesMedicalCondition2()
	{
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
		//waitForLoader();
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
		waitFor(15);
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
		waitFor(2);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		waitFor(2);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);

	}

	public void getYesMedicalConditionWithDependent(String pFirstName, String pLastName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
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
		waitFor(2);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
	}

	public void getYesMedicalConditionWithOutDependent(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress, String confirmEmilAddress, String mblPhoneNo) {
		waitFor(15);
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
		waitFor(2);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);

	}

	public String getNoMedicalConditionErrorMessage() {
		return d.findElement(medicalNoConditionMessage).getText();
	}

	public String getToPaymaentPage() {
		waitFor(4);
		return d.findElement(navigateToPaymentPageIfNo).getText();
	}

	public void getPrimaryFirstNameBlankFieldWithDependent(String pLastName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		waitFor(10);
		scrollBy("300");
		getPrimaryTravellerLastName(pLastName);
		waitFor(2);
		getPrimaryTravellerDOB(pDOB);
		waitFor(2);
		getSecondaryTravellerFirstName(sFirstName);
		waitFor(2);
		getSecondaryTravellerLasttName(sLastName);
		waitFor(2);
		getSecondaryTravellerDOB(sDOB);
		waitFor(2);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		addDependent();
		waitFor(2);
		getDependentDetails(depFirstName, depLastName, depDOBName);
		waitFor(2);
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
		waitFor(10);
		scrollBy("300");
		getPrimaryTravellerFirstName(pFirstName);
		waitFor(2);
		getPrimaryTravellerDOB(pDOB);
		waitFor(2);
		getSecondaryTravellerFirstName(sFirstName);
		waitFor(2);
		getSecondaryTravellerLasttName(sLastName);
		waitFor(2);
		getSecondaryTravellerDOB(sDOB);
		waitFor(2);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
		waitFor(2);
		getYesMedicalCondition();
		waitFor(2);
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}

	public String getPrimaryLastNameBlankFieldErrorMsg() {
		return d.findElement(primaryLastNameFieldBlankErrorMessage).getText();
	}

	public void getPrimaryDOBBlankFieldWithDependent(String pFirstName, String pLastName, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		waitFor(10);
		scrollBy("300");
		getPrimaryTravellerFirstName(pFirstName);
		waitFor(2);
		getPrimaryTravellerLastName(pLastName);
		waitFor(2);
		getSecondaryTravellerFirstName(sFirstName);
		waitFor(2);
		getSecondaryTravellerLasttName(sLastName);
		waitFor(2);
		getSecondaryTravellerDOB(sDOB);
		waitFor(2);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		
		waitFor(2);
		pdsCondition();
		waitFor(2);
		marketCondition();
		waitFor(2);
		getYesMedicalCondition();
		waitFor(2);
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}

	public String getPrimaryDOBBlankFieldErrorMsg() {
		return d.findElement(primaryDOBFieldBlankErrorMessage).getText();
	}

	public void getSecondaryFirstNameBlankFieldWithDependent(String pFirstName, String pLastName, String pDOB,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		waitFor(15);
		scrollBy("300");
		getPrimaryTravellerFirstName(pFirstName);
		waitFor(2);
		getPrimaryTravellerLastName(pLastName);
		waitFor(2);
		getPrimaryTravellerDOB(pDOB);
		waitFor(2);
		getSecondaryTravellerLasttName(sLastName);
		waitFor(2);
		getSecondaryTravellerDOB(sDOB);
		waitFor(2);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
		waitFor(2);
		getYesMedicalCondition();
		waitFor(2);
		confirmAndFinaliseQuote();
	}

	public String getSecondaryFirstNameBlankFieldErrorMsg() {
		return d.findElement(secondaryFirstNameFieldBlankErrorMessage).getText();
	}

	public void getSecondaryLastNameBlankFieldWithDependent(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		waitFor(15);
		scrollBy("300");
		getPrimaryTravellerFirstName(pFirstName);
		waitFor(2);
		getPrimaryTravellerLastName(pLastName);
		waitFor(2);
		getPrimaryTravellerDOB(pDOB);
		waitFor(2);
		getSecondaryTravellerFirstName(sFirstName);
		waitFor(2);
		getSecondaryTravellerDOB(sDOB);
		waitFor(2);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
		waitFor(2);
		getYesMedicalCondition();
		waitFor(2);
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}

	public String getSecondaryLastNameBlankFieldErrorMsg() {
		return d.findElement(secondaryLastNameFieldBlankErrorMessage).getText();
	}

	public void getSecondaryDOBBlankFieldWithDependent(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		waitFor(15);
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
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		waitFor(2);
		pdsCondition();
		waitFor(2);
		marketCondition();
		waitFor(2);
		getYesMedicalCondition();
		waitFor(2);
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}

	public String getSecondaryDOBBlankFieldErrorMsg() {
		return d.findElement(secondaryDOBFieldBlankErrorMessage).getText();
	}

	public void getStreetAdressFieldBlank(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		waitFor(15);
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
		waitFor(4);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(4);
		d.findElement(stateDropdown).click();
		waitFor(2);
		d.findElement(stateSelect).click();
		waitFor(2);
		d.findElement(postCode).sendKeys(pstCode);
		waitFor(2);
		d.findElement(emailAddress).sendKeys(emilAddress);
		waitFor(2);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		waitFor(2);
		d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
		waitFor(2);
		getYesMedicalCondition();
		waitFor(2);
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}

	public String getStreetFieldBlankErrorMsg()
	{
	return d.findElement(streetFieldBlankErrorMessage).getText();
	}
	public void getSuburbAddressFieldBlank(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
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
		waitFor(2);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(3);
		d.findElement(suburb).click();
		
		waitFor(3);
		d.findElement(stateDropdown).click();
		/*waitFor(5);
		d.findElement(stateSelect).click();
		waitFor(5);
		d.findElement(postCode).sendKeys(pstCode);
		d.findElement(emailAddress).sendKeys(emilAddress);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		//addDependent();
		//getDependentDetails(depFirstName, depLastName, depDOBName);
		waitFor(2);
		getYesMedicalCondition();
		waitFor(2);
		confirmAndFinaliseQuote();
		scrollBy("-800");*/
	}
	public String getSuburbFieldBlankErrorMsg()
	{
	return d.findElement(suburbFieldBlankErrorMessage).getText();
	}
	public void getPincodeFieldBlank(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		waitFor(15);
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
		waitFor(4);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(4);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(2);
		d.findElement(stateDropdown).click();
		waitFor(2);
		d.findElement(stateSelect).click();
		waitFor(2);
		d.findElement(emailAddress).sendKeys(emilAddress);
		waitFor(2);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		waitFor(2);
		d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		waitFor(2);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
		waitFor(2);
		getYesMedicalCondition();
		waitFor(2);
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}
	public String getPincodeFieldBlankErrorMsg()
	{
	return d.findElement(postcodeFieldBlankErrrorMessage).getText();
	}
	
	public void getPincodeInValid(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB,String strtAddress, String sburb, String pstCode) {
		waitFor(15);
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
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(5);
		d.findElement(stateDropdown).click();
		d.findElement(stateSelect).click();
		d.findElement(postCode).sendKeys(pstCode);
		d.findElement(emailAddress).click();
		scrollBy("-800");
		
	}
	public String getPincodeInValidErrorMsg()
	{
	return d.findElement(postcodeInValidErrorMessage).getText();
	}
	public void getEmailFieldBlank(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		waitFor(15);
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
		waitFor(2);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(3);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(2);
		d.findElement(stateDropdown).click();
		waitFor(5);
		d.findElement(stateSelect).click();
		waitFor(5);
		d.findElement(postCode).sendKeys(pstCode);
		waitFor(5);
		d.findElement(emailAddress).click();
		waitFor(2);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		/*d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");*/
	}
	public String getEmailFieldBlankErrorMsg()
	{
	return d.findElement(emailFieldBlankErrorMessage).getText();
	}
	public void getEmailInValid(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress) {
		waitFor(15);
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
		waitFor(2);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(2);
		d.findElement(stateDropdown).click();
		waitFor(2);
		d.findElement(stateSelect).click();
		waitFor(2);
		d.findElement(postCode).sendKeys(pstCode);
		d.findElement(emailAddress).sendKeys(emilAddress);
		d.findElement(confirmEmailAddress).click();
		scrollBy("-800");
}
	public String getEmailInValidErrorMsg()
	{
	return d.findElement(emailInValidErrorMessage).getText();
	}
	
	
	public void getConfirmEmailFieldBlank(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		waitFor(11);
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
		waitFor(2);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(3);
		d.findElement(stateDropdown).click();
		waitFor(2);
		d.findElement(stateSelect).click();
		waitFor(3);
		d.findElement(postCode).sendKeys(pstCode);
		d.findElement(emailAddress).sendKeys(emilAddress);
		waitFor(5);
		d.findElement(confirmEmailAddress).click();
		waitFor(2);
		d.findElement(emailAddress).click();
        /*d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");*/
	}
	
	public String getConfirmEmailFieldBlankErrorMsg()
	{
	return d.findElement(confirmFieldBlankErrorMessage).getText();
	}
	
	public void getConfirmEmailInValid(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress,String confirmEmilAddress) {
		waitFor(15);
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
		waitFor(2);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(3);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(2);
		d.findElement(stateDropdown).click();
		waitFor(2);
		d.findElement(stateSelect).click();
		waitFor(2);
		d.findElement(postCode).sendKeys(pstCode);
		waitFor(2);
		d.findElement(emailAddress).sendKeys(emilAddress);
		waitFor(2);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		d.findElement(mobilePhoneNo).click();
		scrollBy("-800");
	}
	public String getConfirmEmailInValidErrorMsg()
	{
	return d.findElement(confirmEmailInValidErrorMessage).getText();
	}
	
	public void getEmailMismatch(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress,String confirmEmilAddress) {
		waitFor(15);
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
		waitFor(2);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(5);
		d.findElement(stateDropdown).click();
		waitFor(5);
		d.findElement(stateSelect).click();
		waitFor(5);
		d.findElement(postCode).sendKeys(pstCode);
		d.findElement(emailAddress).sendKeys(emilAddress);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		d.findElement(mobilePhoneNo).click();
		scrollBy("-800");
}
	public String getEmailMismatchErrorMsg()
	{
	return d.findElement(confirmEmailmismatchErrorMessage).getText();
	}
	public void getMobileFieldBlank(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress,String confirmEmilAddress, String depFirstName, String depLastName, String depDOBName) {
		waitFor(15);
		scrollBy("550");
		/*getPrimaryTravellerFirstName(pFirstName);
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
		waitFor(2);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(3);
		d.findElement(stateDropdown).click();
		waitFor(3);
		d.findElement(stateSelect).click();
		waitFor(2);
		d.findElement(postCode).sendKeys(pstCode);
		d.findElement(emailAddress).sendKeys(emilAddress);
		waitFor(2);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		waitFor(2);*/
		d.findElement(mobilePhoneNo).click();
		waitFor(2);
		d.findElement(confirmEmailAddress).click();
		
	}
	public String getMobileFieldBlankErrorMsg()
	{
	return d.findElement(phoneNoFieldBlankErrorMessage).getText();
	}
	
	public void getMobileInvalidNo(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress,String confirmEmilAddress,String mblPhoneNo) {
		waitFor(15);
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
		waitFor(2);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(3);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(2);
		d.findElement(stateDropdown).click();
		waitFor(2);
		d.findElement(stateSelect).click();
		waitFor(2);
		d.findElement(postCode).sendKeys(pstCode);
		waitFor(2);
		d.findElement(emailAddress).sendKeys(emilAddress);
		waitFor(2);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		waitFor(2);
		d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		d.findElement(confirmEmailAddress).click();
		//getYesMedicalCondition();
		//confirmAndFinaliseQuote();
		scrollBy("-800");
	}
	
	public String getMobileInvalidNoErrorMsg()
	{
	return d.findElement(phoneNoValidationErrorMessage).getText();
	}

	public void getPrimaryBtwn18And85Validation(String pFirstName, String pLastName, String pDOB) 
	{   waitFor(15);
	scrollBy("300");
        getPrimaryTravellerFirstName(pFirstName);
        waitFor(2);
     	getPrimaryTravellerLastName(pLastName);
     	waitFor(2);
		getPrimaryTravellerDOB(pDOB);
}
	
	public String getPrimaryAgeBetween18and85ErrorMsg()
	{
	waitForVisible(primaryDOBAgeBetween18and85ErrorMessage);
	return d.findElement(primaryDOBAgeBetween18and85ErrorMessage).getText();
	}
	public void getSecondaryAgeBtwn18And85Validation(String pFirstName, String pLastName, String pDOB,String sFirstName,String sLastName,String sDOB) 
	{   waitFor(15);
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
		
   }
	public String getSecondaryAgeBetween18and85ErrorMsg()
	{
	waitForVisible(secondaryDOBAgeBetween18and85ErrorMessage);
	return d.findElement(secondaryDOBAgeBetween18and85ErrorMessage).getText();
	}
	
	public void getPrimaryMismatchWithPremium(String pFirstName, String pLastName, String pDOB) 
	{   waitFor(15);
	scrollBy("300");
        getPrimaryTravellerFirstName(pFirstName);
        waitFor(2);
     	getPrimaryTravellerLastName(pLastName);
     	waitFor(2);
		getPrimaryTravellerDOB(pDOB);
}
	
	public String getPrimaryMismatchWithPremiumErrorMsg()
	{   
		waitFor(5);
		waitForVisible(primaryDOBMismatchWithQuoteErrorMessage);	
		return d.findElement(primaryDOBMismatchWithQuoteErrorMessage).getText();
	}
	
	public void getPrimaryMismatchWithPremiumYes()
	{
		d.findElement(dobDialogBoxMismatchYes).click();
	}
	
	public void getPrimaryMismatchWithPremiumNo()
	{
		d.findElement(dobDialogBoxMismatchNo).click();
	}
	
	public void pdsCondition()
	{
		waitFor(6);
		scrollBy("600");
		waitFor(7);
		d.findElement(PDS_Condition).click();
		}
	
	public void marketCondition()
	{
		waitFor(5);
		scrollBy("300");
		d.findElement(Marketing_Consent).click();	
	}
	public void getRACNoMedicalConditionWithoutDependent(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress, String confirmEmilAddress, String mblPhoneNo) throws InterruptedException {
		//waitForLoader();
        waitFor(15);
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
    	 waitFor(3);
    	scrollBy("100");
		d.findElement(confirmAndFinalizeQuoteRAC).click();
	}
	
     public String getDetailsPageHeading()
     {
    	 return d.findElement(detailsTitle).getText();
     }
     
}
