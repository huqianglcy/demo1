package selenium8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class dianjiyuansu extends baidu1{
	public static WebElement e;

	public void yuansu() {
		e=driver.findElement(By.name("tj_trnews"));
		
	}
}
