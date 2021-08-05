package poManagr1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pom1.FifthPage;
import pom1.FourthPage;
import pom1.SecondPage;
import pom1.ThirdPage;

public class POManager1 {
	public static WebDriver driver;

	public POManager1(WebDriver driver2) {
		POManager1.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	private SecondPage sp;
	public SecondPage getInstanceSecondPage() {
		sp = new SecondPage(driver);
		return sp;
	}

	private ThirdPage tp;
	public ThirdPage getInstanceThirdPage() {
		tp= new ThirdPage(driver);
		return tp;
	}

	private FourthPage fp;
	public FourthPage getInstanceFourthPage() {
		fp = new FourthPage(driver);
		return fp;
	}

	private FifthPage fp1;
	public FifthPage getInstanceFifthPage() {
		fp1=new FifthPage(driver);
		return fp1;
	}

}
