package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googleclick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		  WebDriver driver= new FirefoxDriver();
		  Thread.sleep(3000);
		  driver.get("https://www.google.com/search?client=firefox-b-d&q=harsha");
		  Thread.sleep(1000);
		 List<WebElement> all_links = driver.findElements(By.xpath("//h3"));
		 for(WebElement ele:all_links)
		 {
		  String text = ele.getText();
		  System.out.println(text);

	}

	}
}