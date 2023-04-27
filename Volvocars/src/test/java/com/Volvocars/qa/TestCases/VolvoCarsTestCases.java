package com.Volvocars.qa.TestCases;

import org.testng.annotations.Test;

import com.Volvocars.qa.base.Test_Base;
import com.Volvocars.qa.pages.VolvocarsPage;

public class VolvoCarsTestCases extends Test_Base {
	private VolvocarsPage volPageObj;

	public VolvoCarsTestCases() {
		super();
		
	}
	
	
	

	
	
	@Test( priority = 1, groups = {"smoke"})
	public void validatePageTitle() {
		volPageObj = new VolvocarsPage(util);
		String actualTitle = volPageObj.getVolvoCarPageTitle();
		util.verifyMethod(actualTitle, "Volvo Cars - International");
	}
	
	@Test( priority = 2, groups = {"smoke"})
	public void validateSubMenuOptionIsVisibleInMenu() {
		volPageObj = new VolvocarsPage(util);
		volPageObj.verifySubOptionVisibleInMenu();
	}
	
	@Test( priority = 3, groups = {"smoke"})
	public void validateCarsHeaderDisplayAfterClickOnOurCar() {
		volPageObj = new VolvocarsPage(util);
		volPageObj.CarTypesVisibleAfterClickoNOurCarButton();
	}
	
	
}
