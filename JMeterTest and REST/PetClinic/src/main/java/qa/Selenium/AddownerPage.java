package qa.Selenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class AddownerPage {
	
	@FindBy (xpath= "//*[@id=\"firstName\"]")
	private WebElement firstname;
	
	@FindBy(xpath= "//*[@id=\"lastName\"]")
	private WebElement lastname;
	
	@FindBy(xpath= "//*[@id=\"address\"]")
	private WebElement address;
	
	@FindBy(xpath= "//*[@id=\"city\"]")
	private WebElement city;
	
	@FindBy(xpath= "//*[@id=\"telephone\"]")
	private WebElement telephone;
	
	@FindBy (xpath= "/html/body/app-root/app-owner-add/div/div/form/div[7]/div/button[2]")
	private WebElement addOwnerbutton;

	public void enterfirstname (String text) {
		firstname.sendKeys("Fozia");	
	}
	
	public void enterlastname (String text) {
		lastname.sendKeys("Khan");
				
	}
	
	public void enteraddress (String text) {
		address.sendKeys("22 Headfield Road");
		
	}
	
	public void entercity (String text) {
		city.sendKeys("Leeds");
		
	}
	
	public void entertelephone (String text) {
		telephone.sendKeys("0123456789");
		
	}
	
	public void clickaddownerbutton () {
		addOwnerbutton.click();
	}
	
	
	
	
}
