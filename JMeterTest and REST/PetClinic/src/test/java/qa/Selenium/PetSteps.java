package qa.Selenium;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PetSteps {
	
	WebDriver driver;
	private HomePage homepage;
	private AddownerPage addowner;
	
	
	String url = "http://10.0.10.10:4200/petclinic/";
	
	@Before 
	public void setup () {
		System.setProperty("webdriver.chrome.driver", "C:/Development/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		}
	
	

		@Given("^the correct web address$")
		public void the_correct_web_address() throws Throwable {
			driver.get(url);
		}
		
		

		@When("^I navigate to the 'Owners' page$")
		public void i_navigate_to_the_Owners_page() {
		 homepage = PageFactory.initElements(driver, HomePage.class);
		 homepage.clickownerbutton();

		}

		@When("^I click on the Add new tab$")
		public void i_click_on_the_Add_new_tab() {
		homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.clickaddnewowner();
		}
    

		@When("^I fill in the details of the owner$")
		public void i_fill_in_the_details_of_the_owner() {
		addowner = PageFactory.initElements(driver, AddownerPage.class);
		addowner.enterfirstname("Fozia");
		addowner.enterlastname("Khan");
		addowner.enteraddress("12 High road");
		addowner.entercity("Leeds");
		addowner.entertelephone("012345678");
		}

		@Then("^Add a new owner$")
		public void add_a_new_owner() {
		addowner = PageFactory.initElements(driver, AddownerPage.class);
		addowner.clickaddownerbutton();
		
		}
		
	

		
		
	
	
	
}