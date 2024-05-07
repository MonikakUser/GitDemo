import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\monik\\OneDrive\\Desktop\\Udemy_Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait - 5min time out
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul"); //ID locator
		driver.findElement(By.name("inputPassword")).sendKeys("hello23");  //name locator
		driver.findElement(By.className("signInBtn")).click(); //Class name locator
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); // CSS Selector -> tagname.classname 
		
		driver.findElement(By.linkText("Forgot your password?")).click(); //Link Text locator 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john"); //xpath locator- //Tagname[@attribute=’value’]
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("monika@gmail.com"); //CSS Selector ->Tagname[attribute=’value’]
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); //xpath locator- //Tagname[@attribute=’value’][index]
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com"); //CSS Selector ->Tagname[@attribute=’value’]:nth-child(index
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("2013456789");//xpath locator-//parentTagname/childTagname
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); //CSS Selector -> .class value
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); //CSS Selector ->Parenttagname childtagname
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();//xpath locator-//button[contains(@class,'submit')].  – Regular expression 

		Thread.sleep(1000); //

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul"); //CSS Selector ->#id
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); //CSS Selector-input[type*='pass'] – CSS
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	}

	private static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
