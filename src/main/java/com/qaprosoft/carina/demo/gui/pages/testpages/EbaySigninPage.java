package com.qaprosoft.carina.demo.gui.pages.testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class EbaySigninPage extends AbstractPage {


	@FindBy(id="firstname")
	private ExtendedWebElement firstName ;
	
	@FindBy(id="lastname")
	private ExtendedWebElement lastName ;
	
	@FindBy(id="Email")
	private ExtendedWebElement email ;
	
	@FindBy(id="password")
	private ExtendedWebElement password ;

	@FindBy(id="EMAIL_REG_FORM_SUBMIT")
	private ExtendedWebElement createAccountButton ;
	
	
	
	public void inputFirstName(String FirstName) {
		firstName.type(FirstName);
	}
	
	public void inputLastName(String LastName) {
		lastName.type(LastName);
	}
	
	public void inputEmail(String emailStr) {
		email.type(emailStr);
	}
	
	public void inputPassword(String passwordstr) {
		password.type(passwordstr);
	}
	
	public void clickButton () {
		createAccountButton.click();
	}
	

	public EbaySigninPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F%3Fmkcid%3D1%26mkrid%3D711-53200-19255-0%26siteid%3D0%26campid%3D5338936584%26customid%3D6401aebb462a2503480875cc%26toolid%3D10001%26mkevt%3D1%26subId1%3D6401aebb462a2503480875cc%26subId2%3D120%26subId3%3D%26u%3D");
	}

	
	
}
