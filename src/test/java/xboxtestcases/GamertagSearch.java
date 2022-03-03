package xboxtestcases;

import org.testng.annotations.Test;


import java.util.HashMap;

import util.TestData;
import util.CustomAssertion;
import util.TestCaseBase;

import xboxbasepages.XboxGamerTagPage;
import xboxbasepages.XboxHomePage;

public class GamertagSearch extends TestCaseBase {
	@Test(groups = { "firefox", "ChromeWin32", "IEWin32"})
	public void testGameList() throws Exception {
		
		XboxHomePage xboxHomePage = new XboxHomePage();
		
		xboxHomePage.open();
		xboxHomePage.waitPageLoad();
		
		XboxGamerTagPage xboxGamerTagPage = xboxHomePage.gotoGamertagPage();
	
		HashMap<String, String> games = new HashMap<String, String>();
		games.put("game1",TestData.get("gamertag.game1"));
		games.put("game2",TestData.get("gamertag.game2"));
		games.put("game3",TestData.get("gamertag.game3"));
		games.put("game4",TestData.get("gamertag.game4"));
		games.put("game5",TestData.get("gamertag.game5"));
		
		CustomAssertion assertion = new CustomAssertion();
		
		assertion.equals(xboxGamerTagPage.game1.getText(), games, "game1");
		assertion.equals(xboxGamerTagPage.game2.getText(), games, "game2");
		assertion.equals(xboxGamerTagPage.game3.getText(), games, "game3");
		assertion.equals(xboxGamerTagPage.game4.getText(), games, "game4");
		assertion.equals(xboxGamerTagPage.game5.getText(), games, "game5");	
	}
}
