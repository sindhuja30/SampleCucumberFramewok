package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistarPage {


	public WebDriver Rdriver;
    
	public RegistarPage(WebDriver Rigdriver)
	{
		Rdriver = Rigdriver;
		PageFactory.initElements(Rigdriver, this);
	}
	
	
	@FindBy(partialLinkText = "Create New Account")
	@CacheLookup
	WebElement create;
	
	
	@FindBy(name="firstname")
	@CacheLookup
	WebElement Fname;
	
	@FindBy(name="lastname")
	@CacheLookup
	WebElement Lname;
	
	@FindBy(name="reg_email__")
	@CacheLookup
	WebElement Mobnum;
	
	@FindBy(name="reg_passwd__")
	@CacheLookup
	WebElement NewPwd;
	
	@FindBy(id = "day")
	@CacheLookup
	WebElement SelectDay;
	
	@FindBy(id = "month")
	@CacheLookup
	WebElement SelectMonth;
	
	
	@FindBy(id = "year")
	@CacheLookup
	WebElement SelectYear;
	
	@FindBy(id = "u_1_4")
	@CacheLookup
	WebElement Gender;
	
	
	
	
	@FindBy(name="websubmit")
	@CacheLookup
	WebElement regbutton;
	public void rclick() throws InterruptedException
	{
		create.click();
		Thread.sleep(5000);
	}
	
	public void registerdetails1(String fname , String lname , String num , String newpwd , String d, String mon , String ye)
	{
		Fname.sendKeys(fname);
		Lname.sendKeys(lname);
		Mobnum.sendKeys(num);
		NewPwd.sendKeys(newpwd);
		 Select dropdown = new Select(SelectDay);
	        dropdown.selectByValue(d);;
	        
	        Select dropdown1 = new Select(SelectMonth);
	        dropdown1.selectByVisibleText(mon);
	        
	        Select dropdown2 = new Select(SelectYear);
	        dropdown2.selectByValue(ye);;
	}
	
	public void radio() throws InterruptedException
	
	{
		Thread.sleep(4000);
	        Gender.click();
	}
	
	public void registerButton()
	{
		regbutton.click();
	}

}
