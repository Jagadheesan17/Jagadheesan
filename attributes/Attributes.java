package attributes;

import org.testng.annotations.Test;

public class Attributes {
	@Test(threadPoolSize=3,invocationCount=3)
	public  void att() {
		System.out.println("hello");
		
	}

}
