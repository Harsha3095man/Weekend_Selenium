package Select;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener;

public class Reverseorder {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/Alloption.html");
		WebElement ele= driver.findElement(By.id("hotel"));
		TreeSet<String> t=new TreeSet<String>(Collections.reverseOrder());
		Select s= new Select(ele);
		List<WebElement> opt = s.getOptions();
		for(WebElement o:opt)
		{
			String Text=o.getText();
			t.add(Text);
		}
		for(String x:t)
		{
			System.out.println(x);
		}
	}

}
