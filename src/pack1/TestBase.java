package pack1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestBase<sendusername>
{
	WebDriver Driver;
	@BeforeClass
	public void A()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe");
        Driver = new ChromeDriver();
        Driver.get("https://www.saucedemo.com.");
//		POMLoginpage a=new POMLoginpage(Driver);
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod
	public void B()
	{
		 Pomlogin a=new  Pomlogin(Driver);
		 a.sendusername();
	      a.sendpassword();
	      a.clicklogin();
	}
	@AfterMethod
	public void c()
	{
		PomHomepage b=new PomHomepage(Driver);
		 b.sett();
		 b.clicklogout();
	}
	
	

}
