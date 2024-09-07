package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
//import java.util.logging.FileHandler;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot_Simple {

	public static void main(String[] args) throws InterruptedException,  IOException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(200);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\Sanket\\Desktop\\Screesnhot\\.png");
		
		System.out.println(src);
		
		FileHandler.copy(src, dest);
		
	}

}
