package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Registerpage;



public class Registertest extends Baseclass {
	
	@Test
	public void main()
	{
		driver.get("https://keralaproperty.in/member/register/");
		Registerpage ob=new Registerpage(driver);
		ob.start("ammu","ammu123@gmail.com", "ammu123", "ammu123", "1234567890");
		ob.register();
		
		
	}
	
	

}
