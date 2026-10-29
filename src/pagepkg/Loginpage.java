package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	
	@FindBy(name = "ulogin")
	WebElement user;
	
	@FindBy(name = "upass")
	WebElement pass;
	
	@FindBy(id = "sub_logbtn")
	WebElement button;
	
	@FindBy(xpath = "/html/body/header/div[2]/div/a[1]/img")
	WebElement logo;
	
	@FindBy(xpath = "/html/body/header/div[1]/div/a[1]")
	WebElement loginsignup;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
    public String verifyTitle()
    {
		return driver.getTitle();
    }
    public Boolean verifylogo()
    {
		return logo.isDisplayed();
    }
    public void clickLoginSignup()
    {
    	loginsignup.click();
    }
    
    public void start(String username,String password)
    {
    	user.sendKeys(username);
    	pass.sendKeys(password);
    }
    
    public void login()
    {
    	button.click();
    }
    	
    }
    	
    

