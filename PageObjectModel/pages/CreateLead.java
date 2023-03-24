package pages;





import org.openqa.selenium.By;

import base.BaseClass;

public class CreateLead extends BaseClass {
 
	 public MyLeads lead() {
		 driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		 return new MyLeads();
	 }


}
