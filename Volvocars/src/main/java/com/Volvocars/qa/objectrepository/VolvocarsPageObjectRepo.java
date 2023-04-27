package com.Volvocars.qa.objectrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.Volvocars.qa.webUtil.TestUtil;

public class VolvocarsPageObjectRepo {

@FindBy(xpath  = "//button[translate(normalize-space(.),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ')='ACCEPT']")
protected WebElement buttonAccept;

@FindBy(xpath  = "//button[translate(normalize-space(.),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ')='MENU']")
protected WebElement buttonMenu;

@FindBy(xpath  = "//button[translate(normalize-space(.),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ')='BUY']")
protected WebElement buttonBuy;

@FindBy(xpath  = "//button[translate(normalize-space(.),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ')='OWN']")
protected WebElement buttonOwn;

@FindBy(xpath  = "//button[translate(normalize-space(.),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ')='ABOUT VOLVO']")
protected WebElement buttonAboutVolvo;


@FindBy(xpath  = "//button[translate(normalize-space(.),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ')='MORE']")
protected WebElement buttonMore;

@FindBy(xpath  = "//button[translate(normalize-space(.),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ')='EXPLORE']")
protected WebElement buttonExplore;


@FindBy(xpath  = "//button[translate(normalize-space(.),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ')='OUR CARS']")
protected WebElement buttonourCars;

@FindBy(xpath  = "//p[translate(normalize-space(.),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ')='ELECTRIC']")
protected WebElement pElectricHeader;

@FindBy(xpath  = "//p[translate(normalize-space(.),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ')='HYBRIDS']")
protected WebElement pHybridsHeader;

@FindBy(xpath  = "//p[translate(normalize-space(.),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ')='MILD HYBRIDS']")
protected WebElement pMildHybrids;

	
@FindBy(xpath  = "//button[@aria-label ='Close']")
protected WebElement buttonClose;
	
	
	
public VolvocarsPageObjectRepo(TestUtil util) {
		PageFactory.initElements(util.getDriver(),this);
	}
}
