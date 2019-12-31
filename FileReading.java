package utils;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("D:\\Sample\\resume");
			int x;
			while((x=fis.read())!=-1)
				System.out.print((char)x);
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
