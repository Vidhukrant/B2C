package com.racq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
   protected WebDriver d;
    //protected By pageHeading = By.cssSelector("h1.jumbotron-heading");

    public BasePage(WebDriver d) {
        this.d = d;
       // waitForLoader();
    }

    public void waitForPageLoad() {

    }

    public void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public void clickByJavascriptExecuter(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) d;
 	   js.executeScript("arguments[0].click();", element);
    }
    
    public void ScrollForLocator(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) d;
        
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public boolean iselementPresent(By element)
    {
          boolean flag;
          try
          {
          d.findElement(element);
          flag=true;
          }
          catch (Exception e)       {
                 flag=false;
          }
          return flag;
    }

    public void scrollBy(String scrollByPx) {
        JavascriptExecutor js = (JavascriptExecutor) d;
        js.executeScript("window.scrollBy(0," + scrollByPx + ")");
    }

    public void waitForVisible(By locator) {
        new WebDriverWait(d, 20).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitShortForVisible(By locator) {
        new WebDriverWait(d, 30).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    
    public void explicitWait(By locator) {
        new WebDriverWait(d, 90).until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void waitForLoader() {
        try {
			waitShortForVisible(By.cssSelector(".c-loader"));
		} catch (Exception e) {
			e.printStackTrace();
		}
        //waitForVisible(By.xpath("//div[@class='c-loader ng-star-inserted']"));
        waitFor(5);
    }

    public void ScrollForLocator(By ScrollByLocator) {
        JavascriptExecutor js = (JavascriptExecutor) d;
        js.executeScript("arguments[0].scrollIntoView;", ScrollByLocator);
    }

}
