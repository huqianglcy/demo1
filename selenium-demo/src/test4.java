import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
 		
 			try {
 				String url="https://www.cnblogs.com/";
 				driver.get(url);
 				if(url.equals(driver.getCurrentUrl())) {
 					driver.getTitle();
 					WebElement select =driver.findElement(By.id("cate_item_2"));
 				    Actions action=new Actions(driver);
 				    action.moveToElement(select).perform();
 				    driver.findElement(By.xpath("//*[@id=\"cate_content_block_2\"]/div[2]/ul/li[1]/a")).click();
 				    driver.findElement(By.id("zzk_q")).sendKeys("java");
 				   driver.findElement(By.xpath("//*[@id=\"search_block\"]/div[1]/input[2]")).click();
 				  File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 				 FileUtils.copyFile(file,new File("D:/a.jpg"));
 				driver.navigate().back();
 				driver.findElement(By.xpath("//*[@id=\"editor_pick_lnk\"]")).click();
 				System.out.println(driver.getTitle());
 				}
 				else {
 					System.out.println(driver.getTitle());
 				}
 			}
			 catch (Exception e) {
				// TODO: handle exception
				 String url="https://www.cnblogs.com/";
	 				driver.get(url);
	 				if(url.equals(driver.getCurrentUrl())) {
	 					driver.getTitle();
	 					WebElement select =driver.findElement(By.id("cate_item_2"));
	 				    Actions action=new Actions(driver);
	 				    action.moveToElement(select).perform();
	 				    driver.findElement(By.xpath("//*[@id=\"cate_content_block_2\"]/div[2]/ul/li[1]/a")).click();
	 				    driver.findElement(By.id("zzk_q")).sendKeys("java");
	 				   driver.findElement(By.xpath("//*[@id=\"search_block\"]/div[1]/input[2]")).click();
	 				  File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 				 FileUtils.copyFile(file,new File("D:/a.jpg"));
	 				driver.navigate().back();
	 				driver.findElement(By.xpath("//*[@id=\"editor_pick_lnk\"]")).click();
	 				System.out.println(driver.getTitle());
				
			}
	 				else {
	 					System.out.println(driver.getTitle());
	 				}
 		
			 }
	}
}
	

	


