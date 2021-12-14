package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC003CreatingOppWithoutMandFields extends ProjectSpecificMethods {
	@Test 
	public void run_CreatingOppWithoutMandFields() throws InterruptedException {
          LoginPage rCOWM=new LoginPage();
          rCOWM.enterUsername()
          .enterPassword()
          .clickLogin()
          .VerifyHomePage()
          .clickApplauncher()
          .clickViewall()
          .clickSales()
          .clickOppurtunity()
          .verifyOppurtunityPage()
          .clickNew()
          .chooseTomoDate()
          .clickSave()
          .verifyAlert();
	}
}
