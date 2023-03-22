package Maven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WebTable {
	 ChromeDriver driver;
	@Test
	public void web() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
	 driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://erail.in/");

	driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();

    List<WebElement> train=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr//td[2]"));
  for (WebElement webElement : train) {
	String attribute=webElement.getText();
	System.out.println(attribute);
    
	} 
    
	}

}
