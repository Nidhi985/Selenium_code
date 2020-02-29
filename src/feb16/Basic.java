
package feb16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		WebElement textBox=driver.findElement(By.name("first_name"));
		textBox.sendKeys("Nidhi");
		driver.findElement(By.name("last_name")).sendKeys("Shetty");
		driver.findElement(By.name("email")).sendKeys("nidhisshett1@gmail.com");*/
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.id("sex-1")).click();
		

	}
	

}
