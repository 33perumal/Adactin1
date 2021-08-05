package adactin1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClassFinal {
	public static WebDriver driver;

	// 1. For launching Web Browser : - //
	public static WebDriver browserSetup(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Sub Inspector Police\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("opera")) {
				System.setProperty("weddriver.opera.driver",
						"C:\\Program Files\\selenium opera driver\\operadriver.exe");
				driver = new OperaDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Program Files\\Selenium firefox driver\\geckodriver.exe");
			} else {
				System.out.println("Invalid BrowserName");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}

	// 2. For getting URL :- //

	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	}

	// 3. For getting current URL:- //

	public static void getCurrentUrl() {
		try {
			driver.getCurrentUrl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 4. For navigation to url:- //
	public static void navigate(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 5. For backward :- //

	public static void backward() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 6. For forward:- //

	public static void forward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// 7. For refresh:- //
	public static void refresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 8. For quit:- //
	public static WebDriver quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	// 9. For Close:- //
	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 10. For getting Title:- //

	public static void getTitle() {
		try {
			driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 11. is Enabled:- //

	public static void enabled(WebElement element) {
		try {
			element.isEnabled();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 12. is displayed:- //

	public static void displayed(WebElement element) {
		try {
			element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 13. is selected :- //

	public static void selected(WebElement element) {
		try {
			element.isSelected();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 14. Screen shot:- //
	public static void screenShot(String path) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			File desFile = new File(
					"C:\\Users\\Sub Inspector Police\\eclipse-workspace\\Selenium_Project\\Screenshot\\keezhavadam.png");
			FileUtils.copyFile(srcFile, desFile);
		} catch (WebDriverException | IOException e) {
			e.printStackTrace();
		}
	}

	// 15. dropDown :- //
	public static void dropDown(WebElement element, String types, String value) {
		try {
			Select st = new Select(element);
			if (types.equalsIgnoreCase("byIndex")) {
				int parseInt = Integer.parseInt(types);
				st.selectByIndex(parseInt);
			} else if (types.equalsIgnoreCase("byValue")) {
				st.selectByValue(value);
			} else if (types.equalsIgnoreCase("byVisibleText")) {
				st.selectByVisibleText(value);
			} else {
				System.out.println(" Invalid Selection");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	// 16. Dropdown using Locator:- //
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void dropDown1(By locator, String types, String value) {
		try {
			Select sc = new Select(getElement(locator));
			switch (types) {
			case "byIndex":
				sc.selectByIndex(Integer.parseInt(value));
				break;
			case "byValue":
				sc.selectByValue(value);
				break;
			case "byVisibleText":
				sc.selectByVisibleText(value);
				break;
			default:
				System.out.println(" Not correction selection ");
				break;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

	// 17. sendKeys :- //
	public static void sendKeys(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 18. to click :- //
	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 19. simple alert : - //
	public static void simpleAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 20. Confirm Alert:- //
	public static void confirmAlert(String OK, String Cancel) {
		try {
			if (OK.equalsIgnoreCase(OK)) {
				driver.switchTo().alert().accept();
			} else if (Cancel.equalsIgnoreCase(Cancel)) {
				driver.switchTo().alert().dismiss();
			} else {
				System.out.println("Invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 21. Prompt Alert : - //
	public static void promptAlert(String value, String OK, String Cancel) {
		try {
			if (OK.equalsIgnoreCase(OK)) {
				driver.switchTo().alert().sendKeys(value);
				driver.switchTo().alert().accept();
			} else if (Cancel.equalsIgnoreCase(Cancel)) {
				driver.switchTo().alert().sendKeys(Cancel);
				driver.switchTo().alert().dismiss();
			} else {
				System.out.println("Invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 22.actions :- //

	public static void actionMethod(WebElement element) {
		try {
			Actions at = new Actions(driver);
			at.contextClick(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 23. Actions - move to element :- //

	public static void moveToElement(WebElement element) {
		try {
			Actions at = new Actions(driver);
			at.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 24. Actions - Drag & Drop : - //

	public static void drogDrop(WebElement Element, WebElement Element1) {
		try {
			Actions at = new Actions(driver);
			at.dragAndDrop(Element, Element1).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 25. Robot :- //

	public static void robotClass() throws AWTException {
		try {
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	// 26. Scroll - PageUp :-//

	public static void scrollPageUp(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 27. Scroll - pageDown :- //

	public static void scrollPageDown(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 28. Frames :- //

	public static void frameMethod(String types, String value, WebElement element) {
		try {
			if (types.equalsIgnoreCase("byIndex")) {
				int index = Integer.parseInt(value);
				driver.switchTo().frame(index);
			} else if (types.equalsIgnoreCase("byElement")) {
				driver.switchTo().frame(element);
			} else if (types.equalsIgnoreCase("byString")) {
				driver.switchTo().frame(value);
			} else {
				System.out.println("Invalid selection");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	// 29. Clearing string :-

	public static void clear(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 30. Window Handles : - //

	public static void windowHandles() {
		try {
			Set<String> element = driver.getWindowHandles();
			for (String st : element) {
				String title = driver.switchTo().window(st).getTitle();
				System.out.println(title);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
