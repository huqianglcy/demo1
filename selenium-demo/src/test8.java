
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
		//�����������ݵ�ָ���ļ���
		//FileHandler.copy(new File("D:\\a"),new File("D:\\b"),".docx");
		//ָ������docx�ļ��������ļ���
		//FileHandler.copy(new File("D:\\a"),new File("D:\\b"),".txt");
		//ָ������txt�ļ��������ļ���
		//FileHandler.copy(new File("D:\\a\\1.txt"),new File("D:\\b\\c.txt"));
		//ָ���ļ���������ָ���ļ��� �����Ѻ��������Ϊ��
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
