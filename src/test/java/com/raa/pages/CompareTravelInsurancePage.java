package com.raa.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CompareTravelInsurancePage extends BasePage {

	public CompareTravelInsurancePage(WebDriver d) {
		super(d);
		waitForLoader();
	}

	// By Continue = By.cssSelector(".continue-policy");
	By Continue = By.xpath(
			"//button[@class='btn btn-sm font-weight-bold continue-policy continueBG border0 btn-turqoise-color custom-theme-group-two']");
	By Show_Benefit = By.xpath("//*[@class='btn btn-link' and contains(text(),' Show All Benefits ')]");
	By ChooseExcess = By.xpath("(//*[text()='Choose your excess']/following::div[1])[1]");
	// By Going_On_CruiseNo =
	// By.xpath("//*[@id=\"mat-button-toggle-25-button\"]/div");
	By Going_On_CruiseNo = By.xpath("//button[@id='mat-button-toggle-25-button']//div[@class='mat-button-toggle-label-content'][contains(text(),'No')]");
	// (//*[text()='Going on a cruise?']/following::div[1])[1]
	By Ski_Winter_No = By.xpath("//*[@class='mat-button-toggle-label-content' and contains(text(),'No')]");
	By Edit = By.xpath("//*[@class='textsize' and contains(text(),'Edit trip details')]");
	// By Edit = By.cssSelector("#Capa_1");
	//By Edit = By.xpath("//*[@id=\"quote\"]/step-two/section[2]/div/div[2]/div/div/div/div[4]/summary/div[1]/div/div[1]/div/div[1]/a/span");
	By continueApierrro = By.xpath("//span[text()='You can not proceed with Zero premium amount.']");

	public void getSingleTripClickContinue() {

		// waitForLoader();
		scrollBy("1000");
		waitFor(50);
		d.findElement(Continue).click();
		waitFor(20);
		boolean flag = iselementPresent(continueApierrro);
		if (flag == true) {
			System.out.println("Api not worked");
			assertTrue(false, "due to continue api");
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
		scrollBy("300");
		((JavascriptExecutor)d).executeScript("arguments[0].click();",d.findElement(Show_Benefit) );
		waitFor(2);
		//d.findElement(Show_Benefit).click();

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
		waitFor(3);
		scrollBy("300");
		((JavascriptExecutor)d).executeScript("arguments[0].click();",d.findElement(Going_On_CruiseNo) );
		waitFor(2);
		//d.findElement(Going_On_CruiseNo).click();

	}

	public void getSkiWinterNo() {

		// Call first page get method here

		waitFor(3);
		scrollBy("300");
		d.findElement(Ski_Winter_No).click();
	}

	public void getEditFunctionality() {

		// Call first page get method here waitFor(3); scrollBy("300");
		waitFor(3);
		scrollBy("300");
		((JavascriptExecutor)d).executeScript("arguments[0].click();",d.findElement(Edit) );
		waitFor(2);
		//d.findElement(Edit).click();

	}

}
