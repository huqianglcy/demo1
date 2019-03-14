import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.HttpChannelState.Action;

public class test7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
 		String url="file:///C:/Users/asus/Desktop/QTP%E6%95%99%E6%A1%88/selenium_html/index.html";
		driver.get(url);
//		WebElement a=driver.findElement(By.id("drag"));
//		
//		(new Actions(driver)).dragAndDropBy(a,-180,-30).perform();
//		Actions a=new Actions(driver);
//		WebElement b=driver.findElement(By.id("selectWithMultipleEqualsMultiple"));	
//		List<WebElement>op=b.findElements(By.tagName("option"));
//		a.keyDown(Keys.SHIFT).click(op.get(0)).click(op.get(2)).perform();
		driver.findElement(By.className("baidu")).click();
		driver.navigate().back();
		WebElement a=driver.findElement(By.id("user"));
		a.sendKeys("aaa");
		a.sendKeys(Keys.BACK_SPACE);
		WebElement b=driver.findElement(By.id("moreSelect"));
		List<WebElement>a2=b.findElements(By.tagName("option"));
		a2.get(2).click();
		driver.findElement(By.xpath("//*[@id=\"radio\"]/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox\"]/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox\"]/input[2]")).click();
		String a3=driver.getTitle();
		driver.findElement(By.xpath("//*[@id=\"button\"]/input[1]")).click();
		if(a3.equals(driver.getTitle())) {
			driver.findElement(By.className("btnSousuo")).click();
			driver.navigate().back();
		}
		
		driver.findElement(By.xpath("//*[@id=\"alert\"]/input")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\"confirm\"]/input")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("load")).sendKeys("C:\\Users\\asus\\Desktop\\lr\\1203¹ØÁª.txt");
		String a5=driver.getWindowHandle();
		driver.findElement(By.className("open")).click();
		Set<String>a6=driver.getWindowHandles();
		for(String a7:a6) {
			if(a5.equals(a7)) {
				driver.switchTo().window(a5);
			}
			
		}
		;
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.className("over"))).perform(); 
		Thread.sleep(6000);
		builder.moveToElement(driver.findElement(By.className("wait"))).click().perform(); 
		Thread.sleep(6000);
		WebElement a9=driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
		List<WebElement>op=a9.findElements(By.tagName("option"));
		builder.keyDown(Keys.SHIFT).click(op.get(0)).click(op.get(2)).perform();
	}
	
}
