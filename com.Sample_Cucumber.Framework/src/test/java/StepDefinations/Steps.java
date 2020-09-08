package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import PageObjects.RegistarPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	public WebDriver driver;
	public LoginPage lpage;
	public RegistarPage repage;
	
	@Given("^User Launch the Chrome Browser$")
	public void user_Launch_the_Chrome_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\Chrome85\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		lpage = new LoginPage(driver);
		repage = new RegistarPage(driver);
	   
	}

	@When("^User Open the Application URL \"([^\"]*)\"$")
	public void user_Open_the_Application_URL(String url) throws Throwable {
		driver.get(url);
		
	    
	}

	/*@When("^User enter UserName as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enter_UserName_as_and_Password_as(String user, String pwd) throws Throwable {
		lpage.userdetails(user, pwd);
		
	   
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable {
		lpage.loginButton();
	    
	}

	@Then("^Close the Browser$")
	public void close_the_Browser() throws Throwable {
		driver.close();
	  
	}
*/
 @When("^Click on create new account Button$")
public void click_on_create_new_account_Button() throws Throwable {
	
	repage.rclick();

}

 @When("^User enter FirstName as \"([^\"]*)\" and SurName as \"([^\"]*)\" and Mobilenumber as (\\d+) and NewPasssword as \"([^\"]*)\" and dob of the day as (\\d+) and month as \"([^\"]*)\" and year as (\\d+)$")
 public void user_enter_FirstName_as_and_SurName_as_and_Mobilenumber_as_and_NewPasssword_as_and_dob_of_the_day_as_and_month_as_and_year_as(String fname , String lname , String num , String newpwd , String d, String mon , String ye) throws Throwable
 {
    repage.registerdetails1(fname, lname, num, newpwd, d, mon, ye);
 }

 @When("^Click RadioButton as \"([^\"]*)\" Button$")
 public void click_RadioButton_as_Button(String arg1) throws Throwable {
    
	 repage.radio();
 }




@Then("^Click on SighIn Button$")
public void click_on_SighIn_Button() throws Throwable {
	repage.registerButton();
	
    }
@Then("^Close the Browser$")
public void close_the_Browser() throws Throwable {
	driver.close();
  
}




}
