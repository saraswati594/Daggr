package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyCompanyActions {
	

 public VerifyCompanyActions(WebDriver driver) {
	 
	 PageFactory.initElements(driver, this);
	 
 }
 
     @FindBy(xpath="//app-header/div[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")
     WebElement file;
     
     @FindBy(xpath="//a[contains(text(),'Verify Company Actions')]")
     WebElement VerifyCompanyActions;
     
     @FindBy(xpath="//body/app-root[1]/div[1]/app-company-template2-list[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/app-shared-company-search[1]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]")
     WebElement CompanyName;
     
     @FindBy(xpath="/html/body/app-root/div/app-verify-company-actions/div[1]/div/div[2]/div/app-company-name-change/div/div/form/div[1]/div[2]/input[1]")
     WebElement NewCompanyName;
     
     @FindBy(xpath="/html/body/app-root/div/app-verify-company-actions/div[1]/div/div[2]/div/app-liquidation/div/div/form/div[1]/div[2]/input")
     WebElement EffectiveDate;
     
     @FindBy(xpath="/html/body/app-root/div/app-verify-company-actions/div[1]/div/div[2]/div/app-liquidation/div/div/form/div[1]/div[3]/div[1]/ng-autocomplete/div/div[1]/input")
     WebElement TimeZone;
     
     @FindBy(xpath="/html/body/app-root/div/app-verify-company-actions/div[1]/div/div[2]/div/app-liquidation/div/div/form/div[2]/button[1]")
     WebElement Accept;
     
     @FindBy(xpath="/html/body/app-root/div/app-verify-company-actions/div[1]/div/div[2]/div/app-liquidation/div/div/form/div[2]/button[2]")
     WebElement Reject;
     
     @FindBy(xpath="/html/body/app-root/div/app-verify-company-actions/div[1]/div/div[2]/div/app-liquidation/div/div/form/div[2]/button[3]")
     WebElement Edit;
     
  //     public void clickFile() {
  //	 Actions action = new Actions(driver);
  //     action.moveToElement(file).click().perform();
     
  
     
     public void clicktoVerifyCompanyActions() {
    	 VerifyCompanyActions.click();
     }
     
     public void EnterCompanyName(String ecn) {
    	 CompanyName.sendKeys(ecn);
     }
     
     public void EnterNewCompanyName(String encn) {
    	 
         NewCompanyName.sendKeys(encn);
     }
     
     public void EffectiveDate(String ed) {
    	 EffectiveDate.sendKeys(ed);
    	 
     }
     
     public void enterTimezone(String etz) {
    	 TimeZone.sendKeys(etz);
     }
     
     public void enterAccept() {
    	 Accept.click();
     }
     
     public void enterReject() {
    	 Reject.click();
     }
     
     public void enterEdit() {
    	 Edit.click();
     }
    	 
     }
    
     
    	 
     
    	 
    	 
     
    
     
     
     
     
 

