package stepDefinition1;

import java.io.IOException;

import adactin1.BaseClassFinal;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClassFinal{
	@Before
	public void beforeHooks(Scenario scenario) {
    String name = scenario.getName();
	System.out.println("Scenario Name " + name);
	}
	@After
	public void afterHooks(Scenario scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println(" Scenario status "+ status);
	if (scenario.isFailed()) {
		screenShot("C:\\Users\\Sub Inspector Police\\eclipse-workspace\\Adactin1\\Screenshot\\failed.png");
		
	}	
    
	}
	}
