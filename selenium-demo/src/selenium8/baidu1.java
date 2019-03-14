package selenium8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baidu1 {
	public static WebDriver driver;
	public void open(){
	System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		 new ChromeDriver();
		String url="http://www.baidu.com/";
	     driver.get(url);
}}
