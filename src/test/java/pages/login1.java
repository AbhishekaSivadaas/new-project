package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.test1;

public class login1 {
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	
	@BeforeTest
	public void  setup()
	{
		driver=new ChromeDriver();
	}

	@BeforeMethod
	public void url()
	{
		driver.get(baseurl);
	}

	@Test
	public void test()
	{
		test1 obj= new test1(driver);
		obj.setvalues("fafds@gmail.com", "String" );
		obj.login();
	}
	}

