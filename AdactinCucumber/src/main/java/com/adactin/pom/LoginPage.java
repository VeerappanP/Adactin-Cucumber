package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BookHotel {

	@FindBy(xpath = "//input[@name='username']")
	private WebElement userName;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@name='login']")
	private WebElement loginButton;

	@FindBy(css = "div.auth_error")
	private WebElement errorMessageInvalidLoginDetails;
	
	@FindBy(css = "span#username_span")
	private WebElement userNameErrorMessage;
	
	@FindBy(css = "span#password_span")
	private WebElement passwordErrorMessage;

	

	public WebElement getErrorMessageInvalidLoginDetails() {
		return errorMessageInvalidLoginDetails;
	}

	public WebElement getUserNameErrorMessage() {
		return userNameErrorMessage;
	}

	public WebElement getPasswordErrorMessage() {
		return passwordErrorMessage;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
