package pages;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class OppurtunitiesPage extends ProjectSpecificMethods {
	public String text;
	public List<String> sort1=new ArrayList<String>();
	public List<String> sort2=new ArrayList<String>();

	public OppurtunitiesPage verifyOppurtunityPage() {
		boolean displayed = driver.findElement(By.xpath("(//span[text()='Opportunities'])[2]")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}

	public OppurtunitiesPage clickNew() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
		return this;

	}

	public OppurtunitiesPage verifyNewOpp() {
		boolean displayed = driver.findElement(By.xpath("(//span[text()='Opportunities'])[2]")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}

	public OppurtunitiesPage enterOppname() {
		driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow']/input)[2]"))
				.sendKeys("SalesForce Automation by Aravindh");
		String text = "SalesForce Automation by Aravindh";
		return this;

	}

	public OppurtunitiesPage chooseClosedate() {
		driver.findElement(By.xpath(
				"//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right']/input"))
				.sendKeys("11/26/2021");
		return this;

	}

	public OppurtunitiesPage chooseStageNeedAnalysis() {
		WebElement findElement = driver.findElement(By.xpath(
				"(//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right']/input)[3]"));
		Actions builder = new Actions(driver);
		builder.click(findElement).sendKeys("Needs Analysis").sendKeys(Keys.ENTER).perform();
		return this;

	}

	public OppurtunitiesPage clickSave() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		return this;

	}

	public OppurtunitiesPage verifyOppname() {
		String textnew = driver
				.findElement(By.xpath("//div[@class='slds-media__body']//slot//lightning-formatted-text")).getText();
		Assert.assertEquals(textnew, text);

		return this;
	}

	public OppurtunitiesPage searchOpp() {
		driver.findElement(By.xpath(
				"//div[@class='slds-form-element__control slds-grow slds-input-has-icon slds-input-has-icon_left-right']/input"))
				.sendKeys("SalesForce Automation by Aravindh");
		driver.findElement(By.xpath(
				"//div[@class='slds-form-element__control slds-grow slds-input-has-icon slds-input-has-icon_left-right']/input"))
				.sendKeys(Keys.ENTER);
		return this;

	}

	public OppurtunitiesPage clickFirstDropdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='slds-icon_container slds-icon-utility-down'])[1]")).click();
		return this;
	}

	public OppurtunitiesPage clickEditdropdown() {
		driver.findElement(By.xpath("//li[@class='uiMenuItem']/a")).click();
		return this;
	}

	public OppurtunitiesPage chooseTomoDate() {
		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right']/input")).clear();
		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right']/input")).sendKeys("11/27/2021");
		return this;
	}
	public OppurtunitiesPage chooseStagePerceptionAnalysis() {
		WebElement findElement = driver.findElement(By.xpath(
				"(//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right']/input)[3]"));
		Actions builder = new Actions(driver);
		builder.click(findElement).sendKeys("Perception Analysis").sendKeys(Keys.ENTER).perform();
		return this;

	}
	public OppurtunitiesPage chooseDelivery() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click']//input)[7]")).sendKeys("In progress");
		driver.findElement(By.xpath("(//span[@class='slds-media__body']//span)[13]")).click();
		
		return this;
	}
	public OppurtunitiesPage enterDescription() {
       driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow textarea-container']/textarea")).sendKeys("Salesforce");
       return this;
	}
	public OppurtunitiesPage verifyPerceptionAnalysis() throws InterruptedException {
		Thread.sleep(2000);
		String text2 = driver.findElement(By.xpath("(//td[@class='slds-cell-edit cellContainer']//span)[11]")).getText();
		Assert.assertEquals(text2,"Perception Analysis");
		return this;

	}
	public OppurtunitiesPage verifyAlert() {
		String text2 = driver.findElement(By.xpath("(//div[@class='slds-popover__body']//div//li/a)[1]")).getText();
		String text3 = driver.findElement(By.xpath("(//div[@class='slds-popover__body']//div//li/a)[2]")).getText();
		Assert.assertEquals(text2,"Opportunity Name");
		Assert.assertEquals(text3,"Stage");
	    return this;
	}
	public OppurtunitiesPage sortByClosedate() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='slds-cell-fixed']/a)[5]")).click();
     return this;
	}
	public OppurtunitiesPage beforeSortingClosedate() {
	List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='slds-truncate slds-text-align_right slds-grow  sfaOpportunityDealMotionCloseDate']/span"));
	List<String> sort1=new ArrayList<String>();
	for (WebElement web : findElements) {
		String text2 = web.getText();
		sort1.add(text2);
		
	}
	Collections.sort(sort1);
	return this;
	}
	public OppurtunitiesPage afterSortingClosedate() {
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='slds-truncate slds-text-align_right slds-grow  sfaOpportunityDealMotionCloseDate']/span"));
		List<String> sort2=new ArrayList<String>();
		for (WebElement web : findElements) {
			String text2 = web.getText();
			sort2.add(text2);
		}
		return this;
		
		 
		 
}
	
	public OppurtunitiesPage verifySort() {
try {
	Assert.assertEquals(sort1, sort2);
} catch (Exception e) {
	System.out.println("the value does not match");
}
	
	return this;
	
}
}
