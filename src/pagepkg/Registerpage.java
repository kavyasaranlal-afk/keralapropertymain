package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registerpage {
	
	WebDriver driver;
	
	@FindBy(name="listowner")
	WebElement dp;
	
	@FindBy(name="utitle")
	WebElement name;
	 
	@FindBy(id="umail")
	WebElement email;
	
	@FindBy(name="memberpass")
	WebElement pass;
	
	@FindBy(name="repass")
	WebElement conpass;
	
	@FindBy(name="umobile")
	WebElement phone;
	
	@FindBy(name="sub_regbutton")
	WebElement button;
	
    public Registerpage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements( driver, this);
    }
    public void start(String Name,String Email,String Pass,String Conpass,String Phone)
    {
    	Select ob=new Select(dp);
    	ob.selectByValue("agent");
    	name.sendKeys(Name);
    	email.sendKeys(Email );
    	pass.sendKeys(Conpass);
    	phone.sendKeys(Phone );
    }
    public void register()
    {
    	button.click();
    }


    }
    


 