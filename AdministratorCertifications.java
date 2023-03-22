package Maven;

import java.time.Duration;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.sukgu.Shadow;

public class AdministratorCertifications {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*", "--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> win = driver.getWindowHandles();
		List<String> handel = new ArrayList<String>(win);
		driver.switchTo().window(handel.get(1));
		driver.findElement(By.xpath(" //button[text()='Confirm']")).click();
		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//span[text()='Learning']").click();
		WebElement learn = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		action.moveToElement(learn).perform();
		WebElement go = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
		action.scrollToElement(go).click(go).perform();
        driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[1]")).click();
        String title = driver.getTitle();
		System.out.println(title);
		List<WebElement> Certificates = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for (WebElement six : Certificates) {
			String certificate = six.getText();
			System.out.println(certificate);

		}
	}

}
