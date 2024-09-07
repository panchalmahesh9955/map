package WindowHandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),\"OrangeHRM, Inc\")]")).click();
		
		Thread.sleep(2000);
		
		Set<String> WinID = driver.getWindowHandles();
		
		Iterator<String> Test = WinID.iterator();
		
		String ParentID = Test.next();
		
		String ChildID = Test.next();
		
		System.out.println(ParentID);
		
		System.out.println(ChildID);
		
		driver.switchTo().window(ChildID);
		
		driver.findElement(By.id("Form_submitForm_action_request")).click();
		
//		Set<String> WinIDs = driver.getWindowHandles();
//		
//		Iterator<String> Text = WinIDs.iterator();
//		
//		String ChildIDs = Text.next();
//		
		
	}

}
