package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	// Create a constructor and initialize the variables
	public Base() {
		try {
			this.prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\hp\\Downloads\\Cucumber-TestNG-master\\Cucumber-TestNG\\src\\main\\java\\config\\configuration.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\hp\\Downloads\\Cucumber-TestNG-master\\Cucumber-TestNG\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\hp\\Downloads\\Cucumber-TestNG-master\\Cucumber-TestNG\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Driver not exits");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}

	

}