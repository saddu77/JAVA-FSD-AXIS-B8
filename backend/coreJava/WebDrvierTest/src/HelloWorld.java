
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Training\\libs\\selenium-jars\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://www.facebook.com");
		
	}

}
