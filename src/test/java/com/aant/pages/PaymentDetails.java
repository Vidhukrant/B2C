package com.aant.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentDetails extends BasePage {

	public PaymentDetails(WebDriver d) {
		super(d);
		//waitForLoader();
		

	}

	By PromoCode = By.xpath("//a[@class='text-link pl-3 pr-3 pr-sm-0 hyperlink promo-btn']");
	By EnterPromoCode = By.xpath("//input[@id='promoCode']");
	By PromoApply = By.xpath("//button[@class='btn btn-secondary']");
	By ClosePromo = By.xpath("//a[@class='close']//span[contains(text(),'×')]");
	By InvalidPromoError = By.xpath("//mat-error[@id='mat-error-1']");
	// By
	// CName=By.xpath("//*[@id='braintree__card-view-input__cardholder-name']");
	By CName = By.xpath("//input[@id='braintree__card-view-input__cardholder-name']");
	By CCNumber = By.xpath("//input[@id='credit-card-number']");
	By ExpDate = By.xpath("//*[@id='expiration']");
	By CVV = By.xpath("//*[@id='cvv']");
	By CnfPay = By.xpath("//button[@class='ng-star-inserted']");
	By CancelPay = By.xpath("//button[@class='btn btn-cancel']");
	By ErrCCName = By.xpath("//*[@data-braintree-id='cardholder-name-field-error']");
	By ErrCardNum = By.xpath("//*[contains(text(),'Please fill out a card number.')]");
	By ErrExpDate = By.xpath("//div[contains(text(),'Please fill out an expiration date.')]");
	By errCVVNumber = By.xpath("//div[contains(text(),'Please fill out a CVV.')]");
	By errInvalidCardNum = By.xpath("//div[contains(text(),'This card number is not valid.')]");
	By errInvalidExpDate = By.xpath("//div[contains(text(),'This expiration date is not valid.')]");
	By errInvalidCVVNumber = By.xpath("//div[contains(text(),'This security code is not valid.')]");

	public void getCard(String CCName, String Number, String ExpDate1, String CVV1) {
		waitFor(7);
		scrollBy("250");
		new WebDriverWait(d, 20).until(ExpectedConditions.elementToBeClickable(CName));
		d.findElement(CName).sendKeys(CCName);
		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-number[src*='hosted-fields-frame']")));
		d.findElement(CCNumber).sendKeys(Number);
		d.switchTo().defaultContent();
		waitFor(3);
		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-expirationDate[src*='hosted-fields-frame']")));
		d.findElement(ExpDate).sendKeys(ExpDate1);
		d.switchTo().defaultContent();
		waitFor(3);
		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-cvv[src*='hosted-fields-frame']")));
		d.findElement(CVV).sendKeys(CVV1);
		d.switchTo().defaultContent();
		scrollBy("150");
		waitFor(4);
		d.findElement(CnfPay).click();

	}

	public void cancelPayment(String CCName, String Number, String ExpDate1, String CVV1) throws InterruptedException { // Cancel
		waitFor(7); // paymentwaitFor(7);
		scrollBy("250");
		new WebDriverWait(d, 20).until(ExpectedConditions.elementToBeClickable(CName));
		d.findElement(CName).sendKeys(CCName);
		// d.switchTo().defaultContent();
		waitFor(2);
		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-number[src*='hosted-fields-frame']")));
		d.findElement(CCNumber).sendKeys(Number);
		d.switchTo().defaultContent();
		waitFor(2);
		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-expirationDate[src*='hosted-fields-frame']")));
		d.findElement(ExpDate).sendKeys(ExpDate1);
		d.switchTo().defaultContent();
		waitFor(2);
		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-cvv[src*='hosted-fields-frame']")));
		d.findElement(CVV).sendKeys(CVV1);
		d.switchTo().defaultContent();
		waitFor(2);
		d.findElement(CancelPay).click();
		waitFor(2);
		d.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();

	}

	public void ErrorMsgPromoCode(String Promo) throws InterruptedException {
		// For
		// Valid
		// and
		// Invalid
		// promo
		// code

		waitFor(12);
		scrollBy("800");
		d.findElement(PromoCode).click();
		waitFor(4);
		d.findElement(EnterPromoCode).sendKeys(Promo);
		waitFor(2);
		d.findElement(PromoApply).click();
		waitFor(2);
		d.findElement(ClosePromo).click();

	}

	public String ValidateBlankPromoCode() throws InterruptedException { 
		// Validate
		// with
		// blank
		// promo
		// code

		waitFor(12);
		scrollBy("800");
		d.findElement(PromoCode).click();
		Thread.sleep(2000);
		d.findElement(PromoApply).click();
		Thread.sleep(2000);
		d.findElement(ClosePromo).click();
		Thread.sleep(1000);
		String Error = d.findElement(By.xpath("//mat-error[@id='mat-error-0']")).getText();
		return Error;

	}

	public void forBlankCCName() throws InterruptedException { 
		// Validate blank
		// cardholder
		// name
        d.switchTo().defaultContent();
		waitFor(9);
		scrollBy("230");
		waitFor(2);
		 d.findElement(CName).click();
		waitFor(3);
		 waitFor(3);
		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-number[src*='hosted-fields-frame']")));
		d.findElement(CCNumber).click();
		d.switchTo().defaultContent();
		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-expirationDate[src*='hosted-fields-frame']")));
		waitFor(2);
		d.findElement(ExpDate).click();
		waitFor(2);
		 d.switchTo().defaultContent();
		
	}

	public String ErrorMsgCCName() throws InterruptedException {

		//waitForVisible(ErrCCName);
		String Error = d.findElement(ErrCCName).getText();
		return Error;
	}

	public void forBlankCCNumber() throws InterruptedException { 
		// Validate
		// blank
		// card
		// number

		d.switchTo().defaultContent();
		waitFor(9);
		//scrollBy("230");
		waitFor(2);
		//new WebDriverWait(d, 20).until(ExpectedConditions.elementToBeClickable(CName));
		d.findElement(CName).sendKeys("Test");
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-number[src*='hosted-fields-frame']")));
		d.findElement(CCNumber).click();
		d.switchTo().defaultContent();
		waitFor(3);
		d.findElement(CName).click();
		 d.switchTo().defaultContent();

	}

	public String ErrorCCNumber() {
		//waitForVisible(ErrCardNum);
		String Error = d.findElement(ErrCardNum).getText();
		return Error;
	}

	public void forBlankExpDate() throws InterruptedException { 
		// Validate
		// blank expiry
		// date

		d.switchTo().defaultContent();
		waitFor(9);
		scrollBy("230");
		waitFor(2);
		//new WebDriverWait(d, 20).until(ExpectedConditions.elementToBeClickable(CName));
		d.findElement(CName).sendKeys("Test");
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-number[src*='hosted-fields-frame']")));
		d.findElement(CCNumber).sendKeys("5185 5408 1000 0019");
		waitFor(2);
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-expirationDate[src*='hosted-fields-frame']")));
		waitFor(2);
		d.findElement(ExpDate).click();
		waitFor(2);
		d.switchTo().defaultContent();
        waitFor(3);
		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("(//iframe)[3]")));
		d.findElement(CVV).click();
		waitFor(2);
		 d.switchTo().defaultContent();
		 waitFor(2);
        //d.findElement(CName).click();

	}

	public String ErrorMsgExpDate() {
		//waitForVisible(ErrExpDate);
		String Error = d.findElement(ErrExpDate).getText();
		return Error;
	}

	public void forBlankCVV() throws InterruptedException { 
		// Validate blank
		// CVV number

		d.switchTo().defaultContent();
		//scrollBy("230");
		waitFor(2);
		d.findElement(CName).click();
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-number[src*='hosted-fields-frame']")));
		d.findElement(CCNumber).sendKeys("5185 5408 1000 0019");
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-expirationDate[src*='hosted-fields-frame']")));
		d.findElement(ExpDate).sendKeys("12/24");

		d.switchTo().defaultContent();
		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("(//iframe)[3]")));
		d.findElement(CVV).click();
		waitFor(2);
		d.switchTo().defaultContent();
		waitFor(3);
		d.findElement(CName).click();
		

	}
	
	public void clear()
	{
		waitFor(9);
		//scrollBy("230");
		new WebDriverWait(d, 20).until(ExpectedConditions.elementToBeClickable(CName));
		d.findElement(CName).clear();
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-number[src*='hosted-fields-frame']")));
		d.findElement(CCNumber).clear();
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-expirationDate[src*='hosted-fields-frame']")));
		d.findElement(ExpDate).clear();

		d.switchTo().defaultContent();
		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("(//iframe)[3]")));
		d.findElement(CVV).clear();
		waitFor(2);
		d.switchTo().defaultContent();
		
	}

	public String ErrorMsgCVV() {
		//waitForVisible(errCVVNumber);
		String Error = d.findElement(errCVVNumber).getText();
		return Error;
	}

	public void forValidateInvalidCard() throws InterruptedException {
		// Validate
		// invalid
		// card
		// number

		d.switchTo().defaultContent();
		waitFor(9);
		scrollBy("230");
		waitFor(2);
//		new WebDriverWait(d, 20).until(ExpectedConditions.elementToBeClickable(CName));
		d.findElement(CName).sendKeys("Test");
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-number[src*='hosted-fields-frame']")));
		d.findElement(CCNumber).sendKeys("1111 2222 2222 2222");
		d.switchTo().defaultContent();
		waitFor(3);
		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-expirationDate[src*='hosted-fields-frame']")));
		waitFor(2);
		d.findElement(ExpDate).click();
		waitFor(2);
		 d.switchTo().defaultContent();
		 waitFor(2);

	}

	public String ErrorInvalidCard() {
		//waitForVisible(errInvalidCardNum);
		String Error = d.findElement(errInvalidCardNum).getText();
		return Error;
	}

	public void validateInvalidExpDate() throws InterruptedException {
		// Validate
		// with
		// past
		// expiry
		// date
		d.switchTo().defaultContent();
		waitFor(9);
		//scrollBy("230");
		waitFor(2);
		//new WebDriverWait(d, 20).until(ExpectedConditions.elementToBeClickable(CName));
		d.findElement(CName).click();
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-number[src*='hosted-fields-frame']")));
		d.findElement(CCNumber).sendKeys("5200828282828210");
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-expirationDate[src*='hosted-fields-frame']")));
		d.findElement(ExpDate).sendKeys("12/19");
		d.switchTo().defaultContent();
		waitFor(3);
		d.findElement(CName).click();
		waitFor(2);
	}

	public String ErrorInvalidExpDate() {
		//waitForVisible(errInvalidExpDate);
		String Error = d.findElement(errInvalidExpDate).getText();
		return Error;
	}

	public void validateWithInvalidCVV() throws InterruptedException { 
		// Validate
		// with
		// invalid
		// CVV
		// number

		d.switchTo().defaultContent();
		waitFor(9);
		//scrollBy("230");
		waitFor(2);
		//new WebDriverWait(d, 20).until(ExpectedConditions.elementToBeClickable(CName));
		d.findElement(CName).click();
		waitFor(2);
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-number[src*='hosted-fields-frame']")));
		d.findElement(CCNumber).sendKeys("5200828282828210");
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-expirationDate[src*='hosted-fields-frame']")));
		d.findElement(ExpDate).sendKeys("12/22");
		 d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-cvv[src*='hosted-fields-frame']")));
		d.findElement(CVV).sendKeys("11");
		waitFor(2);
		d.switchTo().defaultContent();
		waitFor(3);
		d.findElement(CName).click();
		waitFor(2);

	}

	public String ErrorInvalidCVV() {
		//waitForVisible(errInvalidCVVNumber);
		String Error = d.findElement(errInvalidCVVNumber).getText();
		return Error;
	}

}
