import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class WebDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Training\\libs\\selenium-jars\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
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
		obj.quit();
	}

}
