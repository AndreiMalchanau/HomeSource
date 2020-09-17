package com.HomeSource.steps;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.HomeSource.utils.CommonMethods;
import com.HomeSource.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CreateNewOrder extends CommonMethods{

	@Given("I open Burt's and login I click on menu button")
	public void i_open_Burt_s_and_login_I_click_on_menu_button() throws InterruptedException {
	   
		loginPage.userName.sendKeys(ConfigsReader.getProperty("username"));
		loginPage.password.sendKeys(ConfigsReader.getProperty("password"));
		loginPage.loginButton.click();
		frontPage.menuButton.click();
		Thread.sleep(5000);
	}
	
	@When("I navigate to Point of Sale and click on Orders")
	public void i_navigate_to_Point_of_Sale_and_click_on_Orders() throws InterruptedException {
	  frontPage.PointOfSale.click();
	  Thread.sleep(5000);
	  frontPage.Orders.click();
	}

	@Then("I Select Location")
	public void i_Select_Location() {
	   WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"LocationFK\"]"));
	   Select obj = new Select(dropdown);
	   obj.selectByValue("1");
	}

	@Then("I click on New Order button and and hit Apply")
	public void i_click_on_New_Order_button_and_and_hit_Apply() {
		// ordersPage.newOrderButton.click(); 
	}

	@Then("I choose Bill To")
	public void i_choose_Bill_To() {
		ordersPage.billTo.click();
		ordersPage.customer.sendKeys("Peter James");
		// driver.findElement(By.id("searchFilter")).sendKeys(Keys.ENTER);
		ordersPage.clickOnCustomer.click();
		
		
	 
	}

	@Then("I click Add Items and provide Brand")
	public void i_click_Add_Items_and_provide_Brand() {
	    
	}

	@Then("I click Skip button and hit Done")
	public void i_click_Skip_button_and_hit_Done() {
	 
	}

	@Then("I click Save Order")
	public void i_click_Save_Order() {
	   
	}
}
