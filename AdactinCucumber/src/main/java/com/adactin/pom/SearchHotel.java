package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotel extends LoginPage{

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotels;
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomType;
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement numberOfRoom;
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement checkInDate;
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement checkOutDate;
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultsPerRoom;
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childrenPerRoom;
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement searchButton;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRoom() {
		return numberOfRoom;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildrenPerRoom() {
		return childrenPerRoom;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

}
