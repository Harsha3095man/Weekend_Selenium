package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://accounts.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("identifier")).sendKeys("harsha3095@gmail.com");
		//driver.findElement(By.)
		//Thread.sleep(3000);
	}

}
