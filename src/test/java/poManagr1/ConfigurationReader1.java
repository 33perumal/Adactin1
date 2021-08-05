package poManagr1;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ConfigurationReader1 {
	public static Properties p1;
public ConfigurationReader1() throws Throwable {
File f = new File("C:\\Users\\Sub Inspector Police\\eclipse-workspace\\Adactin1\\src\\test\\java\\poManagr1\\adactin1.properties");
FileInputStream fis1 = new FileInputStream(f);
p1 = new Properties();
p1.load(fis1);
}

public String getBrowser() {
String browser = p1.getProperty("browser");
return browser;
}

public String getUrl() {
String url = p1.getProperty("url");
return url;
}

public String getCardNumber() {
	String cardNumber = p1.getProperty("cardNumber");
    return cardNumber;
}

public String getCvv() {
	String cvv = p1.getProperty("cvv");
	return cvv;

}
}
