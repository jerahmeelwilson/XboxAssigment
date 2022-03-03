package xboxbasepages;


import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.Page;
import util.SystemUtil;
import util.TestCaseBase;
import util.Waiting;

public class XboxLeaderboardsPage extends Page {
	
@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[3]/a")
public WebElement rankOne;

@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[3]/a")
public WebElement rankTwo;

@FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div[3]/a")
public WebElement rankThree;

@FindBy(xpath = "/html/body/div[1]/div/div[4]/div/div[3]/a")
public WebElement rankFour;

@FindBy(xpath = "/html/body/div[1]/div/div[5]/div/div[3]/a")
public WebElement rankFive;


public XboxLeaderboardsPage open() throws Exception {
	//read the from property file
	Properties PROPERTIES_RESOURCES = SystemUtil
			.loadPropertiesResources("/testdata_LeaderboardTest.properties");
	String URL = PROPERTIES_RESOURCES.getProperty("leaderboard.url");
	TestCaseBase.threadDriver.get().navigate().to(URL);

	return this;
}
public XboxLeaderboardsPage waitPageLoad() throws InterruptedException {
	Thread.sleep(1500);
	Waiting.until(rankOne);
	return this;
}
}
