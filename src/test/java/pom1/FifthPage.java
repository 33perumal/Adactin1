package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FifthPage {
	
	public static WebDriver driver;
	
	@FindBy(linkText="www.adactin.com")
	private WebElement ScrollDown;
	public WebElement getScrollDown() {
		return ScrollDown;
	}
	
	@FindBy(linkText ="DOWNLOAD")
	private WebElement ScrollUp;
	public WebElement getScrollUp() {
		return ScrollUp;
	}
	
	@FindBy(linkText = "Logout")
	private WebElement Signout;
		public WebElement getSignout() {
		return Signout;
		}

		public FifthPage(WebDriver driver2) {
		FifthPage.driver = driver2;
		PageFactory.initElements(driver2, this);
		}
}
