package Testng;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class add {
	@DataProvider(name="test")
	public Object[][] data(){
		
		return new Object[][]{{"hello","world"},{"lll","hhh"}};
	}

	@BeforeTest
	public void setUp() throws Exception {
		
	  
	}

	@AfterTest
	public void tearDown() throws Exception {
	}

	@Test(dataProvider="test")
	
	public void test(String data1,String data2) {
		
		System.out.println(data1);
		System.out.println(data2);
		
		
	}

}
