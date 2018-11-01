package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import env.BaseTest;
import methods.ExplicitWaitMethods;


public class Modules implements BaseTest
{
	public WebDriver driver;
	
	
	@FindBy(xpath="//*[@class='btn btn-flat log_out']")
	public WebElement logoutBtn;
	
	@FindBy(xpath="(//*[@class='btn btn-info'])[1]")
	public WebElement okForLogout;
	
	@FindBy(xpath="(//*[text()='Dashboard'])[1]")
	public WebElement dashboardModule;
	
	@FindBy(xpath="(//*[text()='Dashboard'])[2]")
	public WebElement dashboardSubModule;
	
	@FindBy(xpath="//*[text()='System Admin/Master Data']")
	public WebElement masterDataModule;
	
	@FindBy(xpath="//*[text()='Language']")
	public WebElement language;
	
	
	@FindBy(xpath="//*[text()='Country ']")
	public WebElement country;
	
	@FindBy(xpath="//*[text()='State ']")
	public WebElement state;
	
	@FindBy(xpath="//*[text()='City']")
	public WebElement city;
	
	@FindBy(xpath="//*[text()='Village']")
	public WebElement village;
	
	@FindBy(xpath="//*[text()='Main Menus']")
	public WebElement mainMenus;
	
	@FindBy(xpath="//*[text()='Sub Menus']")
	public WebElement subMenus;
	
	@FindBy(xpath="Activity Logs")
	public WebElement activityLog;
	
	@FindBy(xpath="//*[text()='User Management']")
	public WebElement userManagement;
	
	@FindBy(xpath="//*[text()='Users']")
	public WebElement users;
	
	@FindBy(xpath="//*[text()='Role Management']")
	public WebElement roleManagement;
	
	@FindBy(xpath="//*[text()='Roles']")
	public WebElement roles;
	
	@FindBy(xpath="//*[text()='Role Permission']")
	public WebElement rolePermission;
	
	@FindBy(xpath="//*[text()='Survey Management']")
	public WebElement surveyManagement;
	
	@FindBy(xpath="//*[text()='Survey Types']")
	public WebElement surveyTypes;
	
	@FindBy(xpath="//*[text()='Survey Categories']")
	public WebElement surveyCategory;
	
	@FindBy(xpath="//*[text()='Create Survey']")
	public WebElement createSurvey;
	
	@FindBy(xpath="//*[text()='Assign Users to Survey']")
	public WebElement assignUsersToSurvey;
	
	@FindBy(xpath="//*[text()='Question Management']")
	public WebElement questionManagement;
	
	@FindBy(xpath="//*[text()='Question Group']")
	public WebElement questionGroup;
	
	@FindBy(xpath="//*[text()='Question Type']")
	public WebElement questionType;
	
	@FindBy(xpath="//*[text()='Questions']")
	public WebElement questions;
	
	@FindBy(xpath="//*[text()='Survey Questions']")
	public WebElement surveyQuestions;
	
	@FindBy(xpath="//*[text()='Clone Survey Questions']")
	public WebElement cloneSurveyQuestions;
	
	@FindBy(xpath="//*[text()='Assign Questions to Survey']")
	public WebElement assignQuestionsToSurvey;
	
	@FindBy(xpath="//*[text()='Device Management']")
	public WebElement deviceManagement;
	
	@FindBy(xpath="//*[text()='Devices']")
	public WebElement devices;
	
	@FindBy(xpath="//*[text()='Assign Device']")
	public WebElement assignDevice;
	
	@FindBy(xpath="//*[text()='Notification Management']")
	public WebElement notificationManagement;
	
	@FindBy(xpath="//*[text()='Create Notification']")
	public WebElement createNotification;
	
	@FindBy(xpath="//*[text()='Create Global Notification']")
	public WebElement createGlobalNotification;
	
	@FindBy(xpath="//*[text()='Assign Notification']")
	public WebElement assignNotification;
	
	@FindBy(xpath="//*[text()='Mobile App Parameters']")
	public WebElement mobileAppParameters;
	
	@FindBy(xpath="//*[text()='Field Names']")
	public WebElement fieldNames;
	
	@FindBy(xpath="//*[text()='Mobile Screens']")
	public WebElement mobileScreens;
	
	@FindBy(xpath="//*[text()='Mobile Screen Fields']")
	public WebElement mobileScreenFields;
	
	@FindBy(xpath="//*[text()='Screens']")
	public WebElement screens;
	
	@FindBy(xpath="//*[text()='Configurations']")
	public WebElement configurations;
	
	@FindBy(xpath="//*[text()='Reports']")
	public WebElement reports;
	
	@FindBy(xpath="//*[text()='Survey Results']")
	public WebElement surveyResults;
	
	@FindBy(xpath="//*[text()='Batch Management']")
	public WebElement batchManagement;
	
	@FindBy(xpath="//*[text()='Batch']")
	public WebElement batch;
	
	@FindBy(xpath="(//*[text()='Message Management'])[1]")
	public WebElement messageManagementModule;
	
	@FindBy(xpath="(//*[text()='Message Management'])[2]")
	public WebElement messageManagementSubModule;
	
	public Modules(WebDriver x)
	{
		this.driver=x;
		PageFactory.initElements(driver, this);
		
	}
	
	public void logout()
	{
		clickObj.click(logoutBtn);
		navigationObj.switchToActiveElement();
		ExplicitWaitMethods.waitForVisibility(okForLogout);
		clickObj.click(okForLogout);
	}
	
	public void clickDashboardSubModule()
	{
		clickObj.click(dashboardModule);
		ExplicitWaitMethods.waitForVisibility(dashboardSubModule);
		clickObj.click(dashboardSubModule);
	}
	
	public void clickLanguage()
	{
		clickObj.click(masterDataModule);
		ExplicitWaitMethods.waitForVisibility(language);
		clickObj.click(language);
	}
	
	public void clickCountry()
	{
		clickObj.click(masterDataModule);
		ExplicitWaitMethods.waitForVisibility(country);
		country.click();
	}
	
	public void clickState()
	{
		clickObj.click(masterDataModule);
		ExplicitWaitMethods.waitForVisibility(state);
		clickObj.click(state);
	}
	
	public void clickCity()
	{
		clickObj.click(masterDataModule);
		ExplicitWaitMethods.waitForVisibility(city);
		clickObj.click(city);
	}
	
	public void clickVillage()
	{
		clickObj.click(masterDataModule);
		ExplicitWaitMethods.waitForVisibility(village);
		clickObj.click(village);
	}
	
	public void clickMainMenus()
	{
		clickObj.click(masterDataModule);
		ExplicitWaitMethods.waitForVisibility(mainMenus);
		clickObj.click(mainMenus);
	}
	
	public void clickSubMenus()
	{
		clickObj.click(masterDataModule);
		ExplicitWaitMethods.waitForVisibility(subMenus);
		clickObj.click(subMenus);
	}
	
	public void clickActivityLogs()
	{
		clickObj.click(masterDataModule);
		ExplicitWaitMethods.waitForVisibility(activityLog);
		clickObj.click(activityLog);
	}
	
	public void clickUsers()
	{
		clickObj.click(userManagement);
		ExplicitWaitMethods.waitForVisibility(users);
		clickObj.click(users);
	}
	
	public void clickRoles()
	{
		clickObj.click(roleManagement);
		ExplicitWaitMethods.waitForVisibility(roles);
		clickObj.click(roles);
	}
	
	public void clickRolePermission()
	{
		clickObj.click(roleManagement);
		ExplicitWaitMethods.waitForVisibility(rolePermission);
		clickObj.click(rolePermission);
	}
	
	public void clickSurveyTypes()
	{
		clickObj.click(surveyManagement);
		ExplicitWaitMethods.waitForVisibility(surveyTypes);
		clickObj.click(surveyTypes);
	}
	
	public void clickSurveyCategory()
	{
		clickObj.click(surveyManagement);
		ExplicitWaitMethods.waitForVisibility(surveyCategory);
		clickObj.click(surveyCategory);
	}
	
	public void clickCreateSurvey()
	{
		clickObj.click(surveyManagement);
		ExplicitWaitMethods.waitForVisibility(createSurvey);
		clickObj.click(createSurvey);
	}
	
	public void clickAssignUsersToSurvey()
	{
		clickObj.click(surveyManagement);
		ExplicitWaitMethods.waitForVisibility(assignUsersToSurvey);
		clickObj.click(assignUsersToSurvey);
	}
	
	public void clickQuestionGroup()
	{
		clickObj.click(questionManagement);
		ExplicitWaitMethods.waitForVisibility(questionGroup);
		clickObj.click(questionGroup);
	}
	
	public void clickQuestionType()
	{
		clickObj.click(questionManagement);
		ExplicitWaitMethods.waitForVisibility(questionType);
		clickObj.click(questionType);
	}
	
	public void clickQuestions()
	{
		clickObj.click(questionManagement);
		ExplicitWaitMethods.waitForVisibility(questions);
		clickObj.click(questions);
	}
	
	public void clickSurveyQuestions()
	{
		clickObj.click(questionManagement);
		ExplicitWaitMethods.waitForVisibility(surveyQuestions);
		clickObj.click(surveyQuestions);
	}
	public void clickCloneSurveyQuestions()
	{
		clickObj.click(questionManagement);
		ExplicitWaitMethods.waitForVisibility(cloneSurveyQuestions);
		clickObj.click(cloneSurveyQuestions);
	}
	
	public void clickAssignQuestionsToSurvey()
	{
		clickObj.click(questionManagement);
		ExplicitWaitMethods.waitForVisibility(assignQuestionsToSurvey);
		clickObj.click(assignQuestionsToSurvey);
	}
	
	public void clickDevices()
	{
		clickObj.click(deviceManagement);
		ExplicitWaitMethods.waitForVisibility(devices);
		clickObj.click(devices);
	}
	
	public void clickAssignDevice()
	{
		clickObj.click(deviceManagement);
		ExplicitWaitMethods.waitForVisibility(assignDevice);
		clickObj.click(assignDevice);
	}
	
	public void clickCreateNotification()
	{
		clickObj.click(notificationManagement);
		ExplicitWaitMethods.waitForVisibility(createNotification);
		clickObj.click(createNotification);
	}
	
	public void clickCreateGlobalNotification()
	{
		clickObj.click(notificationManagement);
		ExplicitWaitMethods.waitForVisibility(createGlobalNotification);
		clickObj.click(createGlobalNotification);
	}
	
	
	public void clickAssignNotification()
	{
		clickObj.click(notificationManagement);
		ExplicitWaitMethods.waitForVisibility(assignNotification);
		clickObj.click(assignNotification);
	}
	
	public void clickFieldNames()
	{
		clickObj.click(mobileAppParameters);
		ExplicitWaitMethods.waitForVisibility(fieldNames);
		clickObj.click(fieldNames);
	}
	
	public void clickMobileScreens()
	{
		clickObj.click(mobileAppParameters);
		ExplicitWaitMethods.waitForVisibility(mobileScreens);
		clickObj.click(mobileScreens);
	}
	
	public void clickMobileScreenFields()
	{
		clickObj.click(mobileAppParameters);
		ExplicitWaitMethods.waitForVisibility(mobileScreenFields);
		clickObj.click(mobileScreenFields);
	}
	
	public void clickScreens()
	{
		clickObj.click(mobileAppParameters);
		ExplicitWaitMethods.waitForVisibility(screens);
		clickObj.click(screens);
	}
	
	public void clickConfigurations()
	{
		clickObj.click(mobileAppParameters);
		ExplicitWaitMethods.waitForVisibility(configurations);
		clickObj.click(configurations);
	}
	
	
	public void clickReports()
	{
		clickObj.click(surveyResults);
		ExplicitWaitMethods.waitForVisibility(reports);
		clickObj.click(reports);
	}
	
	public void clickBatch()
	{
		clickObj.click(batchManagement);
		ExplicitWaitMethods.waitForVisibility(batch);
		clickObj.click(batch);
	}
	
	public void clickMessageManagement()
	{
		clickObj.click(messageManagementModule);
		ExplicitWaitMethods.waitForVisibility(messageManagementSubModule);
		clickObj.click(messageManagementSubModule);
	}
	
	


	
}
