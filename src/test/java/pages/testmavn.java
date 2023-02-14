package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testmavn {
WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

@Test
	public void test1()
	{
		
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("email")).sendKeys("afa@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ffgg");
		

	
	}
}
