package IFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {

	public static void main(String[] args) throws InterruptedException
	{ 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
				
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click(); 
		
		boolean Test = driver.findElement(By.id("demo")).isDisplayed(); 
		
		System.out.println(Test);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("tryhome")).click(); 
		
		Thread.sleep(5000); 
		
		System.out.println("Execution completed"); 
		
		driver.close();

	}

}
