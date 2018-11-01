package stepDefintions;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import methods.ExplicitWaitMethods;
import methods.TestCaseFailed;
import pages.Loginpage;
import pages.Modules;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import env.BaseTest;

public class PredefinedStepDefinitions implements BaseTest
{
	Scenario s;
	public Loginpage lp;
	public Modules m;
	
	@Before
	public void method1(Scenario x) throws Exception
	{
		//use scenario object for current scenario
		this.s=x;
		lp=new Loginpage(driver);
		m=new Modules(driver);
	}
	
	//Navigation Steps
	
		//Step to navigate to specified URL
		@Then("^navigate to \"([^\"]*)\"$")
		public void navigate_to(String link)
		{
			navigationObj.navigateTo(link);
		}
			
		//Step to navigate forward
		@Then("^navigate forward")
		public void navigate_forward()
		{
			navigationObj.navigate("forward");
		}
			
		//Step to navigate backward
		@Then("^navigate back")
		public void navigate_back()
		{
			navigationObj.navigate("back");
		}
		
		// steps to refresh page
		@Then("^refresh page$")
		public void refresh_page()
		{
			driver.navigate().refresh();
		}
	
	// Switch between windows
		
		//Switch to new window
		@Then("^switch to new window$")
		public void switch_to_new_window()
		{
			navigationObj.switchToNewWindow();
		}
			 
		//Switch to old window
		@Then("^switch to previous window$")
		public void switch_to_old_window()
		{
			navigationObj.switchToOldWindow();
		}
			
		//Switch to new window by window title
		@Then("^switch to window having title \"(.*?)\"$")
		public void switch_to_window_by_title(String windowTitle) throws Exception
		{
			navigationObj.switchToWindowByTitle(windowTitle);
		}
		  
		//Close new window
		@Then("^close new window$")
		public void close_new_window()
		{
			navigationObj.closeNewWindow();
		}
		
	// Switch between frame 
		
		/*@Then("^I switch to frame having name or id \"(.*?)\"$")
		public void switch_frame_by_nameorid(String nameorid) {
		    // Write code here that turns the phrase above into concrete actions
			navigationObj.switchFrameByNameorid(nameorid);
		}
		// Step to switch to frame by index
		@Then("^I switch to frame having index \"(.*?)\" $") 
		public void switch_frame_by_index(int index)
		{
			navigationObj.switchFrameByIndex(index);
		}
		  
		// Step to switch to frame by name or id
		@Then("^I switch to frame having name or id \"(.*?)\"$") 
		public void switch_frame_by_nameorid(String nameorid)
		{
			navigationObj.switchFrameByNameorid(nameorid);
		}*/
		
		// Step to switch to frame by web element
		
			
		// step to switch to main content
		@Then("^switch to main content$")
		public void switch_to_default_content()
		{
			navigationObj.switchToDefaultContent();
		}
	
	// To interact with browser
		
		// step to resize browser
		@Then("^resize browser window size to width (\\d+) and height (\\d+)$")
		public void resize_browser(int width, int heigth)
		{
			navigationObj.resizeBrowser(width, heigth);
		}
		
		// step to maximize browser
		@Then("^maximize browser window$")
		public void maximize_browser()
		{
			navigationObj.maximizeBrowser();
		}
				
		//Step to close the browser
		@Then("^close browser$")
		public void close_browser()
		{
			navigationObj.closeDriver();
		}
			
	// zoom in/out page
		
		// steps to zoom in page
		@Then("zoom in page$") 
		public void zoom_in()
		{
			navigationObj.zoomInOut("ADD");
		}
		
		// steps to zoom out page
		@Then("^zoom out page$")
		public void zoom_out()
		{
			navigationObj.zoomInOut("SUBTRACT");
		}
	
		
	// reset webpage view use
		
		@Then("^reset page view$")
		public void reset_page_zoom()
		{
			navigationObj.zoomInOut("reset");
		}

	// scroll webpage

		@Then("^scroll to (top|end) of page$")
		public void scroll_page(String to) throws Exception
		{
			navigationObj.scrollPage(to);
		} 

		
	
	//JavaScript handling steps
	
	//Step to handle java script
	@Then("^I accept alert$")
	public void handle_alert()
	{
		javascriptObj.handleAlert("accept");
	}

	//Steps to dismiss java script
	@Then("^I dismiss alert$")
	public void dismiss_alert()
	{
		javascriptObj.handleAlert("dismiss");
	}
	
	//Screen shot methods
	
    @Then("^I take screenshot$")
    public void take_screenshot() throws IOException
    {
    	screenshotObj.takeScreenShot();
    }
    
  //Configuration steps
	
  	// step to print configuration
  	@Then("^I print configuration$") 
  	public void print_config()
  	{
  		configObj.printDesktopConfiguration();
  	}
  	
  	
  	@Then("^enter userid with \"(.*)\"$")
  		public void enterUserId(String x)
  		{
  			lp.fillUserId(x);
  		}
  	
	@Then("^enter password with \"(.*)\"$")
		public void enterpwd(String x)
		{
			lp.fillpwd(x);
		}
	
	@And("^click on login button$")
	public void clickLogin() throws Exception
	{
		lp.clickLoginBtn();
		
	}
	
	@Then("^click on logout$")
	public void clicklogout()
	{
		lp.clickLogout();
	}
	
	@Then("^click on ok$")
	public void clickOk()
	{
		navigationObj.switchToActiveElement();
		lp.clickOk();
	}
	
	@Then("^validate userid and password fields with \"(.*)\"$")
	public void validateUserPwdFields(String x) throws Exception
	{
		if(x.equalsIgnoreCase("blank")&&lp.blankEmailErr.isDisplayed()&&lp.blankPwdErr.isDisplayed())
		{
			s.write("blank test passesd");
		}
		else if(x.equalsIgnoreCase("blankuserid")&&lp.blankEmailErr.isDisplayed())
		{
			s.write("blank user id test passed");
		}
		else if(x.equalsIgnoreCase("blankpwd")&&lp.blankPwdErr.isDisplayed())
		{
			s.write("blank password test passed");
		}
		else if(x.equalsIgnoreCase("invalidpwd")&&lp.invalidEmailPwdErr.isDisplayed())
		{
			s.write("invalid password test passed");
		}
		else if(x.equalsIgnoreCase("invaliduserid")&&lp.invalidEmailPwdErr.isDisplayed())
		{
			s.write("invalid user id test passed");
		}
		else if(x.equalsIgnoreCase("valid")&&lp.logoutBtn.isDisplayed())
		{
			s.write("valid user id and password test  passed");
		}
		else {
			screenshotObj.takeScreenShot();
		}
	}
	
	
	@Then("^click on language submodule$")
	public void clickLanguageSubModule()
	{
		m.clickLanguage();
	}
	
	@Then("^click on city submodule$")
	public void clickCitySubModule()
	{
		m.clickCity();
	}
	
	@Then("^click on logout and click ok$")
	public void clickLogout()
	{
		m.logout();
	}
  	
}
