package com.maven.logintestcase;

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
	@Given("user should navigate to the url {string}")
	public void userShouldNavigateToTheUrl(String url) {
		url(url);
	}
	@Given("user enter user name as {string}")
	public void userEnterUserNameAs(String userName) {
	    sendkeys(getUserName(), userName);
	}
	@Given("user enter password as {string}")
	public void userEnterPasswordAs(String password) {
	    
	    sendkeys(getPassword(), password);
	}
	@When("user click the login button")
	public void userClickTheLoginButton() {
	    click(getLoginButton());
	    
	}
	@Then("user should navigate to the search hotel module")
	public void userShouldNavigateToTheSearchHotelModule() {
		String expectedUrl = "https://adactinhotelapp.com/SearchHotel.php";
	    String actualUrl = getCurrentUrl();
	    Assert.assertEquals(actualUrl, expectedUrl);
	    quit();
	}
	
	@When("user should not navigate to the search hotel module")
	public void userShouldNotNavigateToTheSearchHotelModule() {
		String expectedResult ="Invalid Login details or Your Password might have expired. Click here to reset your password";
	    String actualResult = getErrorMessageInvalidLoginDetails().getText();
	    Assert.assertEquals(expectedResult, actualResult);
	    quit();
	}
	
	@When("user must see enter user name error message")
	public void userMustSeeEnterUserNameErrorMessage() {
		String expectedResult ="Enter Username";
	    String actualResult = getUserNameErrorMessage().getText();
	    Assert.assertEquals(expectedResult, actualResult);
	    quit();
	    
	}
	@When("user must see enter password error message")
	public void userMustSeeEnterPasswordErrorMessage() {
		String expectedResult ="Enter Password";
	    String actualResult = getPasswordErrorMessage().getText();
	    Assert.assertEquals(expectedResult, actualResult);
	    quit();
	}
	

	
	
	

}
