package Definations;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Actions.HomeActions;
import Actions.LoginActions;
import Pages.HomePages;
import Pages.LoginPages;
import Utils.Helper;
import io.cucumber.java.en.*;

public class HomeDef {
	
	WebDriver driver = Helper.getDriver();
	WebDriverWait wait;
	HomePages hp = new HomePages();
	HomeActions ha = new HomeActions();
	LoginPages lp = new LoginPages();
	LoginActions la = new LoginActions();
	

	@When("The user enters username {string} and password {string} and Click Login")
	public void the_user_enters_username_and_password_and_click_login(String username, String password) {
		
		ha.enterUsernameandPassword1(username, password);
		ha.submit();
}


	@When("The user should land on the Home Page")
	public void the_user_should_land_on_the_home_page() {
		
    ha.HomeP();
}

	@When("The user click on the AboutUs link")
	public void the_user_click_on_the_about_us_link() {
    ha.aboutus();
}


	@Then("Check the user is on AboutUs Page")
	public void check_the_user_is_on_about_us_page() {
    
		String exp = driver.getTitle();
		String act = "About Us : Shopofiles";
		assertEquals(exp, act);
		
		
}
	
	@When("The user click on the Mens section shourtcut in the Home Page")
	public void the_user_click_on_the_mens_section_shourtcut_in_the_home_page() {
	    ha.mens();

	}

	@Then("Check the user is on Mens Section Page")
	public void check_the_user_is_on_mens_section_page() throws InterruptedException {
		String exp = driver.getTitle();
		Thread.sleep(10);
		String act = "Products : Shopofiles";
		assertEquals(exp, act);
		
	    
	}





}
