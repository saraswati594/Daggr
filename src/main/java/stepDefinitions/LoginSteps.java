package stepDefinitions;

import java.util.Properties;
import org.testng.Assert;
import base.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Login;

public class LoginSteps extends Base {

	Login login;
	Properties prop;

	@Given("user on the Login page URL")
	public void loginPage() {
		initialization();
		login = new Login(driver);
	}

	@Then("user able see Sign In Page")
	public void seeSignPage() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Signin");
	}

	@Then("user enter username as \"([^\"]*)\"$")
	public void enterUserName(String username) {
		login.enter_username(username);
	}

	@Then("user enter password as \"([^\"]*)\"$")
	public void enter_Pass(String password) {
		login.enter_password(password);
	}

	@When("user click on login button")
	public void submitLogin() {
		login.click_login_link();
	}

	@Then("user able to login successfully")
	public void loggedIn() {
		Assert.assertEquals(driver.getTitle(), "Daggr");
	}

	@And("user click on Sign out function")
	public void signOut() {
		login.logoutPage();
	}

	@Then("user got logout from the application and land on sign in page")
	public void successLogin() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Signin");
	}

	@Then("user not be able to login successfully")
	public void should_not_login() {
		login.validate_login();
		Assert.assertEquals(driver.getTitle(), "Signin");

	}

}