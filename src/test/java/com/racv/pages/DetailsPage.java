package com.racv.pages;

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
	By secondaryFirstName2 = By.xpath("//input[@id='adUserFirstName']");
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
	By addDependent=By.xpath("//span[contains(text(),'Add Dependents')]");
	By deleteDependents = By.xpath("//*[@class='fa fa-times remove-dependents']");
	By dependentFirstName = By.xpath("//input[@id='dependentFirstName0']");
	By dependentLastName = By.xpath("//input[@id='dependentLastName0']");
	By dependentDOB = By.xpath("//input[@id='dependentAgeId0']");
	By detailPageYes = By.xpath("//div[contains(text(),'Yes')]");
	By detailPageRACYes=By.xpath("(//div[contains(text(),'Yes')])[3]");
	
	// for Racv USe //*[contains(text(),' Confirm your details > ')]

	By confirmAndFinaliseQuote = By.xpath("//*[contains(text(),' CONFIRM & FINALISE QUOTE')]");
	/*By confirmAndFinaliseQuote = By.xpath("//*[contains(text(),' Confirm your details > ')]");*/
	
	By confirmAndFinalizeQuoteRAC=By.xpath("//*[text()=' Confirm & Finalize Quote ']");
	By confirmAndFinalizeQuoteRACV=By.xpath("//*[text()=' CONFIRM & FINALISE QUOTE ']");
	
	By detailPageNo = By.xpath("//div[contains(text(),'No')]");
	By detailPageForRACNO=By.xpath("(//div[contains(text(),'No')])[4]");
	By detailPageForRACVNO=By.xpath("(//div[contains(text(),'No')])");
	By quoteSummaryEdit = By.xpath("//*[contains(text(),'Edit quote details')]");
	By returnTrip1 =By.xpath("//span[@class='num-text'] [contains(text(),'1')]");
	By cancelDialogBoxModel = By.xpath(
			"//div[@class='modal-dialog modal-dialog-centered modal-lg']//div[@class='modal-header']//span[contains(text(),'×')]");
	By sendACopyEmail = By.xpath("//input[@id='email']");
	By saveAndSend = By.xpath("//*[contains(text(),'SAVE AND SEND')]");
	
	
	By PDS_Condition=By.xpath("(//button[@id='privacyDisclaimerID-button'])[1]");
	//By Marketing_Consent=By.xpath("(//button[@id='marketingConsentCondition-button'])[1]"); @Change
	By Marketing_Consent=By.xpath("(//button[@id='marketingConsentCondition-button'])[1]");

	// message

	//By primaryFirstNameFieldBlankErrorMessage = By.xpath("//mat-error[@id='mat-error-0']");
	By primaryFirstNameFieldBlankErrorMessage=By.xpath("//*[text()='Please enter the First Name of the Primary Traveller']");
	By primaryLastNameFieldBlankErrorMessage = By.xpath("//*[text()=' Please enter the Last Name of the Primary Traveller ']");
	By primaryDOBFieldBlankErrorMessage = By.xpath("//*[text()=' Please enter Date of Birth ']");
	By secondaryFirstNameFieldBlankErrorMessage = By
			.xpath("//*[contains(text(),' Please enter the First Name of the Secondary Traveller ')]");
	By secondaryLastNameFieldBlankErrorMessage = By
			.xpath("//*[contains(text(),'Please enter the Last Name of the Secondary Traveller')]");
	By secondaryDOBFieldBlankErrorMessage = By.xpath("//*[text()=' Please enter Date of Birth ']");
	By streetFieldBlankErrorMessage = By.xpath("//*[contains(text(),'Please enter the Street Address')]");
	By suburbFieldBlankErrorMessage = By.xpath("//*[contains(text(),'Please enter the Suburb')]");
	By stateBlankeErrorMessage = By.xpath("//*[contains(text(),'Please select the State you reside in')]");
	By postcodeFieldBlankErrrorMessage = By.xpath("//*[contains(text(),' Please enter the Postcode ')]");
	By postcodeInValidErrorMessage = By.xpath("//*[text()=' Please enter a valid Postcode that matches the state ']");
	By emailFieldBlankErrorMessage = By.xpath("//*[contains(text(),' Please enter the Email Address')]");
	By emailInValidErrorMessage = By.xpath("//*[contains(text(),' Please enter a valid Email address ')]");
	By confirmFieldBlankErrorMessage = By.xpath("//*[contains(text(),' Please enter the Confirm Email Address ')]");
	By confirmEmailInValidErrorMessage = By.xpath("//*[contains(text(),' Confirm Email address does not match with email Address ')]");
	By confirmEmailmismatchErrorMessage = By
			.xpath("//*[contains(text(),' Confirm Email address does not match with email Address ')]");
	
	By phoneNoFieldBlankErrorMessage = By.xpath("//*[contains(text(),' Please enter a valid Phone number ')]");
	By phoneNoValidationErrorMessage = By.xpath("//*[contains(text(),'Phone number cannot be less than 10 digits.')]");
	By dependentFirstNameFieldBlankErrorMessage = By
			.xpath("//*[contains(text(),'Please enter the First Name of the Dependent')]");
	By dependentLastNameFieldBlankErrorMessage = By
			.xpath("//*[contains(text(),'Please enter the Last Name of the Dependent')]");
	By dependentDOBErrorMessage = By.xpath("//mat-error[@id='mat-error-58']");
	//By primaryDOBAgeBetween18and85ErrorMessage = By
			//.xpath("//*[contains(text(),'Age of Traveler must be between 18-85 if Ski/Winter Sports is opted')]");
	
	By primaryDOBAgeBetween18and85ErrorMessage=By.xpath("//*[contains(text(),'Age of Traveler must be between 18-110')]");
	By secondaryDOBAgeBetween18and85ErrorMessage=By.xpath("//*[contains(text(),'Age of Traveler must be between 18-110')]");
	
	
	By primaryDOBMismatchWithQuoteErrorMessage = By.xpath("//*[contains(text(),' Date of Birth entered does not match the age entered. Premium may be recalculated based on the Date of Birth entered. ')]");
 
	By dobDialogBoxMismatchYes=By.xpath("//div[@class='mat-dialog-actions']/button[span[contains(text(),'Yes')]]");
	By dobDialogBoxMismatchNo=By.xpath("//div[@class='mat-dialog-actions']/button[span[contains(text(),'No')]]");

	By sendingEmailVerify = By.xpath("//div[contains(text(),' Email sent successfully ')]");
	By medicalNoConditionMessage = By.xpath("//div[@class='para-left medical-notification ng-star-inserted']");
	By navigateToPaymentPageIfNo = By.xpath("//h1[@class='jumbotron-heading']");
// Irfan Change Continue xpath.
	/*By continueinpage2foredit = By.xpath(
			"//button[@class='btn btn-sm font-weight-bold continue-policy continueBG border0 btn-turqoise-color custom-theme-group-two']");
*/
	By continueinpage2foredit = By.xpath("//*[contains(text(),'CONTINUE')]");
	By detailsTitle = By.xpath("//h1[@class='jumbotron-heading ng-star-inserted']");

	public DetailsPage(WebDriver d) {
		super(d);
		//waitForLoader();
		// TODO Auto-generated constructor stub
	}

	public void getPrimaryTravellerFirstName(String pFirstName) {
		d.findElement(primaryFirstName).sendKeys(pFirstName);
	}

	public void getPrimaryTravellerLastName(String pLastName) {
		d.findElement(primaryLastName).sendKeys(pLastName);
	}

	public void getPrimaryTravellerDOB(String pDOB) {
		d.findElement(primaryDOB).sendKeys(pDOB);
	}

	public void getSecondaryTravellerFirstName(String sFirstName) {
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
		waitForVisible(addDependent);
		waitFor(8);
		d.findElement(addDependent).click();
	}
	
	public boolean validateAddDependentIsEnabled()
	{
		waitForVisible(addDependent);
		waitFor(3);
		return d.findElement(addDependent).isDisplayed();
	}
	
	public boolean validateDeleteIsEnabled()
	{
		waitForVisible(deleteDependents);
		waitFor(7);
		return d.findElement(deleteDependents).isDisplayed();
	}

	public void getDependentDetails(String depFirstName, String depLastName, String depDOBName) {
		waitFor(5);
		d.findElement(dependentFirstName).sendKeys(depFirstName);
		d.findElement(dependentLastName).sendKeys(depLastName);
		waitFor(3);
		d.findElement(dependentDOB).sendKeys(depDOBName);
	}

	public void deleteDependent() {
		waitForVisible(deleteDependents);
		waitFor(5);
		d.findElement(deleteDependents).click();
	}

	public void getEditQuoteSummaryClick() {
		waitForVisible(quoteSummaryEdit);
		waitFor(5);
		d.findElement(quoteSummaryEdit).click();
		waitFor(5);
		d.findElement(returnTrip1).click();
		waitFor(5);
		//WebDriverWait wait = new WebDriverWait(d, 10); 
		//WebElement editquote = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("quoteSummaryEdit")));
		//editquote.click();
	}
	
	public boolean validateEditQuoteIsEnabled()
	{
		waitForVisible(quoteSummaryEdit);
		waitFor(3);
		return d.findElement(quoteSummaryEdit).isDisplayed();
	}

	/*public void getToDetailsPageAfterEdit() {
		d.findElement(continueinpage2foredit).click();
	}*/

	public void getEditQuoteSummaryCancel() {
		waitFor(3);
		d.findElement(cancelDialogBoxModel).click();
	}
	public boolean validateEditQuoteSummaryCancel() {
		waitFor(3);
		return d.findElement(cancelDialogBoxModel).isDisplayed();
	}

	public String getDetailsPageTitle() {
		return d.findElement(detailsTitle).getText();
	}

	public void sendACopyOfQuoteEmail(String sendACpyEmail) {
		scrollBy("700");
		waitFor(8);
		waitForVisible(sendACopyEmail);
		d.findElement(sendACopyEmail).sendKeys(sendACpyEmail);
		d.findElement(saveAndSend).click();
	}

	public String getEmailSuccessMsg() {
		waitForVisible(sendingEmailVerify);
		waitFor(7);
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
		waitFor(5);
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

	public void getPrimaryFirstNameBlankFieldWithDependent(String pLastName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		waitFor(10);
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
		waitFor(2);
		getYesMedicalCondition();
		waitFor(2);
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}
	
	public void validateDOB() {
		waitFor(5);
		d.findElement(primaryFirstName).sendKeys("test");
		waitFor(2);
		d.findElement(primaryLastName).sendKeys("validation");
		waitFor(2);
		d.findElement(primaryDOB).click();
		d.findElement(primaryDOB).sendKeys(Keys.TAB);
		waitFor(4);
		//d.findElement(secondaryFirstName).click();
	} 
	public void validateSecondryFirstName() {
		waitFor(5);
		d.findElement(primaryFirstName).sendKeys("test");
		waitFor(2);
		d.findElement(primaryLastName).sendKeys("validation");
		waitFor(2);
		d.findElement(primaryDOB).sendKeys("03/01/2000");
		d.findElement(primaryDOB).sendKeys(Keys.TAB);
		waitFor(4);
		d.findElement(secondaryFirstName).click();
		d.findElement(secondaryFirstName).sendKeys(Keys.TAB);
		waitFor(4);
		d.findElement(secondaryLastName).click();
		waitFor(2);
		d.findElement(secondaryLastName).sendKeys(Keys.TAB);
		d.findElement(secondaryDOB).sendKeys("03/01/1995");
		waitFor(2);
		d.findElement(secondaryDOB).sendKeys(Keys.TAB);
		waitFor(5);		
	} 
	public void validateSecondryLastName() {
		waitFor(5);
		d.findElement(primaryFirstName).sendKeys("test");
		waitFor(2);
		d.findElement(primaryLastName).sendKeys("validation");
		waitFor(2);
		d.findElement(primaryDOB).sendKeys("03/01/2000");
		d.findElement(primaryDOB).sendKeys(Keys.TAB);
		waitFor(4);
		d.findElement(secondaryFirstName).sendKeys("Rajan");
		d.findElement(secondaryFirstName).sendKeys(Keys.TAB);
		waitFor(4);
		d.findElement(secondaryLastName).click();
		waitFor(2);
		d.findElement(secondaryLastName).sendKeys(Keys.TAB);
		d.findElement(secondaryDOB).click();
		waitFor(2);
		d.findElement(secondaryDOB).sendKeys(Keys.TAB);
		d.findElement(secondaryFirstName).sendKeys("Rajan");
		waitFor(5);	
		
	} 
	public void validateSecondryStreetAdd() 
	{
		waitFor(5);
		d.findElement(primaryFirstName).sendKeys("test");
		waitFor(2);
		d.findElement(primaryLastName).sendKeys("validation");
		waitFor(2);
		d.findElement(primaryDOB).sendKeys("03/01/2000");
		d.findElement(primaryDOB).sendKeys(Keys.TAB);
		waitFor(4);		
		d.findElement(secondaryFirstName).sendKeys("Rajan");		
		d.findElement(secondaryFirstName).sendKeys(Keys.TAB);
		waitFor(4);
		d.findElement(secondaryLastName).sendKeys("Swami");
		waitFor(2);
		d.findElement(secondaryLastName).sendKeys(Keys.TAB);
		d.findElement(secondaryDOB).click();
		waitFor(2);
		d.findElement(secondaryDOB).sendKeys("03/01/1995");
		waitFor(2);
		d.findElement(streetAddress).click();
		d.findElement(streetAddress).sendKeys(Keys.TAB);
		waitFor(5);
		d.findElement(primaryFirstName).click();
		
		waitFor(5);	
		
	} 
	
	public void validateFname() {
		waitFor(5);
		d.findElement(primaryFirstName).click();
		waitFor(2);
		d.findElement(primaryLastName).click();
	}
	public void validateLname() {
		waitFor(5);
		d.findElement(primaryLastName).click();
		
		waitFor(2);
		d.findElement(primaryFirstName).click();
	}

	public String getPrimaryFirstNameBlankFieldErrorMsg() {
		waitFor(7);
		return d.findElement(primaryFirstNameFieldBlankErrorMessage).getText();
	}

	public void getPrimaryLastNameBlankFieldWithDependent(String pFirstName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerDOB(pDOB);
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

	public String getPrimaryLastNameBlankFieldErrorMsg() {
		waitFor(7);
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
		waitFor(7);
		return d.findElement(primaryDOBFieldBlankErrorMessage).getText();
	}

	public void getSecondaryFirstNameBlankFieldWithDependent(String pFirstName, String pLastName, String pDOB,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		waitFor(3);
		getPrimaryTravellerLastName(pLastName);
		waitFor(3);
		getPrimaryTravellerDOB(pDOB);
		waitFor(3);
		getSecondaryTravellerLasttName(sLastName);
		waitFor(3);
		getSecondaryTravellerDOB(sDOB);
		waitFor(3);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		waitFor(3);
		addDependent();
		waitFor(3);
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		waitFor(3);
		confirmAndFinaliseQuote();
	}

	public String getSecondaryFirstNameBlankFieldErrorMsg() {
		waitFor(8);
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
		waitFor(8);
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
		waitFor(7);
		return d.findElement(secondaryDOBFieldBlankErrorMessage).getText();
	}

	public void getStreetAdressFieldBlank(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		waitFor(3);
		getPrimaryTravellerLastName(pLastName);
		waitFor(3);
		getPrimaryTravellerDOB(pDOB);
		waitFor(3);
		getSecondaryTravellerFirstName(sFirstName);
		waitFor(3);
		getSecondaryTravellerLasttName(sLastName);
		waitFor(3);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(3);
		d.findElement(stateDropdown).click();
		waitFor(3);
		d.findElement(stateSelect).click();
		d.findElement(postCode).sendKeys(pstCode);
		waitFor(3);
		d.findElement(emailAddress).sendKeys(emilAddress);
		waitFor(3);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		waitFor(3);
		addDependent();
		waitFor(3);
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
		waitFor(5);
	}

	public String getStreetFieldBlankErrorMsg()
	{
	waitFor(7);
	return d.findElement(streetFieldBlankErrorMessage).getText();
	}
	public void getSuburbAddressFieldBlank(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(stateDropdown).click();
		waitFor(5);
		d.findElement(stateSelect).click();
		waitFor(5);
		d.findElement(postCode).sendKeys(pstCode);
		d.findElement(emailAddress).sendKeys(emilAddress);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		waitFor(5);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
		waitFor(5);
		getYesMedicalCondition();
		waitFor(5);
		confirmAndFinaliseQuote();
		scrollBy("-800");
		waitFor(5);
	}
	public String getSuburbFieldBlankErrorMsg()
	{
	waitFor(7);
	return d.findElement(suburbFieldBlankErrorMessage).getText();
	}
	public void getPincodeFieldBlank(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		waitFor(3);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		waitFor(3);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(3);
		d.findElement(suburb).sendKeys(sburb);
		d.findElement(stateDropdown).click();
		waitFor(3);
		d.findElement(stateSelect).click();
		d.findElement(emailAddress).sendKeys(emilAddress);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		waitFor(3);
		d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		waitFor(3);
		addDependent();
		waitFor(3);
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}
	public String getPincodeFieldBlankErrorMsg()
	{
		waitFor(10);
	return d.findElement(postcodeFieldBlankErrrorMessage).getText();
	}
	
	public void getPincodeInValid(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB,String strtAddress, String sburb, String pstCode) {
		waitFor(10);
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(5);
		d.findElement(stateDropdown).click();
		d.findElement(stateSelect).click();
		waitFor(3);
		d.findElement(postCode).sendKeys(pstCode);
		waitFor(3);
		d.findElement(emailAddress).click();
		scrollBy("-800");
		
	}
	public String getPincodeInValidErrorMsg()
	{
		waitFor(3);
	return d.findElement(postcodeInValidErrorMessage).getText();
	}
	public void getEmailFieldBlank(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		waitFor(8);
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		waitFor(3);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		waitFor(3);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(suburb).sendKeys(sburb);
		d.findElement(stateDropdown).click();
		waitFor(5);
		d.findElement(stateSelect).click();
		waitFor(5);
		d.findElement(postCode).sendKeys(pstCode);
		waitFor(5);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		waitFor(3);
		addDependent();
		waitFor(3);
		getDependentDetails(depFirstName, depLastName, depDOBName);
		waitFor(3);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}
	public String getEmailFieldBlankErrorMsg()
	{
		waitFor(5);
	return d.findElement(emailFieldBlankErrorMessage).getText();
	}
	public void getEmailInValid(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
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
		waitFor(3);
		d.findElement(confirmEmailAddress).click();
		scrollBy("-800");
}
	public String getEmailInValidErrorMsg()
	{
		waitFor(5);
	return d.findElement(emailInValidErrorMessage).getText();
	}
	
	
	public void getConfirmEmailFieldBlank(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(5);
		d.findElement(stateDropdown).click();
		d.findElement(stateSelect).click();
		waitFor(5);
		d.findElement(postCode).sendKeys(pstCode);
		d.findElement(emailAddress).sendKeys(emilAddress);
		waitFor(5);
        d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
        waitFor(3);
		addDependent();
		waitFor(3);
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}
	
	public String getConfirmEmailFieldBlankErrorMsg()
	{
		waitFor(10);
	return d.findElement(confirmFieldBlankErrorMessage).getText();
	}
	
	public void getConfirmEmailInValid(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress,String confirmEmilAddress) {
		waitFor(10);
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(5);
		d.findElement(stateDropdown).click();
		waitFor(5);
		d.findElement(stateSelect).click();
		waitFor(5);
		d.findElement(postCode).sendKeys(pstCode);
		waitFor(5);
		d.findElement(emailAddress).sendKeys(emilAddress);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		d.findElement(mobilePhoneNo).click();
		scrollBy("-800");
	}
	public String getConfirmEmailInValidErrorMsg()
	{
	waitFor(5);
	return d.findElement(confirmEmailInValidErrorMessage).getText();
	
	}
	
	public void getEmailMismatch(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress,String confirmEmilAddress) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
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
		waitFor(3);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		d.findElement(mobilePhoneNo).click();
		scrollBy("-800");
}
	public String getEmailMismatchErrorMsg()
	{
	waitFor(5);
	return d.findElement(confirmEmailmismatchErrorMessage).getText();
	}
	public void getMobileFieldBlank(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress,String confirmEmilAddress, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
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
		waitFor(5);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		waitFor(3);
		addDependent();
		waitFor(3);
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
	}
	public String getMobileFieldBlankErrorMsg()
	{
		waitFor(5);
	return d.findElement(phoneNoFieldBlankErrorMessage).getText();
	}
	
	public void getMobileInvalidNo(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress,String confirmEmilAddress,String mblPhoneNo) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(5);
		d.findElement(stateDropdown).click();
		waitFor(5);
		d.findElement(stateSelect).click();
		waitFor(5);
		d.findElement(postCode).sendKeys(pstCode);
		waitFor(5);
		d.findElement(emailAddress).sendKeys(emilAddress);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}
	
	public String getMobileInvalidNoErrorMsg()
	{
	waitFor(5);
	return d.findElement(phoneNoValidationErrorMessage).getText();
	}

	public void getPrimaryBtwn18And85Validation(String pFirstName, String pLastName, String pDOB) 
	{
		waitFor(8);
        getPrimaryTravellerFirstName(pFirstName);
     	getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
}
	
	public String getPrimaryAgeBetween18and85ErrorMsg()
	{
	waitForVisible(primaryDOBAgeBetween18and85ErrorMessage);
	waitFor(7);
	return d.findElement(primaryDOBAgeBetween18and85ErrorMessage).getText();
	}
	public void getSecondaryAgeBtwn18And85Validation(String pFirstName, String pLastName, String pDOB,String sFirstName,String sLastName,String sDOB) 
	{
		waitFor(8);
        getPrimaryTravellerFirstName(pFirstName);
     	getPrimaryTravellerLastName(pLastName);
     	waitFor(5);
		getPrimaryTravellerDOB(pDOB);
		waitFor(3);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		waitFor(5);
		getSecondaryTravellerDOB(sDOB);
		
   }
	public String getSecondaryAgeBetween18and85ErrorMsg()
	{
	waitForVisible(secondaryDOBAgeBetween18and85ErrorMessage);
	waitFor(7);
	return d.findElement(secondaryDOBAgeBetween18and85ErrorMessage).getText();
	}
	
	public void getPrimaryMismatchWithPremium(String pFirstName, String pLastName, String pDOB) 
	{
		waitFor(10);
        getPrimaryTravellerFirstName(pFirstName);
     	getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
}
	
	public String getPrimaryMismatchWithPremiumErrorMsg()
	{   
		waitFor(10);
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
		waitFor(10);
		d.findElement(PDS_Condition).click();
		waitFor(5);
		}
	
	public void marketCondition()
	{
		//scrollBy("300");
		waitFor(10);
		d.findElement(Marketing_Consent).click();	
	}
	public void getRACNoMedicalConditionWithoutDependent(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress, String confirmEmilAddress, String mblPhoneNo) throws InterruptedException {
		//waitForLoader();
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
		d.findElement(detailPageForRACVNO).click();
	}

	public void getYesRACMedicalCondition() {
		d.findElement(detailPageRACYes).click();
	}
	
	//Irfan Change Xpath Name.
     public void confirmAndFinaliseQuoteRAC() {
    	scrollBy("100");
    	waitFor(4);
		d.findElement(confirmAndFinalizeQuoteRACV).click();
	}
	
     public String getDetailsPageHeading()
     {
    	 waitFor(3);
    	 return d.findElement(detailsTitle).getText();
     }
     
}
