package com.racq.pages;

import org.openqa.selenium.*;

public class MedicalRescoringPage extends BasePage {

   By totalTravelCarebeforechange=By.xpath("//li[9]/div[2]");
   By medicalCondition=By.xpath("//li[14]/div[2]");
   By totalValue=By.xpath("(//h5)[2]");
   By editQuoteDetail=By.xpath("(//span[contains(text(),'Edit quote details')])[1]");
   
   By ExtraTravelPremium=By.xpath("(//*[text()=' CHOOSE '])[1]");
   By Continue = By.xpath("//button[@class='btn btn-sm font-weight-bold continue-policy continueBG border0 btn-turqoise-color custom-theme-group-two']");
	
   By visitingPage2=By.xpath("(//*[@class='num-text'])[2]");
   By visitingPage3=By.xpath("(//*[@class='num-text'])[3]");

	By primaryFirstName = By.id("userFirstName");
	By primaryLastName = By.cssSelector("#userLastName");

	By secondaryFirstName = By.id("adUserFirstName");
	By secondaryLastName = By.id("adUserLastName");

	By streetAddress = By.id("userStreetAddress");
	By suburb = By.id("userSubUrb");
	By stateDropdown = By.xpath("//mat-select[@id='mat-select-0']//div[@class='mat-select-value']");
	By stateSelect = By.xpath("//span[text()='SA']");
	By postCode = By.id("userPostcode");
	By emailAddress = By.id("userEmailAddress");
	By confirmEmailAddress = By.id("userConfirmEmailAddress");
	By mobilePhoneNo = By.xpath("//input[@id='userPhoneNumber']");

	By tripDetails=By.xpath("//span[@class='textsize']");


	By travelDestination = By.cssSelector("#country");
	By travelCancel = By.xpath("//*[text()='cancel']");
	By destinationEntry = By.xpath("//*[contains(@class,'mat-option-text')]");
	//By destinationEntry = By.cssSelector("span.mat-option-text");

	By destinationDOmesticSelect = By.xpath("//*[text()=' AUSTRALIA ']");
	By departDate = By.xpath("//input[@id='departDate']");
	By returningOnDate = By.xpath("//input[@id='returnDate']");


	By Getaquote = By.xpath("//*[contains(text(),' Get a Quote')]");

	By AgePrimarytraveller = By.xpath("//input[@id='ageFirst']");

	By detailPageYes = By.xpath("(//div[contains(text(),'Yes')])[1]");

	By primaryDOB = By.id("PrimaryTravelerDateOfBirth");
	By confirmAndFinaliseQuote = By.xpath("(//*[@type='submit'])[1]");
	By resumeAccept=By.xpath("(//*[@class='ng-star-inserted'])[2]");
	By editAccept=By.xpath("(//*[text()=' (Edit), '])[1]");
	By acceptPremium=By.xpath("(//button[contains(text(),'Accept')])[1]");
   
	public MedicalRescoringPage(WebDriver d) {
		super(d);
		waitForLoader();
		// TODO Auto-generated constructor stub
	}

	
	public String gettotaltravelcarebeforechange()
	{
		waitFor(13);
		scrollBy("800");
		return d.findElement(totalTravelCarebeforechange).getText();
	}
	
	public String getMedicalCondition()
	{
		waitFor(13);
		//scrollBy("200");
		return d.findElement(medicalCondition).getText();
	}
	
	public String getTotalValue()
	{
		waitFor(13);
		return d.findElement(totalValue).getText();
	}
	
	public void  geteditquoteclick()
	
	{
		scrollBy("-800");
		d.findElement(editQuoteDetail).click();
	}
	
	public void getEditTravel()
	{
		waitFor(13);
		scrollBy("650");
		waitFor(3);
	    d.findElement(ExtraTravelPremium).click();
	}
	
   public void getSingleTripClickContinueAfterUpdate() {
	   waitFor(40);
	   JavascriptExecutor js = (JavascriptExecutor)d;
       WebElement button=d.findElement(By.xpath("//*[@data-auto-id='goToStepThree']"));
	   js.executeScript("arguments[0].click();", button);
		//scrollBy("400");

		/*d.findElement(Continue).click();
	   waitForLoader();
*/
	}
   
   public String gettotaltravelcareafterchange()
	{
		waitFor(13);
		scrollBy("650");
		return d.findElement(totalTravelCarebeforechange).getText();
	}
	
	public String getmedicalConditionafterChange()
	{
		scrollBy("200");
		return d.findElement(medicalCondition).getText();
	}
	
	public String getTotalValueAfterChange()
	{
		//scrollBy("500");
		return d.findElement(totalValue).getText();
	}
	
	
	public void getEditPage2() {
		waitFor(13);
		scrollBy("-800");
		waitForVisible(visitingPage2);
		d.findElement(visitingPage2).click();
		
	}

	public void getEditPage3() {
		scrollBy("500");
		d.findElement(visitingPage3).click();
		
	}


	public void  getedittripclick()

	{
		waitFor(13);
		scrollBy("200");
		d.findElement(tripDetails).click();
	}

	public void getClearGetAQuote() {

        waitFor(15);
		waitForVisible(travelDestination);
		scrollBy("400");
		waitFor(3);
		d.findElement(travelCancel).click();
		waitFor(4);
	}

	public void getChangeDestination(String traveldestination) {

		waitFor(13);
		waitForVisible(travelDestination);
		//scrollBy("400");
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(4);
		d.findElement(destinationEntry).click();
		waitFor(5);
		d.findElement(Getaquote).click();
		// waitForVisible(Getquotesuccessmessage);
	}

	public void getAddDestination(String traveldestination)
	{
		waitForVisible(travelDestination);
		scrollBy("400");
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(4);
		d.findElement(destinationEntry).click();
		waitFor(5);
		d.findElement(Getaquote).click();
		// waitForVisible(Getquotesuccessmessage);
	}
	public void getChangeAge(String age)
	{
		waitForVisible(travelDestination);
		scrollBy("400");
		waitFor(3);
		WebElement primaryage=d.findElement(AgePrimarytraveller);
		primaryage.sendKeys(Keys.CONTROL + "a");
		primaryage.sendKeys(age);
		waitFor(4);
		d.findElement(Getaquote).click();
		// waitForVisible(Getquotesuccessmessage);
	}

	public void getDOBChange(String Primaryage)
	{
        WebElement page3DOB=d.findElement(primaryDOB);
	    scrollBy("400");
		page3DOB.sendKeys(Keys.CONTROL + "a");
		waitFor(4);
		page3DOB.sendKeys(Primaryage);

	}
	public void getResume()
	{
		waitForVisible(resumeAccept);
		scrollBy("500");
		d.findElement(resumeAccept).click();
		waitForVisible(acceptPremium);
	}
	public void acceptPremiumafterchange()
	{
		waitFor(25);
		waitForVisible(acceptPremium);
		scrollBy("600");
		d.findElement(acceptPremium).click();

	}
	public void getYesMedicalCondition3()
	{
		waitFor(22);
		scrollBy("1400");
		d.findElement(detailPageYes).click();
	}
	public void confirmAndFinaliseQuote1() {
		waitFor(7);
		scrollBy("200");
		d.findElement(confirmAndFinaliseQuote).click();
		waitFor(15);
		waitForVisible(resumeAccept);
	}







}