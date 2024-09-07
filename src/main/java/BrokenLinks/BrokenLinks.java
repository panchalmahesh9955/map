package BrokenLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) 
	{
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
			
			driver.get("https://www.facebook.com/");
			
//			List<WebElement> Link = driver.findElements(By.tagName("a"));
//			
//			System.out.println(Link.size());
//			
//			for(WebElement Links : Link)
//			{
//				System.out.println(Links.getText());
//				System.out.println(Links.getAttribute("href"));
//			}
//			driver.quit();
//			
			List<WebElement> Link = driver.findElements(By.tagName("a"));
			
			System.out.println(Link.size());
			
			for(WebElement Links : Link)
			{
				System.out.println(Links.getAttribute("href"));
				System.out.println(Links.getText());
				
			}
			
	}

}
