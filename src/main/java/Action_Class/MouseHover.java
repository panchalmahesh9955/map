package Action_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args)
	{
		 WebDriver  driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		 
		 driver.get("https://www.amazon.in/");
		 
		WebElement ele = driver.findElement(By.id("nav-link-accountList"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).build().perform();
		
		 
	}

}
