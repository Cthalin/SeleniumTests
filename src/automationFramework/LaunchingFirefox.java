package automationFramework;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxOptions;
public class LaunchingFirefox {

	public static void main(String[] args) throws InterruptedException {
		FirefoxOptions capabilities = new FirefoxOptions();
		capabilities.setCapability("marionette", true);
//		System.setProperty("webdriver.gecko.driver", "D:\\\\Automation\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://www.toolsqa.com");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
