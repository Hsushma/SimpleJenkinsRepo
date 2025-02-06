package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsTest 
{
	@Test
	public void simpletest()
	{
		Reporter.log("JenkinsTestscript class executed",true);
	}

}
