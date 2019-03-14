import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shoujiTest {
	static WebDriver driver;
	@BeforeClass
	public  static void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("localhost:8080/mobile_mysql/index.jsp");
		driver.findElement(By.name("name")).sendKeys("123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.className("input1")).click();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.close();
		
	}

	@Test
	public  void testMain() {
		String a=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/table[2]/tbody/tr[1]/td")).getText();
        assertEquals("123,欢迎回来", a);
       
	}
	@Test
	public void test1(){
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 EEEE");
	        String currentDate =   dateFormat.format( new Date() );
	        String a=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/table[2]/tbody/tr[2]/td")).getText();
	        assertEquals(currentDate, a);
	        
		
	}
	@Test
	public void test2() {
		String b=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/table[2]/tbody/tr[3]/td")).getText();
        assertEquals("会员姓名：le" ,b);
	}
	

}
