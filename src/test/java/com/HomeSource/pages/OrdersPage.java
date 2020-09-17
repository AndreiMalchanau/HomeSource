package com.HomeSource.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrdersPage {

	@FindBy(id = "searchFilter")
	public WebElement billTo;
	@FindBy(id = "searchFilter")
	public WebElement clickOnCustomer;
	@FindBy(xpath = "//*[@id=\"grid\"]/div[3]/table/tbody/tr/td[1]")
	public WebElement customer;
	@FindBy(css = "#edit-sales-info")
	public WebElement newOrderButton;
	@FindBy(id = "JobName")
	public WebElement jobName;

	public WebElement apply;
	@FindBy(className = "btn btn-success")
	public WebElement addItems;
	
	@FindBy(xpath = "//*[@id=\"appGrid\"]/div[3]/table/tbody/tr[1]/td[1]")
	public WebElement adcItem;
	@FindBy(xpath = "//*[@id=\"modalWindow2\"]/div[2]/div/div/a[2]")
	public WebElement skip;
	@FindBy(xpath = "//*[@id=\"modalWindow\"]/div[2]/div/div/button")
	public WebElement done;
	@FindBy(xpath = "//*[@id=\"saveQuoteBtn\"]/div")
	public WebElement saveOrder;
	
	
	
	
	
	
	
	
}
