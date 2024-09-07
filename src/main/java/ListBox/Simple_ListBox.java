package ListBox;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Simple_ListBox 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/login/");
	
	Thread.sleep(200);
	
	driver.findElement(By.xpath("//a[@class=\"_97w5\"]")).click();
	
	driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Rutuja");
	
	driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Panchal");
	
	driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("1234678756");
	
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Password@123");
	
	WebElement day = driver.findElement(By.id("day"));
	
	Select sel = new Select(day);
	
	sel.selectByVisibleText("30");
	
	WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	
	Select sel1 = new Select(month);
	
	sel1.selectByVisibleText("Aug");
	
	WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
	
	Select sel2 = new Select(year);
	
	sel2.selectByVisibleText("1995");
	
	driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
	//*[@id="u_0_o_nn"]/span[1]/label
	
	driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
	

	}

}
