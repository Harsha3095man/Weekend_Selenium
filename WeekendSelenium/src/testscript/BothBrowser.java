package testscript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BothBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
       String key ="webdriver.chrome.driver";
       String value = "./softwares/chromedriver.exe";
       System.setProperty(key, value);
       ChromeDriver fx = new ChromeDriver();
       String key1 = "webdriver.gecko.driver";
       String Value1 = "./softwares/geckodriver.exe";
       System.setProperty(key1, Value1);
       FirefoxDriver fx1 = new FirefoxDriver();
       Thread.sleep(5000);
       fx.close();
       fx1.close();    
       
	}

}
