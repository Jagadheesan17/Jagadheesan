package attributes;

import java.security.InvalidAlgorithmParameterException;

import org.testng.annotations.Test;

public class depends {
	@Test
	public void dep() {
		System.out.println("depends"); 
		//throw new InvalidAlgorithmParameterException();
	}
	@Test(dependsOnMethods = "dep")
	public void met() {
		System.out.println("onMethod");
	}
	@Test(dependsOnMethods = {"dep","met"})
	public void on() {
		System.out.println("sucessfully printed");
	}

}
