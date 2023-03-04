package com.qaprosoft.carina.demo.testpersonalpages;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.pages.testpages.EbaySigninPage;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.core.registrar.tag.Priority;
import com.zebrunner.carina.core.registrar.tag.TestPriority;

public class TestEbaySigninPage implements IAbstractTest {

	
	
	EbaySigninPage ebayPage;
	@Test
	@MethodOwner(owner = "irakli")
	@TestPriority(Priority.P1)
	public void openWeb() throws InterruptedException {
		 ebayPage = new EbaySigninPage(getDriver());
		ebayPage.open();
		Assert.assertTrue(ebayPage.isPageOpened(), " Page is not opened");
		ebayPage.inputFirstName("test");
		ebayPage.inputLastName("test");
		ebayPage.inputEmail("email@email.com");
		ebayPage.inputPassword("test222@");
		ebayPage.clickButton();
	}


	
	
	
}
