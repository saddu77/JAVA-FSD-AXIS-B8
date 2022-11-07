package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By uname = By.id("j_username");
	By pwd = By.name("j_password");
	By loginBtn = By.xpath("/html/body/div/div/form/div[4]/button");
	
	public void enterUsername(String user){
		driver.findElement(uname).sendKeys(user);
	}
	
	public void enterPassword(String pass){
		driver.findElement(pwd).sendKeys(pass);
	}
	
	public void clickLogin() {		
		driver.findElement(loginBtn).click();
	}
}
