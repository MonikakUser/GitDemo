package JavaStreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoCartListSortingUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monik\\chromedriver-win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		
		// click on column

		
		driver.findElement(By.xpath("//tr/th[1]")).click();


		// capture all webelements into list
		
		List<WebElement> elementsList =  driver.findElements(By.xpath("//tr/td[1]"));

		
		// capture text of all webelements into new(original) list
		List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		//List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());



		// sort on the original list of step 3 -> sorted list

		List<String> sortedList =  originalList.stream().sorted().collect(Collectors.toList());

		

		// compare original list vs sorted list

		//Assert.assertTrue(originalList.equals(sortedList));
		List<String> pricelist;

		// scan the name column with getText ->Beans->print the price of the Rice

		do

		{

			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		
			pricelist = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceList(s)).collect(Collectors.toList());
		
			pricelist.forEach(a->System.out.println(a));
			
			if(pricelist.size()<1)
			{
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		

	}while(pricelist.size()<1);

		
	}
		
	private static String getPriceList(WebElement s) {
		// TODO Auto-generated method stub
	String price =	s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
