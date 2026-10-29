package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Loginpage;

public class Logintest extends Baseclass {


	@Test
	public void verifyTitleTest()
	{
		Loginpage ob= new Loginpage(driver);
		Assert.assertEquals(ob.verifyTitle(),"Kerala Real Estate Website  |  Kerala Property");
		}
		
	
	@Test
	public void veriftLogoTest()
	{
	
		Loginpage ob=new Loginpage(driver);
		Assert.assertTrue(ob.verifylogo());
	}
	
	@Test
	public void main()
	{
		Loginpage ob=new Loginpage(driver);
		ob.clickLoginSignup();
		ob.start("ammu123", "123456");
		ob.login();
	
	

		
		
		
	}
	
	

}
