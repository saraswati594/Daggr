package stepDefinitions;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;

import base.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FileMenu;
import pages.GetJob;
import pages.Login;

public class GetJobStep extends Base {
	Login login;
	GetJob getjob;
	FileMenu fileMenu;

	@Given("open daggr application")
	public void loginToDaggr() throws InterruptedException {
		initialization();
		login = new Login(driver);
		Thread.sleep(1000);
	}

	@Then("user enter valid username \"([^\"]*)\"$")
	public void enterUserName(String username) {
		
		login.enter_username(username);
	}

	@Then("user enter valid password \"([^\"]*)\"$")
	public void enter_Pass(String password) {
		login.enter_password(password);
	}

	@When("click on login button")
	public void submitLogin() throws InterruptedException {
		login.click_login_link();
		// Thread.sleep(1000);
	}

	@Then("user succesfully reached to homepage")
	public void succuessfullHomepage() {
		Assert.assertEquals(driver.getTitle(), "Daggr");
	}

	@When("user able to see homepage")
	public void seeHomepage() {
		getjob = new GetJob(driver);
		getjob.showWelcome();
	}

	@Then("user click on filemenu")
	public void clickFileMenu() {
		fileMenu = new FileMenu(driver);
		fileMenu.clickOnFileMenu();
	}

	@And("user click on getjob functionality")
	public void navigaetToGetJob() throws InterruptedException {
		fileMenu = new FileMenu(driver);
		fileMenu.clickOnGetjob();
	}

	@Then("user choose to company database function")
	public void companyDatabase() {
		getjob.clickCorporateAction();
	}

	@And("user enter CompanyName mandatory as \"([^\"]*)\"$")
	public void enterCompany(String cname) throws InterruptedException {
		getjob.enterCompanyName(cname);
		Thread.sleep(4000);
		getjob.enterCompanyClick();

	}
	
	//

	@And("user select the type mandatory as \"([^\"]*)\"$")
	public void clickPublic(String type) {
		getjob.type(type);
	}

	@And("user select companystatus mandatory \"([^\"]*)\"$")
	public void clickStatus(String cstatus) {
		getjob.comapanyStatus(cstatus);
	}

	@And("user enter company website mandatory as \"([^\"]*)\"$")
	public void enterWebsite(String url) {
		getjob.enterWebsite(url);
	}

	@And("user enter employee as \"([^\"]*)\"$")
	public void enterDetails(String emp) {
		getjob.enterEmployees(emp);
	}

	@And("user enter startdate as \"([^\"]*)\"$")
	public void enterStartDate(String sd) {
		getjob.enterStartDate(sd);
	}

	@And("user enter enddate as \"([^\"]*)\"$")
	public void enterEnddate(String ed) {
		getjob.enterEndDate(ed);
	}

	@And("user enter sector and industry")
	public void enterSectorIndustry() {
		getjob.enterSector();
		getjob.enterIndustry("abc");
	}

	@And("user select countryname mandatory as \"([^\"]*)\"$")
	public void enterCountry(String con) throws InterruptedException {
		getjob.enterCountry(con);
		Thread.sleep(4000);
		getjob.enterCompanyClick();

	}

	@And("user enter address, phonenumber and company description")
	public void enterAddresNumbComDesc() {
		getjob.enterAddress("abc");
		getjob.enterNumber("797821323238");
		getjob.enterDescription("abc");
	}

	@And("user enter company identifiers as ISIN, CIK, CUSIP and SEDOL")
	public void enterCompanyIdentifiers() {
		getjob.enterIsin("212");
		getjob.enterCik("323");
		getjob.enterCusip("332");
		getjob.enterSedol("3232");
	}

	@Then("user click on first next button to preceed")
	public void clickNext() throws InterruptedException {
		getjob.submitNextone();
		Thread.sleep(1000);
	}

	@When("user able to see second step")
	public void ableToSeeSecondStep() {
       getjob.stepTwo();
	}

	@Then("user enter IrSection Link mandatory as \"([^\"]*)\"$")
	public void enterIr(String ir) {
		getjob.enterIrsection(ir);
	}

	@And("user enter PrSection Link as \"([^\"]*)\"$")
	public void enterPrSection(String pr) {
		getjob.enterprsection(pr);
	}

	@And("user enter IR Executive as IRName, IRDesignation, IRPhoneNumber, IREmail")
	public void enterIrExecutive() {
		getjob.enterIrName("abc");
		getjob.enterIrDesignation("abc");
		getjob.enterIrphoneNumber("58595575");
		getjob.enterIrEmail("abc@gmail.com");
	}

	@And("user press IRResponding to email \"([^\"]*)\"$")
	public void enterIrrespondingEmail(String ir) {
		getjob.chooseirrespondingToEmail(ir);
	}

	@And("user press IRResponding to phone call \"([^\"]*)\"$")
	public void enterIrrespondingphone(String ircall) {
		getjob.chooseIrrespondingToPhoneCall(ircall);
	}

	@And("user enter Executives Section Link \"([^\"]*)\"$")
	public void enterIrExecuive(String esl) {
		getjob.enterExecutiveSectionLink(esl);
	}

	@And("user enter Analyst Coverage Link \"([^\"]*)\"$")
	public void enterAnalystCoverageLink(String acL) {
		getjob.enterAnalystCoverageLink(acL);
	}

	@Then("user click on second next button to proceed")
	public void enterNextBtn() {
		getjob.enternexttwo();
	}

	@When("user able to see third step")
	public void seethirsStep() {
       getjob.eventSee();
	}

	@Then("user enter eventsection link mandatory as \"([^\"]*)\"$")
	public void enterEventSec(String es) {
		getjob.eventSection(es);
	}

	@And("user press Earnings Announcement \"([^\"]*)\"$")
	public void pressEarnings(String pe) {
getjob.chooseEarningAnnoncement(pe);
	}

	@And("user press Earnings Call Conducted \"([^\"]*)\"$")
	public void pressEarningsCall(String pec) {
getjob.earningCallConduct(pec);
	}

	@And("user select Language \"([^\"]*)\"$")
	public void enterLanguage(String el) {
System.out.println(el);
	}

	@And("user select Earnings Call Frequency \"([^\"]*)\"$")
	public void pressEarningsCallFreq(String pecf) {
System.out.println("dsds");
	}

	@And("user press Email alerts set Up \"([^\"]*)\"$")
	public void pressEmailAlerts(String pea) {
getjob.chooseemailAlerts(pea);
	}

	@And("user press Add to Calendar Option \"([^\"]*)\"$")
	public void addToCalender(String atc) {
			getjob.chooseAddToCalender(atc);
	}

	@And("user enter Comments \"([^\"]*)\"$")
	public void enterComments(String ec) {
			getjob.enterComesntss(ec);
	}

	@Then("user click on third next button")
	public void clickEnterNext() {
		getjob.enterNextThree();
	}

	@When("user able to see fourth step")
	public void seeFourthStep() {
getjob.seetracking();
	}

	@Then("user press Tracking Type mandatory \"([^\"]*)\"$")
	public void selectTrackingType(String ty) {
		getjob.chooseTrackingType(ty);
	}

	@And("user enter tracking link mandatory as \"([^\"]*)\"$")
	public void enterTrack(String et) {
		getjob.trackingLink(et);
	}

	@And("user tracking status \"([^\"]*)\"$")
	public void selectTrackingStatus(String trkstatus) {
		getjob.enterStatustwo(trkstatus);
	}

	@And("user enter scraping frequency as \"([^\"]*)\"$")
	public void enterScrap(String es) {
		getjob.scarpingFrequency(es);
		
	}

	@And("user enter commentss \"([^\"]*)\"$")
	public void enterCommentss(String es) {
		getjob.entercommentssss(es);
	}

	@When("user click on final next Step")
	public void finalNext() throws InterruptedException {
		Thread.sleep(1000);
		getjob.enterSubmit();
	}

	@Then("user able to create a get job")
	public void ableToCreateJob() {
getjob.confirJobCrete();
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
