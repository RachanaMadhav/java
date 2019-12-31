package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeObjects {

	public static void main(String[] args) {
		FileOutputStream fos;
		try {
			fos=new FileOutputStream("D:\\Sample\\customer");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Customer customer1=new Customer(101,"Dongli",50000);
			Customer customer2=new Customer(201,"Tongli",60000);
			oos.writeObject(customer1);;
			oos.writeObject(customer2);
			oos.close();
			fos.close();
			System.out.println("ok");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
