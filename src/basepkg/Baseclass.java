package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	
	public WebDriver driver;
	public String url="https://keralaproperty.in/";
	
	@BeforeMethod
	public void start()

	{
		driver=new ChromeDriver();
		driver.get(url);
	}
}
