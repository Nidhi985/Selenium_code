package feb22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.findElement(By.name("firstname")).sendKeys("Nidhi");
		driver.findElement(By.id("lastname")).sendKeys("Shetty");
		List<WebElement> list = driver.findElements(By.name("sex"));
		list.get(1).click();
		List<WebElement> list1 = driver.findElements(By.name("exp"));
		//int a = list1.size();
		for (WebElement list2 : list1) {
			list2.click();
		}
			driver.findElement(By.id("datepicker")).sendKeys("22/04/1995");
			driver.findElement(By.id("profession-1")).click();
		List<WebElement> list3=driver.findElements(By.name("tool"));
		for(WebElement list4: list3)
		{
			if(list4.getAttribute("value").contains("Selenium Webdriver"))
			{
				list4.click();
			}
			
		}
			
			
		
		
		
			
			
		}
		
	}


