package BrokenLinks;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken 
{
	public static void main(String[] args) throws IOException 
	{
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			
			driver.get("https://the-internet.herokuapp.com/status_codes");
			
			List<WebElement> Links = driver.findElements(By.tagName("a"));
			
			System.out.println(Links.size());
			
			System.out.println(Links);
			
			int brokenlink = 0;
			
		    for(WebElement element : Links)
		    {
		    	String url = element.getAttribute("href");
		    	{
		    	if(url == null || url.isEmpty())
		    {
		    		System.out.println("URL is empty");
		    }
		    	URL Link = new URL(url);
		    	
		    	HttpURLConnection httpcode = (HttpURLConnection) Link.openConnection();
		    	
		    	httpcode.connect();
		    	
		    	if(httpcode.getResponseCode() >= 400)
		    	{
		    		System.out.println(httpcode.getResponseCode() + "-->"+url+" is a broken link");
		    	}
		    	else
		    	{
		    		System.out.println(httpcode.getResponseCode() + "-->"+url+" is not a broken link");
		    	}
		    	
		    	}	
		    }	
	}

}
