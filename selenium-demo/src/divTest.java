import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class divTest {
	
	

	@Before
	public void setUp() throws Exception {
		System.out.println("2");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("3");
	}

	@Test
	public void test() {
		//div.div1(10,2);
		assertEquals(5, div.div1(10,2));
		System.out.println("1");
	}
	@Test
	public void test1() {
		//div.div1(10,2);
		
		System.out.println("4");
	}

}
