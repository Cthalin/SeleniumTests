package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchingIE {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
