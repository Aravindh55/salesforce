package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("earth@testleaf.com");
		return this;
	}

	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("Bootcamp@123");
		return this;
	}

	public HomePage clickLogin() {
		driver.findElement(By.id("Login")).click();
		return new HomePage();
	}

}
