package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import env.BaseTest;

public class Dashboard implements BaseTest 
{
	public WebDriver driver;
	
	@FindBy(xpath="//*[@class='panel panel-success panel-colorful']")
	public WebElement associateCener;
	
	@FindBy(xpath="//*[@class='panel panel-info panel-colorful']")
	public WebElement vendorCenter;
	
	@FindBy(xpath="//*[@class='panel panel-purple panel-colorful']")
	public WebElement donorCustomerCenter;
	
	
	@FindBy(xpath="//*[@class='panel panel-warning panel-colorful']")
	public WebElement bankCenter;
	
	@FindBy(xpath="//*[@class='panel panel-org panel-colorful']")
	public WebElement organizationCenter;
	
	@FindBy(xpath="panel panel-cent panel-colorful")
	public WebElement reportsCenter;
	
	public Dashboard(WebDriver x)
	{
		this.driver=x;
		PageFactory.initElements(driver, this);
	}
	
	public void clickAssociateCenter()
	{
		clickObj.click(associateCener);
	}
	
	public void clickVendorCenter()
	{
		clickObj.click(vendorCenter);
	}
	
	public void clickDonorCustomerCenter()
	{
		clickObj.click(donorCustomerCenter);
	}
	
	public void clickBankCenter()
	{
		clickObj.click(bankCenter);
	}
	
	public void clickOrganizationCenter()
	{
		clickObj.click(organizationCenter);
	}
	
	public void clickReportsCenter()
	{
		clickObj.click(vendorCenter);
	}
}
