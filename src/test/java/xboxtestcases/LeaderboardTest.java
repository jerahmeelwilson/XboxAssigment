package xboxtestcases;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

import util.TestData;
import util.CustomAssertion;
import util.TestCaseBase;

import xboxbasepages.XboxLeaderboardsPage;

public class LeaderboardTest extends TestCaseBase{
	@Test(groups = { "firefox", "ChromeWin32", "IEWin32"})
	public void testLeaderBoardPage() throws Exception {
		
		XboxLeaderboardsPage xboxLeaderBoardPage = new XboxLeaderboardsPage();
		
		xboxLeaderBoardPage.open();
		xboxLeaderBoardPage.waitPageLoad();
		
		
		
		HashMap<String, String> leaderboard = new HashMap<String, String>();
		leaderboard.put("rank1",TestData.get("leaderboard.rank1"));
		leaderboard.put("rank2",TestData.get("leaderboard.rank2"));
		leaderboard.put("rank3",TestData.get("leaderboard.rank3"));
		leaderboard.put("rank4",TestData.get("leaderboard.rank4"));
		leaderboard.put("rank5",TestData.get("leaderboard.rank5"));
		
		
		System.out.println(Arrays.asList(leaderboard));
		
		CustomAssertion assertion = new CustomAssertion();
		
		assertion.equals(xboxLeaderBoardPage.rankOne.getText(), leaderboard, "rank1");
		assertion.equals(xboxLeaderBoardPage.rankTwo.getText(), leaderboard, "rank2");
		assertion.equals(xboxLeaderBoardPage.rankThree.getText(), leaderboard, "rank3");
		assertion.equals(xboxLeaderBoardPage.rankFour.getText(), leaderboard, "rank4");
		assertion.equals(xboxLeaderBoardPage.rankFive.getText(), leaderboard, "rank5");	
	}
}
