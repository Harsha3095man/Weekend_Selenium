package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisabledorEnabled {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		  WebDriver driver= new FirefoxDriver();
		  Thread.sleep(3000);
		  driver.get("https://www.facebook.com");
		  Thread.sleep(2000);
		  WebElement ele= driver.findElement(By.id("a1"));
		  if(ele.isDisplayed())
		  System.out.println("Displayed");
		  else
		   System.out.println("Not dispalyed");	
		   WebElement ele2 = driver.findElement(By.id("a2"));
		   if(ele2.isEnabled())
			   System.out.println("Enabled");
		   else
			   System.out.println("Disabled");
		  WebElement ele3= driver.findElement(By.xpath("//input[@id='C1']"));
		  if (ele3.isSelected())
			  System.out.println("Checked");
		  else
			  System.out.println("Unchecked");
		  
		  
		   
			   
	}

}
