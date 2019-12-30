package utils;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {
	public static void main(String args[]){
		ArrayList<Employee> emplist=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		emplist.add(new Employee(101,"Deloitte",500));
		while(sc.hasNext()){
			emplist.add(new Employee(sc.nextInt(),sc.next(),sc.nextInt()));
		}
		System.out.println(emplist);
	}
}
