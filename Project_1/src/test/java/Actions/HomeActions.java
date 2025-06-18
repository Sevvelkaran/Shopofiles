package Actions;

import org.openqa.selenium.support.PageFactory;

import Pages.HomePages;
import Pages.LoginPages;
import Utils.Helper;

public class HomeActions {
	
	HomePages home = null;

    public HomeActions() {
        home = new HomePages();
        PageFactory.initElements(Helper.getDriver(), home);
    }
    

    public void HomeP() {
    	
    	home.Home.click();
    }
    
    public void aboutus() {
    	
    	home.AboutUS.click();
    }

	public void enterUsernameandPassword1(String username, String password) {
		// TODO Auto-generated method stub
		home.Username.clear();
    	home.Password.clear();
    	home.Username.sendKeys(username);
    	home.Password.sendKeys(password);
    	
	}
	public void submit() {
		// TODO Auto-generated method stub
    	home.Submit.click();

		
	}
	
	public void mens() {
		home.Mens.click();
	}

}
