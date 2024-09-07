package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp1 
{
	public static void main(String[] args) 
	{
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			
			driver.get("https://www.bigbasket.com/");
			
			System.out.println(driver.getTitle());

	}

}
