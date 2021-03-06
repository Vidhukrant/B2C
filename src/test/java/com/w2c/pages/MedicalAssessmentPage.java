package com.w2c.pages;
import com.w2c.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MedicalAssessmentPage extends BasePage {
	
	public MedicalAssessmentPage(WebDriver d) {
		super(d);
		//waitForLoader();
		// TODO Auto-generated constructor stub
	}


	By againstMedicalAdviceOrMedicalTreatmentYes=By.xpath("//*[contains(text(),'Are you/this person travelling against medical advice or for medical treatment?')]//..//..//mat-button-toggle-group[1]//mat-button-toggle[1]//button[1]//div[1]");
	By againstMedicalAdviceOrMedicalTreatmentNo=By.xpath("(//*[contains(@id,'mediclAdvice-button')])[2]/div");
	
	By awaitingSurgeryTreatmentInvestigationOfProceduresYes=By.xpath("//*[contains(text(),' Are you/this person currently awaiting surgery, treatment, investigation of procedures?')]//..//..//mat-button-toggle-group[1]//mat-button-toggle[1]//button[1]//div[1]");
	By awaitingSurgeryTreatmentInvestigationOfProceduresNo =By.xpath("(//*[contains(@id,'mediclAdvice-button')])[4]/div");

	By option3Yes=By.xpath("(//*[contains(@id,'mediclAdvice-button')])[5]/div");
	By option3No=By.xpath("(//*[contains(@id,'mediclAdvice-button')])[6]/div");
	
	
	By modalCancel=By.xpath("//div[@class='close-btn-wrap']//span[contains(text(),'×')]");
	
	By option4Yes=By.xpath("(//*[contains(@id,'mediclAdvice-button')])[7]/div");
	By option4No=By.xpath("//*[contains(text(),' Do you/this person understand that any medical condition not declared will result in having no cover for any claim exacerbated by, arising from or related to that medical condition? ')]//..//..//mat-button-toggle-group[1]//mat-button-toggle[2]//button[1]//div[1]");
	By option5Yes=By.xpath("(//*[contains(@id,'mediclAdvice-button')])[9]/div");
	By option5No=By.xpath("(//*[contains(@id,'mediclAdvice-button')])[10]/div");
		
	By continueOption=By.xpath("//button[contains(text(),'Continue')]");
	
	By conditionName=By.cssSelector("input.verisk-form-control");
	
	By condtionClick=By.xpath("//*[text()='Diabetes']");
	By conditionClick1=By.xpath("//div[contains(text(),'Diabetes insipidus')]");
	
	By conditionClick2=By.xpath("//div[contains(text(),'Diabetes in pregnancy')]");
	
	By startDeclaration=By.xpath("//button[@class='verisk-btn verisk-btn-primary verisk-right-float']");
	
	By noInsulin=By.xpath("//label[text()='No']");
	By selectZero=By.xpath("//div[@class='col-lg-3 col-auto']/label[text()='0']");
	By noChainSmoker=By.xpath("//label[div[div[text()='No']]]");
	By doYouHaveAnyOfTheAbove=By.xpath("//label[div[div[text()='No - none of the above']]]");
	By done=By.xpath("//button[text()='Done']");
	By advisedToTakeMedicationForBloodPressure=By.xpath("//div[@class='col-lg-3 col-auto']/label[text()='No']");
	
	By advisesToTakeMedicationForCholestrol=By.xpath("//div[@class='col-lg-3 col-auto']/label[text()='No']");
	By continueLast=By.xpath("//*[text()='Continue']");
	By completeDeclaration=By.cssSelector("#btnReactFinish");
	By acceptPremium=By.xpath("//button[contains(text(),'Accept')]");
	By declinePremium=By.xpath("//*[text()=' Decline ']");
	By ExtraTravelPremium=By.xpath("(//*[text()=' CHOOSE '])[1]");
	By EditTrip=By.xpath("//span[@class='textsize']");
	
    //Message
	
	//By modalYes=By.xpath("//div[@class='modal-body'][contains(text(),'By answering yes to this question you understand t')]");
	

public void getMedicalAssessment()
{
	waitFor(9);
	scrollBy("350");
	d.findElement(againstMedicalAdviceOrMedicalTreatmentNo).click();
	waitFor(4);
	d.findElement(awaitingSurgeryTreatmentInvestigationOfProceduresNo).click();
	waitFor(4);
	d.findElement(option3No).click();
	waitFor(4);
	d.findElement(option4Yes).click();
	waitFor(10);
	d.findElement(option5Yes).click();
	waitFor(10);
	d.findElement(continueOption).click();
	
}

public void getMedicalAssessmentSearch(String cname)
{
waitFor(18);
d.findElement(conditionName).sendKeys(cname);
waitFor(5);
d.findElement(condtionClick).click();
waitFor(4);
d.findElement(startDeclaration).click();
waitFor(4);
d.findElement(noInsulin).click();
waitFor(4);
d.findElement(selectZero).click();
waitFor(4);
d.findElement(noChainSmoker).click();
waitFor(4);
scrollBy("150");
d.findElement(doYouHaveAnyOfTheAbove).click();
waitFor(4);
d.findElement(done).click();
waitFor(4);
d.findElement(advisedToTakeMedicationForBloodPressure).click();
waitFor(4);
d.findElement(advisesToTakeMedicationForCholestrol).click();
waitFor(4);
d.findElement(continueLast).click();
waitFor(5);
scrollBy("300");
d.findElement(completeDeclaration).click();
waitFor(25);
scrollBy("500");
d.findElement(acceptPremium).click();

}

public void reScoreMedical1(String cname){
	
	waitFor(18);
	d.findElement(conditionName).sendKeys(cname);
	waitFor(5);
	d.findElement(condtionClick).click();
	waitFor(4);
	d.findElement(startDeclaration).click();
	waitFor(4);
	d.findElement(noInsulin).click();
	waitFor(4);
	d.findElement(selectZero).click();
	waitFor(4);
	d.findElement(noChainSmoker).click();
	waitFor(4);
	scrollBy("150");
	d.findElement(doYouHaveAnyOfTheAbove).click();
	waitFor(4);
	d.findElement(done).click();
	waitFor(4);
	d.findElement(advisedToTakeMedicationForBloodPressure).click();
	waitFor(4);
	d.findElement(advisesToTakeMedicationForCholestrol).click();
	waitFor(4);
	d.findElement(continueLast).click();
	waitFor(5);
	scrollBy("300");
	d.findElement(completeDeclaration).click();
	waitFor(15);
	d.findElement(EditTrip).click();
	waitFor(13);
	scrollBy("650");
	waitFor(3);
    d.findElement(ExtraTravelPremium).click();	
	
	/*waitFor(25);
	scrollBy("500");
	d.findElement(acceptPremium).click();*/
}

}
