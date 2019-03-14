package Testng;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest2 {
	static WebDriver driver;
	@DataProvider(name="test")
	public Object[][] data(){
		
		return new Object[][]{{"13647049263","beloveover0712"},{"123456","beloveover0712"}};
	}

  @Test(dataProvider="test")
  public void denglu(String name,String pass) throws InterruptedException, IOException {
		String url="http://www.baidu.com/";
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.linkText("µÇÂ¼")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("TANGRAM__PSP_10__footerULoginBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__userName\"]")).sendKeys(name);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__password\"]")).sendKeys(pass);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__submit\"]")).click();
		try {
			Thread.sleep(5000);
			driver.findElement(By.className("user-name"));
			System.out.println("µÇÂ½³É¹¦");
		}
		catch(Exception e){
			Thread.sleep(5000);
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("D://a.jpg"));
			String cw=driver.findElement(By.id("TANGRAM__PSP_10__error")).getText();
			System.out.println(cw);
		}
	
  }
  @BeforeTest
	public void kq() throws Exception {
	  System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
	 driver=new ChromeDriver();
	  
	}
  @AfterTest
	public void tearDown() throws Exception {
	  driver.close();
	}
  
}
