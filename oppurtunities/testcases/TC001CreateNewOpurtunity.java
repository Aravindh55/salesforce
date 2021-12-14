package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC001CreateNewOpurtunity extends ProjectSpecificMethods{
	@Test
	public void runCNO() throws InterruptedException {
		LoginPage lg=new LoginPage();
		lg.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewall()
		.clickSales()
		.clickOppurtunity()
		.verifyOppurtunityPage()
		.clickNew()
		.verifyNewOpp()
		.enterOppname()
		.chooseClosedate()
		.chooseStageNeedAnalysis()
		.clickSave()
		.verifyNewOpp();
		
		

	}

}
