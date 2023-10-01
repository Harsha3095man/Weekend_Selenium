package testscript;

import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeBrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     String Key = "webdriver.chrome.driver";
     String value = "./softwares/chromedriver.exe";
     System.setProperty(Key, value);
     ChromeDriver ch = new ChromeDriver();
     Thread.sleep(5000);
     ch.quit();
	}

}
