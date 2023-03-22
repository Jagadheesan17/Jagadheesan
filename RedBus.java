package Maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*", "--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("chen");
		Actions action = new Actions(driver);
		WebElement from = driver.findElement(By.xpath("(//li[@class='sub-city'])[1]"));
		action.moveToElement(from).click().perform();

		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("banga");
		WebElement to = driver.findElement(By.xpath("(//li[@class='sub-city'])[1]"));
		action.moveToElement(to).click().perform();
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[text()='23']")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();

		WebElement found = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']"));
		String bus = found.getText();
		System.out.println(bus);
		driver.findElement(By.xpath("(//label[@class='custom-checkbox'])[6]")).click();
		WebElement second = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]"));
		String secondbus = second.getText();
		System.out.println(secondbus);
		String title = driver.getTitle();
		System.out.println(title);

	}

}
