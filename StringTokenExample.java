package utils;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenExample {

	public static void main(String[] args) {
			String str="Deloitte training is in Nexwave";
			StringTokenizer tokenizer=new StringTokenizer(str);
			while(tokenizer.hasMoreTokens()){
				System.out.println(tokenizer.nextToken());
			}
	}

}
