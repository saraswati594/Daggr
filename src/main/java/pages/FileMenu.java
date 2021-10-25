package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileMenu {

public FileMenu(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//app-header/div[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]")
WebElement filemenu;

@FindBy(xpath = "//a[contains(text(),'Get Job')]")
WebElement getJob;

public void clickOnFileMenu() {
	filemenu.click();
}

public void clickOnGetjob() {
	getJob.click();
}



}
