package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Google {

	WebDriver driver;

	WebElement input;
	public Google(WebDriver driver) {
		this.driver = driver;
		input = driver.findElement(By.name("q"));
	}
	public void inputKeys(String q) {
		input.sendKeys(q);
	}
}
