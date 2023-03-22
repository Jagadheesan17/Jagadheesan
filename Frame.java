package Maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frame {
	ChromeDriver driver;

	@BeforeMethod

	public void fr() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(option);
		driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node01kaleicwjqld431kahknhzg5v171783.node0");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@Test
	public void fram() {
		WebElement frame=driver.findElement(By.xpath("(//div[@class='card']/iframe)[3]"));
		driver.switchTo().frame(frame);
		WebElement frame1=driver.findElement(By.xpath("//body/iframe"));
	
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("Click")).click();
	}

}
