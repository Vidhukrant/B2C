package com.racq.pages;


import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class CompareTravelInsurancePage extends BasePage {

	public CompareTravelInsurancePage(WebDriver d) {
		super(d);
		waitForLoader();
}

	//By Continue = By.cssSelector(".continue-policy");
	By Continue = By.xpath("//*[@data-auto-id='goToStepThree']");
	By Show_Benefit = By.xpath("//*[@id=\"headingOne\"]/h2/button");
	By ChooseExcess = By.xpath("//*[@id=\"mat-select-7\"]/div/div[2]");
	//By Going_On_CruiseNo = By.xpath("//*[@id=\"mat-button-toggle-25-button\"]/div");
	By Going_On_CruiseNo = By.xpath("//td[contains(text(),'Going on a Cruise?~')]//..//div[contains(text(),'Yes')]");
	By Ski_Winter_No = By.xpath("(//*[@class='mat-button-toggle-label-content'])[4]");
	//By Edit = By.xpath("//*[@id=\"Capa_1\"]");
	By Edit=By.xpath("//*[text()='Edit trip details']");
	By continueApierrro = By.xpath("//span[text()='You can not proceed with Zero premium amount.']");

		
	
	public void getSingleTripClickContinue() throws InterruptedException {

		//waitForLoader();
		/*scrollBy("1000");
		waitFor(30);*/
		explicitWait(Continue);
		WebElement continueele=d.findElement(Continue);
		ScrollForLocator(continueele);
		Thread.sleep(4000);
		clickByJavascriptExecuter(continueele);
		Thread.sleep(3000);
		try{
		explicitWait(DetailsPage.primaryFirstName);
		}
		catch(Exception e){
			d.navigate().refresh();
			Thread.sleep(2000);
			getSingleTripClickContinue();
		}
	} 
 
 

public void getSingleTripClickContinueAfterUpdate() {
        
		//waitForLoader();
		//scrollBy("1000");
		waitFor(4);
		d.findElement(Continue).click();

	}
    
public void getAMTClickContinue() {
        
		//waitForLoader();
		scrollBy("1000");
		waitFor(60);
		d.findElement(Continue).click();

	}

	
	  public void getValidateAllBenefit() {
	  
	  // Call first page get quote method here JSWaiter.waitUntilJSReady();
	  waitFor(3);
	  scrollBy("1000"); 
	  d.findElement(Show_Benefit).click();
	  
	  
	  }
	  
	  public void getChooseYourExcess()  {  
	  
	  waitFor(3);
	  scrollBy("300"); d.findElement(ChooseExcess).click();
	  
	  }
	  
	  public void getGoingOnCruiseNo() {
	  
	  // Call first page get method here scrollBy("300");
	  d.findElement(Going_On_CruiseNo).click();
	  
	  }
	  
	  public void getSkiWinterNo() {
	  
	  // Call first page get method here
	  
	  waitFor(3); 
	  scrollBy("300"); 
	  d.findElement(Ski_Winter_No).click(); }
	  
	  public void getEditFunctionality() {
	  
	  // Call first page get method here waitFor(3); scrollBy("300");
		  waitFor(3); 
	     d.findElement(Edit).click();
	     waitFor(7);
	 
	  
	 }
	 
}
