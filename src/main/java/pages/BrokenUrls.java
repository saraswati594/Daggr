package pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokenUrls {
	
		public  BrokenUrls(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//app-header/div[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]")
		WebElement file;
		
		@FindBy(xpath="//a[contains(text(),'Broken Urls')]")
		WebElement BrokenUrls;
		
		@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]")
		 WebElement CorporateAction;
		
		@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-template2-events[1]/div[1]/div[1]/form[1]/div[1]/div[1]/textarea[1]")
		WebElement PredictedEventType;
		
		@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-template2-events[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")
		WebElement ArticleRelevancyYes;
		
       @FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-template2-events[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[3]/div[1]/input[1]")
       WebElement ArticleRelevancyNo;
       
       @FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-template2-events[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
       WebElement ArticleRelevancyNoData;
       
       @FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-template2-events[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/div[1]/input[1]")
       WebElement ArticleRelevancyDuplicate;
       
       @FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-template2-events[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/app-shared-company-search[1]/div[1]/ng-autocomplete[1]/div[1]/div[1]/in")
       WebElement CompanyName;
       
       @FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-template2-events[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]")
       WebElement EventType;
       
       @FindBy(xpath="//label[contains(text(),'Add File')]")
       WebElement AddFile;
       
       @FindBy(xpath="//label[contains(text(),'Add File')]")
       WebElement Skip;
       
       @FindBy(xpath="//button[contains(text(),'Save & Add New')]")
       WebElement Save;
       
       @FindBy(xpath="//button[contains(text(),'Submit')]")
       WebElement Submit;
       
       public void clickFile() {
    	   
    	   file.click();
       }
       
       public void clicktoBrokenUrls() {
    	   BrokenUrls.click();
       }
       
    	  public void CorporateAction() {
    		  CorporateAction.click();
    	  }
    	  
    	  public void PredictedEvencyType(String htp) {
    		  PredictedEventType.sendKeys(htp);
    	  }
    	  
    	  public void ArticleElevancyYes() {
    		  ArticleRelevancyYes.click();
    	  }
    	  
    	  public void ArticleRelevancyNo() {
    		  ArticleRelevancyNo.click();
    	  }
    	  
    	  public void ArticleElevancyNo() {
    		  ArticleRelevancyNoData.click(); 
    	  }
    	  
    	  public void ArticleRelevancyDuplcate() {
    		  ArticleRelevancyDuplicate.click();
    	  }
    	  
    	  public void CompanyName() {
    		  CompanyName.click();
    	  }
    	  
    	  public void EventType() {
    		  EventType.click();
    	  }
    	  
    	  public void AddFile() { 
    		  AddFile.click();
    	  }
    	  
    	  public void Skip() {
    		  Skip.click();
    	  }
    	  
    	  public void Save() {
    		  Save.click();
    	  }
    	  
    	  public void Submint() {
    		  Submit.click();
    	  }
    	  
    	  }

    	  
    	  
    		  
       
       
       

       
       
	


