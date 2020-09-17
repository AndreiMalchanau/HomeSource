package com.HomeSource.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HomeSource.testbase.BaseClass;

public class LoginPage {

	@FindBy(name = "email")
	public WebElement userName;
	@FindBy(name = "password")
	public WebElement password;
	@FindBy(xpath = "//button[@type = 'submit']")
	public WebElement loginButton;
	
	public LoginPage() {
		
		PageFactory.initElements(BaseClass.driver, this);
	}
}
