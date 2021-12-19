package com.blazeDemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FlightSearchResult {

	WebDriver lDriver;
	public FlightSearchResult(WebDriver rdriver)
	{
		lDriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//table/tbody/tr[1]/td[1]/input[@value='Choose This Flight']")
	@CacheLookup
	WebElement FlightResult;
	
	

	public void SelectFight() {
		FlightResult.click();
	}
	
	
}
