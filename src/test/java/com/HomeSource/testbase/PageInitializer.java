package com.HomeSource.testbase;

import com.HomeSource.pages.FrontPageElements;
import com.HomeSource.pages.LoginPage;
import com.HomeSource.pages.OrdersPage;

public class PageInitializer extends BaseClass{

	public static FrontPageElements frontPage;
	public static LoginPage loginPage;
	public static OrdersPage ordersPage;
	
	
	
public static void initializeAll() {
		
	frontPage = new FrontPageElements();
	loginPage = new LoginPage();
	ordersPage = new OrdersPage();

  }	
}
