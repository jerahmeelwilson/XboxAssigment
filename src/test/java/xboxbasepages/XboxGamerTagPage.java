package xboxbasepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.Page;

public class XboxGamerTagPage extends Page {
	@FindBy(xpath = "//html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/h3/a")
	public WebElement game1;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/h3/a")
	public WebElement game2;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/h3/a")
	public WebElement game3;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[4]/div/div/div[1]/h3/a")
	public WebElement game4;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[5]/div/div/div[1]/h3/a")
	public WebElement game5;

}
