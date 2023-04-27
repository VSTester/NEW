package com.Volvocars.qa.pages;



import com.Volvocars.qa.objectrepository.VolvocarsPageObjectRepo;
import com.Volvocars.qa.webUtil.TestUtil;



public class VolvocarsPage  extends VolvocarsPageObjectRepo{
	TestUtil util;
	
	
	

	
	//  **  we create this page class constructor or call locator in this class object Repository**//
	public VolvocarsPage(TestUtil util) {
		super(util);
		this.util = util;
		
	}
	
	
	public void clickOnOurCarButton() {
		util.clickOnElement(buttonourCars);
	}
	
	
	public void CarTypesVisibleAfterClickoNOurCarButton() {
		clickOnAcceptCookiesButton();
		clickOnOurCarButton();
		util.waitForElementToBeClickable(pElectricHeader, 05);
		util.elementIsDisplayed(pElectricHeader);
		util.elementIsDisplayed(pHybridsHeader);
		util.elementIsDisplayed(pMildHybrids);
		util.clickOnElement(buttonClose);
	}

public void verifySubOptionVisibleInMenu() {
	clickOnAcceptCookiesButton();
	util.clickOnElement(buttonMenu);
	util.elementIsDisplayed(buttonBuy);
	util.elementIsDisplayed(buttonOwn);
	util.elementIsDisplayed(buttonAboutVolvo);
	util.elementIsDisplayed(buttonExplore);
	util.elementIsDisplayed(buttonMore);
	util.clickOnElement(buttonClose);
}

public void clickOnAcceptCookiesButton() {
	util.clickOnElement(buttonAccept);
}

	public String getVolvoCarPageTitle() {
		return util.getPageTitle();
	}

	
	
	
}
