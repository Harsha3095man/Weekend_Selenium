package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchtitle 
{
	public static void main(String[] args) throws InterruptedException 
	{
	   System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   Thread.sleep(3000);
	   driver.get("https://www.google.com");

	}

}
