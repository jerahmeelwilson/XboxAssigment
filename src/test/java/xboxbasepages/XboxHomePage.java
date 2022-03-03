package xboxbasepages;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import util.Page;
import util.SystemUtil;
import util.TestCaseBase;
import util.Waiting;

public class XboxHomePage extends Page{
	
	public static String TITLE="Yahoo";
	public static String URL="https://www.yahoo.com/";
	

	
	@FindBy(xpath = "//input[@placeholder='Enter a gamertag to lookup']")
	public WebElement searchInput;
	
	@FindBy(xpath = "//a[@href='/leaderboards']")
	public WebElement leaderboards;

	public XboxHomePage open() throws Exception {
		//read the from property file
		Properties PROPERTIES_RESOURCES = SystemUtil
				.loadPropertiesResources("/testdata_xbox.properties");
		String URL = PROPERTIES_RESOURCES.getProperty("gamertagpage.url");
		TestCaseBase.threadDriver.get().navigate().to(URL);

		return this;
	}
	
	
	
	public XboxLeaderboardsPage gotoLeaderboardsPage() {
		Waiting.until(leaderboards);
		leaderboards.click();
		
		return new XboxLeaderboardsPage();
	}
	
	
	public XboxGamerTagPage gotoGamertagPage() throws Exception {
		Properties PROPERTIES_RESOURCES = SystemUtil
				.loadPropertiesResources("/testdata_xbox.properties");
		String gamertag = PROPERTIES_RESOURCES.getProperty("xbox.gamertag");
		Waiting.until(searchInput);
		searchInput.sendKeys(gamertag + Keys.ENTER);
		
		return new XboxGamerTagPage();
	}
	
	public XboxHomePage waitPageLoad() throws InterruptedException {
		Thread.sleep(1500);
		Waiting.until(leaderboards);
		//Waiting.until(loginLink);
		return this;
	}
}
