import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test6 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
 		String url="http://www.baidu.com/";
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.linkText("µÇÂ¼")).click();
		Thread.sleep(3000);
		String  a=driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__qrcode\"]/p[2]")).getText();
		String b="°Ù¶ÈAPP";
		if(a.equals(b)) {
		driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__footerULoginBtn\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__userName\"]")).sendKeys("13647049263");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__password\"]")).sendKeys("beloveover0712");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__submit\"]")).click();
		Set<Cookie> co=driver.manage().getCookies();
		System.out.println(co);
		driver.close();}
		else {
			driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__userName\"]")).sendKeys("13647049263");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__password\"]")).sendKeys("beloveover0712");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__submit\"]")).click();
			Set<Cookie> co=driver.manage().getCookies();
			System.out.println(co);
			driver.close();
			}
			
		}
	}


