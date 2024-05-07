package Selenium_Advance;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinkURL {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monik\\chromedriver-win32//chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 
		 List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		 SoftAssert a = new SoftAssert();
		 
		 for(WebElement link : links)
		 {
			
			 String url = link.getAttribute("href");
				HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();
			int response =	conn.getResponseCode();
			System.out.println(response); 
			
			a.assertTrue(response<400, "The link with text "+link.getText()+" is broken with code "+response);
			/*if(response>400)
			{
				System.out.println("The link with text "+link.getText()+" is broken with code "+response );
				Assert.assertTrue(false);
			}*/
		 }
		 a.assertAll();
		 
		 /*String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		 
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
	int response =	conn.getResponseCode();
	System.out.println(response);*/
		
		 
	}
	private static Object getReturnCode(WebElement link) {

		// TODO Auto-generated method stub

		return null;
	}

}
