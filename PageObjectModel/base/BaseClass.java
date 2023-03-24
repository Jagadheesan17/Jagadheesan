package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {

	public static ChromeDriver driver;

	@BeforeMethod
	public void preCondition() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterMethod
	public void postCondition() throws InterruptedException {
		Thread.sleep(5000);
		WebElement title = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']"));
		if(title.isDisplayed()) {
			System.out.println("----------------- Successfully Created ---------------");
		driver.close();

	}
	}}
