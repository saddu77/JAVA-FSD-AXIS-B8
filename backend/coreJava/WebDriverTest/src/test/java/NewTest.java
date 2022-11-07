import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver obj;
	 @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Before Test case");
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Training\\libs\\selenium-jars\\chromedriver.exe");
		  obj = new ChromeDriver();
	  }
	 
  @Test
  public void calculate() {
	    obj.get("https://www.calculator.net/");
		obj.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[3]")).click();
		obj.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
		obj.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[3]")).click();
		obj.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
		String res = obj.findElement(By.id("sciOutPut")).getText();
		System.out.println("Result is:" + res);
		if(res.trim().equals("18")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	
  }
  @Test
  public void openJenkins() {
	    obj.get("http://127.0.0.1:8080/");
		obj.findElement(By.id("j_username")).sendKeys("admin");
		obj.findElement(By.name("j_password")).sendKeys("admin123");
	    obj.findElement(By.xpath("/html/body/div/div/form/div[4]/button")).click();	
	    obj.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    obj.findElement(By.xpath("//*[@id=\"page-header\"]/div[3]/a[2]/span")).click();
  }
 

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Test case");
		obj.quit();
  }

}
