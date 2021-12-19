package com.blazeDemo.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.blazeDemo.pageObjects.BlazeDemoHomepage;
import com.blazeDemo.pageObjects.CustomerBookingConfirmation;
import com.blazeDemo.pageObjects.CustomerBookingDetails;
import com.blazeDemo.pageObjects.FlightSearchResult;

public class TC_VerifyFlightBooking extends BaseClass
{
	
	@Test
	public void bookFlightTicket()throws InterruptedException, IOException
	{
		logger.info("Customer Homepage");
		WebElement HomepageTitle = driver.findElement(By.xpath("/html/body/div[2]/div/h1"));
		
		Assert.assertEquals("Welcome to the Simple Travel Agency!", HomepageTitle.getText());
		logger.info("Welcome to the Simple Travel Agency! prsent in the homepage");
		
		BlazeDemoHomepage Homepage = new BlazeDemoHomepage(driver);
		Homepage.SelectDepCity("Paris");
		Homepage.SelectDestCity("Rome");
		Homepage.ClickFindFight();
		logger.info("Select the Destination and Departure location");
		captureScreen(driver,"Flight search results");
		FlightSearchResult SearchResult=new FlightSearchResult(driver);
		SearchResult.SelectFight();
		
		logger.info("Entering the customer details for flight booking");
		
		CustomerBookingDetails CustDetails=new CustomerBookingDetails(driver);
		CustDetails.custName("Test");
		CustDetails.custAddress("XYZ Road");
		CustDetails.custCity("Bangalore");
		CustDetails.custState("KA");
		CustDetails.custZipCode("008833");
		WebElement drpCardType=driver.findElement(By.xpath("//select[@id='cardType']"));
		Select drpCard= new Select(drpCardType);
		drpCard.selectByIndex(1);
		CustDetails.cCreditNo("123454321");
		CustDetails.cCreditMonth("11");
		CustDetails.cCreditYear("2022");
		CustDetails.cCreditName("ABC Services");
		CustDetails.ClickPurcahseTicket();
		
		CustomerBookingConfirmation BookingConf = new CustomerBookingConfirmation(driver);
		WebElement BookingConfirmationTitle = driver.findElement(By.xpath("/html/body/div[2]/div/h1"));
		Assert.assertEquals("Thank you for your purchase today!", BookingConfirmationTitle.getText());
		logger.info("Booking is confirmed");
		String BookID= BookingConf.getBookingId();
		System.out.println("Booking ID "+BookID);
		captureScreen(driver,"Booking Confirmation");
		
}
}
