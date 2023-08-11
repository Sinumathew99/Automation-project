package test;

import org.testng.annotations.Test;
import pages.ABPSelectnPages;

public class ABPSelectnTest extends ABPLoginTest {
	@Test(priority=2)
	public void test() throws InterruptedException
	{
		ABPSelectnPages ob1=new ABPSelectnPages(cd);
		Thread.sleep(2000);
		ob1.selectn();
		Thread.sleep(2000);
	}
	
	
	
	
	
	

}
