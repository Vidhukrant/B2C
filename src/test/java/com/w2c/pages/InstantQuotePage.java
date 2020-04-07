package com.w2c.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InstantQuotePage extends BasePage {

	public InstantQuotePage(WebDriver d) {
		super(d);
	}

	public void getAQuote(String countryName, String date) {
		enterCountry(countryName);
		enterDepartureDate(date);
		submit();
	}

	private void submit() {

	}

	public void enterCountry(String countryName) {

		d.findElement(By.xpath("//div[@id='coountry']")).sendKeys(countryName);
	}

	public String getCountryErrorMsg() {
		return d.findElement(By.xpath("//div[@id='coountry']")).getText();
	}

	public void getAQuote() {
	}

	public void enterDepartureDate(String date) {
		// TODO Auto-generated method stub

	}

}
