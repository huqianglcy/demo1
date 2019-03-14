import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
 		String url="http://www.zhihu.com/";
		driver.get(url);
		String a=driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[2]")).getText();
		String b=driver.findElement(By.className("SignContainer-switch")).getText();
		if(a.equals(b)) {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[2]/span")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div[2]")).sendKeys("13647049263");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]")).sendKeys("beloveover666666");
			driver.findElement(By.className("Button SignFlow-submitButton Button--primary Button--blue")).click();
		}
		else {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div[2]")).sendKeys("13647049263");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]")).sendKeys("beloveover666666");
			driver.findElement(By.className("Button SignFlow-submitButton Button--primary Button--blue")).click();
			
		}
		Set<Cookie> co=driver.manage().getCookies();
		System.out.println(co);

	}

}
