package mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Desktop\\Training\\libs\\selenium-jars\\geckodriver.exe");
		WebDriver obj = new FirefoxDriver();
		obj.get("https://www.google.com/");
		
	}

}
