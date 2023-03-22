package Maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookMyshow {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*", "--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://in.bookmyshow.com/");

		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		String currentUrl = driver.getCurrentUrl();
		Thread.sleep(2000);
		WebElement findElement = driver
				.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']"));
		findElement.click();
		WebElement findElement2 = driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']"));
		findElement2.sendKeys("pathaan");
		WebElement findElement3 = driver.findElement(By.xpath("//div[@class='sc-fFTYTi kXEckc']"));
		Actions action = new Actions(driver);
		action.moveToElement(findElement3).click().perform();

		driver.findElement(By.xpath(
				"(//button[contains(@class,'CommonContainers__ButtonComponent-sc-8f9mtj-0 CommonContainers__')])[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='sc-vhz3gb-3 dRokFO']//span)[1]")).click();

		WebElement the = driver.findElement(By.xpath("//a[@class='__venue-name']"));
		String theater = the.getText();
		System.out.println(theater);
		the.click();

		driver.findElement(By.xpath("//div[text()='Details']")).click();
		Thread.sleep(2000);
		WebElement facility = driver.findElement(By.xpath("(//div[@class='facility-text'])[4]"));
		String park = facility.getText();
		System.out.println("available =" + park);

		driver.findElement(By.xpath("//div[text()='							Thu						']")).click();
		driver.findElement(By.xpath("	//div[text()='							10:10 AM					']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='Accept'])[1]")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='pop_1']")).click();
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		driver.findElement(By.xpath("(//a[@class='_available'])[1]")).click();
		driver.findElement(By.xpath("(//span[@id='btnSTotal_reserve'])[1]")).click();
		Thread.sleep(2000);
		WebElement Rs = driver.findElement(By.xpath("//span[@id='ttPrice']"));
		String subtotal = Rs.getText();
		System.out.println(subtotal);

	}

}
