package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Logo {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(200);
		
		WebElement ele = driver.findElement(By.xpath("//img[@class=\"_97vu img\"]"));
		
		String random = RandomString.make(4);
		
		String img = "Facebook";
		
		File F1 = ((TakesScreenshot)ele).getScreenshotAs(OutputType.FILE);
		
		File F2 = new File("C:\\Users\\Sanket\\Desktop\\Screesnhot\\"+img+"_"+random+".png");
		
		FileHandler.copy(F1, F2);
		
		driver.close();
		
		

	}

}
