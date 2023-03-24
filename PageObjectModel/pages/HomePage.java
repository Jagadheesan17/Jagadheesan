package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class HomePage extends BaseClass {
	 public CreateLead crmsfa() {
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 return new CreateLead();
	 }

}
