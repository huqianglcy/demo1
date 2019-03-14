
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class test8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FileHandler.copy(new File("D:\\a"),new File("D:\\b"));
		//复制所有内容到指定文件夹
		//FileHandler.copy(new File("D:\\a"),new File("D:\\b"),".docx");
		//指定复制docx文件和其他文件夹
		//FileHandler.copy(new File("D:\\a"),new File("D:\\b"),".txt");
		//指定复制txt文件和其他文件夹
		//FileHandler.copy(new File("D:\\a\\1.txt"),new File("D:\\b\\c.txt"));
		//指定文件名辅助到指定文件夹 名字已后面的名字为主
		/*FileOutputStream out=new FileOutputStream("D:\\b\\c.txt");
		String str="aaa";
		byte[] b=str.getBytes();
		for(int i=0;i<str.length();i++) {
			out.write(b[i]);
		}
		out.close();*/
		
		String c=FileHandler.readAsString(new File("D:\\b\\c.txt"));
		
		System.out.println(c);
		
		
		
				
		
	}

}
