package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("D:\\Sample\\resume");
			FileOutputStream fos=new FileOutputStream("D:\\Sample\\resume1");
			int x;
			while((x=fis.read())!=-1)
				fos.write(x);
			fis.close();
			fos.close();
			System.out.println("success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
