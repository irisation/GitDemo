package pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Test {

	@Test
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Google page = new Google(driver);
		Thread.sleep(5000);
		page.inputKeys("sdgdgdgdf");
		driver.close();

	}
	

}
