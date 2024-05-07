import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;


public class AssignmentDyanamicvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\monik\\chromedriver-win32\\chromedriver.exe");
			//WebDriverManager.chromedriver ().clearDriverCache ();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String label = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		
		System.out.println(label);
		
		WebElement ele = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(ele);
		dropdown.selectByVisibleText(label);
		
		driver.findElement(By.name("enter-name")).sendKeys(label);
		driver.findElement(By.id("alertbtn")).click();

		String text = driver.switchTo().alert().getText();
		 if(text.contains(label))

	     {

	    System.out.println("Alert message success");

	     }

	     else

	    System.out.println("Something wrong with execution");

	}
		

	}


