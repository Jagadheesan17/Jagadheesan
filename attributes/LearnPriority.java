package attributes;

import org.testng.annotations.Test;

public class LearnPriority {
	@Test(priority=-1)
	public void pri() {
		System.out.println("hello");
	}
	@Test(priority=0)
	public void nxt() {
		System.out.println("how are you");
	}

}
