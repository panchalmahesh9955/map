package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email")); 
		
		WebElement pass = driver.findElement(By.id("pass")); 
		
		WebElement Test = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		 js.executeScript("document.getElementById('email').value='Test@gmail.com';");
		 
		 js.executeScript("document.getElementById('pass').value='Password@123';");
		 
		 js.executeScript("argument[0].click()", Test);
		 
		js.executeScript("document.getElementById('email').value='Test@gmail.com';");
		
		js.executeScript("document.getElementById('pass').value='Password@123';");
		
		js.executeScript("argument[0].click()", Test);
		
		
	}

}
