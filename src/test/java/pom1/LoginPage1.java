package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	public static WebDriver driver;
	@FindBy(name ="username")
	private WebElement UserName;
	public WebElement getUserName() {
		return UserName;
	}

	@FindBy(name = "password")	
	private WebElement Password;
	public WebElement getPassword() {
		return Password;
	}
	
	@FindBy(name = "login")
	private WebElement Submit;
	public WebElement getSubmit() {
		return Submit;
	}
	
	public LoginPage1(WebDriver driver2) {
		LoginPage1.driver=driver2;
		PageFactory.initElements(driver2, this);
	}




}
