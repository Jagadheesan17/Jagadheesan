package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class MyLeads extends BaseClass {
	public MyLeads Company() {
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		return this;
	}
	public MyLeads firstname() {
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Testleaf");
		return this;
	}
	public MyLeads createLeadForm() {
		Select sel= new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']")));
		sel.selectByValue("LEAD_EMPLOYEE");
		return this;
	}
	public MyLeads lastName() {
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("G");
		return this;
	}
	public void create() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 
	}
	

}
