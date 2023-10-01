package testscript;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicitwait {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		  WebDriver driver= new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  driver.get("https://www.flipkart.com");
		  driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("grocery");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[.='✕']")).click();  
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  driver.findElement(By.xpath("//a[@title='Nutraj Round Kishmish Raisins']")).click();
		  Set<String> all_id=driver.getWindowHandles();
		  for (String id :all_id ) 
		  {
			driver.switchTo().window(id);
		}
		  
	}

}
