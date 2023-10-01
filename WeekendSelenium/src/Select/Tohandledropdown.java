package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Tohandledropdown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/Alloption.html");
		WebElement ele= driver.findElement(By.id("hotel"));
		Thread.sleep(2000);
		Select a= new Select(ele);
		a.selectByIndex(3);
		Thread.sleep(2000);
		a.selectByVisibleText("BBB");
		Thread.sleep(2000);
		a.deselectAll();

	}

}
