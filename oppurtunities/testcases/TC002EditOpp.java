package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC002EditOpp extends ProjectSpecificMethods{
	@Test
	public void runEopp() throws InterruptedException {
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
.searchOpp()
.clickFirstDropdown()
.clickEditdropdown()
.chooseTomoDate()
.chooseStagePerceptionAnalysis()
.chooseDelivery()
.enterDescription()
.clickSave()
.verifyPerceptionAnalysis();




	}

}
