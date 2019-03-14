import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
//		String url="http://www.baidu.com/";
//		driver.get(url);
		//WebElement a=driver.findElement(By.className("mnav"));
//		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(file,new File("D:/a.jpg"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		String url="https://www.sina.com.cn/";
		driver.get(url);
//		driver.findElement(By.id("alert")).click();
//		//跳转到弹框页面
//		Alert a=driver.switchTo().alert();
//		Thread.sleep(5000);
//		a.accept();
//		//点击确定
//		driver.findElement(By.id("confirm")).click();
//		Alert b=driver.switchTo().alert();
//		Thread.sleep(5000);
//	    b.dismiss();
//	    driver.findElement(By.id("prompt")).click();
//		Alert c=driver.switchTo().alert();
//		Thread.sleep(5000);
//	    c.sendKeys("乐建波");
//	    c.accept();
//		driver.switchTo().frame("frame");
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"div1\"]")).getText());
//		driver.findElement(By.id("input1")).sendKeys("aaa");
//		System.out.println(driver.getTitle());
//		driver.switchTo().defaultContent();
//		WebElement a=driver.findElement(By.name("yue"));
//		Select b=new Select(a);
//		b.selectByIndex(2);
//		Thread.sleep(3000);
//		b.selectByValue("5");
//		Thread.sleep(3000);
//		b.selectByVisibleText("一月");
		String a=driver.getWindowHandle();
		Thread.sleep(30000);
		driver.findElement(By.linkText("娱乐")).click();
		Thread.sleep(6000);
		Set<String>b=driver.getWindowHandles();
		for(String i:b) {
			if(a.equals(i)) {
			    driver.switchTo().window(i);
				driver.findElement(By.xpath("/html/body/div[8]/div/div[1]/form/div[1]/h3")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div[8]/div/div[1]/form/div[1]/div[2]/ul/li[4]")).click();
				driver.findElement(By.className("inp-txt")).sendKeys("50");
				driver.findElement(By.className("submit-second-btn")).click();
				break;
			}
			else {
				continue;
			}
		}
		
		
		
	
		
		
	
	}

}
