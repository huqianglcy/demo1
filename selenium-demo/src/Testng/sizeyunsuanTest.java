package Testng;


import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.DataProvider;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;

@Test (groups="jihe")public class sizeyunsuanTest {
	sizeyunsuan s=new sizeyunsuan();
	
  @BeforeGroups(groups="add")
  public void beforeClass() {
	  
  }

  @AfterGroups(groups="add")
  public void afterClass() {
	  
  }


  @Test(groups="add")
  public void Aadd() {
	  int result=s.add(4, 5);
	  Assert.assertEquals(result, 9);
	  System.out.println("这是加法分组");
   
  }

  @Test(groups="cheng")
  public void Bcf() {
	  int result=s.cf(5, 4);
	  Assert.assertEquals(result, 20);
	  System.out.println("这是加法分组");
  }

  @Test(groups="add")
  public void Ddiv() {
	  int result=s.div(20, 4);
	  Assert.assertEquals(result, 5);
  }

  @Test(groups="cheng")
  public void Csub() {
	  int result=s.sub(6, 4);
	  Assert.assertEquals(result, 2);
  }
 
}
