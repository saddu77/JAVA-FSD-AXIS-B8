package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
	WebDriver driver;

	public Dashboard(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	By logoutBtn = By.xpath("//*[@id=\"page-header\"]/div[3]/a[2]/span");
	
	
	public String getHeading(){
		String head = driver.getTitle();
		return head;
	}
	
	public void clickLogout() throws InterruptedException {
		
		driver.findElement(logoutBtn).click();
	}
}
