package com.rac.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CompareTravelInsurancePage extends BasePage {

	public CompareTravelInsurancePage(WebDriver d) {
		super(d);
		/* waitForLoader(); */
	}

	// By Continue = By.cssSelector(".continue-policy");
	By Continue = By.xpath("//*[@data-auto-id='goToStepThree']");
	By Show_Benefit = By.xpath("//button[text()=' Show All Benefits ']");
	By ChooseExcess = By.xpath("(//*[text()='Choose your excess']/following::div[1])[1]");
	// By Going_On_CruiseNo =
	// By.xpath("//*[@id=\"mat-button-toggle-25-button\"]/div");
	By Going_On_CruiseNo = By.xpath("//td[contains(text(),'Going on a Cruise?~')]//..//div[contains(text(),'Yes')]");
	By Ski_Winter_No = By.xpath("(//td[text()='Ski/Winter Sports?~']/following::div[contains(text(),'No')])[1]");
	// By Edit = By.xpath("//*[@id=\"Capa_1\"]");
	By Edit = By.xpath("//*[text()='Edit trip details']");
	By continueApierrro = By.xpath("//*[text()='Please wait, the premium is still loading hence you cannot proceed.']");
	

public void getSingleTripClickContinue() {
		
        // waitForLoader();
        scrollBy("1000");
        waitFor(30);
        d.findElement(Continue).click();
        waitForLoader();
        boolean flag=iselementPresent(continueApierrro);
   if(flag==true)
   {
      
        assertTrue(false,"Price Loading API is not working");
   }
        

  }

	public void getSingleTripClickContinueAfterUpdate() {

		// waitForLoader();
		// scrollBy("1000");
		waitFor(4);
		d.findElement(Continue).click();

	}

	public void getAMTClickContinue() {

		// waitForLoader();
		scrollBy("1000");
		waitFor(60);
		d.findElement(Continue).click();

	}

	public void getValidateAllBenefit() {

		// Call first page get quote method here JSWaiter.waitUntilJSReady();
		waitFor(3);
		scrollBy("100");
		d.findElement(Show_Benefit).click();

	}

	public void getChooseYourExcess() {

		waitFor(3);
		scrollBy("300");
		((JavascriptExecutor)d).executeScript("arguments[0].click();",d.findElement(ChooseExcess) );
		waitFor(2);
		//d.findElement(By.xpath("//span[contains(text(),'$100')]")).click();
		

	}

	public void getGoingOnCruiseNo() {

		// Call first page get method here scrollBy("300");
		d.findElement(Going_On_CruiseNo).click();

	}

	public void getSkiWinterNo() {

		// Call first page get method here

		waitFor(3);
		d.findElement(Ski_Winter_No).click();
	}

	public void getEditFunctionality() {

		// Call first page get method here waitFor(3); scrollBy("300");
		waitFor(3);
		d.findElement(Edit).click();

	}

}
