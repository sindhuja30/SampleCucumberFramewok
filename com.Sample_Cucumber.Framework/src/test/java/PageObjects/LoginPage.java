package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver Ldriver;
    
	public LoginPage(WebDriver Rdriver)
	{
		Ldriver = Rdriver;
		PageFactory.initElements(Rdriver, this);
	}
	
	@FindBy(name="email")
	@CacheLookup
	WebElement User;
	
	@FindBy(name="pass")
	@CacheLookup
	WebElement Password;
	
	@FindBy(name="login")
	@CacheLookup
	WebElement loginbutton;
	
	public void userdetails(String user , String password )
	{
		User.sendKeys(user);
		Password.sendKeys(password);
	}
	
	public void loginButton()
	{
		loginbutton.click();
	}
	
	
	
	
	
	
	
	
	

}
