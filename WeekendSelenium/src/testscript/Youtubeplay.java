package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtubeplay 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		  WebDriver driver= new FirefoxDriver();
		  Thread.sleep(3000);
		  driver.get("https://www.youtube.com");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@id='search']")).sendKeys("play song");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();

	}

}
