package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FourthPage {
	public static WebDriver driver;

	@FindBy(name = "first_name")
	private WebElement FirstName;
	public WebElement getFirstName() {
		return FirstName;
	}


	@FindBy(name = "last_name")
	private WebElement LastName;
	public WebElement getLastName() {
		return LastName;
	}

	@FindBy(name = "address")
	private WebElement Billing;
	public WebElement getBilling() {
		return Billing;
	}

	@FindBy(name = "cc_num")
	private WebElement CardNumber;
	public WebElement getCardNumber() {
		return CardNumber;
	}

	@FindBy(name = "cc_type")
	private WebElement CardType;
	public WebElement getCardType() {
		return CardType;
	}

	@FindBy(name = "cc_exp_month")
	private WebElement ExpiryMonth;
	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}

	@FindBy(name = "cc_exp_year")
	private WebElement ExpiryYear;
	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	@FindBy(name = "cc_cvv")
	private WebElement CardCVV;
	public WebElement getCardCVV() {
		return CardCVV;
	}

	@FindBy(name = "book_now")
	private WebElement Submit;
	public WebElement getSubmit() {
		return Submit;
	}

	public FourthPage(WebDriver driver2) {
		FourthPage.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

}
