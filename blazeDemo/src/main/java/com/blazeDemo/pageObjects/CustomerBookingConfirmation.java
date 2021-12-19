package com.blazeDemo.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CustomerBookingConfirmation {
	
	WebDriver lDriver;
	public CustomerBookingConfirmation(WebDriver rdriver)
	{
		lDriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//table/tbody/tr[1]/td[2]")
	@CacheLookup
	WebElement BookingId;
	
	
	public  String getBookingId() {
		String BookId =BookingId.getText();
		return BookId;
	}
	
	
	
}
