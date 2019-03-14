package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	@DataProvider(name="test")
    public Object[][] data(){
		
		return new Object[][]{{"http://www.baidu.com/"},{"http://www.qq.com/"}};
	}
    @BeforeTest
	 public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		 
	 
	  }
  @Test(dataProvider="test")
  public void f(String a) {
	  WebDriver driver=new ChromeDriver();
	  String url="a";
	  driver.get(url); 
  }
 

  @AfterTest
  public void afterTest() {
	  WebDriver driver=new ChromeDriver();
	  driver.close();
  
  }

}
