package Action_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) 
	{
		 WebDriver  driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		 
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		 
		 WebElement frame =driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]")); 
		 
		 driver.switchTo().frame(frame);
		 
		WebElement ele1 =  driver.findElement(By.xpath("//img[@alt=\"The peaks of High Tatras\"]"));
		
		WebElement ele2 = driver.findElement(By.id("trash"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(ele1, ele2).build().perform();

	}

}
