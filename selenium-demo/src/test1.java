import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://www.baidu.com/";
		driver.get(url);
		WebElement a=driver.findElement(By.xpath("//*[@id=\"u1\"]/a[1]"));
		a.click();
		WebElement b=driver.findElement(By.xpath("//*[@id=\"ww\"]"));
		b.sendKeys("∫È√≈");
		WebElement d=driver.findElement(By.id("s_btn_wr"));   
	    d.click();
		try {
			WebElement c=driver.findElement(By.xpath("//*[@id=\"1\"]/h3/a"));
			String title=driver.getTitle();
			System.out.println(title);
	    }
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Œ¥’“µΩ“≥√Ê");
			driver.navigate().back();

			
		}
	    
	   
	    
	   
		


			
		}
		
		
		
		
	

	}


