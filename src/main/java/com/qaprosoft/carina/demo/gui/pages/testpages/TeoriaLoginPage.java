package com.qaprosoft.carina.demo.gui.pages.testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class TeoriaLoginPage extends AbstractPage {





	@FindBy(xpath="/html/body/div[1]")
	ExtendedWebElement header ;
	
	@FindBy(xpath="/html/body/div[2]")
	ExtendedWebElement loginWrapper ;
	
	public ExtendedWebElement getHeader() {
		return header;
	}



	public ExtendedWebElement getLoginWrapper() {
		return loginWrapper;
	}
	
	public TeoriaLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
