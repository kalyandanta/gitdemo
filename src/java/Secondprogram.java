package java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondprogram {
static WebDriver driver;
	public static void main(String[] args) {
	System.setProperty("webDriver.chrome.driver","c:\\users\\dshan\\onedrive\\documents\\lib\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.close();
	driver.quit();

	}

}
