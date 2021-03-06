package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.hubspot.base.BasePage;
import com.qa.hubspot.utils.Constants;
import com.qa.hubspot.utils.ElementUtil;

import io.qameta.allure.Step;

public class LoginPage extends BasePage {
	
	private WebDriver driver;
	private ElementUtil elementUtil;	

	// 1. By Locators: OR
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By loginButton = By.xpath("//input[@value='Login' and @type='submit']");
	private By forgotPwdLink = By.linkText("Forgotten Password");
	
	private By registerLink = By.linkText("Register");
	
	// 2. Constructor of the page class:	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	// 3. page actions: features(Behvaior) of the page in the form methods:
	@Step("check the login Page title")
	public String getLoginPageTitle() {
		return elementUtil.waitForTitlePresent(Constants.LOGIN_PAGE_TITLE, 5);
	}
	@Step("check if password link exists")
	public boolean isForgotPwdLinkExist() {
		return elementUtil.doIsDisplayed(forgotPwdLink);
		//return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	@Step("Login with user : {0) and password {1}")
	public AccountsPage doLogin(String un, String pwd) {
		System.out.println("Login with : " + un + " and " + pwd);
		elementUtil.doSendKeys(emailId, un);
		//driver.findElement(emailId).sendKeys(un);
		elementUtil.doSendKeys(password, pwd);
		//driver.findElement(password).sendKeys(pwd);
		elementUtil.doClick(loginButton);
		//driver.findElement(loginButton).click();
		return new AccountsPage(driver);
	}
	
	@Step("check the registration link..")
	public RegisterPage navigateToRegisterPage() {
		elementUtil.doClick(registerLink);
		return new RegisterPage(driver);
	}	
	
	

}
