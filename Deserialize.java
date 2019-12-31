package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("D:\\Sample\\customer");
			ois=new ObjectInputStream(fis);
			Object obj;
			while((obj=ois.readObject())!=null){
				Customer cust=(Customer) obj;
				System.out.println(cust.getCustid()+" "+cust.getCustname()+" "+cust.getCommn());
			}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		try {
			ois.close();
			fis.close(); 
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
