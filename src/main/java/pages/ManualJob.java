package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManualJob {

	public ManualJob (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//app-header/div[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]")
	 WebElement file;                       
	 
	@FindBy(xpath="//a[contains(text(),'Manual Job')]")
	   WebElement ManualJob;
	
	@FindBy(xpath="//p[contains(text(),'No Data Available')]") 
	 WebElement NoDataAvailable;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]")
	WebElement CorporateAction;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-template2-events[1]/div[1]/div[1]/form[1]/div[1]/app-company-article[1]/div[1]/form[1]/div[1]/input[1]")
	WebElement ArticleLink;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-template2-events[1]/div[1]/div[1]/form[1]/div[1]/app-company-article[1]/div[1]/form[1]/div[2]/input[1]")
	WebElement UploadDocument;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
    WebElement Submit;
	
	@FindBy(xpath="//button[contains(text(),'Save & Add New')]")
	WebElement Save;
	
	public void clicktoFile() {
		file.click();
	}
	
	public void clicktoManualJob() {
		ManualJob.click();
	}
		
		
	public void NoDataAvailable(String tcn) {
		NoDataAvailable.sendKeys(tcn);
	}
	
	public void CorporateAction(String ecn) {
	    CorporateAction.sendKeys(ecn);
	
	}
	
	public void ArticleLink(String pnp) {
		ArticleLink.sendKeys(pnp);
		}
	
	public void UploadDocument(String kli) {
		UploadDocument.sendKeys(kli);
		}
	
	public void Submit() {
		Submit.click();
	}
	
	public void Save() {
		Save.click();
		
	
	
		
	}
	
}  
