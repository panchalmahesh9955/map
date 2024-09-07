package ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Withut_Select_Class {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Rutuja");
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Panchal");
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("1234678756");
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Password@123");
		
		WebElement day = driver.findElement(By.id("day"));
		
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
		List<WebElement> D1 = driver.findElements(By.xpath("//select[@id=\"day\"]"));
		
		int no = D1.size();
		
		System.out.println("No of days:- "+no);
		
		for(int i = 0; i<=no;i++)
		{
			String dayvalues = D1.get(i).getText();
			
			System.out.println(dayvalues);
			
			if(dayvalues.equals("30"))
			{
				D1.get(i).click();
			}
		}
		List<WebElement> D2 = driver.findElements(By.xpath("//select[@id=\"month\"]"));
		
		int no2 = D2.size();
		
		for(int i =0; i<=no2; i++)
		{
			String monthvalues = D2.get(i).getText();
			
			System.out.println(monthvalues);
			
			if(monthvalues.equals("08"))
			{
				D2.get(i).click();
			}
		}

	}

}
