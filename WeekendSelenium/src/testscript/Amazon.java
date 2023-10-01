package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon
{

	public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	  WebDriver driver= new FirefoxDriver();
	  Thread.sleep(3000);
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 13");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 13 (128GB) - Blue')]")).click();
	}

}
