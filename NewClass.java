package Maven;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NewClass {
	@Test
	public void mai() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
	Set<String>w=driver.getWindowHandles();
	List<String>window=new ArrayList<String>(w);
	System.out.println(window);
	String child =window.get(1);
	driver.switchTo().window(child);
	String name=driver.getTitle();
	System.out.println(name);
	//select[@id='selectnav2']
	driver.findElement(By.xpath("//select[@id='selectnav2']")).click();
	
	
	
	
}}
