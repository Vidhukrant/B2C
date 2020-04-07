package com.w2c.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentDetails extends BasePage {

	public PaymentDetails(WebDriver d) {
		super(d);

	}

	By PromoCode = By.xpath("//a[@class='text-link pl-3 pr-3 pr-sm-0 hyperlink promo-btn']");
	By EnterPromoCode = By.xpath("//input[@id='promoCode']");
	By PromoApply = By.xpath("//button[@class='btn btn-secondary']");
	By ClosePromo = By.xpath("//a[@class='close']//span[contains(text(),'×')]");
	By InvalidPromoError = By.xpath("//mat-error[@id='mat-error-1']");
	By SaveAndSend =By.xpath("//*[text()='SAVE AND SEND']");
	// By
	// CName=By.xpath("//*[@id='braintree__card-view-input__cardholder-name']");
	By CName = By.id("braintree__card-view-input__cardholder-name");
	By CCNumber = By.xpath("//*[@id='credit-card-number']");
	By ExpDate = By.xpath("//*[@id='expiration']");
	By CVV = By.xpath("//*[@id='cvv']");
	By CnfPay = By.xpath("//button[@class='ng-star-inserted']");
	By CancelPay = By.xpath("//button[@class='btn btn-cancel']");
	By ErrCCName = By.xpath("//*[@data-braintree-id='cardholder-name-field-error']");
	By ErrCardNum = By.xpath("//*[contains(text(),'Please fill out a card number.')]");
	By ErrExpDate = By.xpath("//*[contains(@data-braintree-id,'expiration-date-field-error')]");
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
		waitFor(3);

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

		waitFor(9);
		scrollBy("800");
		new WebDriverWait(d, 20).until(ExpectedConditions.elementToBeClickable(CName));
		d.findElement(CName).click();
		d.switchTo().defaultContent();
		waitFor(3);
		//new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				//By.cssSelector("iframe#braintree-hosted-field-number[src*='hosted-fields-frame']")));
		waitFor(6);
		d.findElement(CName).sendKeys("Test");
		waitFor(3);
		/*d.findElement(CName).clear();*/
		
		d.findElement(CName).sendKeys(Keys.TAB);
		waitFor(3);
		d.findElement(CName).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		d.findElement(CName).sendKeys(Keys.DELETE);
		d.findElement(CName).sendKeys(Keys.TAB);
		//d.findElement(By.xpath("*enter your xpath here*")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		
	}

	public String ErrorMsgCCName() throws InterruptedException {

		waitForVisible(ErrCCName);
		waitFor(7);
		String Error = d.findElement(ErrCCName).getText();
		return Error;
	}

	public void forBlankCCNumber() throws InterruptedException { 
		// Validate
		// blank
		// card
		// number

		waitFor(9);
		scrollBy("270");
		new WebDriverWait(d, 20).until(ExpectedConditions.elementToBeClickable(CName));
		/*waitFor(20);*/
		waitFor(5);
		d.findElement(CName).sendKeys("Test");
		waitFor(5);
		d.findElement(CName).sendKeys(Keys.TAB);
		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-number[src*='hosted-fields-frame']")));
		d.findElement(CCNumber).sendKeys("4111");
		waitFor(5);
		d.findElement(CCNumber).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		d.findElement(CCNumber).sendKeys(Keys.DELETE);
		waitFor(5);
		d.findElement(CCNumber).sendKeys(Keys.TAB);
		waitFor(5);		
	}

	public String ErrorCCNumber() {
		waitForVisible(ErrCardNum);
		waitFor(5);
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


	/*public void forBlankExpDate() throws InterruptedException { 
		// Validate
		// blank expiry
		// date

		waitFor(9);
		scrollBy("350");
		new WebDriverWait(d, 20).until(ExpectedConditions.elementToBeClickable(CName));
		d.findElement(CName).sendKeys("Test");
		waitFor(3);
		//d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-number[src*='hosted-fields-frame']")));
		d.findElement(CCNumber).sendKeys("4111111111111111");
		d.findElement(CCNumber).sendKeys(Keys.TAB);
		d.findElement(CCNumber).sendKeys(Keys.TAB);	
		waitFor(5);
		d.findElement(CVV).click();
		
		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-expirationDate[src*='hosted-fields-frame']")));
		
		WebElement element = d.findElement(ExpDate);
		Actions actions = new Actions(d);
		waitFor(3);
		actions.moveToElement(element).click().perform();
		waitFor(3);
		d.findElement(CCNumber).sendKeys(Keys.TAB);

		
	}*/

	public String ErrorMsgExpDate() {
		waitForVisible(ErrExpDate);
		waitFor(4);
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

	/*public void forBlankCVV() throws InterruptedException { 
		// Validate blank
		// CVV number

		waitFor(9);
		scrollBy("500");
		new WebDriverWait(d, 20).until(ExpectedConditions.elementToBeClickable(CName));
		d.findElement(CName).sendKeys("Test");
		d.findElement(CName).sendKeys(Keys.TAB);
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-number[src*='hosted-fields-frame']")));
		d.findElement(CCNumber).sendKeys("5185 5408 1000 0019");
		d.findElement(CCNumber).sendKeys(Keys.TAB);
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-expirationDate[src*='hosted-fields-frame']")));
		d.findElement(ExpDate).sendKeys("12/24");
		d.findElement(ExpDate).sendKeys(Keys.TAB);
		d.findElement(ExpDate).sendKeys(Keys.TAB);

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-cvv[src*='hosted-fields-frame']")));
		d.findElement(CVV).click();
		d.findElement(CVV).sendKeys("036");		
		waitFor(3);
		d.findElement(CVV).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		waitFor(3);
		d.findElement(CVV).sendKeys(Keys.DELETE);
		d.findElement(CVV).sendKeys(Keys.TAB);
		waitFor(3);
		d.findElement(CVV).sendKeys(Keys.TAB);
		waitFor(4);
		d.findElement(ExpDate).click();

	}
*/
	public String ErrorMsgCVV() {
		waitForVisible(errCVVNumber);
		waitFor(4);
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
//    new WebDriverWait(d, 20).until(ExpectedConditions.elementToBeClickable(CName));
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
	/*public void forValidateInvalidCard() throws InterruptedException {
		// Validate
		// invalid
		// card
		// number

		waitFor(9);
		scrollBy("230");
		new WebDriverWait(d, 20).until(ExpectedConditions.elementToBeClickable(CName));
		d.findElement(CName).sendKeys("Test");
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-number[src*='hosted-fields-frame']")));
		d.findElement(CCNumber).sendKeys("1111 2222 2222 2222");
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-expirationDate[src*='hosted-fields-frame']")));
		d.findElement(ExpDate).click();

	}*/

	public String ErrorInvalidCard() {
		waitForVisible(errInvalidCardNum);
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

	/*public void validateInvalidExpDate() throws InterruptedException {
		// Validate
		// with
		// past
		// expiry
		// date

		waitFor(9);
		scrollBy("230");
		new WebDriverWait(d, 20).until(ExpectedConditions.elementToBeClickable(CName));
		d.findElement(CName).sendKeys("Test");
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-number[src*='hosted-fields-frame']")));
		d.findElement(CCNumber).sendKeys("5200828282828210");
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-expirationDate[src*='hosted-fields-frame']")));
		d.findElement(ExpDate).sendKeys("12/19");

	}
*/
	public String ErrorInvalidExpDate() {
		waitForVisible(errInvalidExpDate);
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

	/*public void validateWithInvalidCVV() throws InterruptedException { 
		// Validate
		// with
		// invalid
		// CVV
		// number

		waitFor(9);
		scrollBy("230");
		new WebDriverWait(d, 20).until(ExpectedConditions.elementToBeClickable(CName));
		d.findElement(CName).sendKeys("Test");
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-number[src*='hosted-fields-frame']")));
		d.findElement(CCNumber).sendKeys("5200828282828210");
		d.switchTo().defaultContent();

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-expirationDate[src*='hosted-fields-frame']")));
		d.findElement(ExpDate).sendKeys("12/22");

		new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.cssSelector("iframe#braintree-hosted-field-cvv[src*='hosted-fields-frame']")));
		d.findElement(CVV).sendKeys("1111");

		d.findElement(ExpDate).click();

	}
*/
	public String ErrorInvalidCVV() {
		waitForVisible(errInvalidCVVNumber);
		String Error = d.findElement(errInvalidCVVNumber).getText();
		return Error;
	}

}
