package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxwebdriver 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodrivers.exe");
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(5000);
	driver.close();

	}

}
