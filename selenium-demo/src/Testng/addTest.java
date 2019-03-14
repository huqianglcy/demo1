package Testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class addTest {

	@BeforeTest
	public void setUp() throws Exception {
		
	  
	}

	@AfterTest
	public void tearDown() throws Exception {
	}

	@Test
	@Parameters({"data1","data2"})
	public void test(String data1,String data2) {
		
		System.out.println(data1);
		
		
	}

}
