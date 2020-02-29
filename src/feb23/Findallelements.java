package feb23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findallelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(3000);
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println(alllinks);
		for (WebElement links : alllinks) {
			System.out.println(links.getText()+" ---> "+links.getAttribute("href"));
			
			
		}

	}

}
