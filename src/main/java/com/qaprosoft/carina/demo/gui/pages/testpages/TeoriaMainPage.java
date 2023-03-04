package com.qaprosoft.carina.demo.gui.pages.testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class TeoriaMainPage  extends AbstractPage {

	@FindBy(xpath="/html/body/header/div[1]")
	ExtendedWebElement headerDiv ;
	
	@FindBy(xpath="/html/body/section")
	ExtendedWebElement section ;

	@FindBy(xpath="/html/body/nav/div[3]/div/a")
	ExtendedWebElement loginButton ;
	
	public ExtendedWebElement getHeaderDiv() {
		return headerDiv;
	}

	public ExtendedWebElement getSection() {
		return section;
	}

	public ExtendedWebElement getLoginButton() {
		return loginButton;
	}

	public TeoriaLoginPage clickLoginBitton() {
		loginButton.click();
		return new TeoriaLoginPage(getDriver());
	}
	
	public TeoriaMainPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://teoria.on.ge/");
	}

}
