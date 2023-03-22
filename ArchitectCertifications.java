package Maven;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class ArchitectCertifications {
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
		// Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> win = driver.getWindowHandles();
		List<String> handel = new ArrayList<String>(win);
		driver.switchTo().window(handel.get(1));
		driver.findElement(By.xpath(" //button[text()='Confirm']")).click();
		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//span[text()='Learning']").click();
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		WebElement learn = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		action.moveToElement(learn).perform();
		WebElement go = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
		action.scrollToElement(go).click(go).perform();
		driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();

		WebElement summary = driver.findElement(By.xpath(
				"//div[contains(@class,'cert-site_text slds-text-align--center Lh(1.5) Fz(16px) slds-container--center slds')]"));
		String sum = summary.getText();
		System.out.println(sum);

		List<WebElement> Certificates = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for (WebElement seven : Certificates) {
			String certificate = seven.getText();

			System.out.println(certificate);
		}
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		List<WebElement> c1 = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for (WebElement archi : c1) {
			String c2 = archi.getText();

			System.out.println(c2);
		}
	}

}
