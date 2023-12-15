package tycspackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class SeleniumDemo {
	static String driverPath = "D:\\selinium\\geckodriver-v0.33.0-win32\\geckodriver.exe";
	public static FirefoxDriver driver;

	public static void main(String[] args) {
		
		int a=10,b=20;
		System.out.println("Hi....");
		System.out.println(a+b);
		System.out.println("Selenium demo.....");
		System.setProperty("webdriver.gecko.driver" ,driverPath);
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette" ,true);
		driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("devendrabharambe");
		driver.findElement(By.name("pass")).sendKeys("devendrabharambe");
		//driver.quit();

		

	}

}
