package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePages {

	
	@FindBy(xpath = "//label[@class=\"fw-bold text-dark fs-sm mb-1\"]/following::input[@name=\"email\"]")
	public WebElement Username ;
	
	@FindBy(xpath = "//label[@class=\"fw-bold text-dark fs-sm mb-1\"]/following::input[@name=\"password\"]")
	public WebElement Password;
	
	@FindBy(xpath = "//button[@type=\"submit\"]" )
	public WebElement Submit;
	
	@FindBy(xpath = "//ul[@class=\"d-flex align-itmes-center justify-content-end\"]/li/a[text()='Home']")
	public WebElement Home;
	
	@FindBy(xpath = "//div[@class=\"hero-btns d-flex align-items-center gap-3 gap-sm-5 flex-wrap\"]/a[2]")
	public WebElement AboutUS;
	
	@FindBy(xpath = "//a[@href=\"https://shopofiles.applifiles.com/products?&category_id=2\"][2]")
	public WebElement Mens;
	
	@FindBy(xpath = "//div[@class=\"mb-2 tt-category tt-line-clamp tt-clamp-1\"]/following::a[@href=\"https://shopofiles.applifiles.com/products/adidas-joggers-dgsec\"]")
	public WebElement Addidas;
	
}
