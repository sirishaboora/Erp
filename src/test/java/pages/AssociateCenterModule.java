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
	public WebElement masterDataEmployee;
	
	@FindBy(xpath="(//*[text()='Consultant'])[1]")
	public WebElement masterDataConsultant;
	
	
	@FindBy(xpath="(//*[text()='Contract Staff'])[1]")
	public WebElement masterDataContractStaff;
	
	@FindBy(xpath="(//*[text()='CHFs/CHEs/BCPs'])[1]")
	public WebElement masterDataCHFsCHEsBCPs;
	
	@FindBy(xpath="(//*[text()='Program Associate'])[1]")
	public WebElement masterDataProgramAssociate;
	
	@FindBy(xpath="(//*[text()='Volunteers'])[1]")
	public WebElement masterDataVolunteers;
	
	
	@FindBy(xpath="(//*[text()='Student'])[1]")
	public WebElement masterDataStudent;
	
	@FindBy(xpath="(//*[text()='CHFMapping'])[1]")
	public WebElement masterDataCHFMapping;
	
	@FindBy(xpath="(//*[text()='Personnel Expenses'])[1]")
	public WebElement personnelExpenses;
	
	@FindBy(xpath="(//*[text()='Salaries'])[1]")
	public WebElement personnelExpensesSalaries;
	
	@FindBy(xpath="(//*[text()='Fees'])[1]")
	public WebElement personnelExpensesFees;
	
	@FindBy(xpath="(//*[text()='Associate Program Fees'])[1]")
	public WebElement personnelExpensesAssociateProgramFees;
	
	@FindBy(xpath="(//*[text()='Staff Advances ( Salary Advances)'])[1]")
	public WebElement personnelExpensesStaffAdvances;
	
	@FindBy(xpath="(//*[text()='Payments & Settlements'])[1]")
	public WebElement personnelExpensesPaymentAndSettlements;
	
	@FindBy(xpath="(//*[text()='Non Personnel Expenses'])[1]")
	public WebElement nonPersonnelExpenses;
	
	@FindBy(xpath="(//*[text()='Advances'])[1]")
	public WebElement nonPersonnelExpensesAdvance;
	
	@FindBy(xpath="(//*[text()='Expenses Booking'])[1]")
	public WebElement nonPersonnelExpensesBooking;
	
	@FindBy(xpath="(//*[text()='Payments & Settlements'])[2]")
	public WebElement nonPersonnelExpensesPaymentAndSettlements;
	
	@FindBy(xpath="(//*[text()='Reimbursements & DirectPayments'])[1]")
	public WebElement nonPersonnelExpensesReimbursementsAndDirectPayments;
	
	@FindBy(xpath="(//*[text()='Program Expenses'])[1]")
	public WebElement programExpenses;
	
	@FindBy(xpath="(//*[text()='Advances'])[2]")
	public WebElement programExpensesAdvances;
	
	@FindBy(xpath="(//*[text()='Program Expenses'])[2]")
	public WebElement programExpensesInProgramExpenses;
	
	@FindBy(xpath="(//*[text()='SNP Advances'])[1]")
	public WebElement programExpensesSNPAdvances;
	
	@FindBy(xpath="(//*[text()='SNP FEE'])[1]")
	public WebElement programExpensesSNPFee;
	
	@FindBy(xpath="(//*[text()='Payments & Settlements'])[3]")
	public WebElement programExpensesPaymentAndSettlements;
	
	@FindBy(xpath="(//*[text()='Stipends'])[1]")
	public WebElement programExpensesStipends;
	
	@FindBy(xpath="(//*[text()='CHFIncentive'])[1]")
	public WebElement programExpensesCHFIncentive;
	
	@FindBy(xpath="(//*[text()='Stipends Payments'])[1]")
	public WebElement programExpensesStipendsPayments;
	
	
	@FindBy(xpath="(//*[text()='Volunteers'])[2]")
	public WebElement programExpensesVolunteers;
	
	
	@FindBy(xpath="(//*[text()='Volunteers Payments'])[1]")
	public WebElement programExpensesVolunteersPayments;
	
	
	@FindBy(xpath="(//*[text()='Receipts'])[1]")
	public WebElement receipts;
	
	
	@FindBy(xpath="(//*[text()='Payment Recovery '])[1]")
	public WebElement receiptsPaymentRecovery;
	
	
	@FindBy(xpath="(//*[text()='Associate Receipts '])[1]")
	public WebElement receiptsAssociateReceipts;
	
	@FindBy(xpath="(//*[text()='Status'])[1]")
	public WebElement status;
	
	
	
	
	
	
	public AssociateCenterModule(WebDriver x)
	{
		this.driver=x;
		PageFactory.initElements(driver, this);
	}
	
	public void clickAssociateCenter()
	{
		clickObj.click(associateCenter);
	}
	
	
	

	
}
