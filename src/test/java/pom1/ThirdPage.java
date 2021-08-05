package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdPage {
public static WebDriver driver;

@FindBy(name ="radiobutton_0")
private WebElement CheckBox;
public WebElement getCheckBox() {
	return CheckBox;
}

@FindBy(name = "continue")
private WebElement Continue;
public WebElement getContinue() {
return Continue;
}

public ThirdPage(WebDriver driver2) {
ThirdPage.driver = driver2;
PageFactory.initElements(driver2, this);
}

}





