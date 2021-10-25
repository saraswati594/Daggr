package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class GetJob {
	
public GetJob(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h3[contains(text(),'Welcome')]")
	WebElement welcome;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/a[1]/img[1]")
	WebElement markdown;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[2]/a[1]/img[1]")
	WebElement offlineui;
	
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]")
	WebElement corporateAction;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[2]/app-shared-company-search[1]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]")
	WebElement companyName;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	WebElement companyclick;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[3]/select[1]")
	WebElement type;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[4]/select[1]")
	WebElement status;
	
	@FindBy(xpath = "//body[1]/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[5]/textarea[1]")
	WebElement website;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[6]/input[1]")
	WebElement employees;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[7]/input[1]")
	WebElement startDate;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[8]/input[1]")
	WebElement endDate;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[9]/select[1]")
	WebElement sector;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[10]/input[1]")
	WebElement industry;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[11]/app-country-state-city-search[1]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]")
	WebElement country;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[12]/app-country-state-city-search[1]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]")
	WebElement state;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[13]/app-country-state-city-search[1]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]")
	WebElement city;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[14]/textarea[1]")
	WebElement address;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[15]/input[1]")
	WebElement number;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[16]/textarea[1]")
	WebElement companyDescription;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[17]/div[2]/input[1]")
	WebElement isin;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[17]/div[3]/input[1]")
	WebElement clk;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[17]/div[4]/input[1]")
	WebElement cusip;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[17]/div[5]/input[1]")
	WebElement sedol;
	
	@FindBy(xpath="//button[contains(text(),'Back')]")
	WebElement step2;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	WebElement next;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/textarea[1]")
	WebElement irsection;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/textarea[1]")
	WebElement prsection;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[2]/input[1]")
	WebElement irname;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[3]/input[1]")
	WebElement irdesignation;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[4]/input[1]")
	WebElement irphonenumber;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[5]/input[1]")
	WebElement iremail;
	
	@FindBy(xpath="//label[contains(text(),'IR Responding to Email')]")
	WebElement irrespondingtoemail;
	
	@FindBy(xpath="//input[@id='respondingToEmailRadioYes']")
	WebElement irrespondingtoemailyes;
	
	@FindBy(xpath="//input[@id='respondingToEmailRadioNo']")
	WebElement irrespondingtoemailno;
	
	@FindBy(xpath="//label[contains(text(),'IR Responding to Phone Call')]")
	WebElement irrespondingtophonecall;
	
	@FindBy(xpath="//input[@id='respondToCallRadioYes']")
	WebElement irrespondingtophonecallyes;
	
	@FindBy(xpath="//input[@id='respondToCallRadioNo']")
	WebElement irrespondingtophonecallno;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[7]/textarea[1]")
	WebElement executivesectionlink;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[8]/textarea[1]")
	WebElement analystcoveragelink;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	WebElement nexttwo;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[3]/textarea[1]")
	WebElement EventSectionLink;
	
	
	
	@FindBy(xpath="//label[contains(text(),'Earnings Announcement')]")
	WebElement earningannouncement;
	
	@FindBy(xpath="//input[@id='earningsAnnouncementRadioYes']")
	WebElement earningannouncementyes;
	
	@FindBy(xpath="//input[@id='earningsAnnouncementRadioNo']")
	WebElement earningannouncementno;
	
	@FindBy(xpath="//label[contains(text(),'Earnings Call Conducted')]")
	WebElement earningcallconducted;
	
	@FindBy(xpath="//input[@id='earningsCallConductedRadioYes']")
	WebElement earningcallconductedyes;
	
	
	@FindBy(xpath="//input[@id='earningsCallConductedRadioNo']")
	WebElement earningcallconductedno;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[6]/app-languages[1]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]/span[1]")
	WebElement language;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[7]/select[1]")
	WebElement earningcallfrequency;
	
	@FindBy(xpath="//label[contains(text(),'Email alerts set Up')]")
	WebElement emailasertssetup;
	
	@FindBy(xpath="//input[@id='emailAlertSetupRadioYes']")
	WebElement emailasertssetupyes;
	
	@FindBy(xpath="//input[@id='emailAlertSetupRadioNo']")
	WebElement emailasertssetupno;
	
	@FindBy(xpath="//label[contains(text(),'Add to Calendar Option')]")
	WebElement addtocalenderoption;
	
	@FindBy(xpath="//input[@id='addToCalendarOptionRadioYes']")
	WebElement addtocalenderoptionyes;
	
	@FindBy(xpath="//input[@id='addToCalendarOptionRadioNo']")
	WebElement addtocalenderoptionno;
	
	@FindBy(xpath="//textarea[@id='exampleFormControlTextarea1']")
	WebElement coments;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	WebElement next3;
	
	@FindBy(xpath="//p[contains(text(),'Tracking Type')]")
	WebElement trackingtype;
	
	@FindBy(xpath="//input[@id='enum_answer_rss']")
	WebElement rssfeed;
	
	@FindBy(xpath="//input[@id='enum_answer_html']")
	WebElement HTTP;
	
	@FindBy(xpath="//input[@id='enum_answer_manual']")
	WebElement manual;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/textarea[1]")
	WebElement TrackingLink;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[3]/select[1]")
	WebElement Status2;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[4]/ng-autocomplete[1]/div[1]/div[1]/input[1]")
	WebElement ScarpingFrequency;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/div[2]/div[1]/ng-conainer[1]/app-company[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[4]/ng-autocomplete[1]/div[1]/div[1]/input[1]")
	WebElement comentss;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	WebElement Submit;
	
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-work-items[1]/div[1]/div[1]/img[1]")
	WebElement confirmationImage;
	
		
	public void showWelcome() {
		if(welcome.isDisplayed()) {
			System.out.println("you are in home page");
		}
		else {
			System.out.println("you are not in home page");
		}
	}
		
		
		public void clickCorporateAction() {
			Select select = new Select(corporateAction);
			select.selectByValue("company_database");	
		}
		
		public void enterCompanyName(String ecn) {
			companyName.sendKeys(ecn);
			
		}
		
		public void enterCompanyClick() {
			companyclick.click();
		}
		
		public void type(String ty) {
			Select selectStatus = new Select(type);
			if(ty.equalsIgnoreCase("public")) {
				selectStatus.selectByIndex(1);
			}
			else {
				selectStatus.selectByIndex(2);
			}
			
		}
		

		public void comapanyStatus(String sta) {
			Select selectStatus = new Select(status);
			if(sta.equalsIgnoreCase("Active")) {
			selectStatus.selectByIndex(1);
			} else {
				selectStatus.selectByIndex(2);
			}
			
		}
		
		public void enterWebsite(String ew) {
			website.sendKeys(ew);
		}
		
		public void enterEmployees(String ee) {
			employees.sendKeys(ee);
		}
		
		public void enterStartDate(String esd) {
			startDate.sendKeys(esd);
		}
		
		public void enterEndDate(String eed) {
			endDate.sendKeys(eed);
		}
		
		public void enterSector() {
			Select selectSector = new Select(sector);
			selectSector.selectByIndex(8);
		}
		
		public void enterIndustry(String ei) {
			industry.sendKeys(ei);
		}
		
		public void enterCountry(String ec) {
			country.sendKeys(ec);
		}
		
		public void enterState(String es) {
			state.sendKeys(es);
		}
		
		public void enterCity(String ecc) {
			city.sendKeys(ecc);
		}
		
		public void enterAddress(String ea) {
			address.sendKeys(ea);
		}
		
		public void enterNumber(String en) {
			number.sendKeys(en);
		}
		
		public void enterDescription(String ed) {
			companyDescription.sendKeys(ed);
		}

		public void enterIsin(String ei) {
			isin.sendKeys(ei);
		}
		
		public void enterCik(String ec) {
			clk.sendKeys(ec);
		}
		
		public void enterCusip(String ecu ) {
			cusip.sendKeys(ecu);
		}
		
		public void enterSedol(String ese) {
			sedol.sendKeys(ese);
		}
		
		public void submitNextone() {
			next.click();
		}
		public void enterIrsection(String irs) {
			irsection.sendKeys(irs);
		
		}
		
		public void enterprsection(String ep) {
			prsection.sendKeys(ep);
		}
		
		public void enterIrName(String ein) {
			irname.sendKeys(ein);
		}
		
		public void enterIrDesignation(String eid) {
			irdesignation.sendKeys(eid);
		}
		
		public void enterIrphoneNumber(String eipn) {
			irphonenumber.sendKeys(eipn);
		}
		
		public void enterIrEmail(String eie) {
			iremail.sendKeys(eie);
		}
		
		public void chooseirrespondingToEmail(String input) {
			
			if(input.equalsIgnoreCase("Yes")) {
				irrespondingtoemailyes.click();
			}
			else {
				irrespondingtoemailno.click();
			}
		}
		
		public void chooseIrrespondingToPhoneCall(String input) {
			if(input.equalsIgnoreCase("Yes")) {
				irrespondingtophonecallyes.click();
			}
			else {
				irrespondingtophonecallno.click();
			}
		}
		
		public void enterExecutiveSectionLink(String eesl) {
			executivesectionlink.sendKeys(eesl);
		}
		
		public void enterAnalystCoverageLink(String eacl) {
			analystcoveragelink.sendKeys(eacl);
		}
		public void enternexttwo() {
			nexttwo.click();
			
		}
		public void stepTwo() {
			step2.isDisplayed();
		}
		public void eventSee() {
			EventSectionLink.isDisplayed();
		}
		public void eventSection(String es) {
			EventSectionLink.sendKeys(es);	
			
		}
		public void chooseEarningAnnoncement(String input) {
			if(input.equalsIgnoreCase("yes")) {
				earningannouncementyes.click();
			}
			else {
				earningannouncementno.click();
			}
		}
		
		public void earningCallConduct(String input) {
			if(input.equalsIgnoreCase("yes")) {
				earningcallconductedyes.click();
			}
			else {
				earningcallconductedno.click();
			}
		}
		
		public void selectlanguage() {
			
		}
		
		public void selectEarningCallFrequency() {
			
		}
		
		public void chooseemailAlerts(String input) {
			if(input.equalsIgnoreCase("yes")) {
				emailasertssetupyes.click();
			}
			else {
				emailasertssetupno.click();
			}
		}
		
		public void chooseAddToCalender(String input) {
			if(input.equalsIgnoreCase("yes")) {
				addtocalenderoptionyes.click();
			}
			else {
				addtocalenderoptionno.click();
			}
		}
		
		public void enterComesntss(String ec) {
			coments.sendKeys(ec);
		}
		
		
		public void enterNextThree() {
			next3.click();
		}
		
		public void chooseTrackingType(String input) {
			if(input.equalsIgnoreCase("Rssfeed")) {
				rssfeed.click();
			}
			if (input.equalsIgnoreCase("Manual")) {
				manual.click();
			} else {
				HTTP.click();
			}
		}
		
		
		public void seetracking() {
			HTTP.isDisplayed();
		}
		
		public void trackingLink(String tl) {
         TrackingLink.sendKeys(tl);
		}
		
		public void enterStatustwo(String es) {
			Select selectscrap = new Select(Status2);
			if(es.equalsIgnoreCase("Active")) {
			selectscrap.selectByIndex(1);
			}
			else {
				selectscrap.selectByIndex(2);
			}
		}
		
		public void scarpingFrequency(String sf) {
			ScarpingFrequency.sendKeys(sf);
		}
		
		public void entercommentssss(String ecss) {
			comentss.sendKeys(ecss);
		}
		
		public void enterSubmit() {
			Submit.click();
		}
		
		public void confirJobCrete() {
			confirmationImage.isDisplayed();
		}
		
		
		
}

