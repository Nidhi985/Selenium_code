package feb23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://demoqa.com/automation-practice-form/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nidhi");//locator
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Shetty");//locator
		driver.findElement(By.xpath("//input[@value='Female']")).click();//attributes
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("2/2/2020");//locator
		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
		driver.close();*/
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
		
		
		


	}

}
