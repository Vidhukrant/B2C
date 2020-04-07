package com.racq.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetAQuotePage extends BasePage {

	// By singleTripSelect = By.xpath("//label[@class='btn btn-sm btn-light']");
	// Now By singleTripSelect = By.xpath("//label[@class='btn btn-sm btn-light
	// active']");
	// By singleTripSelect =By.xpath("//*[contains(text(),'Single Trip')]");
	By singleTripSelect = By.xpath("//*[@data-auto-id='singleTrip']");
	By annualMultiTrip = By.cssSelector("label#mlttrip");
	// England
	By travelDestination = By.cssSelector("#country");
	By travelCancel = By.xpath("//*[text()=' Single Trip ']");
	By destinationEntry = By.xpath("//*[contains(@class,'mat-option-text')]");
	//By destinationEntry = By.cssSelector("span.mat-option-text");

	By destinationDOmesticSelect = By.xpath("//*[text()=' AUSTRALIA ']");
	By departDate = By.xpath("//input[@id='departDate']");
	By returningOnDate = By.xpath("//input[@id='returnDate']");
	By AgePrimarytraveller = By.xpath("//input[@id='ageFirst']");
	By AgeSecondaryTravel = By.xpath("//input[@id='ageSecond']");
	By NoofDependants = By.xpath("//input[@id='dependantCount']");
	By State = By.xpath("//mat-select[@id='mat-select-0']//div[@class='mat-select-value']");
	By state_click = By.xpath("//span[text()='SA']");
	By AreyouanRACMember = By.xpath("//*[@data-auto-id='racvMember']");
	By AreyouanRACMemberNoClick = By.xpath("//span[contains(text(),'No')]");
	By Getaquote = By.xpath("//*[contains(text(),' Get a Quote')]");
	// message return
	By Getquotesuccessmessage = By.xpath("//h1[@class='jumbotron-heading']");
	//By DomesticInternationalMessage = By.xpath(
	//		"//*[contains(text(),' We can not complete your request.  You cannot mix Domestic and International travel on a single policy.   AUSTRALIA,LORD HOWE ISLAND,NORFOLK ISLAND   AUSTRALIA,LORD HOWE ISLAND,NORFOLK ISLAND')]");
	
	By DomesticInternationalMessage=By.xpath("//*[@data-auto-id='countryErrorSix']");
	By traveldeserrormsg = By.xpath("//*[text()='Please select the Travel Destination']");
	By LeavingDate = By.xpath("//*[@data-auto-id='departDateErrorOne']");
	By ReturnDate = By.xpath("//*[contains(text(),'Please select the Return Date')]");
	By leavingandReturnsamedate = By
			.xpath("//*[@data-auto-id='returnDateErrorTwo']");
	By PrimaryAge = By.xpath("//*[text()=' Please enter the age of the Primary Traveller ']");
	By SingleTripAgeBelow18and110Year = By.xpath("//*[@data-auto-id='ageFirstErrorTwo']");
	By departureDateMoreErrorMsg = By
			.xpath("//*[@data-auto-id='departDateErrorThree']");
	By returnDateLessErrorMsg = By.xpath("//*[contains(text(),'Return Date cannot be less than the Departure Date')]");
	By Leaving548daysforbothsingleandamt = By.xpath("(//*[contains(@id,'mat-error')])[1]");
	By singletripretutndate365days = By
			.xpath("//*[@data-auto-id='returnDateErrorThree']");
	//By AMTAgebelow18and75year = By.xpath(
			//"/html[1]/body[1]/div[1]/div[1]/step-one[1]/main[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/mat-error[1]");
	By AMTAgebelow18and75year=By.xpath("//*[@data-auto-id='ageFirstErrorFour']");
	By AMTretrundate60days = By
			.xpath("//*[@data-auto-id='returnDateErrorFive']");
	By returndateAMTerrormsg = By
			.xpath("//*[@data-auto-id='returnDateErrorTwo']");

	By departDateWhole = By.xpath("(//div[contains(@class,'row')])[4]/div[contains(@class,'col')][2]");

	public GetAQuotePage(WebDriver d) {
		super(d);
		waitForLoader();
		/*
		 * if
		 * (d.findElement(pageHeading).getText().contains("Travel Insurance")) {
		 * throw new IllegalStateException("Not on the Get A Quote page!"); }
		 */
	}

	public void switchToSingleTrip() {
		waitForVisible(singleTripSelect);
		d.findElement(singleTripSelect).click();
	}

	public String switchToSingleTripTitl() {
		//waitFor(5);
		waitForVisible(singleTripSelect);
		return d.findElement(singleTripSelect).getText();

	}

	public void switchToAMTtrip() {
		d.findElement(annualMultiTrip).click();
	}

	public String switchToAMTtripTitle() {
		return d.findElement(annualMultiTrip).getText();

	}

	// getaquotesuccessmesssage
	public void getSingleTripGetQuote(String traveldestination, String leavingOn, String agePrimarytraveller,
			String agesecondaryTravel, String noofDependants) {

		waitForVisible(travelDestination);
		scrollBy("400");
		waitFor(4);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(4);
		d.findElement(destinationEntry).click();
		waitFor(5);
		d.findElement(departDate).sendKeys(leavingOn);
		// waitFor(2);
		waitFor(2);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		// waitFor(2);
		//d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		// waitFor(2);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		// waitFor(2);
		d.findElement(State).click();
		d.findElement(state_click).click();
		d.findElement(AreyouanRACMember).click();
		d.findElement(AreyouanRACMemberNoClick).click();
		d.findElement(Getaquote).click();
		// waitForVisible(Getquotesuccessmessage);
	}

	public void checkWinows() {
		
		String parent= d.getWindowHandle();
			
			d.findElement(By.xpath("//a[@class='pandemic-link']")).click();
                      d.switchTo().window(parent);
                      waitFor(10);
                      d.findElement(By.xpath("//*[@id='pandemicInfochecked']")).click();
		}
	
	public void getdomesticinternationalcountry(String traveldestination1, String traveldestination2) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination1);
		waitFor(2);
		d.findElement(destinationEntry).click();
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination2);
		d.findElement(destinationEntry).click();
		// return new GetAQuotePage(d);

	}

	public String errorMsgDomesticInternational() {
		waitForVisible(DomesticInternationalMessage);
		return d.findElement(DomesticInternationalMessage).getText();
	}

	// travelfieldblank
	public void getTravelDestinationFieldBlank(String leavingOn, String returningOn, String agePrimarytraveller,
			String agesecondaryTravel, String noofDependants) {

		d.findElement(departDate).sendKeys(leavingOn);
		// d.findElement(returningOnDate).sendKeys(returningOn);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		d.findElement(State).click();
		d.findElement(state_click).click();

		d.findElement(Getaquote).click();

	}

	public String gettravelerrormsg() {
		return d.findElement(traveldeserrormsg).getText();
	}

	// #### leavingonblank
	public void getleavingonfieldblank(String traveldestination, String returningOn, String agePrimarytraveller,
			String agesecondaryTravel, String noofDependants) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(3);
		d.findElement(destinationEntry).click();
		waitFor(3);
		d.findElement(returningOnDate).sendKeys(returningOn);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		waitFor(3);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		waitFor(3);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		d.findElement(State).click();
		waitFor(3);
		d.findElement(state_click).click();
		d.findElement(Getaquote).click();

	}

	public String getleavingserrorms() {
		return d.findElement(LeavingDate).getText();
	}

	// returning onblank
	public void getreturningfieldblank(String traveldestination, String leavingOn, String agePrimarytraveller,
			String agesecondaryTravel, String noofDependants) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(3);
		d.findElement(destinationEntry).click();
		waitFor(3);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(3);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		waitFor(3);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		waitFor(3);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		waitFor(3);
		d.findElement(State).click();
		d.findElement(state_click).click();
		d.findElement(Getaquote).click();

	}

	public String getreturnserrormsg() {
		return d.findElement(ReturnDate).getText();
	}

	public void getleavingandreturndatesame(String traveldestination, String leavingOn, String returningOn,
			String agePrimarytraveller, String agesecondaryTravel, String noofDependants) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(3);
		d.findElement(destinationEntry).click();
		waitFor(3);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(3);
		WebElement Retdate = d.findElement(returningOnDate);
		// Retdate.click();
		waitFor(3);
		Retdate.sendKeys(Keys.CONTROL + "a");
		Retdate.sendKeys(Keys.BACK_SPACE);
		waitFor(3);
		Retdate.sendKeys("22/02/2020");
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		d.findElement(Getaquote).click();

	}

	public void getleavingandreturndateAMT(String traveldestination, String leavingOn, String returningOn,
			String agePrimarytraveller, String agesecondaryTravel, String noofDependants) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(3);
		d.findElement(destinationEntry).click();
		waitFor(3);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(3);
		d.findElement(returningOnDate).sendKeys(returningOn);
		// Retdate.click();
		waitFor(3);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		d.findElement(Getaquote).click();
	}

	public String getAMTleaveandreturnerrormsg() {
		return d.findElement(returndateAMTerrormsg).getText();
	}

	public String getleaveandreturnserrormsg() {
		return d.findElement(leavingandReturnsamedate).getText();
	}

	// primaryblankvalidation
	public void getSTagePrimarytravellerfieldblank(String traveldestination, String leavingOn,
			String agesecondaryTravel, String noofDependants) {
		waitFor(7);
		waitForVisible(travelDestination);
		scrollBy("400");
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(3);
		d.findElement(destinationEntry).click();
		waitFor(3);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(3);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		waitFor(4);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		d.findElement(State).click();
		waitFor(4);
		d.findElement(state_click).click();
		waitFor(2);
		d.findElement(Getaquote).click();
	}

	public String getage_errormsg() {
		return d.findElement(PrimaryAge).getText();
	}

	public void getAMTagePrimarytravellerfieldblank(String traveldestination, String leavingOn, String returningOn,
			String agesecondaryTravel, String noofDependants) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(3);
		d.findElement(destinationEntry).click();
		waitFor(3);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(3);
		d.findElement(returningOnDate).sendKeys(returningOn);
		waitFor(3);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		waitFor(2);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		d.findElement(State).click();
		waitFor(2);
		d.findElement(state_click).click();
		waitFor(2);
		d.findElement(Getaquote).click();
	}

	public void getagesingletriptraveller_agebelow18andmore110(String traveldestination, String leavingOn,
			String returningOn, String agePrimarytraveller, String agesecondaryTravel, String noofDependants) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(3);
		d.findElement(destinationEntry).click();
		d.findElement(departDate).sendKeys(leavingOn);
		d.findElement(returningOnDate).sendKeys(returningOn);
		waitFor(5);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		waitFor(5);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		waitFor(5);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		waitFor(5);
		d.findElement(State).click();
		d.findElement(state_click).click();
		d.findElement(Getaquote).click();

	}

	public String getSingleTripage_errormsgforbelow18and110() {
		return d.findElement(SingleTripAgeBelow18and110Year).getText();
	}

	public void getpastdate(String traveldestination, String leavingOn) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		d.findElement(destinationEntry).click();
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(2);
		d.findElement(AgePrimarytraveller).click();
	}

	public String getpastdateerrormsg()

	{
		return d.findElement(departureDateMoreErrorMsg).getText();
	}

	public void getsingletrip_leavingdate_548days(String traveldestination, String leavingOn) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		d.findElement(destinationEntry).click();
		waitFor(2);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(2);
		d.findElement(AgePrimarytraveller).click();

	}

	public String getsingletrip_leavingdate_548dayserrormsg()

	{
		return d.findElement(Leaving548daysforbothsingleandamt).getText();
	}

	public void getsingletrip365days(String traveldestination, String leavingOn, String returningOn) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		d.findElement(destinationEntry).click();
		waitFor(2);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(2);
		WebElement Retdate = d.findElement(returningOnDate);
		// Retdate.click();
		waitFor(2);
		Retdate.sendKeys(Keys.CONTROL + "a");
		Retdate.sendKeys(Keys.BACK_SPACE);
		waitFor(3);
		Retdate.sendKeys("22/02/2022");
	}

	public String getsingletrip365daysfromdeparterrormsg()

	{
		return d.findElement(singletripretutndate365days).getText();
	}

	public void getAMT_leavingdate_548days(String traveldestination, String leavingOn) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		d.findElement(destinationEntry).click();
		d.findElement(departDate).sendKeys(leavingOn);

	}

	public String getAMTtrip_leavingdate_548dayserrormsg()

	{
		return d.findElement(Leaving548daysforbothsingleandamt).getText();
	}

	public void getageAMTtraveller_agebelow18andmore75(String traveldestination, String leavingOn, String returningOn,
			String agePrimarytraveller, String agesecondaryTravel, String noofDependants) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(3);
		d.findElement(destinationEntry).click();
		waitFor(3);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(3);
		d.findElement(returningOnDate).sendKeys(returningOn);
		waitFor(3);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		d.findElement(State).click();
		d.findElement(state_click).click();
		d.findElement(Getaquote).click();

	}

	public String getAMTage_errormsgforbelow18andmore75() {
		return d.findElement(AMTAgebelow18and75year).getText();
	}

	public void getAMTtrip60daysfromdepart(String traveldestination, String leavingOn, String returningOn) {
		d.findElement(travelDestination).sendKeys(traveldestination);
		d.findElement(destinationEntry).click();
		d.findElement(departDate).sendKeys(leavingOn);
		d.findElement(returningOnDate).sendKeys(returningOn);

	}

	public String getAMTtrip60daysfromdeparterrormsg()

	{
		return d.findElement(AMTretrundate60days).getText();
	}

	public String getPageHeading() {
		waitFor(4);
		waitForVisible(Getquotesuccessmessage);
		return d.findElement(Getquotesuccessmessage).getText();
	}

	public void getMultiTripGetAQuote(String traveldestination, String leavingOn, String returningOn,
			String agePrimarytraveller, String agesecondaryTravel, String noofDependants) {
		switchToAMTtrip();
		waitForVisible(travelDestination);
		scrollBy("400");
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(2);
		waitForVisible(destinationEntry);
		waitFor(4);
		d.findElement(destinationEntry).click();
		waitFor(2);
		d.findElement(departDate).sendKeys(leavingOn);
		// waitFor(2);
		d.findElement(returningOnDate).sendKeys(returningOn);
		waitFor(2);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		// waitFor(2);
		//d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		// waitFor(2);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		// waitFor(2);
		d.findElement(State).click();
		waitFor(2);
		d.findElement(state_click).click();
		waitFor(2);
		d.findElement(AreyouanRACMember).click();
		waitFor(2);
		d.findElement(AreyouanRACMemberNoClick).click();
		waitFor(2);
		d.findElement(Getaquote).click();

		// waitForVisible(Getquotesuccessmessage);
	}

	public void getMultiTripDomestic(String traveldestination, String leavingOn, String returningOn,
			String agePrimarytraveller, String agesecondaryTravel, String noofDependants) {

		switchToAMTtrip();
		waitForVisible(travelDestination);
		scrollBy("400");
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(2);
		d.findElement(destinationDOmesticSelect).click();
		waitFor(5);
		d.findElement(departDate).sendKeys(leavingOn);
		// waitFor(2);
		d.findElement(returningOnDate).sendKeys(returningOn);
		waitFor(2);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		// waitFor(2);
		//d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		// waitFor(2);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		// waitFor(2);
		d.findElement(State).click();
		d.findElement(state_click).click();
		d.findElement(AreyouanRACMember).click();
		d.findElement(AreyouanRACMemberNoClick).click();
		d.findElement(Getaquote).click();
		// waitForVisible(Getquotesuccessmessage);
	}

	public void getSingleTripDomestic(String traveldestination, String leavingOn, String agePrimarytraveller,
			String agesecondaryTravel, String noofDependants) {

		waitForVisible(travelDestination);
		waitFor(7);
		scrollBy("400");
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(5);
		d.findElement(destinationEntry).click();
		waitFor(5);
		d.findElement(departDate).sendKeys(leavingOn);
		// waitFor(2);
		waitFor(2);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		// waitFor(2);
		//d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		// waitFor(2);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		// waitFor(2);
		d.findElement(State).click();
		d.findElement(state_click).click();
		d.findElement(AreyouanRACMember).click();
		d.findElement(AreyouanRACMemberNoClick).click();
		d.findElement(Getaquote).click();
		waitForLoader();
		// waitForVisible(Getquotesuccessmessage);
	}

	public void getClearGetAQuote() {

		waitForVisible(travelDestination);
		scrollBy("400");
		waitFor(3);
		d.findElement(travelCancel).click();
		waitFor(4);
		WebElement Departdate = d.findElement(departDate);
		waitFor(2);
		Departdate.sendKeys(Keys.CONTROL + "a");
		Departdate.sendKeys(Keys.BACK_SPACE);
		WebElement Retdate = d.findElement(returningOnDate);
		// Retdate.click();
		waitFor(2);
		Retdate.sendKeys(Keys.CONTROL + "a");
		Retdate.sendKeys(Keys.BACK_SPACE);
		d.findElement(AgePrimarytraveller).clear();
		waitFor(2);
		d.findElement(AgeSecondaryTravel).clear();
	}

	public void getEditForPage3GetQuote(String traveldestination, String leavingOn, String returningdate,
			String agePrimarytraveller, String agesecondaryTravel) {

		waitForVisible(travelDestination);
		scrollBy("400");
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(4);
		d.findElement(destinationEntry).click();
		waitFor(5);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(2);
		d.findElement(returningOnDate).sendKeys(returningdate);
		waitFor(2);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		// waitFor(2);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		// waitFor(2);
		d.findElement(Getaquote).click();
		// waitForVisible(Getquotesuccessmessage);
	}

	public String getDepartError() {
		return d.findElement(departDateWhole).getText();
	}

	public void enterCountry(String string) {
		// TODO Auto-generated method stub
		
	}

	public void enterDepartureDate(String string) {
		// TODO Auto-generated method stub
		
	}

	public void clickGetAQuote() {
		// TODO Auto-generated method stub
		
	}

}
