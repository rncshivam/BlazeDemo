package com.blazeDemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CustomerBookingDetails {
	
	WebDriver lDriver;

	public CustomerBookingDetails(WebDriver rdriver)
	{
		lDriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='inputName']")
	@CacheLookup
	WebElement txtCustomerName;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='address']")
	@CacheLookup
	WebElement txtCustomerAddress;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='city']")
	@CacheLookup
	WebElement txtCity;
	

	@FindBy(how=How.XPATH,using="//input[@id='state']")
	@CacheLookup
	WebElement txtState;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='zipCode']")
	@CacheLookup
	WebElement txtZipCode;
	
	
	
	@FindBy(how=How.XPATH,using="//input[@id='creditCardNumber']")
	@CacheLookup
	WebElement txtCreditCardNo;
	
	@FindBy(how=How.XPATH,using="//input[@id='creditCardMonth']")
	@CacheLookup
	WebElement txtCreditCardMonth;
	
	@FindBy(how=How.XPATH,using="//input[@id='creditCardYear']")
	@CacheLookup
	WebElement txtCreditCardYear;
	
	@FindBy(how=How.XPATH,using="//input[@id='nameOnCard']")
	@CacheLookup
	WebElement txtNameOnCard;
	
	@FindBy(how=How.XPATH,using="//input[@value='Purchase Flight']")
	@CacheLookup
	WebElement btnPurchaseTicket;
	

	
	public void custName(String cName) {
		txtCustomerName.sendKeys(cName);
	}
	
	public void custAddress(String cAddress) {
		txtCustomerAddress.sendKeys(cAddress);
	}
	
	public void custCity(String cCity) {
		txtCity.sendKeys(cCity);
	}
	
	public void custState(String cState) {
		txtState.sendKeys(cState);
	}
	
	public void custZipCode(String cZipCode) {
		txtZipCode.sendKeys(cZipCode);
	}
	
		
	
	public void cCreditNo(String cCardno) {
		txtCreditCardNo.sendKeys(cCardno);
	}
	
	public void cCreditMonth(String cCardMonth) {
		txtCreditCardMonth.sendKeys(cCardMonth);
	}
	
	public void cCreditYear(String cCardYear) {
		txtCreditCardYear.sendKeys(cCardYear);
	}
	
	
	public void cCreditName(String cCardName) {
		txtNameOnCard.sendKeys(cCardName);
	}
	
	
	public void ClickPurcahseTicket() {
		btnPurchaseTicket.click();
	}
	

	
	
	
	
}
