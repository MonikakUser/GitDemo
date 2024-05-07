import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfLinksScope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\monik\\OneDrive\\Desktop\\Udemy_Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//count of links in whole page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//count of links in footer *limit the scope
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		
		// count of link in one column
		
		WebElement footercolumndriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footercolumndriver.findElements(By.tagName("a")).size());
		
		//click on the links
		
		for(int i=1;i<footercolumndriver.findElements(By.tagName("a")).size();i++)
			
		{
			String Clickontab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footercolumndriver.findElements(By.tagName("a")).get(i).sendKeys(Clickontab);
			Thread.sleep(5000L);
		}
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it= window.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
