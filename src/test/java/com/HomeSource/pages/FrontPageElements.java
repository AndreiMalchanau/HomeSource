package com.HomeSource.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HomeSource.testbase.BaseClass;
import com.HomeSource.testbase.PageInitializer;
import com.HomeSource.utils.CommonMethods;

public class FrontPageElements extends CommonMethods{

	@FindBy(xpath = "//div[@class = 'responsive_nav']")
	public WebElement menuButton;
	@FindBy(xpath = "//*[@id=\"menu\"]/li[2]/a/span[1]")
	public WebElement PointOfSale;
	@FindBy(xpath = "//*[@id=\"menu\"]/li[2]/ul/li[2]/a")
	public WebElement Orders;
	
	public FrontPageElements() {
		
		PageFactory.initElements(BaseClass.driver, this);
	}
}
