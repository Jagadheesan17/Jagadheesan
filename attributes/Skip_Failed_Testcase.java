package attributes;

import org.testng.annotations.Test;

public class Skip_Failed_Testcase {
	@Test(enabled = false)
	public void testcase() {
		System.out.println("print your name");
	}
	@Test(enabled = true)
	public void testcases() {
		System.out.println("Print your address");
	}

}
