import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Locator2 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		String name = "Sam";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\monik\\OneDrive\\Desktop\\Udemy_Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait - 5min time out
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Locator2 obj1 = new Locator2();
		String SPassword = obj1.getpassword(driver);
		
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name); //ID locator
		driver.findElement(By.name("inputPassword")).sendKeys(SPassword);  //name locator
		driver.findElement(By.className("signInBtn")).click(); //Class name locator
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class=\"login-container\"] h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}
	
	public String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click(); //Link Text locator 
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); //CSS Selector -> .class value
		String getPass = driver.findElement(By.cssSelector("form p")).getText(); //CSS Selector ->Parenttagname childtagname
		String[] passarray = getPass.split("'");
		String[] passarray2 = passarray[1].split("'");
		String Password = passarray2[0];
		return Password;
		
	}

}
