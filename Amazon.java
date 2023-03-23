package Maven;

import java.time.Duration;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*", "--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(" https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags", Keys.ENTER);
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
		String bag = findElement.getText();
		System.out.println(bag);

		WebElement america = driver.findElement(By.xpath("//span[text()='American Tourister']"));

		Actions action = new Actions(driver);
		action.click(america).click().perform();
		Thread.sleep(2000);
		WebElement sky = driver.findElement(By.xpath("//span[text()='Skybags']"));

		action.click(sky).click().perform();
		Thread.sleep(2000);
		WebElement findElement2 = driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
		findElement2.click();
		// Select select = new Select(findElement2);
		// select.selectByVisibleText("Newest Arrivals");

		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Skybags Polyester 30 Ltrs Fox Black Laptop Backpack (Black)']"))
				.click();
		Set<String> win = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(win);
		driver.switchTo().window(window.get(1));
		WebElement dd = driver.findElement(By.xpath("//span[@id='productTitle']"));
		String dd1 = dd.getText();
		System.out.println("product name   ::" + dd1);
		// div[@class='a-section a-spacing-none aok-align-center']
		WebElement ddd = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none aok-align-center']"));
		String dd2 = ddd.getText();
		System.out.println("DISCOUNT PRICE   ::" + dd2);
		driver.close();
	}
}
