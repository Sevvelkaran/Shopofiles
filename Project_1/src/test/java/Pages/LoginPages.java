package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages {

	
	@FindBy(xpath = "//label[@class=\"fw-bold text-dark fs-sm mb-1\"]/following::input[@name=\"email\"]")
	public WebElement Username ;
	
	@FindBy(xpath = "//label[@class=\"fw-bold text-dark fs-sm mb-1\"]/following::input[@name=\"password\"]")
	public WebElement Password;
	
	@FindBy(xpath = "//button[@type=\"submit\"]" )
	public WebElement Submit;
	
	@FindBy(xpath = "//div[@class=\"gshop-header-user position-relative\"]/button")
	public WebElement Profile;
	
	@FindBy(xpath = "//ul[@class=\"user-menu\"]/li/a[@href=\"https://shopofiles.applifiles.com/logout\"][1]")
	public WebElement Logout;

	
	
	
	
	
	
}
