package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.maven.baseclass.BaseClass;

public class BookHotel extends BaseClass {

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastName;
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement billingAdress;
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement creditCardNumber;
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement creditCardType;
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expireMonth;
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement expireYear;
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvvNumber;
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement bookNowButton;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAdress() {
		return billingAdress;
	}

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpireMonth() {
		return expireMonth;
	}

	public WebElement getExpireYear() {
		return expireYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNowButton() {
		return bookNowButton;
	}

}
