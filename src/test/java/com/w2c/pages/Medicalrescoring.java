package com.w2c.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Medicalrescoring extends BasePage {

   By totalTravelCarebeforechange=By.xpath("//li[9]/div[2]");
   By medicalCondition=By.xpath("//li[14]/div[2]");
   By totalValue=By.xpath("(//h5)[2]");
   By editQuoteDetail=By.xpath("(//span[contains(text(),'Edit quote details')])[1]");
   
   By ExtraTravelPremium=By.xpath("(//*[text()=' CHOOSE '])[1]");
   By Continue = By.xpath("//button[@class='btn btn-sm font-weight-bold continue-policy continueBG border0 btn-turqoise-color custom-theme-group-two']");
              
   By visitingPage2=By.xpath("(//*[@class='num-text'])[2]");
   By visitingPage3=By.xpath("(//*[@class='num-text'])[3]");
   
   
              public Medicalrescoring(WebDriver d) {
                             super(d);
                             // TODO Auto-generated constructor stub
              }

              
              public String gettotaltravelcarebeforechange()
              {
                             waitFor(13);
                             scrollBy("550");
                             return d.findElement(totalTravelCarebeforechange).getText();
              }
              
              public String getMedicalCondition()
              {
                             scrollBy("200");
                             return d.findElement(medicalCondition).getText();
              }
              
              public String getTotalValue()
              {
                             //scrollBy("500");
            	  			waitFor(5);
                             return d.findElement(totalValue).getText();
              }
              
              public void  geteditquoteclick()
              {
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
        
                             //waitForLoader();
                             //scrollBy("1000");
                             waitFor(4);
                             d.findElement(Continue).click();

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
            	  
            	  				waitFor(5);
                             d.findElement(visitingPage2).click();
                             
              }

              public void getEditPage3() {
                             scrollBy("500");
                             d.findElement(visitingPage3).click();
                             
              }


              
              
   
}
