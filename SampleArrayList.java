package utils;
import java.util.ArrayList;
import java.util.Iterator;
public class SampleArrayList {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(564);
		list.add(23.8);
		list.add(null);
		list.add("Dell");
		list.add(564);
		System.out.println(list+" "+list.size());
		list.remove(new Integer(564));
		System.out.println(list+" "+list.size());
		list.remove("Dell");
		System.out.println(list+" "+list.size());
		Iterator itr=list.listIterator();
		while(itr.hasNext())
			{
			Object obj=itr.next();
			if(obj instanceof Integer)
			System.out.println(obj);
			}


	}

}
