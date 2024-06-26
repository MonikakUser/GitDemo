import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowTableScrolling {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monik\\chromedriver-win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        
        List<WebElement> clm = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4) "));
        int sum =0;
        
        for(int i=0;i<clm.size();i++)
        {
        	sum = sum + Integer.parseInt(clm.get(i).getText());
        }
        System.out.println(sum);
        
        int total = Integer.parseInt( driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
        System.out.println(total);
        Assert.assertEquals(sum,total);
	
	}

}
