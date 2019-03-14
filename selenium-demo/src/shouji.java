import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shouji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://localhost:8080/mobile_mysql/index.jsp";
		driver.get(url);
		driver.findElement(By.name("name")).sendKeys("123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.className("input1")).click();
		String a=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/table[2]/tbody/tr[1]/td/font/b")).getText();
        System.out.println(a);
        driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/table[2]/tbody/tr[2]/td"));
        String b=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/table[2]/tbody/tr[3]/td")).getText();
        System.out.println(b);
       
        
        
	}
	

}
