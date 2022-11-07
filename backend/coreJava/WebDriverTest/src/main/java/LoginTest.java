import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Training\\libs\\selenium-jars\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		
		obj.get("http://127.0.0.1:8080/");
		obj.findElement(By.id("j_username")).sendKeys("admin");
		obj.findElement(By.name("j_password")).sendKeys("admin123");
	    obj.findElement(By.xpath("/html/body/div/div/form/div[4]/button")).click();	
	    obj.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    obj.findElement(By.xpath("//*[@id=\"page-header\"]/div[3]/a[2]/span")).click();
	    obj.quit();
	}

}
