package com.maven.loginwithdifferentvaliddata;

import org.junit.Assert;

import com.adactin.pom.SelectHotel;
import com.maven.baseclass.Browser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepClass extends SelectHotel {
	
	@Given("user should launch the browser")
	public void userShouldLaunchTheBrowser() {
	    browserLaunch(Browser.CHROME);
	}
	@Given("user should navigate to the {string}")
	public void userShouldNavigateToThe(String url) {
	    url(url);
	}
	@Given("user enter user name as {string}")
	public void userEnterUserNameAs(String userName) {
	    sendkeys(getUserName(), userName);
	}
	@Given("user enter the password as {string}")
	public void userEnterThePasswordAs(String password) {
	    sendkeys(getPassword(), password);
	}
	@When("user click login button")
	public void userClickLoginButton() {
	    click(getLoginButton());
	}
	@Then("user should navigate to the search hotel module")
	public void userShouldNavigateToTheSearchHotelModule() {
		String expectedUrl = "https://adactinhotelapp.com/SearchHotel.php";
	    String actualUrl = getCurrentUrl();
	    Assert.assertEquals(actualUrl, expectedUrl);
	    quit();
	}
    
}
