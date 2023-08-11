package test;

import org.testng.annotations.Test;
import pages.ABPLoginPages;

public class ABPLoginTest extends ABPBaseClass {
	
	@Test(priority=1)
	public void test() throws InterruptedException
	{
		ABPLoginPages ob=new ABPLoginPages(cd);
		ob.log("sinumathew4560@gmail.com", "Sinumathew@99");
		Thread.sleep(5000);
	}
	
	

}
