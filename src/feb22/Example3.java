package feb22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
				System.out.println(driver.getCurrentUrl());
				driver.findElement(By.linkText("REGISTER")).click();
				driver.findElement(By.name("firstName")).sendKeys("Nidhi");
				driver.findElement(By.name("lastName")).sendKeys("Shetty");
				driver.findElement(By.name("phone")).sendKeys("999999");
				driver.findElement(By.name("userName")).sendKeys("nidhisshetty1@gmail.com");
				driver.findElement(By.name("address1")).sendKeys("Managlore,Udupi");
				driver.findElement(By.name("address2")).sendKeys("Managlore,Udupi");
				driver.findElement(By.name("city")).sendKeys("Managlore");
				driver.findElement(By.name("state")).sendKeys("Karnataka");
				driver.findElement(By.name("postalCode")).sendKeys("574244");
				driver.findElement(By.name("email")).sendKeys("Nidhi");
				driver.findElement(By.name("password")).sendKeys("Newuser2204");
				driver.findElement(By.name("confirmPassword")).sendKeys("Newuser2204");
				driver.findElement(By.xpath("//select/option[2]")).click();
				driver.findElement(By.name("register")).click();
				
				
				

	}

}
