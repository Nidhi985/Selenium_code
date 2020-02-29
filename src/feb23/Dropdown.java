package feb23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement list=driver.findElement(By.id("select-demo"));
		Select list1=new Select(list);
		list1.selectByIndex(2);//this is using index, using value can be written as "list1.selectByvalue("Monday")
		/*driver.findElement(By.id("select-demo"));
		driver.findElement(By.xpath("//option[@value='Monday']")).click();*///using xpath
		Select list3=new Select(driver.findElement(By.name("States")));
		list3.selectByIndex(0);
		list3.selectByValue("Florida");
		list3.selectByVisibleText("New York");
		list3.deselectAll();
		/*driver.findElement(By.id("multi-select"));
		driver.findElement(By.xpath("//option[@value='Florida']")).click();*///using xpath
		Thread.sleep(2000);//wait
		driver.close();//close the current window
		//driver.quit();//closes all the windows opened by the "same driver"
		
	}

}
