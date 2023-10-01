package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginusinghtml 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("harsha3095@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("harsha@1995");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
	}

}
