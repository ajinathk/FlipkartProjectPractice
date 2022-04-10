package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver getChromeDriver(String a)
	{
		if(a.equals("chrome"))
		{
			//
			//
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Browsers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();     //upcasting
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			return driver;
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\Browsers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();     //upcasting
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			return driver;
		}
}}
