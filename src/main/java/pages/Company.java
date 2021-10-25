package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Company {

public Company (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
   
   @FindBy(xpath="//app-header/div[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]")
   WebElement Edit;
   
   @FindBy(xpath="//app-header/div[1]/nav[1]/div[1]/ul[1]/li[2]/div[1]/a[1]")
   WebElement Company;
   
   @FindBy(xpath="//body/app-root[1]/div[1]/app-company-template2-list[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/app-shared-company-search[1]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]")
   WebElement CompanyName;
   
   @FindBy(xpath="//body/app-root[1]/div[1]/app-company-template2-list[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]")
   WebElement CompanyAddedDate;
   
   @FindBy(xpath="//body/app-root[1]/div[1]/app-company-template2-list[1]/div[1]/div[1]/div[1]/div[2]/div[3]/app-country-state-city-search[1]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]")
   WebElement Country;
   
   @FindBy(xpath="//button[contains(text(),'Next')]")
   WebElement Next;
   
   @FindBy(xpath="//button[contains(text(),'Previous')]")
   WebElement Previous;
   
  // public void clickEdit() {
	//   Actions action = new Actions(driver);
	  // action.moveToElement(Edit).click().perform();
   
     //}
	   
   public void clickCompany() {
	   Company.click();
	   
   }
   
   public void CompanyName(String ecn) {
	   CompanyName.sendKeys(ecn);
	 
   }
   
   public void EnterCompanyAddedDate(String dte) {
	   CompanyAddedDate.sendKeys(dte);
	 
   }   
	public void startDate(String dte) { 
		CompanyAddedDate.sendKeys(dte);
	}	
	public void endDate(String dte) {
		CompanyAddedDate.sendKeys(dte);
	
	}
	
	public void clickCountry() {
		Country.sendKeys();
		
	}
	
	public void clickNext() {
		Next.click();
	}
	   
   }
   

