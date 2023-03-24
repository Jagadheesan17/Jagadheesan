package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.HomePage;
import pages.CreateLead;
import pages.MyLeads;

public class leaftaps extends BaseClass {
	@Test
	public void leafTaps() {
		LoginPage lp = new LoginPage();
		lp.enterUsername().enterPassword().clickLoginButton().crmsfa().lead().Company().firstname().createLeadForm()
				.lastName().create();

	}
}
