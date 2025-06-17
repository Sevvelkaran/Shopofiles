package Definations;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Actions.LoginActions;
import Pages.LoginPages;
import Utils.Helper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginDef {

    WebDriver driver;
    WebDriverWait wait;
    LoginPages objlog = new LoginPages();
    LoginActions objact = new LoginActions();

    @Before
    public void setUp() {
        Helper.setUpDriver();
        driver = Helper.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // ✅ Set explicit wait
    }

    @After
    public void tearDown() {
        Helper.teardown();
    }

    @Given("I want to go to OrangeHRM {string}")
    public void i_want_to_go_to_orange_hrm(String url) {
        Helper.openPage(url);
        objact = new LoginActions();
    }

    @When("The user enters username {string} and password {string}")
    public void the_user_enters_username_and_password(String username, String password) {
        objact.enterUsernameandPassword(username, password);
    }

    @When("Clicks on the Login button")
    public void clicks_on_the_login_button() {
        objact.submit();
    }

    @Then("Assert them for valid login")
    public void assert_them_for_valid_login() {
        String expectedTitle = "Customer Dashboard : Shopofiles";
        wait.until(ExpectedConditions.titleIs(expectedTitle)); // ✅ Wait until page title matches
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Then("Assert them for invalid login")
    public void assert_them_for_invalid_login() {
        String expectedURL = "https://shopofiles.applifiles.com/login";
        wait.until(ExpectedConditions.urlToBe(expectedURL)); // ✅ Wait until URL matches
        String actualURL = driver.getCurrentUrl();
        assertEquals(expectedURL, actualURL);
    }

    @Then("Assert them for empty login")
    public void assert_them_for_empty_login() {
        String expectedURL = "https://shopofiles.applifiles.com/login";
        wait.until(ExpectedConditions.urlToBe(expectedURL)); // ✅ Wait until URL matches
        String actualURL = driver.getCurrentUrl();
        assertEquals(expectedURL, actualURL);
    }

    @Then("Logout")
    public void logout() {
        objact.logout();
    }
}
