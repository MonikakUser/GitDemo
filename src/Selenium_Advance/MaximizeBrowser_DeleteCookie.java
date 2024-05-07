package Selenium_Advance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser_DeleteCookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monik\\chromedriver-win32//chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().deleteCookieNamed("sessioncookie");

	    driver.get("http://qaclickacademy.com/practice.php");

	}

}
