package Action_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) throws InterruptedException
	{
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
			
			driver.switchTo().frame("iframeResult");
			
		WebElement ele = 	driver.findElement(By.xpath("//button[contains(text(),\"Copy Text\")]"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(ele).build().perform();
		
		Thread.sleep(300);
		
		String text1 = driver.findElement(By.id("field1")).getText();
		
		String text2 = driver.findElement(By.id("field2")).getText();
		
		if(text1==text2)
		{
			System.out.println("Done Successfully");
		}
		else
		{
			System.out.println("Failed");
		}
		//driver.close();
		 
	}

}
