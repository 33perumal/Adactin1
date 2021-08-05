package stepDefinition1;

import adactin1.BaseClassFinal;
import cucumber.api.java.en.*;
import poManagr1.FileReaderManager1;
import poManagr1.POManager1;
import pom1.FifthPage;
import pom1.FourthPage;
import pom1.LoginPage1;
import pom1.SecondPage;
import pom1.ThirdPage;

public class StepDefinition1 extends BaseClassFinal {
    LoginPage1 lp1 = new LoginPage1(driver);
	@Given("^User launch the Application$")
	public void user_launch_the_Application() throws Throwable {
		String url = FileReaderManager1.getInstanceFR().getInstanceCR().getUrl();
		getUrl(url);		
	}

	@When("^User enters userName$")
	public void user_enters_userName() throws Throwable {
	sendKeys(lp1.getUserName(), "Daisykate");
}

	@When("^User enters password$")
	public void user_enters_password() throws Throwable {
    sendKeys(lp1.getPassword(),"789456");
	}

	@Then("^User enters the submit button$")
	public void user_enters_the_submit_button() throws Throwable {
		click(lp1.getSubmit());
	}

	// SECOND POM PAGE DATA //
	
	SecondPage sp = new SecondPage(driver);
	POManager1 pom1= new POManager1(driver);
	
	@Given("^User selecting the location \"([^\"]*)\"$")
	public void user_selecting_the_location(String arg1) throws Throwable {
    dropDown(pom1.getInstanceSecondPage().getLocation(), "byvalue", arg1);
	}

	@When("^Select your hotel type$")
	public void select_your_hotel_type() throws Throwable {
		dropDown(pom1.getInstanceSecondPage().getHotel(),"byValue", "Hotel Cornice");
	}

	@When("^Select your Roomtype$")
	public void select_your_Roomtype() throws Throwable {
		dropDown(pom1.getInstanceSecondPage().getRoomType(),"byVisibleText", "Super Deluxe");
	}

	@When("^Select no of rooms$")
	public void select_no_of_rooms() throws Throwable {
		dropDown(pom1.getInstanceSecondPage().getNoOfRooms(),"byIndex","1");
	}

	@When("^Select Check in date$")
	public void select_Check_in_date() throws Throwable {
		clear(pom1.getInstanceSecondPage().getCheckIn());
		sendKeys(pom1.getInstanceSecondPage().getCheckIn(), "02/08/2021");
	}

	@When("^Select check out date$")
	public void select_check_out_date() throws Throwable {
		clear(pom1.getInstanceSecondPage().getCheckOut());
		sendKeys(pom1.getInstanceSecondPage().getCheckOut(), "03/08/2021");
	}

	@When("^Select person per room$")
	public void select_person_per_room() throws Throwable {
		dropDown(pom1.getInstanceSecondPage().getAdultPerRoom(),"byIndex","2");
	}

	@When("^Select child per room$")
	public void select_child_per_room() throws Throwable {
		dropDown(pom1.getInstanceSecondPage().getNoOfChild(), "byIndex","1");
	}

	@Then("^User click search button$")
	public void user_click_search_button() throws Throwable {
		click(pom1.getInstanceSecondPage().getEnter());
	}

	// ThirdPage //
	ThirdPage tp = new ThirdPage(driver);
	
	@Given("^User confirm the Hotel name$")
	public void user_confirm_the_Hotel_name() throws Throwable {
		click(pom1.getInstanceThirdPage().getCheckBox());
	}

	@When("^User sumbits the hotel name confirmation$")
	public void user_sumbits_the_hotel_name_confirmation() throws Throwable {
		click(pom1.getInstanceThirdPage().getContinue());
	}

	// FourthPage //
 
	FourthPage fp = new FourthPage(driver);
	
	@Given("^Enter the name$")
	public void enter_the_name() throws Throwable {
		sendKeys(pom1.getInstanceFourthPage().getFirstName(),"Daisy");
	}

	@When("^Enter last name$")
	public void enter_last_name() throws Throwable {
		sendKeys(pom1.getInstanceFourthPage().getLastName(),"kate");
	}

	@When("^Enters Billing Address$")
	public void enters_Billing_Address() throws Throwable {
	sendKeys(pom1.getInstanceFourthPage().getBilling(),"10 Keezha vadam boki, Switzerland");
	}

	@When("^Enters card Number$")
	public void enters_card_Number() throws Throwable {
	String cardNumber = FileReaderManager1.getInstanceFR().getInstanceCR().getCardNumber();
	sendKeys(pom1.getInstanceFourthPage().getCardNumber(),cardNumber);
	}

	@When("^Enters card type$")
	public void enters_card_type() throws Throwable {
		dropDown(pom1.getInstanceFourthPage().getCardType(),"byValue", "VISA");
	}

	@When("^Enters expiry Month$")
	public void enters_expiry_Month() throws Throwable {
		dropDown(pom1.getInstanceFourthPage().getExpiryMonth(),"byValue","12");
	}

	@When("^Enters expiry year$")
	public void enters_expiry_year() throws Throwable {
		dropDown(pom1.getInstanceFourthPage().getExpiryYear(), "byValue","2021");
	}

	@When("^Enters CVV No$")
	public void enters_CVV_No() throws Throwable {
		String cvv = FileReaderManager1.getInstanceFR().getInstanceCR().getCvv();
		sendKeys(pom1.getInstanceFourthPage().getCardCVV(), cvv);
	}

	@Then("^Submits for booking$")
	public void submits_for_booking() throws Throwable {
		click(pom1.getInstanceFourthPage().getSubmit());
		}

	// Fifth Page //
	
	FifthPage fp1 = new FifthPage(driver);
	
	@Given("^User scrolldown the page for checking$")
	public void user_scrolldown_the_page_for_checking() throws Throwable {
		scrollPageDown(pom1.getInstanceFifthPage().getScrollDown());
	}

	@When("^User scrollup the page for checking$")
	public void user_scrollup_the_page_for_checking() throws Throwable {
		scrollPageUp(pom1.getInstanceFifthPage().getScrollUp());
	}

	@When("^User Logout$")
	public void user_Logout() throws Throwable {
		click(pom1.getInstanceFifthPage().getSignout());
	}

	
	
}
