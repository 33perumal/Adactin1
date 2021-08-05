package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage {
	public static WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement Location;
		public WebElement getLocation() {
		return Location;
	}

	@FindBy(id = "hotels")
	private WebElement Hotel;
	public WebElement getHotel() {
		return Hotel;
	}
	
	@FindBy(id = "room_type")
	private WebElement RoomType;
	public WebElement getRoomType() {
		return RoomType;
	}
	
	@FindBy(id = "room_nos")
	private WebElement NoOfRooms;
	public WebElement getNoOfRooms() {
		return NoOfRooms;
	}
	@FindBy(id = "datepick_in")
	private WebElement CheckIn;
	public WebElement getCheckIn() {
		return CheckIn;
	}
	
	@FindBy(id = "datepick_out")
	private WebElement CheckOut;
	public WebElement getCheckOut() {
		return CheckOut;
	}
	
	@FindBy(id = "adult_room")
	private WebElement AdultPerRoom;
	public WebElement getAdultPerRoom() {
		return AdultPerRoom;
	}
	
	@FindBy(id = "child_room")
	private WebElement NoOfChild;
	public WebElement getNoOfChild() {
		return NoOfChild;
	}
	
	@FindBy(id = "Submit")
	private WebElement Enter;
	public WebElement getEnter() {
		return Enter;
	}
	
	public SecondPage(WebDriver driver2) {
	SecondPage.driver = driver2;
	PageFactory.initElements(driver2, this);
	}
}
