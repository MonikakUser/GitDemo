package Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\monik\\OneDrive\\Desktop\\Udemy_Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window = driver.getWindowHandles();//parentid , childid
		Iterator<String> it = window.iterator();
		String parentid = it.next();
		String Childid = it.next();
		driver.switchTo().window(Childid);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String email = (driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0]);
		driver.switchTo().window(parentid);
		driver.findElement(By.id("username")).sendKeys(email);
		}

}