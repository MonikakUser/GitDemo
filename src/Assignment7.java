
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

public static void main(String[] args) {

// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\monik\\chromedriver-win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://qaclickacademy.com/practice.php");
	WebElement table=driver.findElement(By.id("product"));

	System.out.println(table.findElements(By.tagName("tr")).size());
	System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

	List<WebElement> secondR=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

	System.out.println(secondR.get(0).getText());

	System.out.println(secondR.get(1).getText());

	System.out.println(secondR.get(2).getText());

}

}

