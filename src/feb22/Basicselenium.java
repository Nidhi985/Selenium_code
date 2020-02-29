package feb22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		System.out.println(driver.getTitle());
		WebElement textBox=driver.findElement(By.name("first_name"));
		textBox.sendKeys("Nidhi");
		driver.findElement(By.name("last_name")).sendKeys("Shetty");
		driver.findElement(By.name("email")).sendKeys("nidhisshett1@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("99877676565");
		driver.findElement(By.name("address")).sendKeys("udupi");
		driver.findElement(By.name("city")).sendKeys("Mangalore");
		driver.findElement(By.name("zip")).sendKeys("574244");
		driver.findElement(By.name("website")).sendKeys("Website");
		//driver.findElement(By.xpath("//input[@value='yes']")).click();//using xpath to click on radio button
		driver.findElement(By.name("comment")).sendKeys("Automation");
		List<WebElement> list=driver.findElements(By.name("hosting"));//using findelements to click on Radio button
		list.get(0).click();
		driver.close();
		
		
		
				

}

	
}
