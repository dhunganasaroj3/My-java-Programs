package com.gatsby.java;
import java.util.*;

public class stringInput{

	public static void  Main(int val){
		Scanner input = new Scanner(System.in);
		String[] subject = new String[val];
	
		for(int i = 0; i < subject.length; i++){
		
			subject[i] = input.nextLine();
		}
		System.out.println("You've Entered the Following Subjects");
		for (String value : subject){
	
			System.out.println(value);
		}

	}
}
