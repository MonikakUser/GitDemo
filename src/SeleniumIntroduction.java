import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
	//Chrome	
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\monik\\OneDrive\\Desktop\\Udemy_Selenium\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
		
	//Firefox	
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\monik\\OneDrive\\Desktop\\Udemy_Selenium\\geckodriver.exe");
	//WebDriver driver = new FirefoxDriver();
	
	//Edge
	System.setProperty("webdriver.edge.driver","C:\\Users\\monik\\OneDrive\\Desktop\\Udemy_Selenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	
	driver.get("https://rahulshettyacademy.com");
	System.out.println(driver.getTitle());	
	System.out.println(driver.getCurrentUrl());
	driver.close();
	}

}
