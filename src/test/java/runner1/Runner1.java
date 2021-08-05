package runner1;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import adactin1.BaseClassFinal;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import poManagr1.FileReaderManager1;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\adactin1", glue = "stepDefinition1", monochrome = true,plugin ={"pretty","com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport1.html","html:Report/HTML_Report","json:Report1/CucumberJSON_Report.json"})

public class Runner1 {
	public static WebDriver driver;

@BeforeClass
	public static void setUp() throws Throwable {
		String browser = FileReaderManager1.getInstanceFR().getInstanceCR().getBrowser();
		driver = BaseClassFinal.browserSetup(browser);

	}

}
