package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.google.common.base.Verify;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	public HomePage VerifyHomePage() {

		boolean displayed = driver.findElement(By.xpath("//span[@class='breadcrumbDetail uiOutputText']"))
				.isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}

	public HomePage clickApplauncher() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;

	}

	public HomePage clickViewall() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		return this;

	}

	public HomePage clickSales() {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		return this;
	}

	public OppurtunitiesPage clickOppurtunity() throws InterruptedException {
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='slds-context-bar']//a)[2]"));
		driver.executeScript("arguments[0].click();",findElement);
		
		return new OppurtunitiesPage();

	}

}
