package com.tests;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pages.BaseClass;
import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginTest2 extends BaseClass {

	@Test
	public void loginuser2() throws IOException, InterruptedException {
		HomePage homepage = new HomePage(driver);
		LoginPage loginpage=new LoginPage(driver);
		homepage.clicksignin();
		Reporter.log("clicked signin", true);
	    loginpage.enteremail(getObject("emailid"));
	    loginpage.clickcontinue();
	    Thread.sleep(5000);
	    loginpage.enterpassword(getObject("password"));
	    loginpage.clicklogin();
	    Thread.sleep(5000);
	    
	}

}
