import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;

public class test2 {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://www.baidu.com/";
		driver.get(url);
		//WebElement a=driver.findElement(By.className("mnav"));
		List<WebElement> a= driver.findElements(By.className("mnav"));
		a.get(1).click();
		String a1="https://www.hao123.com/";
		if(a1.equals(driver.getCurrentUrl())){
			System.out.println(driver.getCurrentUrl());
			WebElement a3=driver.findElement(By.xpath("//*[@id=\"search-input\"]"));
			a3.sendKeys("selenium");
			WebElement a4=driver.findElement(By.xpath("//*[@id=\"search-form\"]/div[2]/input"));
			a4.click();
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(file,new File("D:/a.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		else {
			driver.navigate().refresh();

			
		}/*
		
		*/



	}

}