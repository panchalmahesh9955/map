package Action_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement ele = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(ele).build().perform();
		
		Thread.sleep(2000);

	}

}
