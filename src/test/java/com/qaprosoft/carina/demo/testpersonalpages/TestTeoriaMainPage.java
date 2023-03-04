package com.qaprosoft.carina.demo.testpersonalpages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.pages.testpages.TeoriaLoginPage;
import com.qaprosoft.carina.demo.gui.pages.testpages.TeoriaMainPage;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.core.registrar.tag.Priority;
import com.zebrunner.carina.core.registrar.tag.TestPriority;

public class TestTeoriaMainPage implements IAbstractTest {

	@Test
	@MethodOwner(owner="irakli")
	@TestPriority(Priority.P1)
	public void testteoriamainpage() {
		TeoriaMainPage teoriapage = new TeoriaMainPage(getDriver());
		teoriapage.open();
		Assert.assertTrue(teoriapage.isPageOpened(), "Page is not opened");
		Assert.assertTrue(teoriapage.getHeaderDiv().isPresent());
		Assert.assertTrue(teoriapage.getSection().isPresent());
		Assert.assertTrue(teoriapage.getLoginButton().isPresent());
		TeoriaLoginPage loginpage = teoriapage.clickLoginBitton();
		
		Assert.assertTrue(loginpage.getHeader().isPresent());
		Assert.assertTrue(loginpage.getLoginWrapper().isPresent());
	}
	
}
