package test;

import org.testng.annotations.Test;

import pages.ABPCheckOutPages;


	public class ABPCheckOutTest extends ABPSelectnTest{	
	@Test(priority=3)
	public void test() throws InterruptedException
	{
		ABPCheckOutPages ob2=new ABPCheckOutPages(cd);
		Thread.sleep(2000);
		ob2.clickaddtocart();
		Thread.sleep(2000);
		ob2.clickcheckout();
		Thread.sleep(2000);
		ob2.details("Kaippurathu", "second", "pallippuram", "kerala","688541","9188572625");
		Thread.sleep(2000);
		ob2.returntocart();
		Thread.sleep(2000);
	    ob2.removal();
	    Thread.sleep(2000);
	    
	}}
	