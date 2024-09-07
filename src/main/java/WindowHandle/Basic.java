package WindowHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		String WinID = driver.getWindowHandle();
		
		System.out.println(WinID);
		
	}

}
