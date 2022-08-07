package pack1;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyaddTocart extends TestBase
{
 
	@Test
	public void D()
	{
		PomHomepage d=new PomHomepage(Driver);
		d.addTocart();
//		Assert.assertTrue(false);

}
	@Test
	public void E()
	{
		System.out.println("Hii this is E");
		Assert.assertTrue(true);
	}
	@Test
	public void F()
	{
		String url=Driver.getCurrentUrl();
		System.out.println(url);
		String expectedurl="https://www.saucedemo.com./inventory.html";
		Assert.assertEquals(url, expectedurl);
	}
}
