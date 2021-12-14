package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC004Verifysortorderbycloseddate extends ProjectSpecificMethods{
	@Test
	public void run_Verifysortorderbycloseddate() throws InterruptedException {
    LoginPage lg=new LoginPage();
    lg.enterUsername()
    .enterPassword()
    .clickLogin()
    .VerifyHomePage()
    .clickApplauncher()
    .clickViewall()
    .clickSales()
    .clickOppurtunity()
    .verifyOppurtunityPage()
    .beforeSortingClosedate()
    .sortByClosedate()
    .afterSortingClosedate()
    .verifySort();
    
	}

}
