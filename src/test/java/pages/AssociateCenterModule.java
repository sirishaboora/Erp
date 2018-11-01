package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import env.BaseTest;
import methods.ExplicitWaitMethods;


public class AssociateCenterModule implements BaseTest
{
	

	public WebDriver driver;
	
	@FindBy(xpath="(//*[@class='pull-right'])[1]")
	public WebElement profile;
	
	@FindBy(xpath="//*[text()='Sign Out']")
	public WebElement logout;
	
	@FindBy(xpath="(//*[text()='Associate Center'])[1]")
	public WebElement associateCenter;
	
	@FindBy(xpath="(//*[text()='Master Data'])[1]")
	public WebElement masterData;
	
	@FindBy(xpath="(//*[text()='Employee'])[1]")
	public WebElement employee;
	
	@FindBy(xpath="(//*[text()='Consultant'])[1]")
	public WebElement consultant;
	
	
	@FindBy(xpath="(//*[text()='Contract Staff'])[1]")
	public WebElement contractStaff;
	
	@FindBy(xpath="(//*[text()='CHFs/CHEs/BCPs'])[1]")
	public WebElement CHFsCHEsBCPs;
	
	@FindBy(xpath="(//*[text()='Program Associate'])[1]")
	public WebElement programAssociate;
	
	@FindBy(xpath="(//*[text()='Volunteers'])[1]")
	public WebElement volunteers;
	
	
	@FindBy(xpath="(//*[text()='Student'])[1]")
	public WebElement student;
	
	@FindBy(xpath="(//*[text()='CHFMapping'])[1]")
	public WebElement chfMapping;
	
	@FindBy(xpath="(//*[text()='Personnel Expenses'])[1]")
	public WebElement personnelExpenses;
	
	@FindBy(xpath="(//*[text()='Salaries'])[1]")
	public WebElement salaries;
	
	@FindBy(xpath="(//*[text()='Fees'])[1]")
	public WebElement fees;
	
	@FindBy(xpath="(//*[text()='Associate Program Fees'])[1]")
	public WebElement associateProgramFees;
	
	@FindBy(xpath="(//*[text()='Staff Advances ( Salary Advances)'])[1]")
	public WebElement staffAdvances;
	
	@FindBy(xpath="(//*[text()='Payments & Settlements'])[1]")
	public WebElement personalExpensesPaymentAndSettlements;
	
	//@FindBy(xpath="")
	//public WebElement ;
	
	
	
	
	
	public AssociateCenterModule(WebDriver x)
	{
		this.driver=x;
		PageFactory.initElements(driver, this);
	}
	
	public void clickAssociateCenter()
	{
		clickObj.click(associateCenter);
	}
	
	public void clickMasterData()
	{
		
		
		clickObj.click(masterData);
		ExplicitWaitMethods.waitForVisibility(chfMapping);
		clickObj.click(chfMapping);
	}
	
	
	


	
}
