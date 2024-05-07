
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\monik\\OneDrive\\Desktop\\Udemy_Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='form_fields[travel_comp_date]']")));
	    driver.findElement(By.xpath("//input[@name='form_fields[travel_comp_date]']")).click();  
		
	    List<WebElement> cal = driver.findElements(By.className("dayContainer"));
	    int count = driver.findElements(By.className("dayContainer")).size();
	    
	    for(int i=0;i<count;i++)
	    {
	    	String text = driver.findElements(By.className("dayContainer")).get(i).getText();
	    	
	    	if(text.equalsIgnoreCase("23"))
	    	{
	    		driver.findElements(By.className("dayContainer")).get(i).clear();
	    		break;
	    	}
	    }
	}
}