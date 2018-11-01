package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import env.BaseTest;

public class Loginpage implements BaseTest
{
	public WebDriver driver;
	@FindBy(id="inputEmail")
	public WebElement userid;

	@FindBy(id="inputPassword")
	public WebElement pwd;

	@FindBy(name="Login")
	public WebElement loginBtn;
	
	@FindBy(xpath="(//*[@class='pull-right'])[1]")
	public WebElement profile;
	
	@FindBy(xpath="//*[text()='Sign Out']")
	public WebElement logout;
	
	@FindBy(xpath="//*[text()='The email is required']")
	public WebElement blankEmailErr;
	
	@FindBy(xpath="//*[text()='The password is required']")
	public WebElement blankPwdErr;
	
	@FindBy(xpath="//*[text()='User Authentication is Failed']")
	public WebElement invalidEmailPwdErr;
	
	
	
	
	
	public Loginpage(WebDriver x)
	{
		this.driver=x;
		PageFactory.initElements(driver, this);
	}
	
	public void fillUserId(String x)
	{
		inputObj.enterText(userid, x);
		
	}
	
	public void fillpwd(String x)
	{
		inputObj.enterText(pwd, x);
		
	}
	
	public void clickLoginBtn()
	{
		clickObj.click(loginBtn);
	}
	
	public void clickLogout()
	{
		clickObj.click(logoutBtn);
	}
	
	public void clickOk()
	{
		clickObj.click(okForLogout);
	}
}

