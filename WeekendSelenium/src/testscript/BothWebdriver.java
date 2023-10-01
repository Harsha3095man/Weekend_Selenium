package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BothWebdriver 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodrivers.exe");
		WebDriver driver1 = new FirefoxDriver();
		Thread.sleep(5000);
		driver.close();
		driver1.close();

		
	}

}
