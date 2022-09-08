package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Google {

	WebDriver driver;
	@FindBy(name="q")
	WebElement input;
	public Google(WebDriver driver) {
		this.driver = driver;
	}
	public void inputKeys(String q) {
		input.sendKeys(q);
	}
}
