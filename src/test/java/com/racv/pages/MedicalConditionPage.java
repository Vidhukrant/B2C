package com.racv.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MedicalConditionPage extends BasePage{
	
	
	By primaryTravellerYesClick=By.xpath("//body[contains(@class,'sitecoreTheme')]/div/div[@id='quote']/step-three/section[@class='step3']/div[@class='container']/div[@class='row pt-5 mat-custom-error']/div[@class='col-md-8 col-xl-9']/div[@class='row ng-star-inserted']/div[@class='col-md-12']/div[@class='box-panel mt-4']/div[1]/div[2]/div[1]/mat-button-toggle-group[1]/mat-button-toggle[1]/button[1]/div[1]");
    By primaryTravellerNoClick=By.xpath("//body[contains(@class,'sitecoreTheme')]/div/div[@id='quote']/step-three/section[@class='step3']/div[@class='container']/div[@class='row pt-5 mat-custom-error']/div[@class='col-md-8 col-xl-9']/div[@class='row ng-star-inserted']/div[@class='col-md-12']/div[@class='box-panel mt-4']/div[1]/div[2]/div[1]/mat-button-toggle-group[1]/mat-button-toggle[2]/button[1]/div[1]");
    By primaryTravellerYesAccess=By.xpath("//body[contains(@class,'sitecoreTheme')]/div/div[@id='quote']/step-three/section[@class='step3']/div[@class='container']/div[@class='row pt-5 mat-custom-error']/div[@class='col-md-8 col-xl-9']/div[@class='row ng-star-inserted']/div[@class='col-md-12']/div[@class='box-panel mt-4']/div[1]/div[2]/button[1]");
    
    By secondaryTravellerYesClick=By.xpath("//div[@class='row pt-5 mat-custom-error']//div[2]//div[2]//div[1]//mat-button-toggle-group[1]//mat-button-toggle[1]//button[1]//div[1]");
    By secondaryTravellerNoClick=By.xpath("//div[@class='row pt-5 mat-custom-error']//div[2]//div[2]//div[1]//mat-button-toggle-group[1]//mat-button-toggle[2]//button[1]//div[1]");
    By secondaryTravellerYesAccessClick=By.xpath("//body[contains(@class,'sitecoreTheme')]/div/div[@id='quote']/step-three/section[@class='step3']/div[@class='container']/div[@class='row pt-5 mat-custom-error']/div[@class='col-md-8 col-xl-9']/div[@class='row ng-star-inserted']/div[@class='col-md-12']/div[@class='box-panel mt-4']/div[2]/div[2]/button[1]");

    By dependantTravellerYesClick=By.xpath("//div[@class='col-lg-5 col-xl-4 ng-star-inserted']//div[@class='mat-button-toggle-label-content'][contains(text(),'Yes')]");
    By dependentTravellerNoClick=By.xpath("//div[@class='col-lg-5 col-xl-4 ng-star-inserted']//div[@class='mat-button-toggle-label-content'][contains(text(),'No')]");
	By dependentTravellerYesAccessClick=By.xpath("//div[@class='col-lg-5 col-xl-4 ng-star-inserted']//button[@class='btn btn-secondary assess-btn custom-theme-group-two ng-star-inserted'][contains(text(),'Assess')]");
    
	By continueClick=By.xpath("//button[contains(text(),'Continue')]");
	
    
    By primaryTravellerYesClickRAC=By.xpath("(//div[contains(text(),'Yes')])[1]");
    By primaryTravellerYesAccessRAC=By.xpath("(//*[contains(text(),'Assess')])[1]");
    
    //Message
    
    By primaryNMCErrorMessage=By.xpath("//body[contains(@class,'sitecoreTheme')]/div/div[@id='quote']/step-three/section[@class='step3']/div[@class='container']/div[@class='row pt-5 mat-custom-error']/div[@class='col-md-8 col-xl-9']/div[@class='row ng-star-inserted']/div[@class='col-md-12']/div[@class='box-panel mt-4']/div[1]/div[2]/p[1]");
    By secondaryNMCErrorMessage=By.xpath("//div[@class='row pt-5 mat-custom-error']//div[2]//div[2]//p[1]");
    By dependentNMCErrorMessage=By.xpath("//div[@class='col-lg-5 col-xl-4 ng-star-inserted']//p[@class='ng-star-inserted'][contains(text(),'No Medical Conditions Declaration')]");
    
    
    public MedicalConditionPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
    
    
    public void getYesMedicalConditionDeclaration()
    {
    waitFor(20);
    scrollBy("150");
    d.findElement(primaryTravellerYesClick).click();
    
    }

    public void getAccessMedicalConditionDeclaration()
    {
    waitFor(5);
    d.findElement(primaryTravellerYesAccess).click();
    
    }
    
    public void getNoMedicalConditionDeclaration()
    {
    waitFor(5);
    scrollBy("300");
    d.findElement(primaryTravellerNoClick).click();
    d.findElement(secondaryTravellerNoClick).click();
    d.findElement(continueClick).click();
    
    }
    
    public void getMedicalConditionCOntinueLaststage()
    {
    waitFor(20);
    scrollBy("350");	
    d.findElement(continueClick).click();    
    
    }
    
    public void getRACYesMedicalConditionDeclaration()
    {
    waitFor(10);
    scrollBy("150");
    d.findElement(primaryTravellerYesClickRAC).click();
    
    }

    public void getRACAccessMedicalConditionDeclaration()
    {
    waitFor(5);
    d.findElement(primaryTravellerYesAccessRAC).click();
    
    }
    
    public void getRACNoMedicalConditionDeclaration()
    {
    waitFor(5);
    scrollBy("300");
    d.findElement(primaryTravellerNoClick).click();
    d.findElement(secondaryTravellerNoClick).click();
    d.findElement(continueClick).click();
    
    }
    
    

}
