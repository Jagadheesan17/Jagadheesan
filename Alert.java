package Maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert {
	ChromeDriver driver;
	@BeforeMethod
	public void alert() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt1");
	}
	@Test
	public void frame() {
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().sendKeys("dd");
		driver.switchTo().alert().accept();
		
		
		
		
	}

}
