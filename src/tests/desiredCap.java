package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class desiredCap {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
	/*ChromeOptions options = new ChromeOptions();
	options.addArguments("--incognito");
	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	
	@SuppressWarnings("deprecation")
	WebDriver driver  = new ChromeDriver(capabilities);*/
	
	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	  
	capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91987\\eclipse-workspace\\TrainingProject\\drivers\\chromedriver_win32\\chromedriver.exe");
	 
	//System.
	 //it is used to initialize the IE driver
	 WebDriver driver = new ChromeDriver(capabilities);
	  
	 driver.manage().window().maximize();

	 driver.get("http://gmail.com");
	  
	 driver.quit();
	}
}