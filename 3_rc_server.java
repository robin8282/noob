package ecloipse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class class1
{
static String driverPath = "C:\\selinium\\geckodriver-v0.25.0-win64\\geckodriver.exe";
public static FirefoxDriver driver;
public static void main(String args[])
{
int a=10,b=20;
System.out.println("Hi....");
System.out.println(a+b);
System.out.println("Selenium demo.....");
System.setProperty("webdriver.gecko.driver" ,driverPath);
DesiredCapabilities capabilities = DesiredCapabilities.firefox();
capabilities.setCapability("marionette" ,true);
driver= new FirefoxDriver(capabilities);
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.quit();
}
}