package utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,Integer> phonebook=new HashMap<>();
		phonebook.put("key",12345);
		phonebook.put("asdfg", 223456);
		phonebook.put("sdfe", 12345);
		System.out.println(phonebook);
		System.out.println(phonebook.get("sdfe"));
		Set set=phonebook.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
