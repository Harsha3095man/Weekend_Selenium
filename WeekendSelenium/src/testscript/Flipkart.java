package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		  WebDriver driver= new FirefoxDriver();
		  Thread.sleep(3000);
		  driver.get("https://www.flipkart.com");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("grocery");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//button[.='✕']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@title='Nutraj Round Kishmish Raisins']")).click();


	}

}
