package com.blazeDemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BlazeDemoHomepage {

	WebDriver lDriver;
	public BlazeDemoHomepage(WebDriver rdriver)
	{
		lDriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/h1")
	@CacheLookup
	WebElement HomepageTitle;
	
	@FindBy(how=How.XPATH,using="//select[@name='fromPort']")
	@CacheLookup
	WebElement drpDepartureCity;
	
	
	@FindBy(how=How.XPATH,using="//select[@name='toPort']")
	@CacheLookup
	WebElement drpDestinationCity;
	
	@FindBy(how=How.XPATH,using="//input[@value='Find Flights']")
	@CacheLookup
	WebElement btnFlights;
	
	public void SelectDepCity(String DepCity) {
		Select drpDepCity= new Select(drpDepartureCity);
		drpDepCity.selectByValue(DepCity);
	}
	
	public void SelectDestCity(String DestCity) {
		Select drpDestCity= new Select(drpDestinationCity);
		drpDestCity.selectByValue(DestCity);
	}
	
	public void ClickFindFight() {
		btnFlights.click();
	}
	
	
}
