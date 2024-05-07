import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calender_GreenKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monik\\chromedriver-win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

           driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
           String monthNum = "6";
           String date = "15";
           String year = "2027";
           String[] expected = {monthNum, date, year};
           driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
           driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
           driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
           driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
           driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNum)-1).click();
          
           driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
           
        List<WebElement> Actual =   driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
           for(int i =0; i<Actual.size();i++)
           {
        	   System.out.println(Actual.get(i).getAttribute("value"));
        	   Assert.assertEquals(Actual.get(i).getAttribute("value"), expected[i]);
           }
        		   
        		
           driver.close();
           }

}
