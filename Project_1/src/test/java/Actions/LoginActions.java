package Actions;

import org.openqa.selenium.support.PageFactory;

import Pages.LoginPages;
import Utils.Helper;

public class LoginActions {
	
	   LoginPages loginpages = null;

	    public LoginActions() {
	        loginpages = new LoginPages();
	        PageFactory.initElements(Helper.getDriver(), loginpages);
	    }
	    
	    public void enterUsernameandPassword(String username, String password) {
	    	
	    	loginpages.Username.clear();
	    	loginpages.Password.clear();
	    	loginpages.Username.sendKeys(username);
	    	loginpages.Password.sendKeys(password);
	    	
	    }
	    
		public void submit() {
			// TODO Auto-generated method stub
	    	loginpages.Submit.click();

			
		}
		
	    public void logout () {
	    	loginpages.Profile.click();
	    	loginpages.Logout.click();
	    }


	    

}
