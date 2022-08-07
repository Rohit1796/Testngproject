package pack1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomHomepage 
{
	WebDriver driver;
	@FindBy(xpath="//button[text()='Add to cart']")
	List<WebElement> addtocart;
	
	public void addTocart()
	{ 
//		List<integer> L=new ArrayList<integer>(); 
		for(int i=0;i<addtocart.size();i++)
		{
			addtocart.get(i).click();
		}
		System.out.println("Product added");

}
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement threeline;
	public void sett()
	{
		threeline.click();
		
	}
	
	@FindBy(xpath="//a[@class='bm-item menu-item'][3]")
	WebElement logout;
	public void clicklogout()
	{
		logout.click();
		
	}
	
	public PomHomepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
