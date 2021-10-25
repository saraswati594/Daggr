package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;
	public Login(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	
	// Declare elements on Login page by @findBy annotation
	@FindBy(xpath="//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/form[1]/input[3]")
	private WebElement login_lnkbtn;

	@FindBy(xpath="//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/form[1]/div[1]/input[1]")
	private WebElement username_txt;

	@FindBy(xpath="//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/form[1]/div[2]/input[1]")
	private WebElement password_txt;
	
	@FindBy(xpath = "/html/body/app-root/div/app-default/div/div/h3")
	private List<WebElement> login_success;
	
	@FindBy(xpath = "//app-header/div[1]/nav[1]/div[1]/ul[2]/li[1]/a[2]")
	 WebElement logout;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	WebElement logoutPage;
	
	

	 //Utilization: Methods to perform action on the web page
	public void click_login_link() {
		login_lnkbtn.click();
	}	

	
	public void enter_username(String uname) {
		username_txt.sendKeys(uname);
	}
	
	
	public void enter_password(String pwd) {
		password_txt.sendKeys(pwd);
	}
	
//	public void log() {
//		logout.isDisplayed();
//	}
//	
	public void logoutPage() {
		logout.click();
		logoutPage.click();
	}
	
	public void getTitle() {
		if(driver.getTitle().equals("Daggr")) {
			System.out.println("logged in");
		}
		else {
			System.out.println("logged in failed");
		}
		
		
	}
	
	//Login assertion
	public void validate_login() {
		if(login_success.size()==1) {
			System.out.println("Login successful");
		}else {
			System.out.println("Login failed");
		}
	}
	
	
}
